package com.example.ginggingi.headerrecycler.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.ginggingi.headerrecycler.AdapterHolder.headerHolder
import com.example.ginggingi.headerrecycler.AdapterHolder.itemHolder
import com.example.ginggingi.headerrecycler.Model.ListItemModel
import com.example.ginggingi.headerrecycler.Model.listViewModel
import com.example.ginggingi.headerrecycler.R
import kotlinx.android.synthetic.main.rec_head.view.*
import kotlinx.android.synthetic.main.rec_item.view.*

class listAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    val lvm = listViewModel()
    var ItemList: ArrayList<ListItemModel> = ArrayList()
    lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        context = parent.context
        if (viewType == lvm.header){
            val headView: View = LayoutInflater.from(parent!!.context).inflate(R.layout.rec_head, parent, false)
            return headerHolder(headView)
        }else {
            val itemView: View = LayoutInflater.from(parent!!.context).inflate(R.layout.rec_item, parent, false)
            return itemHolder(itemView)

        }
    }

    override fun getItemViewType(position: Int): Int {
        if (ItemList.get(position).Type == lvm.header) {
            return lvm.header
        }else{
            return lvm.item
        }
    }

    override fun getItemCount(): Int {
        return ItemList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is headerHolder) {
            holder.btn1.setOnClickListener { v -> holder.btn1.setText("Click!") }
            holder.btn2.setOnClickListener { v -> holder.btn1.setText("Click1!") }
            holder.btn3.setOnClickListener { v -> holder.btn1.setText("Click2!") }
            holder.titleV.setText(ItemList.get(position).Txt)
        }else if (holder is itemHolder) {
            holder.Txv.setText(ItemList.get(position).Txt)
            holder.Txv.setOnClickListener { v -> holder.Txv.setText("clickthis") }
        }
    }

    fun setDatas(data: ArrayList<ListItemModel>) {
        this.ItemList = data
    }

}