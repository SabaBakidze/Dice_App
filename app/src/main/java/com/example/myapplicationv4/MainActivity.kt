package com.example.myapplicationv4

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)

        rollDice() //roll when app starts

        rollButton.setOnClickListener {
            rollDice()
        }
    }


    private fun rollDice() {
        val dice1: ImageView = findViewById(R.id.dice1_img)
        val dice2: ImageView = findViewById(R.id.dice2_img)

        val firstDice = Dice(6) //Default Value
        when (firstDice.roll()){
            1 -> dice1.setImageResource(R.drawable.dice_1)
            2 -> dice1.setImageResource(R.drawable.dice_2)
            3 -> dice1.setImageResource(R.drawable.dice_3)
            4 -> dice1.setImageResource(R.drawable.dice_4)
            5 -> dice1.setImageResource(R.drawable.dice_5)
            6 -> dice1.setImageResource(R.drawable.dice_6)
        }
        val secondDice = Dice(6) //Default Value
        when (secondDice.roll()){
            1 -> dice2.setImageResource(R.drawable.dice_1)
            2 -> dice2.setImageResource(R.drawable.dice_2)
            3 -> dice2.setImageResource(R.drawable.dice_3)
            4 -> dice2.setImageResource(R.drawable.dice_4)
            5 -> dice2.setImageResource(R.drawable.dice_5)
            6 -> dice2.setImageResource(R.drawable.dice_6)
        }
    }

    class Dice(var numSides: Int) {
        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}