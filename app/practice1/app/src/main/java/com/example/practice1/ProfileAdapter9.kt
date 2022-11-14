package com.example.practice1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView

class ProfileAdapter9(val line9List: ArrayList<Profiles9>) : RecyclerView.Adapter<ProfileAdapter9.CustomViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProfileAdapter9.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_line9, parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return line9List.size
    }

    override fun onBindViewHolder(holder: ProfileAdapter9.CustomViewHolder, position: Int) {
        holder.profile9.setImageResource(line9List.get(position).profile)
        holder.line9.text = line9List.get(position).line
        holder.station9.text = line9List.get(position).station
        holder.delay9.text = line9List.get(position).delay
    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profile9 = itemView.findViewById<ImageView>(R.id.iv_listline9)
        val line9 = itemView.findViewById<TextView>(R.id.tv_line9)
        val station9 = itemView.findViewById<TextView>(R.id.tv_station9)
        val delay9 = itemView.findViewById<TextView>(R.id.tv_delay9)
    }
}