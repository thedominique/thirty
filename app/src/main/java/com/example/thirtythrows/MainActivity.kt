package com.example.thirtythrows

import android.content.res.Resources
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var dice: Array<Dice> = emptyArray()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dice = arrayOf(
            Dice(findViewById(R.id.dice1)),
            Dice(findViewById(R.id.dice2)),
            Dice(findViewById(R.id.dice3)),
            Dice(findViewById(R.id.dice4)),
            Dice(findViewById(R.id.dice5)),
            Dice(findViewById(R.id.dice6))
        )

        var throwButton = findViewById<Button>(R.id.throwButton)
        var nrOfThrows = 0
        var index = 0
        var rounds = IntArray(10)
        throwButton.setOnClickListener {
                if (throwButton.text == resources.getText(R.string.calc_button)) {
                    rounds[index++] = 1
                    nrOfThrows = 0
                    for(die in dice){
                        die.removeKeep()
                    }
                    if(index == rounds.size){
                        throwButton.setText(R.string.result_button)
                    }else {
                        throwButton.setText(R.string.throw_button)
                    }
                } else {
                    nrOfThrows++
                    if (nrOfThrows == 3) {
                        throwButton.setText(R.string.calc_button)
                    }
                    throwDice()
                }
        }
    }

    fun throwDice() {
        for (die in dice) {
            die.throwDice()
        }
    }
}