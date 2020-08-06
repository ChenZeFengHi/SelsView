package com.zack.selsview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.zack.selsview.ClickCellListener
import com.zack.selsview.itf.ISelect
import com.zack.selsview.R
import java.util.*

class ViewPageAdapter(val context: Context) : RecyclerView.Adapter<ViewPageAdapter.MyViewHolder>() {

    private val selList: ArrayList<ISelect> =
        ArrayList()
    private val selsList: ArrayList<List<ISelect>> =
        ArrayList()

    fun addColumn(tabPosition: Int, model: ISelect, models: List<ISelect>) {
        while (tabPosition < selList.size) {
            selList.removeAt(selList.size - 1)
        }
        while (tabPosition < selsList.size) {
            selsList.removeAt(selsList.size - 1)
        }

        selList.add(model)
        selsList.add(models)

        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_recyleview, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return selsList.size
    }

    fun getName(tabPosition: Int): String {
        return if (tabPosition + 1 >= selList.size) {
            "请选择"
        } else {
            selList[tabPosition + 1].getName()
        }
    }

    /**
     * 检查[position]位置的数据是否是[model]
     */
    fun checkExist(position: Int, model: ISelect): Boolean {
        return selList.size > 0 && model.hashCode() == selList[position].hashCode()
    }

    fun getSelList(): ArrayList<ISelect> {
        return selList
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.setData(selsList[position], position)
    }

    inner class MyViewHolder(itemView: View) : ViewHolder(itemView) {
        private val mRecycleView: RecyclerView =
            itemView.findViewById(R.id.recycle_view)
        private val mAdapter = CellRecycleViewAdapter()

        init {
            mRecycleView.layoutManager = LinearLayoutManager(context)
            mRecycleView.adapter = mAdapter

            mAdapter.mClickCellListener = { iSelect, nextPosition ->
                mClickCellListener?.invoke(iSelect, nextPosition)
            }
        }

        fun setData(iSelects: List<ISelect>, position: Int) {
            mAdapter.replaceAll(position, iSelects)
        }
    }

    var mClickCellListener: ClickCellListener? = null
}