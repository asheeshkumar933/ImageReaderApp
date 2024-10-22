package com.example.imagereaderapp

import android.R
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import com.hololo.tutorial.library.Step
import com.hololo.tutorial.library.TutorialActivity


class OnboardingScreen : TutorialActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById()) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }


        addFragment(
            Step.Builder().setTitle("This is header")
                .setContent("This is content")
                .setBackgroundColor(Color.parseColor("#FF0957")) // int background color
                .setDrawable(R.drawable.screen_background_light) // int top drawable
                .setSummary("This is summary")
                .build()
        )

        addFragment(
            Step.Builder().setTitle("This is header")
                .setContent("This is content")
                .setBackgroundColor(Color.parseColor("#FF0957")) // int background color
                .setDrawable(R.drawable.screen_background_light) // int top drawable
                .setSummary("This is summary")
                .build()
        )

        addFragment(
            Step.Builder().setTitle("This is header")
                .setContent("This is content")
                .setBackgroundColor(Color.parseColor("#FF0957")) // int background color
                .setDrawable(R.drawable.screen_background_light) // int top drawable
                .setSummary("This is summary")
                .build()
        )
    }

    override fun finishTutorial() {
         startActivity(Intent(this , MainActivity::class.java))
        finish()
    }

    override fun currentFragmentPosition(position: Int) {

    }
}