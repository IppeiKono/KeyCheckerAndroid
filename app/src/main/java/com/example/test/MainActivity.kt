package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.NumberPicker
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //オブジェクトの認識
        var helloText : TextView = findViewById(R.id.textView1)
        var helloButton : Button = findViewById(R.id.button1)
        //ドラムロール表示用の配列作成
        val code1Left = arrayOf("C", "D", "E", "F", "G", "A", "B")
        val code1Right = arrayOf("", "m",  "♭", "#", "#m", "dim", "#dim")

        //NumberPickerを取得
        val picker1Left = findViewById<NumberPicker>(R.id.picker1Left)
        val picker1Right = findViewById<NumberPicker>(R.id.picker1Right)
        //配列のインデックス最小、最大を指定
        picker1Left.minValue = 0
        picker1Left.maxValue = code1Left.size - 1
        picker1Right.minValue = 0
        picker1Right.maxValue = code1Right.size - 1
        //NumberPickerに配列をセットする
        picker1Left.displayedValues = code1Left
        picker1Right.displayedValues = code1Right

        helloButton.setOnClickListener{
            //選択されている項目のインデックス番号を取得
            val index1L = picker1Left.value
            val index1R = picker1Right.value
            //フルーツの配列からインデックス番号を指定して取得
            val code = code1Left[index1L] + code1Right[index1R]
            helloText.text = code
        }
    }
}