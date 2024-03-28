package com.example.signinapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {
    private lateinit var btnLogin: Button
    private lateinit var editTextId: EditText
    private lateinit var editTextPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signinactivity)

        btnLogin = findViewById(R.id.btn_login)
        editTextId = findViewById(R.id.edit_text_id)
        editTextPassword = findViewById(R.id.edit_text_ps)

        btnLogin.setOnClickListener {
            val user = editTextId.text.toString()
            val pass = editTextPassword.text.toString()



            if (user.isEmpty() || pass.isEmpty()) {
                Toast.makeText(this, "아이디와 비밀번호를 모두 입력해주세요.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "로그인 되었습니다.", Toast.LENGTH_SHORT).show()


                val intent = Intent(this, HomeActivity::class.java)

                intent.putExtra("ID", "abc")

                startActivity(intent)


            }
        }


        val btnSignup = findViewById<Button>(R.id.btn_signup)
        btnSignup.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}