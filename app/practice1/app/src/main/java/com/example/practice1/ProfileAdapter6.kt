package com.example.practice1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView

class ProfileAdapter6(val line6List: ArrayList<Profiles6>) : RecyclerView.Adapter<ProfileAdapter6.CustomViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProfileAdapter6.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_line6, parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return line6List.size
    }

    override fun onBindViewHolder(holder: ProfileAdapter6.CustomViewHolder, position: Int) {
        holder.profile6.setImageResource(line6List.get(position).profile)
        holder.line6.text = line6List.get(position).line
        holder.station6.text = line6List.get(position).station
        holder.delay6.text = line6List.get(position).delay
    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profile6 = itemView.findViewById<ImageView>(R.id.iv_listline6)
        val line6 = itemView.findViewById<TextView>(R.id.tv_line6)
        val station6 = itemView.findViewById<TextView>(R.id.tv_station6)
        val delay6 = itemView.findViewById<TextView>(R.id.tv_delay6)
    }
}