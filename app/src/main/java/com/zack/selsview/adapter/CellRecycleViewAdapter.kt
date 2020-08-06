package com.zack.selsview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zack.selsview.ClickCellListener
import com.zack.selsview.itf.ISelect
import com.zack.selsview.R


class CellRecycleViewAdapter : RecyclerView.Adapter<CellRecycleViewAdapter.MyViewHolder>() {
    private val dataList: ArrayList<ISelect> =
        ArrayList()
    private var tabPosition = 0

    fun replaceAll(tabPosition: Int, list: List<ISelect>) {
        this.tabPosition = tabPosition
        dataList.clear()
        if (list.isNotEmpty()) {
            dataList.addAll(list)
        }
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_cell, parent, false)
        )
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.setData(dataList[position])
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvName: TextView = itemView.findViewById(R.id.tv_name)

        init {
            itemView.setOnClickListener {
                iSelect?.let {
                    mClickCellListener?.invoke(it, tabPosition + 1)
                }
            }
        }

        private var iSelect: ISelect? = null
        fun setData(iSelect: ISelect) {
            this.iSelect = iSelect

            tvName.text = iSelect.getName()
        }
    }

    var mClickCellListener: ClickCellListener? = null

}