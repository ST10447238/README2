package com.example.tamagotchiapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val btnReturn3 = findViewById<Button>(R.id.btnReturn3)//(IIE,2024)
        btnReturn3.setOnClickListener{//(IIE,2024)
            val intent6 = Intent(this,MainActivity2::class.java)//(see Five Minute How to move  from one activity to another activity-Brijesh Kumar Sharm,2021)
            startActivity(intent6)
        }
    }
}
/* Reference List
        IIE,2024.Introduction to mobile application development.IMAD5112
        Five Minute How to move  from one activity to another activity-Brijesh Kumar Sharm.2021.YouTube Video,added by Tech Projects.[Online].Available at:https://youtu.be/JOdWT50bWw4?si=pKORlQFAtf3J7EXS[Accessed 25 April 20240
*/