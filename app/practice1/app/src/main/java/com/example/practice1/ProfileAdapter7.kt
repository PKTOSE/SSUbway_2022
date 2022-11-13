package com.example.practice1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView

class ProfileAdapter7(val line7List: ArrayList<Profiles7>) : RecyclerView.Adapter<ProfileAdapter7.CustomViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProfileAdapter7.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_line7, parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return line7List.size
    }

    override fun onBindViewHolder(holder: ProfileAdapter7.CustomViewHolder, position: Int) {
        holder.profile7.setImageResource(line7List.get(position).profile)
        holder.line7.text = line7List.get(position).line
        holder.station7.text = line7List.get(position).station
        holder.delay7.text = line7List.get(position).delay
    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profile7 = itemView.findViewById<ImageView>(R.id.iv_listline7)
        val line7 = itemView.findViewById<TextView>(R.id.tv_line7)
        val station7 = itemView.findViewById<TextView>(R.id.tv_station7)
        val delay7 = itemView.findViewById<TextView>(R.id.tv_delay7)
    }
}