package com.example.practice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practice1.databinding.ActivityLine2Binding

class Line2Activity : AppCompatActivity() {
    private var mBinding: ActivityLine2Binding? = null
    private val binding get() = mBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_line1)
        mBinding = ActivityLine2Binding.inflate(layoutInflater)

        setContentView(binding.root)
        val line2List = arrayListOf(
            Profiles2(R.drawable.line_2, "2호선","시청","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","을지로입구","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","을지로3가","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","을지로4가","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","동대문역사문화공원","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","신당","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","상왕십리","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","왕십리","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","한양대","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","뚝섬","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","성수","지연정보"),

            Profiles2(R.drawable.line_2, "2호선","용답","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","신답","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","용두","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","신설동","지연정보"),

            Profiles2(R.drawable.line_2, "2호선","건대입구","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","구의","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","강변","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","잠실나루","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","잠실","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","잠실새내","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","종합운동장","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","삼성","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","선릉","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","역삼","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","강남","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","교대","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","서초","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","방배","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","사당","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","낙성대","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","서울대입구","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","봉천","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","신림","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","신대방","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","구로디지털단지","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","대림","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","신도림","지연정보"),

            Profiles2(R.drawable.line_2, "2호선","도림천","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","양천구청","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","신정네거리","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","까치산","지연정보"),

            Profiles2(R.drawable.line_2, "2호선","문래","지연정보"),

            Profiles2(R.drawable.line_2, "2호선","영등포구청","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","당산","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","합정","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","홍대입구","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","신촌","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","이대","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","아현","지연정보"),
            Profiles2(R.drawable.line_2, "2호선","충정로","지연정보")

        )

        binding.rvLine2.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvLine2.setHasFixedSize(true)

        binding.rvLine2.adapter = ProfileAdapter2(line2List)
    }
    override fun onDestroy() {
        // onDestroy 에서 binding class 인스턴스 참조를 정리해주어야 한다.
        mBinding = null
        super.onDestroy()
    }
}