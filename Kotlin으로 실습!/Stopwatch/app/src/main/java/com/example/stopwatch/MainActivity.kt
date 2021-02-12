package com.example.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.concurrent.timer
import kotlin.concurrent.timerTask

class MainActivity : AppCompatActivity() {

    private var time = 0
    private var isRunning = false
    private var timeerTask: Timer? = null
    private var lap = 1

    fun pause(){
        fab.setImageResource(R.drawable.ic_baseline_play_arrow_24)
        timeerTask?.cancel()
    }

    fun start() {
        fab.setImageResource(R.drawable.ic_baseline_pause_24)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fab.setOnClickListener {
            isRunning = !isRunning

            if (isRunning) {
                start()
                timeerTask = timer(period = 10){
                    time++
                    val sec = time/100
                    val milli = time%100
                    runOnUiThread() {
                        secTextVi.text = "$sec"
                        mlliTextView.text = "$milli"
                    }

                }
            } else {
                pause()
            }

        }

        lapButton.setOnClickListener() {
            recordLapTime()
        }
        restetFab.setOnClickListener() {
            reset()
        }
    }
    private fun recordLapTime(){
        val lapTime = this.time
        val textView = TextView(this)
        textView.text="$lap LAP:${lapTime / 100}.${lapTime%100}"

        lapLayout.addView(textView,0)
        lap++

    }
    private fun reset(){
        timeerTask?.cancel()

        time =0
        isRunning = false
        fab.setImageResource(R.drawable.ic_baseline_play_arrow_24)
        secTextVi.text="0"
        mlliTextView.text="00"

        lapLayout.removeAllViews()
        lap =1
    }


}