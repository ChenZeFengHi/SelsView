package com.zack.selsview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.zack.selsview.itf.DataProvider
import com.zack.selsview.itf.ISelect
import com.zack.selsview.model.AreaModel
import com.zack.selsview.model.DataModel
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

/**
 * Description MainActivity
 * Version 1.0
 * Created by ZeFeng.Chen on 2020/8/6 2:47 PM
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        selects_view.setDataProvider(object :
            DataProvider {
            override fun onAddressSelected(models: ArrayList<ISelect>?) {
                Log.e("zack", models.toString())
            }

            override fun provideData(
                position: Int,
                model: ISelect?,
                receiver: DataProvider.DataReceiver
            ) {
                if (model is DataModel.SubListBean) {
                    receiver.send(if (model.subList == null) null else model.subList as ArrayList<ISelect>)
                } else {
                    receiver.send(DataModel.getInstance().data as ArrayList<ISelect>)
                }
            }
        })
    }
}