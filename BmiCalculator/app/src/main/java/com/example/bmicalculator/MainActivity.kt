package com.example.bmicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun loadData(){
            val pref = PreferenceManager.getDefaultSharedPreferences(this)
            val height = pref.getInt("KEY_HEIGHT",0)
            val weight = pref.getInt("KEY_WEIGHT",0)

            if(height !=0&&weight !=0){
                heighEditText.setText(height.toString())
                weightEditText.setText(weight.toString())
            }
        }

        loadData()

        resultButton.setOnClickListener{
            val intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("Weight",weightEditText.text.toString())
            intent.putExtra("height",heighEditText.text.toString())
            startActivity(intent)
        }

    }
}