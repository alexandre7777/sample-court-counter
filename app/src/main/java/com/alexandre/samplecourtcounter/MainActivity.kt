package com.alexandre.samplecourtcounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resetBtn.setOnClickListener{
            scoreATxt.text = "0"
            scoreBTxt.text = "0"
        }

        freeThrowABtn.setOnClickListener{
            scoreATxt.text = (scoreATxt.text.toString().toInt() + 1).toString()
        }

        twoPointsABtn.setOnClickListener{
            scoreATxt.text = (scoreATxt.text.toString().toInt() + 2).toString()
        }

        threePointsABtn.setOnClickListener{
            scoreATxt.text = (scoreATxt.text.toString().toInt() + 3).toString()
        }

        freeThrowBBtn.setOnClickListener{
            scoreBTxt.text = (scoreATxt.text.toString().toInt() + 1).toString()
        }

        twoPointsBBtn.setOnClickListener{
            scoreBTxt.text = (scoreBTxt.text.toString().toInt() + 2).toString()
        }

        threePointsBBtn.setOnClickListener{
            scoreBTxt.text = (scoreBTxt.text.toString().toInt() + 3).toString()
        }
    }
}
