package com.example.practice1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView

class ProfileAdapter4(val line4List: ArrayList<Profiles4>) : RecyclerView.Adapter<ProfileAdapter4.CustomViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProfileAdapter4.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_line4, parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return line4List.size
    }

    override fun onBindViewHolder(holder: ProfileAdapter4.CustomViewHolder, position: Int) {
        holder.profile4.setImageResource(line4List.get(position).profile)
        holder.line4.text = line4List.get(position).line
        holder.station4.text = line4List.get(position).station
        holder.delay4.text = line4List.get(position).delay
    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profile4 = itemView.findViewById<ImageView>(R.id.iv_listline4)
        val line4 = itemView.findViewById<TextView>(R.id.tv_line4)
        val station4 = itemView.findViewById<TextView>(R.id.tv_station4)
        val delay4 = itemView.findViewById<TextView>(R.id.tv_delay4)
    }
}