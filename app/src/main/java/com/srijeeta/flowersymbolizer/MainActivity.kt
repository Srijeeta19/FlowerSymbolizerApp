package com.srijeeta.flowersymbolizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.options)
        val button = findViewById<Button>(R.id.btn)

        button.setOnClickListener {
            val opt = spinner.selectedItem.toString()
            if (opt == "Friendship") {
                startActivity(Intent(this@MainActivity, Friendship::class.java))
            } else if (opt == "Love") {
                startActivity(Intent(this@MainActivity, Love::class.java))
            } else if (opt == "Joy") {
                startActivity(Intent(this@MainActivity, Joy::class.java))
            } else if (opt == "Admiration") {
                startActivity(Intent(this@MainActivity, Admiration::class.java))
            } else if (opt == "Gratitude") {
                startActivity(Intent(this@MainActivity, Gratitude::class.java))
            }
        }
    }
}