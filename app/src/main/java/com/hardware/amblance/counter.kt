package com.hardware.amblance

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity




import android.content.Intent



class counter : AppCompatActivity() {

    private lateinit var countdownTimer: CountDownTimer
    private lateinit var countdownText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        countdownText = findViewById(R.id.countdown_text)

        countdownTimer = object : CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val secondsRemaining = millisUntilFinished / 1000
                countdownText.text = "Time remaining: $secondsRemaining seconds"
            }

            override fun onFinish() {
                countdownText.text = "Countdown finished"
                startActivity(Intent(this@counter, gmap::class.java))
                finish() // Optional: finish the MainActivity
            }
        }

        countdownTimer.start()
    }
}
