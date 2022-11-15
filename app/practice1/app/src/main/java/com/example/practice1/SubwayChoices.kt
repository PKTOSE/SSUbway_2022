package com.example.practice1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice1.databinding.ActivitySubwayChoicesBinding

class SubwayChoices : AppCompatActivity() {
    private var mBinding: ActivitySubwayChoicesBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_subway_choices)
        mBinding = ActivitySubwayChoicesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLine7.setOnClickListener(){
            val intent = Intent(this, SubActivity::class.java)

            startActivity(intent)
        }
        binding.btnLine1.setOnClickListener(){
            val intent = Intent(this, Line1Activity::class.java)

            startActivity(intent)
        }
        binding.btnLine2.setOnClickListener(){
            val intent = Intent(this, Line2Activity::class.java)

            startActivity(intent)
        }
        binding.btnLine3.setOnClickListener(){
            val intent = Intent(this, Line3Activity::class.java)

            startActivity(intent)
        }
        binding.btnLine4.setOnClickListener(){
            val intent = Intent(this, Line4Activity::class.java)

            startActivity(intent)
        }
        binding.btnLine5.setOnClickListener(){
            val intent = Intent(this, Line5Activity::class.java)

            startActivity(intent)
        }
        binding.btnLine6.setOnClickListener(){
            val intent = Intent(this, Line6Activity::class.java)

            startActivity(intent)
        }
        binding.btnLine7.setOnClickListener(){
            val intent = Intent(this, DelayActivity::class.java)

            startActivity(intent)
        }
        binding.btnLine8.setOnClickListener(){
            val intent = Intent(this, Line8Activity::class.java)

            startActivity(intent)
        }
        binding.btnLine9.setOnClickListener(){
            val intent = Intent(this, Line9Activity::class.java)

            startActivity(intent)
        }

    }
    override fun onDestroy() {
        // onDestroy 에서 binding class 인스턴스 참조를 정리해주어야 한다.
        mBinding = null
        super.onDestroy()
    }
}