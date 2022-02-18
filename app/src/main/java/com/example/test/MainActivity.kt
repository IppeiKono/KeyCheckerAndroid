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
        val fruits = arrayOf("りんご", "いちご", "みかん")
        //NumberPickerを取得
        val picker = findViewById<NumberPicker>(R.id.picker)
        //配列のインデックス最小、最大を指定
        picker.minValue = 0
        picker.maxValue = fruits.size - 1
        //NumberPickerに配列をセットする
        picker.displayedValues = fruits

        helloButton.setOnClickListener{
            //選択されている項目のインデックス番号を取得
            val index = picker.value
            //フルーツの配列からインデックス番号を指定して取得
            val fruit = fruits[index]
            helloText.text = fruit
        }
    }
}