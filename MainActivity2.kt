package com.naveen.perspectivemobile

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
// implicit intent
        val url = "https://www.google.com/"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
        // Explicit intent 
//        val username = intent.getStringExtra("username")
//        val age = intent.getIntExtra("age", 0)
//
//        val textView: TextView = findViewById(R.id.textview1)
//        textView.text = "Username: $username, Age: $age"
    }
}
