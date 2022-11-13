package com.example.practice1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView

class ProfileAdapter3(val line3List: ArrayList<Profiles3>) : RecyclerView.Adapter<ProfileAdapter3.CustomViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProfileAdapter3.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_line3, parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return line3List.size
    }

    override fun onBindViewHolder(holder: ProfileAdapter3.CustomViewHolder, position: Int) {
        holder.profile3.setImageResource(line3List.get(position).profile)
        holder.line3.text = line3List.get(position).line
        holder.station3.text = line3List.get(position).station
        holder.delay3.text = line3List.get(position).delay
    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profile3 = itemView.findViewById<ImageView>(R.id.iv_listline3)
        val line3 = itemView.findViewById<TextView>(R.id.tv_line3)
        val station3 = itemView.findViewById<TextView>(R.id.tv_station3)
        val delay3 = itemView.findViewById<TextView>(R.id.tv_delay3)
    }
}