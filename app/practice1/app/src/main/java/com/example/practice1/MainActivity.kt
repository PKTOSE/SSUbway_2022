package com.example.practice1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.practice1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        mBinding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.textView.setText("SSUBWAY")

        binding.btnA.setOnClickListener(){
            val intent = Intent(this, SubwayChoices::class.java)
            intent.putExtra("msg", binding.textView.text.toString())// 메인 텍스트뷰 값을 담은뒤 msg라는 키로 잠궜다

            startActivity(intent)
            Toast.makeText(this, "확인하고 싶은 호선을 선택하세요", Toast.LENGTH_LONG).show()
        }

    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}


