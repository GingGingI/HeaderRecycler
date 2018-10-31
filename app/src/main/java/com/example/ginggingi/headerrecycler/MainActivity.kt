package com.example.ginggingi.headerrecycler

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.ginggingi.headerrecycler.Adapter.listAdapter
import com.example.ginggingi.headerrecycler.Model.ListItemModel
import com.example.ginggingi.headerrecycler.Model.listViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var data: ArrayList<ListItemModel>
    lateinit var adapter: listAdapter
    lateinit var lm: RecyclerView.LayoutManager

    val lvm = listViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        data = ArrayList()
        data.add(ListItemModel("HEADERVIEW!!!!!!", lvm.header))
        var i = 0
        while (i < 20){
            i++
            data.add(ListItemModel("item$i", lvm.item))
        }

        lm = LinearLayoutManager(this)

        adapter = listAdapter()
        adapter.setDatas(data)
        adapter.notifyDataSetChanged()

        Rcy.layoutManager = lm
        Rcy.adapter = adapter

    }
}
