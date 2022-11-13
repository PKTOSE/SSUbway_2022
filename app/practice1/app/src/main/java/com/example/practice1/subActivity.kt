package com.example.practice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import com.example.practice1.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    private var mBinding: ActivitySubBinding? = null
    private val binding get() = mBinding!!

    var Userlist = arrayListOf<User>(
        User(R.drawable.line_7, "7호선","장암","지연정보"),
        User(R.drawable.line_7, "7호선","도봉산","지연정보"),
        User(R.drawable.line_7, "7호선","수락산","지연정보"),
        User(R.drawable.line_7, "7호선","마들","지연정보"),
        User(R.drawable.line_7, "7호선","노원","지연정보"),
        User(R.drawable.line_7, "7호선","중계","지연정보"),
        User(R.drawable.line_7, "7호선","하계","지연정보")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivitySubBinding.inflate(layoutInflater)

        setContentView(binding.root)
        //setContentView(R.layout.activity_sub)

//        val item = arrayOf("사과","배","딸기","키위","나")
//        //context란 한 액티비티에 모든 정보를 담고 있다
//        binding.listView.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, item)
        val Adapter = UserAdapter(this,Userlist)
        binding.listView.adapter = Adapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position) as User
            Toast.makeText(this, selectItem.info, Toast.LENGTH_SHORT).show()

        }

    }
    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}