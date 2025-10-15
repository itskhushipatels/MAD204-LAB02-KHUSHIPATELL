/**
 * Course: MAD204
 * Lab: 02
 * Student Name: Khushi Patel
 * Student ID: A00198843
 * Date of Submission: 2025-10-14
 */

package com.example.mad204_lab02_khushipatel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName = findViewById<EditText>(R.id.editTextName)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)

        buttonLogin.setOnClickListener {
            val name = editTextName.text.toString().trim()

            if (name.isNotEmpty()) {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("USERNAME", name)
                startActivity(intent)
            } else {
                editTextName.error = "Please enter your name"
            }
        }
    }
}