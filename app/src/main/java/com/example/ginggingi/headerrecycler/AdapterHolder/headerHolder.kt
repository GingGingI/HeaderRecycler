package com.example.ginggingi.headerrecycler.AdapterHolder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.ginggingi.headerrecycler.R

class headerHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    val titleV = itemView!!.findViewById<TextView>(R.id.HeaderTitleV)

    val btn1 = itemView!!.findViewById<Button>(R.id.btn1)
    val btn2 = itemView!!.findViewById<Button>(R.id.btn2)
    val btn3 = itemView!!.findViewById<Button>(R.id.btn3)

}