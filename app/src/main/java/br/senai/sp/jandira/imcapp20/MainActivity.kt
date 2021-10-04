package br.senai.sp.jandira.imcapp20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()

        val buttonEntrar = findViewById<Button>(R.id.btn_entrar)

        buttonEntrar.setOnClickListener {
            val openDashboardActivity = Intent(this, DashboardActivity::class.java)
            startActivity(openDashboardActivity)
        }
    }
}