package com.astraris.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.astraris.swoosh.Utilities.EXTRA_LEAGUE
import com.astraris.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked (view: View){
        womenLeaguesBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = "mens"
    }

    fun onWomenClicked (view: View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = "women"
    }

    fun onCoedClicked(view: View){
        mensLeagueBtn.isChecked = false
        womenLeaguesBtn.isChecked = false

        selectedLeague = "co-ed"
    }

    fun leagueNextClicked (view: View) {
        if (selectedLeague != ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else{
            Toast.makeText(this, "Please select league", Toast.LENGTH_SHORT).show()
        }
    }
}
