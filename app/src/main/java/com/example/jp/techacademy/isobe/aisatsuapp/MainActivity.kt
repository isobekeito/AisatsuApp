package com.example.jp.techacademy.isobe.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            showTimePickerDialog()

        }




    }
    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                Log.d("UI_PARTS", "$hour:$minute")
                if(2<=hour && hour<=9){
                    textView.text="　「おはよう」"
                }else if(10<=hour && hour<=17) {
                    textView.text = "「こんにちは」"
                }else if(hour<=24||hour<=1){
                    textView.text="「こんばんは」"
                }
            },
            13, 0, true)
        timePickerDialog.show()
    }
}




