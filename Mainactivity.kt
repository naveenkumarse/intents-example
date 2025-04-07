package com.naveen.perspectivemobile

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val value1: EditText = findViewById(R.id.input1)
        val value2: EditText = findViewById(R.id.input2)
        val addButton: Button = findViewById(R.id.addButton)
        val subButton: Button = findViewById(R.id.subButton)
        val multiplyButton : Button = findViewById(R.id.multiplyButton)
        val divButton : Button = findViewById(R.id.divisionButton)
        val nextPageButton : Button = findViewById(R.id.NextPageButton)
        val resultText: TextView = findViewById(R.id.resultText)

        addButton.setOnClickListener {
            val val1 = value1.text.toString().toIntOrNull() ?: 0
            val val2 = value2.text.toString().toIntOrNull() ?: 0
            val result = val1 + val2
            resultText.text = "Value is $result"
            Toast.makeText(this, "Result: $result", Toast.LENGTH_LONG).show()
        }

        subButton.setOnClickListener {
            val val1 = value1.text.toString().toIntOrNull() ?: 0
            val val2 = value2.text.toString().toIntOrNull() ?: 0
            val result = val1 - val2
            resultText.text = "Value is $result"
            Toast.makeText(this, "Result: $result", Toast.LENGTH_LONG).show()
        }

        multiplyButton.setOnClickListener {
            val val1 = value1.text.toString().toIntOrNull() ?: 0
            val val2 = value2.text.toString().toIntOrNull() ?: 0
            val result = val1 * val2
            resultText.text = "Value is $result"
            Toast.makeText(this, "Result: $result", Toast.LENGTH_LONG).show()
        }

        divButton.setOnClickListener {
            val val1 = value1.text.toString().toIntOrNull() ?: 0
            val val2 = value2.text.toString().toIntOrNull() ?: 0
            val result = val1 / val2
            resultText.text = "Value is $result"
            Toast.makeText(this, "Result: $result", Toast.LENGTH_LONG).show()
        }
            nextPageButton.setOnClickListener{
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("username", "JohnDoe")
                intent.putExtra("age", 25)
                startActivity(intent)
            }
        }
}

