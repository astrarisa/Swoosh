package com.astraris.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.astraris.swoosh.R
import com.astraris.swoosh.Utilities.EXTRA_LEAGUE
import com.astraris.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val skill = intent.getStringExtra(EXTRA_SKILL)
        val league = intent.getStringExtra(EXTRA_LEAGUE)
        searchLeaguesText.text = "Looking for  $league  $skill's league near you..."
    }
}
