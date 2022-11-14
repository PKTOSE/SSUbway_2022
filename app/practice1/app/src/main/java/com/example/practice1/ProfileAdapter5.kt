package com.example.practice1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView

class ProfileAdapter5(val line5List: ArrayList<Profiles5>) : RecyclerView.Adapter<ProfileAdapter5.CustomViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProfileAdapter5.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_line5, parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return line5List.size
    }

    override fun onBindViewHolder(holder: ProfileAdapter5.CustomViewHolder, position: Int) {
        holder.profile5.setImageResource(line5List.get(position).profile)
        holder.line5.text = line5List.get(position).line
        holder.station5.text = line5List.get(position).station
        holder.delay5.text = line5List.get(position).delay
    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profile5 = itemView.findViewById<ImageView>(R.id.iv_listline5)
        val line5 = itemView.findViewById<TextView>(R.id.tv_line5)
        val station5 = itemView.findViewById<TextView>(R.id.tv_station5)
        val delay5 = itemView.findViewById<TextView>(R.id.tv_delay5)
    }
}