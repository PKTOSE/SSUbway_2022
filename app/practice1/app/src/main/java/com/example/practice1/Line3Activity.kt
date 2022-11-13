package com.example.practice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practice1.databinding.ActivityLine3Binding

class Line3Activity : AppCompatActivity() {
    private var mBinding: ActivityLine3Binding? = null
    private val binding get() = mBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_line1)
        mBinding = ActivityLine3Binding.inflate(layoutInflater)

        setContentView(binding.root)
        val line3List = arrayListOf(
            Profiles3(R.drawable.line_3, "3호선","대화","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","주엽","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","정발산","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","마두","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","백석","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","대곡","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","화정","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","원당","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","원흥","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","삼송","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","지축","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","구파발","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","연신내","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","불광","지연정보"),

            Profiles3(R.drawable.line_3, "3호선","녹번","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","홍제","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","무악재","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","독립문","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","경복궁","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","안국","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","종로3가","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","을지로3가","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","충무로","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","동대입구","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","약수","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","금호","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","옥수","지연정보"),

            Profiles3(R.drawable.line_3, "3호선","압구정","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","신사","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","잠원","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","고속터미널","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","교대","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","남부터미널","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","양재","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","매봉","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","도곡","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","대치","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","학여울","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","대청","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","일원","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","수서","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","가락시장","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","경찰병원","지연정보"),
            Profiles3(R.drawable.line_3, "3호선","오금","지연정보")
        )

        binding.rvLine3.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvLine3.setHasFixedSize(true)

        binding.rvLine3.adapter = ProfileAdapter3(line3List)
    }
    override fun onDestroy() {
        // onDestroy 에서 binding class 인스턴스 참조를 정리해주어야 한다.
        mBinding = null
        super.onDestroy()
    }
}