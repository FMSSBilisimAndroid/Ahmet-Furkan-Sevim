package com.empedocles.dicecube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    private lateinit var dice1:ImageView
    private lateinit var dice2:ImageView
    private lateinit var scoreText:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dice1 = findViewById(R.id.dice1)
        dice2 = findViewById(R.id.dice2)
        scoreText = findViewById(R.id.sum)
    }

    fun roll(view:View){
        var dice1Score = Random.nextInt(6) + 1
        var dice2Score = Random.nextInt(6) + 1

        changeDice(dice1Score,dice1)
        changeDice(dice2Score,dice2)
        var sum = dice1Score + dice2Score
        scoreText.setText("The sum is " + sum)

    }

    fun changeDice(randomInt:Int, diceImg:ImageView){
        val src = when(randomInt){
            1 -> R.drawable.ic_dice1
            2 -> R.drawable.ic_dice2
            3 -> R.drawable.ic_dice3
            4 -> R.drawable.ic_dice4
            5 -> R.drawable.ic_dice5
            else -> R.drawable.ic_dice6
        }
        diceImg.setImageResource(src)
    }
}