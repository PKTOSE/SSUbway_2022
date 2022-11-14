package com.example.practice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practice1.databinding.ActivityLine5Binding

class Line5Activity : AppCompatActivity() {
    private var mBinding: ActivityLine5Binding? = null
    private val binding get() = mBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_line1)
        mBinding = ActivityLine5Binding.inflate(layoutInflater)

        setContentView(binding.root)
        val line5List = arrayListOf(
            Profiles5(R.drawable.line_5, "5호선","방화","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","개화산","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","김포공항","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","송정","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","마곡","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","발산","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","우장산","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","화곡","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","까치산","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","신정","지연정보"),

            Profiles5(R.drawable.line_5, "5호선","목동","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","오목교","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","양평","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","영등포구청","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","영등포시장","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","신길","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","여의도","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","여의나루","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","마포","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","공덕","지연정보"),

            Profiles5(R.drawable.line_5, "5호선","애오개","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","충정로","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","서대문","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","광화문","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","종로3가","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","을지로4가","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","동대문역사문화공원","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","청구","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","신금호","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","행당","지연정보"),

            Profiles5(R.drawable.line_5, "5호선","왕십리","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","마장","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","답십리","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","장한평","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","군자","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","아치산","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","광나루","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","천호","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","강동","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","길동","지연정보"),

            Profiles5(R.drawable.line_5, "5호선","굽은다리","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","명일","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","고덕","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","상일동","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","강일","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","미사","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","하남풍산","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","하남시청","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","하남검단산","지연정보"),

            Profiles5(R.drawable.line_5, "5호선","둔촌동","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","올림픽공원","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","방이","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","오금","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","개롱","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","거여","지연정보"),
            Profiles5(R.drawable.line_5, "5호선","마천","지연정보")

        )

        binding.rvLine5.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvLine5.setHasFixedSize(true)

        binding.rvLine5.adapter = ProfileAdapter5(line5List)
    }
    override fun onDestroy() {
        // onDestroy 에서 binding class 인스턴스 참조를 정리해주어야 한다.
        mBinding = null
        super.onDestroy()
    }
}