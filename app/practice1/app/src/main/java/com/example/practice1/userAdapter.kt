package com.example.practice1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class UserAdapter (val context : Context, val userList: ArrayList<User>): BaseAdapter() {
    override fun getCount(): Int {
        return userList.size
    }

    override fun getItem(position: Int): Any {
        return userList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.list_item_user,null)

        val profile = view.findViewById<ImageView>(R.id.iv_seven)
        val name = view.findViewById<TextView>(R.id.tv_seven)
        val station = view.findViewById<TextView>(R.id.tv_station)
        val info = view.findViewById<TextView>(R.id.tv_info)

        val user = userList[position]
        //바인딩 해결
        profile.setImageResource(user.profile)
        name.text = user.name
        station.text = user.station
        info.text = user.info

        return view

    }
}