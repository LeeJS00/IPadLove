package com.example.ipadlove

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_info.*

class MyInfo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_info)
        val id = intent.getStringExtra("id")
        val passwd = intent.getStringExtra("passwd")
        text_id.text = "ID : "+info.id
        text_passwd.text = "Name : "
    }
}
