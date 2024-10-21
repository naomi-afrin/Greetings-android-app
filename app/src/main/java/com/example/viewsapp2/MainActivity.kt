package com.example.viewsapp2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the content view to use the XML layout
        setContentView(R.layout.activity_main)


        // Step 2: Declaring Views
        val edt : EditText = findViewById(R.id.edt)
        val btn = findViewById<Button>(R.id.btn)
        // Step 3: Adding Functionalities
        btn.setOnClickListener(){
            var entered_text = edt.text
            Toast.makeText(this, "Hello "+entered_text, Toast.LENGTH_LONG)
                .show()
        }
    }
}
