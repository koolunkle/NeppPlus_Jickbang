package com.neppplus.jickbangcopy_20211104

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        //        2.5 초 정도 이후에 넘어가게? => Handler 클래스 활용
        val myHandler = Handler(Looper.getMainLooper())

        myHandler.postDelayed( {

//            이 중괄호 내부의 코드는, 2.5초 후에 실행될 예정.
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)

//            화면 이동 후에는 로딩화면 종료
            finish()

        },  2500 )




    }
}