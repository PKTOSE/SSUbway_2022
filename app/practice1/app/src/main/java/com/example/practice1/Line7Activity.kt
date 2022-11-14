package com.example.practice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practice1.databinding.ActivityLine7Binding

class Line7Activity : AppCompatActivity() {
    private var mBinding: ActivityLine7Binding? = null
    private val binding get() = mBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_line1)
        mBinding = ActivityLine7Binding.inflate(layoutInflater)

        setContentView(binding.root)
        val line7List = arrayListOf(
            Profiles7(R.drawable.line_7, "7호선", "석남", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "산곡", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "부평구청", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "굴포천", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "삼산체육관", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "상동", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "부천시청", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "신중동", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "춘의", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "부천종합운동장", "지연정보"),

            Profiles7(R.drawable.line_7, "7호선", "까치울", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "온수", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "천왕", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "광명사거리", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "철산", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "가산디지털단지", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "남구로", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "대림", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "신풍", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "보라매", "지연정보"),

            Profiles7(R.drawable.line_7, "7호선", "신대방삼거리", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "장승배기", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "상도", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "숭실대입구", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "남성", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "총신대입구(이수)", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "내방", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "고속터미널", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "반포", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "논현", "지연정보"),

            Profiles7(R.drawable.line_7, "7호선", "학동", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "강남구청", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "청담", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "뚝섬유원지", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "건대입구", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "어린이대공원", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "군자", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "중곡", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "용마산", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "사가정", "지연정보"),

            Profiles7(R.drawable.line_7, "7호선", "면목", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "상봉", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "중화", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "먹골", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "태릉입구", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "공릉", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "하계", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "중계", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "노원", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "마들", "지연정보"),

            Profiles7(R.drawable.line_7, "7호선", "수락산", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "도봉산", "지연정보"),
            Profiles7(R.drawable.line_7, "7호선", "장암", "지연정보")

        )

        binding.rvLine7.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvLine7.setHasFixedSize(true)

        binding.rvLine7.adapter = ProfileAdapter7(line7List)
    }

    override fun onDestroy() {
        // onDestroy 에서 binding class 인스턴스 참조를 정리해주어야 한다.
        mBinding = null
        super.onDestroy()
    }
}