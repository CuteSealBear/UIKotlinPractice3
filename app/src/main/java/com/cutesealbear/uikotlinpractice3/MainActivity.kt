package com.cutesealbear.uikotlinpractice3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        확인 버튼이 눌리면? 이벤트 달아주자.

        okBtn.setOnClickListener {

//            입력된 내용? : contentEdt의 text의 값 조회 (get) 변수에 저장해두자.

            val inputContent = contentEdt.text.toString()

//            저장해둔 입력값을 => 텍스트뷰의 내용으로 반영. (set)

            resultTxt.text = inputContent

        }
    }
}