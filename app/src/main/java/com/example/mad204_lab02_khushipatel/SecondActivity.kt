package com.example.mad204_lab02_khushipatel

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = intent.getStringExtra("USERNAME")
        val textViewGreeting = findViewById<TextView>(R.id.textViewGreeting)
        val buttonLogout = findViewById<Button>(R.id.buttonLogout)

        textViewGreeting.text = "Welcome, $name!"

        buttonLogout.setOnClickListener {
            finish() // go back to login screen
        }
    }
}