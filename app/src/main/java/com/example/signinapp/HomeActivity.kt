package com.example.signinapp
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homeactivity)

        val btn_end = findViewById<Button>(R.id.btn_end)

        btn_end.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
            finish()
        }

        val name = intent.getStringExtra("ID")

        val txtGetData = findViewById<TextView>(R.id.tv_2)

        txtGetData.text = "ID: ${name}"

        }
    }
