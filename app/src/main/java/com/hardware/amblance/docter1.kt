package com.hardware.amblance

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hardware.amblance.databinding.ActivityDocter1Binding
import com.hardware.amblance.databinding.ActivityLogin1Binding

class docter1 : AppCompatActivity() {
    lateinit var mainBinding: ActivityDocter1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityDocter1Binding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)

        mainBinding.book1.setOnClickListener {
            val intent = Intent(this@docter1, Call1::class.java)
            startActivity(intent)
        }

    }
}