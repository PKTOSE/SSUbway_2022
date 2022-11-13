package com.example.practice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practice1.databinding.ActivityLine8Binding

class Line8Activity : AppCompatActivity() {
    private var mBinding: ActivityLine8Binding? = null
    private val binding get() = mBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_line1)
        mBinding = ActivityLine8Binding.inflate(layoutInflater)

        setContentView(binding.root)
        val line8List = arrayListOf(
            Profiles8(R.drawable.line_8, "8호선","암사","지연정보"),
            Profiles8(R.drawable.line_8, "8호선","천호","지연정보"),
            Profiles8(R.drawable.line_8, "8호선","강동구청","지연정보"),
            Profiles8(R.drawable.line_8, "8호선","몽촌토성","지연정보"),
            Profiles8(R.drawable.line_8, "8호선","잠실","지연정보"),

            Profiles8(R.drawable.line_8, "8호선","석촌","지연정보"),
            Profiles8(R.drawable.line_8, "8호선","송파","지연정보"),
            Profiles8(R.drawable.line_8, "8호선","가락시장","지연정보"),
            Profiles8(R.drawable.line_8, "8호선","문정","지연정보"),
            Profiles8(R.drawable.line_8, "8호선","장지","지연정보"),

            Profiles8(R.drawable.line_8, "8호선","복정","지연정보"),
            Profiles8(R.drawable.line_8, "8호선","남위례","지연정보"),
            Profiles8(R.drawable.line_8, "8호선","산성","지연정보"),
            Profiles8(R.drawable.line_8, "8호선","남한산성입구","지연정보"),
            Profiles8(R.drawable.line_8, "8호선","단대오거리","지연정보"),

            Profiles8(R.drawable.line_8, "8호선","신흥","지연정보"),
            Profiles8(R.drawable.line_8, "8호선","수진","지연정보"),
            Profiles8(R.drawable.line_8, "8호선","모란","지연정보")

        )

        binding.rvLine8.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvLine8.setHasFixedSize(true)

        binding.rvLine8.adapter = ProfileAdapter8(line8List)
    }

    override fun onDestroy() {
        // onDestroy 에서 binding class 인스턴스 참조를 정리해주어야 한다.
        mBinding = null
        super.onDestroy()
    }
}