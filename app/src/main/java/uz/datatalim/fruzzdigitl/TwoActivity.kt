package uz.datatalim.fruzzdigitl

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class TwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)
    }

    fun vbg(view: View) {
        val dfr = Intent(this,FourActivity::class.java)
        startActivity(dfr)
    }

}