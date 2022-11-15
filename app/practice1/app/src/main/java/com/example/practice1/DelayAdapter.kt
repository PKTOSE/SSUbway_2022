package com.example.practice1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DelayAdapter(private val context: Context): RecyclerView.Adapter<DelayAdapter.ViewHolder>() {
    private var delayList = mutableListOf<DelayInfo>()

    fun setListData(data: MutableList<DelayInfo>){
        delayList = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DelayAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_delay,parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: DelayAdapter.ViewHolder, position: Int) {
        val delay : DelayInfo = delayList[position]
        holder.날짜.text = delay.날짜.toString()
        holder.호선.text = delay.호선.toString()
        holder.시간.text = delay.시간.toString()
    }

    override fun getItemCount(): Int {
        return delayList.size
    }

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val 날짜 : TextView = itemView.findViewById(R.id.date)
        val 호선 : TextView = itemView.findViewById(R.id.line)
        val 시간 : TextView = itemView.findViewById(R.id.time)

    }

}