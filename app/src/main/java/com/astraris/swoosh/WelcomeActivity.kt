package com.astraris.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.welcome_main.*


class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_main)

        getStartedBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity ::class.java)
            startActivity(leagueIntent)
        }

    }




}
