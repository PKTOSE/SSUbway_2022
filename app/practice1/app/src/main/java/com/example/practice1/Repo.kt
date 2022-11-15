package com.example.practice1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class Repo {
    fun getData(): LiveData<MutableList<DelayInfo>> {
        val mutableData = MutableLiveData<MutableList<DelayInfo>>()
        val database = Firebase.database
        val myRef = database.getReference("DelayInfo")
        myRef.addValueEventListener(object : ValueEventListener {
            val listData: MutableList<DelayInfo> = mutableListOf<DelayInfo>()
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()){
                    for (userSnapshot in snapshot.children){
                        val getData = userSnapshot.getValue(DelayInfo::class.java)
                        listData.add(getData!!)

                        mutableData.value = listData
                    }
                }
            }
            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })
        return mutableData
    }
}