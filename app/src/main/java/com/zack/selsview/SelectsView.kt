package com.zack.selsview

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.zack.selsview.adapter.ViewPageAdapter
import com.zack.selsview.itf.DataProvider
import com.zack.selsview.itf.ISelect
import kotlinx.android.synthetic.main.layout_selects_view.view.*

public typealias ClickCellListener = (model: ISelect, position: Int) -> Unit

class SelectsView : FrameLayout {
    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(
        context,
        attrs
    ) {
        init()
    }

    constructor(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int
    ) : super(context, attrs, defStyleAttr) {
        init()
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    constructor(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
        init()
    }

    private var mViewPageAdapter: ViewPageAdapter? = null
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2

    private fun init() {
        val mConstraintLayout =
            LayoutInflater.from(context)
                .inflate(R.layout.layout_selects_view, this, false) as ConstraintLayout


        tabLayout = mConstraintLayout.getViewById(R.id.tab_layout) as TabLayout
        viewPager = mConstraintLayout.getViewById(R.id.view_pager2) as ViewPager2

        mViewPageAdapter = ViewPageAdapter(context).also {
            viewPager.adapter = it
            TabLayoutMediator(
                tabLayout,
                viewPager,
                TabLayoutMediator.TabConfigurationStrategy { tab, position ->
                    tab.text = mViewPageAdapter?.getName(position)
                }).attach()

            it.mClickCellListener = { iSelect, nextPosition ->
                addView(iSelect, nextPosition)
            }
        }

        addView(mConstraintLayout)
    }

    private var dataProvider: DataProvider? = null

    fun setDataProvider(dataProvider: DataProvider) {
        this.dataProvider = dataProvider
        addView(object : ISelect {
            override fun getName(): String {
                return "请选择"
            }
        }, 0)
    }

    private fun addView(model: ISelect, nextPosition: Int) {
        dataProvider?.let { dataProvider ->
            dataProvider.provideData(
                nextPosition, model
            ) { models ->
                if (models.isNullOrEmpty()) {
                    dataProvider.onAddressSelected(mViewPageAdapter?.getSelList())
                } else {
                    if (mViewPageAdapter!!.checkExist(nextPosition - 1, model)) {
                        viewPager.currentItem = nextPosition
                        return@provideData
                    }
                    mViewPageAdapter?.addColumn(nextPosition, model, models)
                    viewPager.currentItem = mViewPageAdapter!!.itemCount - 1

                }
            }
        }
    }


}