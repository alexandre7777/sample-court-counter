package com.alexandre.samplecourtcounter

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mViewModel = ViewModelProviders.of(this).get(ScoreViewModel::class.java)

        displayScoreTeamA(mViewModel.scoreTeamA)
        displayScoreTeamB(mViewModel.scoreTeamB)

        resetBtn.setOnClickListener{
            mViewModel.scoreTeamA = 0
            mViewModel.scoreTeamB = 0
            displayScoreTeamA(mViewModel.scoreTeamA)
            displayScoreTeamB(mViewModel.scoreTeamB)
        }

        freeThrowABtn.setOnClickListener{
            mViewModel.scoreTeamA = mViewModel.scoreTeamA + 1
            displayScoreTeamA(mViewModel.scoreTeamA)
        }

        twoPointsABtn.setOnClickListener{
            mViewModel.scoreTeamA = mViewModel.scoreTeamA + 2
            displayScoreTeamA(mViewModel.scoreTeamA)
        }

        threePointsABtn.setOnClickListener{
            mViewModel.scoreTeamA = mViewModel.scoreTeamA + 3
            displayScoreTeamA(mViewModel.scoreTeamA)
        }

        freeThrowBBtn.setOnClickListener{
            mViewModel.scoreTeamB = mViewModel.scoreTeamB + 1
            displayScoreTeamB(mViewModel.scoreTeamB)
        }

        twoPointsBBtn.setOnClickListener{
            mViewModel.scoreTeamB = mViewModel.scoreTeamB + 2
            displayScoreTeamB(mViewModel.scoreTeamB)
        }

        threePointsBBtn.setOnClickListener{
            mViewModel.scoreTeamB = mViewModel.scoreTeamB + 3
            displayScoreTeamB(mViewModel.scoreTeamB)
        }
    }

    fun displayScoreTeamA(scoreTeamA: Int) {
        scoreATxt.text = scoreTeamA.toString()
    }

    fun displayScoreTeamB(scoreTeamB: Int) {
        scoreBTxt.text = scoreTeamB.toString()
    }
}
