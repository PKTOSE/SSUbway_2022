package com.example.practice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practice1.databinding.ActivityLine4Binding

class Line4Activity : AppCompatActivity() {
    private var mBinding: ActivityLine4Binding? = null
    private val binding get() = mBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_line1)
        mBinding = ActivityLine4Binding.inflate(layoutInflater)

        setContentView(binding.root)
        val line4List = arrayListOf(
            Profiles4(R.drawable.line_4, "4호선","오이도","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","정왕","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","신길온천","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","안산","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","초지","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","고잔","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","중앙","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","한대앞","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","상록수","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","반월","지연정보"),

            Profiles4(R.drawable.line_4, "4호선","대야미","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","수리산","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","산본","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","금정","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","범계","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","평촌","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","인덕원","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","정부과천청사","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","과천","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","대공원","지연정보"),

            Profiles4(R.drawable.line_4, "4호선","경마공원","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","선바위","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","남태령","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","사당","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","총신대입구(이수)","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","동작","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","이촌","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","신용산","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","삼각지","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","숙대입구","지연정보"),

            Profiles4(R.drawable.line_4, "4호선","서울역","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","회현","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","명동","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","충무로","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","동대문역사문화공원","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","동대문","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","혜화","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","한성대입구","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","성신여대입구","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","길음","지연정보"),

            Profiles4(R.drawable.line_4, "4호선","미아사거리","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","미아","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","수유","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","쌍문","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","창동","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","노원","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","상계","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","당고개","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","별내별가람","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","오남","지연정보"),
            Profiles4(R.drawable.line_4, "4호선","진접","지연정보")
        )

        binding.rvLine4.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvLine4.setHasFixedSize(true)

        binding.rvLine4.adapter = ProfileAdapter4(line4List)
    }
    override fun onDestroy() {
        // onDestroy 에서 binding class 인스턴스 참조를 정리해주어야 한다.
        mBinding = null
        super.onDestroy()
    }
}