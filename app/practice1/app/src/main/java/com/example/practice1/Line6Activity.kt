package com.example.practice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practice1.databinding.ActivityLine6Binding

class Line6Activity : AppCompatActivity() {
    private var mBinding: ActivityLine6Binding? = null
    private val binding get() = mBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_line1)
        mBinding = ActivityLine6Binding.inflate(layoutInflater)

        setContentView(binding.root)
        val line6List = arrayListOf(
            Profiles6(R.drawable.line_6, "6호선","연신내","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","독바위","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","불광","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","역촌","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","구산","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","응암","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","새절","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","디지털미디어시티","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","월드컵경기장","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","마포구청","지연정보"),

            Profiles6(R.drawable.line_6, "6호선","망원","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","합정","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","상수","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","광흥창","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","대흥","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","공덕","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","효창공원앞","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","삼각지","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","녹사평","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","이태원","지연정보"),

            Profiles6(R.drawable.line_6, "6호선","연한강진","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","버티고개","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","약수","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","청구","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","신당","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","동묘앞","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","창신","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","보문","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","안암","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","고려대","지연정보"),

            Profiles6(R.drawable.line_6, "6호선","월곡","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","상월곡","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","돌곶이","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","석계","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","태릉입구","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","화랑대","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","봉화산","지연정보"),
            Profiles6(R.drawable.line_6, "6호선","신내","지연정보")


        )

        binding.rvLine6.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvLine6.setHasFixedSize(true)

        binding.rvLine6.adapter = ProfileAdapter6(line6List)
    }
    override fun onDestroy() {
        // onDestroy 에서 binding class 인스턴스 참조를 정리해주어야 한다.
        mBinding = null
        super.onDestroy()
    }
}