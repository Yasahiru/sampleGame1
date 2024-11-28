package com.cmc.game

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val circleView = findViewById<CircleView>(R.id.circleView)
        val btnUp = findViewById<Button>(R.id.btnUp)
        val btnDown = findViewById<Button>(R.id.btnDown)
        val btnLeft = findViewById<Button>(R.id.btnLeft)
        val btnRight = findViewById<Button>(R.id.btnRight)

        btnUp.setOnClickListener {
            circleView.moveCircle(0f, -50f)
        }

        btnDown.setOnClickListener {
            circleView.moveCircle(0f, 50f)
        }

        btnLeft.setOnClickListener {
            circleView.moveCircle(-50f, 0f)
        }

        btnRight.setOnClickListener {
            circleView.moveCircle(50f, 0f)
        }
    }
}