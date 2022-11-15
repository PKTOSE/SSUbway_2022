package com.example.practice1

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practice1.databinding.ActivityLine7Binding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase

class Line7Activity : AppCompatActivity() {
    private var mBinding: ActivityLine7Binding? = null
    private val binding get() = mBinding!!
    fun initializeDbRef() {
        // [START initialize_database_ref]
        val database = Firebase.database
        val myRef = database.getReference("time")
        // [END initialize_database_ref]
        myRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = dataSnapshot.getValue<String>()
                Log.d(TAG, "Value is: $value")
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_line1)
        mBinding = ActivityLine7Binding.inflate(layoutInflater)

        setContentView(binding.root)
        val line7List = arrayListOf(
            Profiles7(R.drawable.line_7, "6호선","연신내","지연정보"))

    }

    override fun onDestroy() {
        // onDestroy 에서 binding class 인스턴스 참조를 정리해주어야 한다.
        mBinding = null
        super.onDestroy()
    }
}