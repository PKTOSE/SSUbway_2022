package com.example.practice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DelayActivity : AppCompatActivity() {
    private lateinit var adapter:DelayAdapter
    private val viewModel by lazy { ViewModelProvider(this).get(ListViewModel::class.java)}
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delay)
            adapter = DelayAdapter(this)

            val recyclerView : RecyclerView = findViewById(R.id.rv_delay)
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = adapter
            observerData()

        }

    fun observerData(){
        viewModel.fetchData().observe(this, Observer {
            adapter.setListData(it)
            adapter.notifyDataSetChanged()
        })
    }
}