package com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.tamagotchiapplication.MainActivity2
import com.example.tamagotchiapplication.R

class MainActivity3 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val btnReturn1 = findViewById<Button>(R.id.btnReturn1)//(IIE,2024)
        btnReturn1.setOnClickListener{//(IIE,2024)
            val intent2 = Intent(this,MainActivity2::class.java)//(see Five Minute How to move  from one activity to another activity-Brijesh Kumar Sharm,2021)
            startActivity(intent2)
        }
    }
}
/* Reference List
        IIE,2024.Introduction to mobile application development.IMAD5112
        Five Minute How to move  from one activity to another activity-Brijesh Kumar Sharm.2021.YouTube Video,added by Tech Projects.[Online].Available at:https://youtu.be/JOdWT50bWw4?si=pKORlQFAtf3J7EXS[Accessed 25 April 20240
*/