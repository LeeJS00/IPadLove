package com.example.ipadlove

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        button_login.setOnClickListener{
            val id = id.text.toString()
            val passwd =passwd.text.toString()
            val intent1 = Intent(baseContext, MainActivity::class.java)
            intent1.putExtra("id",id)
            intent1.putExtra("passwd",passwd)
            startActivity(intent1)
            System.exit(0)
        }
    }

}
