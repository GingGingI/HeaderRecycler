package com.example.ginggingi.headerrecycler.AdapterHolder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.example.ginggingi.headerrecycler.R
import kotlinx.android.synthetic.main.rec_item.view.*

class itemHolder(itemView: View?) : RecyclerView.ViewHolder(itemView){
    val Txv = itemView!!.findViewById<TextView>(R.id.Txv)
}