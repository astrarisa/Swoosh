package com.astraris.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.astraris.swoosh.R
import kotlinx.android.synthetic.main.welcome_main.*


class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_main)

        getStartedBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }

    }




}
