package com.example.practice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practice1.databinding.ActivityLine1Binding

class Line1Activity : AppCompatActivity() {
    private var mBinding: ActivityLine1Binding? = null
    private val binding get() = mBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_line1)
        mBinding = ActivityLine1Binding.inflate(layoutInflater)

        setContentView(binding.root)
        val lineList = arrayListOf(
            Profiles(R.drawable.line_1, "1호선","소요산","지연정보"),
            Profiles(R.drawable.line_1, "1호선","동두천","지연정보"),
            Profiles(R.drawable.line_1, "1호선","보산","지연정보"),
            Profiles(R.drawable.line_1, "1호선","동두천중앙","지연정보"),
            Profiles(R.drawable.line_1, "1호선","지행","지연정보"),
            Profiles(R.drawable.line_1, "1호선","덕정","지연정보"),
            Profiles(R.drawable.line_1, "1호선","덕계","지연정보"),
            Profiles(R.drawable.line_1, "1호선","양주","지연정보"),
            Profiles(R.drawable.line_1, "1호선","녹양","지연정보"),
            Profiles(R.drawable.line_1, "1호선","가능","지연정보"),
            Profiles(R.drawable.line_1, "1호선","의정부","지연정보"),
            Profiles(R.drawable.line_1, "1호선","회룡","지연정보"),

            Profiles(R.drawable.line_1, "1호선","망월사","지연정보"),
            Profiles(R.drawable.line_1, "1호선","도봉산","지연정보"),
            Profiles(R.drawable.line_1, "1호선","도봉","지연정보"),
            Profiles(R.drawable.line_1, "1호선","방학","지연정보"),
            Profiles(R.drawable.line_1, "1호선","창동","지연정보"),
            Profiles(R.drawable.line_1, "1호선","녹천","지연정보"),
            Profiles(R.drawable.line_1, "1호선","월계","지연정보"),
            Profiles(R.drawable.line_1, "1호선","광운대","지연정보"),
            Profiles(R.drawable.line_1, "1호선","석계","지연정보"),
            Profiles(R.drawable.line_1, "1호선","신이문","지연정보"),
            Profiles(R.drawable.line_1, "1호선","외대앞","지연정보"),
            Profiles(R.drawable.line_1, "1호선","회기","지연정보"),

            Profiles(R.drawable.line_1, "1호선","청량리","지연정보"),
            Profiles(R.drawable.line_1, "1호선","제기동","지연정보"),
            Profiles(R.drawable.line_1, "1호선","신설동","지연정보"),
            Profiles(R.drawable.line_1, "1호선","동묘앞","지연정보"),
            Profiles(R.drawable.line_1, "1호선","동대문","지연정보"),
            Profiles(R.drawable.line_1, "1호선","종로5가","지연정보"),
            Profiles(R.drawable.line_1, "1호선","종로3가","지연정보"),
            Profiles(R.drawable.line_1, "1호선","종각","지연정보"),
            Profiles(R.drawable.line_1, "1호선","시청","지연정보"),
            Profiles(R.drawable.line_1, "1호선","서울역","지연정보"),
            Profiles(R.drawable.line_1, "1호선","남영","지연정보"),
            Profiles(R.drawable.line_1, "1호선","용산","지연정보"),
            Profiles(R.drawable.line_1, "1호선","노량진","지연정보"),
            Profiles(R.drawable.line_1, "1호선","대방","지연정보"),
            Profiles(R.drawable.line_1, "1호선","신길","지연정보"),
            Profiles(R.drawable.line_1, "1호선","영등포","지연정보"),
            Profiles(R.drawable.line_1, "1호선","신도림","지연정보"),
            Profiles(R.drawable.line_1, "1호선","구로","지연정보"),

            Profiles(R.drawable.line_1, "1호선","구일","지연정보"),
            Profiles(R.drawable.line_1, "1호선","개봉","지연정보"),
            Profiles(R.drawable.line_1, "1호선","오류동","지연정보"),
            Profiles(R.drawable.line_1, "1호선","온수","지연정보"),
            Profiles(R.drawable.line_1, "1호선","역곡","지연정보"),
            Profiles(R.drawable.line_1, "1호선","소사","지연정보"),
            Profiles(R.drawable.line_1, "1호선","부천","지연정보"),
            Profiles(R.drawable.line_1, "1호선","중동","지연정보"),
            Profiles(R.drawable.line_1, "1호선","송내","지연정보"),
            Profiles(R.drawable.line_1, "1호선","부개","지연정보"),
            Profiles(R.drawable.line_1, "1호선","부평","지연정보"),
            Profiles(R.drawable.line_1, "1호선","백운","지연정보"),
            Profiles(R.drawable.line_1, "1호선","동암","지연정보"),
            Profiles(R.drawable.line_1, "1호선","간석","지연정보"),
            Profiles(R.drawable.line_1, "1호선","주안","지연정보"),
            Profiles(R.drawable.line_1, "1호선","도화","지연정보"),
            Profiles(R.drawable.line_1, "1호선","제물포","지연정보"),
            Profiles(R.drawable.line_1, "1호선","도원","지연정보"),
            Profiles(R.drawable.line_1, "1호선","동인천","지연정보"),
            Profiles(R.drawable.line_1, "1호선","인천","지연정보"),


            Profiles(R.drawable.line_1, "1호선","가산디지털단지","지연정보"),
            Profiles(R.drawable.line_1, "1호선","독산","지연정보"),
            Profiles(R.drawable.line_1, "1호선","금천구청","지연정보"),
            Profiles(R.drawable.line_1, "1호선","광명","지연정보"),
            Profiles(R.drawable.line_1, "1호선","석수","지연정보"),
            Profiles(R.drawable.line_1, "1호선","관악","지연정보"),
            Profiles(R.drawable.line_1, "1호선","안양","지연정보"),
            Profiles(R.drawable.line_1, "1호선","명학","지연정보"),
            Profiles(R.drawable.line_1, "1호선","금정","지연정보"),
            Profiles(R.drawable.line_1, "1호선","군포","지연정보"),
            Profiles(R.drawable.line_1, "1호선","당정","지연정보"),
            Profiles(R.drawable.line_1, "1호선","의왕","지연정보"),

            Profiles(R.drawable.line_1, "1호선","성균관대","지연정보"),
            Profiles(R.drawable.line_1, "1호선","화서","지연정보"),
            Profiles(R.drawable.line_1, "1호선","수원","지연정보"),
            Profiles(R.drawable.line_1, "1호선","세류","지연정보"),
            Profiles(R.drawable.line_1, "1호선","병점","지연정보"),
            Profiles(R.drawable.line_1, "1호선","서동탄","지연정보"),
            Profiles(R.drawable.line_1, "1호선","세마","지연정보"),
            Profiles(R.drawable.line_1, "1호선","오산대","지연정보"),
            Profiles(R.drawable.line_1, "1호선","오산","지연정보"),
            Profiles(R.drawable.line_1, "1호선","진위","지연정보"),
            Profiles(R.drawable.line_1, "1호선","송탄","지연정보"),
            Profiles(R.drawable.line_1, "1호선","서정리","지연정보"),

            Profiles(R.drawable.line_1, "1호선","평택지제","지연정보"),
            Profiles(R.drawable.line_1, "1호선","평택","지연정보"),
            Profiles(R.drawable.line_1, "1호선","성환","지연정보"),
            Profiles(R.drawable.line_1, "1호선","직산","지연정보"),
            Profiles(R.drawable.line_1, "1호선","두정","지연정보"),
            Profiles(R.drawable.line_1, "1호선","천안","지연정보"),
            Profiles(R.drawable.line_1, "1호선","봉명","지연정보"),
            Profiles(R.drawable.line_1, "1호선","쌍용","지연정보"),
            Profiles(R.drawable.line_1, "1호선","아산","지연정보"),
            Profiles(R.drawable.line_1, "1호선","탕정","지연정보"),
            Profiles(R.drawable.line_1, "1호선","배방","지연정보"),
            Profiles(R.drawable.line_1, "1호선","온양온천","지연정보"),
            Profiles(R.drawable.line_1, "1호선","신창","지연정보")
        )

        binding.rvLine1.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvLine1.setHasFixedSize(true)

        binding.rvLine1.adapter = ProfileAdapter(lineList)
    }
    override fun onDestroy() {
        // onDestroy 에서 binding class 인스턴스 참조를 정리해주어야 한다.
        mBinding = null
        super.onDestroy()
    }
}