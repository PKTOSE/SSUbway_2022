package com.example.practice1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView

class ProfileAdapter2(val line2List: ArrayList<Profiles2>) : RecyclerView.Adapter<ProfileAdapter2.CustomViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProfileAdapter2.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_line2, parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return line2List.size
    }

    override fun onBindViewHolder(holder: ProfileAdapter2.CustomViewHolder, position: Int) {
        holder.profile2.setImageResource(line2List.get(position).profile)
        holder.line2.text = line2List.get(position).line
        holder.station2.text = line2List.get(position).station
        holder.delay2.text = line2List.get(position).delay
    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profile2 = itemView.findViewById<ImageView>(R.id.iv_listline2)
        val line2 = itemView.findViewById<TextView>(R.id.tv_line2)
        val station2 = itemView.findViewById<TextView>(R.id.tv_station2)
        val delay2 = itemView.findViewById<TextView>(R.id.tv_delay2)
    }
}