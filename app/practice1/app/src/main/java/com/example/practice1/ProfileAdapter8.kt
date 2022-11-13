package com.example.practice1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView

class ProfileAdapter8(val line8List: ArrayList<Profiles8>) : RecyclerView.Adapter<ProfileAdapter8.CustomViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProfileAdapter8.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_line8, parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return line8List.size
    }

    override fun onBindViewHolder(holder: ProfileAdapter8.CustomViewHolder, position: Int) {
        holder.profile8.setImageResource(line8List.get(position).profile)
        holder.line8.text = line8List.get(position).line
        holder.station8.text = line8List.get(position).station
        holder.delay8.text = line8List.get(position).delay
    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profile8 = itemView.findViewById<ImageView>(R.id.iv_listline8)
        val line8 = itemView.findViewById<TextView>(R.id.tv_line8)
        val station8 = itemView.findViewById<TextView>(R.id.tv_station8)
        val delay8 = itemView.findViewById<TextView>(R.id.tv_delay8)
    }
}