package com.example.practice1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView

class ProfileAdapter(val lineList: ArrayList<Profiles>) : RecyclerView.Adapter<ProfileAdapter.CustomViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileAdapter.CustomViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_line1, parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lineList.size
    }

    override fun onBindViewHolder(holder: ProfileAdapter.CustomViewHolder, position: Int){
        holder.profile.setImageResource(lineList.get(position).profile)
        holder.line.text = lineList.get(position).line
        holder.station.text = lineList.get(position).station
        holder.delay.text = lineList.get(position).delay
    }
    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val profile = itemView.findViewById<ImageView>(R.id.iv_listline1)
        val line = itemView.findViewById<TextView>(R.id.tv_line1)
        val station = itemView.findViewById<TextView>(R.id.tv_station1)
        val delay = itemView.findViewById<TextView>(R.id.tv_delay1
        )
    }

}
