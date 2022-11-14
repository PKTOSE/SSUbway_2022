package com.example.practice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practice1.databinding.ActivityLine9Binding

class Line9Activity : AppCompatActivity() {
    private var mBinding: ActivityLine9Binding? = null
    private val binding get() = mBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_line1)
        mBinding = ActivityLine9Binding.inflate(layoutInflater)

        setContentView(binding.root)
        val line9List = arrayListOf(
            Profiles9(R.drawable.line_9, "9호선","개화","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","김포공항","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","공항시장","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","신방화","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","마곡나루","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","양천향교","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","가양","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","증미","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","등촌","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","염창","지연정보"),

            Profiles9(R.drawable.line_9, "9호선","신목동","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","선유도","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","당산","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","국회의사당","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","여의도","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","샛강","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","노량진","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","노들","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","흑석","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","동작","지연정보"),

            Profiles9(R.drawable.line_9, "9호선","구반포","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","신반포","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","고속터미널","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","사평","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","신논현","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","언주","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","선정릉","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","삼성중앙","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","봉은사","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","종합운동장","지연정보"),

            Profiles9(R.drawable.line_9, "9호선","삼전","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","석촌고분","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","석촌","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","송파나루","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","한성백제","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","올림픽공원","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","둔촌오륜","지연정보"),
            Profiles9(R.drawable.line_9, "9호선","중앙보훈병원","지연정보")

        )

        binding.rvLine9.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvLine9.setHasFixedSize(true)

        binding.rvLine9.adapter = ProfileAdapter9(line9List)
    }

    override fun onDestroy() {
        // onDestroy 에서 binding class 인스턴스 참조를 정리해주어야 한다.
        mBinding = null
        super.onDestroy()
    }
}