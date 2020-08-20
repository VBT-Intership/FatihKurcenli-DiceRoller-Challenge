package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button=findViewById(R.id.roll_button)
        val rollButton2: Button=findViewById(R.id.roll_button_challenge)
        rollButton.setOnClickListener { rollDice() }
        rollButton2.setOnClickListener { challenge() }
        //resultText.text="Dice rolled change!!" //we using for change to text result

    }

    private fun challenge() {
        var resultText:TextView=findViewById(R.id.result_text)
        if(resultText.text=="Hello world"){ //if writing resultText "Hello world"
            resultText.text="1" //text equals to 1
        }else{
            var resultInt=resultText.text.toString().toInt()
            if(resultInt<6){
                resultInt++
                resultText.text=resultInt.toString()
            }
        }
    }

    private fun rollDice(){
        val resultText: TextView=findViewById(R.id.result_text)
        val randomInt=(1..6).random()
        resultText.text=randomInt.toString() //toString for TextView.
        //Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show()
    }
}