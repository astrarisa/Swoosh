package com.astraris.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.astraris.swoosh.Model.Player
import com.astraris.swoosh.R
import com.astraris.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("", "")

    //This is the instance(состояние значения выбранных кнопок) we're saving after it rotated and destroyed
    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }
    //after the instance is recreated (onRestoreInstanceState)...
    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){   //...we check if instant state is not null...
            player = savedInstanceState.getParcelable(EXTRA_PLAYER) //...than we go and get Extra_player and set to player
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked (view: View){
        womenLeaguesBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.leauge = "mens"
    }

    fun onWomenClicked (view: View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.leauge = "women"
    }

    fun onCoedClicked(view: View){
        mensLeagueBtn.isChecked = false
        womenLeaguesBtn.isChecked = false

        player.leauge = "co-ed"
    }

    fun leagueNextClicked (view: View) {
        if (player.leauge != ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else{
            Toast.makeText(this, "Please select league", Toast.LENGTH_SHORT).show()
        }
    }
}
