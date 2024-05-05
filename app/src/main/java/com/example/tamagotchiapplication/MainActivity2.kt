package com.example.tamagotchiapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import com.MainActivity3

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val feedStatus = findViewById<Switch>(R.id.feedStatus) //(IIE,2024)  // the variables to check the dog's status
        val cleanStatus = findViewById<Switch>(R.id.cleanStatus) //(IIE,2024)
        val playStatus = findViewById<Switch>(R.id.playStatus) //(IIE,2024)

        val btnFeed = findViewById<Button>(R.id.btnFeed)//(IIE,2024)
        btnFeed.setOnClickListener {//(IIE,2024)
            val intent1 = Intent(this, MainActivity3::class.java) //(see Five Minute How to move  from one activity to another activity-Brijesh Kumar Sharm,2021)
            startActivity(intent1)
        }
        val btnClean = findViewById<Button>(R.id.btnClean)//(IIE,2024)
        btnClean.setOnClickListener {//(IIE,2024)
            val intent3 = Intent(this, MainActivity4::class.java)//(see Five Minute How to move  from one activity to another activity-Brijesh Kumar Sharm,2021)
            startActivity(intent3)
        }
        val btnPlay = findViewById<Button>(R.id.btnPlay)//(IIE,2024)
        btnPlay.setOnClickListener {//(IIE,2024)
            val intent5 = Intent(this, MainActivity5::class.java)//(see Five Minute How to move  from one activity to another activity-Brijesh Kumar Sharm,2021)
            startActivity(intent5)
        }
    }
}
/* Reference List
        IIE,2024.Introduction to mobile application development.IMAD5112
        Five Minute How to move  from one activity to another activity-Brijesh Kumar Sharm.2021.YouTube Video,added by Tech Projects.[Online].Available at:https://youtu.be/JOdWT50bWw4?si=pKORlQFAtf3J7EXS[Accessed 25 April 20240
*/