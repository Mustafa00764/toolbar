package uz.datatalim.fruzzdigitl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun yt(view: View) {
        val trr = Intent(this,ThreeActivity::class.java)
        startActivity(trr)
    }

    fun re(view: View) {
        val yur = Intent(this,TwoActivity::class.java)
        startActivity(yur)
    }

}