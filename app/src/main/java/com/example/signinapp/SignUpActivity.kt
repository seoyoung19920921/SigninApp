package com.example.signinapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    private lateinit var btnSignup: Button
    private lateinit var editTextId: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var editName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signupactivity)

        btnSignup = findViewById(R.id.btn_gosignin)
        editTextId = findViewById(R.id.edit_3)
        editTextPassword = findViewById(R.id.etp)
        editName = findViewById(R.id.edit_1)

        btnSignup.setOnClickListener {

            val user1 = editTextId.text.toString()
            val pass1 = editTextPassword.text.toString()
            val name1 = editName.text.toString()

            if (user1.isEmpty() || pass1.isEmpty() || name1.isEmpty()) {
                Toast.makeText(this, "아이디와 비밀번호, 이름을 모두 입력해주세요.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "회원가입 완료", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, SignInActivity::class.java)
                startActivity(intent)

                finish()
            }
        }

    }
}