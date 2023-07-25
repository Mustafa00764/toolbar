package uz.datatalim.fruzzdigitl

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)
    }

    fun wyq(view: View) {
        val ior = Intent(this,FourActivity::class.java)
        startActivity(ior)
    }


}