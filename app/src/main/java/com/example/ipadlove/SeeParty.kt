package com.example.ipadlove

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_see_party.*

class SeeParty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_see_party)
        var time:String = ""
        val time_set = arrayOf("12시","12시반","1시","1시반","5시","5시반","6시","6시반")
        val place_set = arrayOf("RC","지곡식당 앞","학생회관")
        val menu_set = arrayOf("치킨","정식","햄버거","중화요리","족발&보쌈","피자","해산물","분식")

        for(i in 0..3) {
            if(info.lunch[i]) {
                time += time_set[i]
                time += "/"
            }
        }
        time+="\n"
        for(i in 0..2) {
            if(info.lunch_place[i]) {
                time += place_set[i]
                time += "/"
            }
        }
        time+="\n"
        for(i in 0..2) {
            for(j in 0..7) {
                if(info.lunch_menu[i]==j) {
                    time += menu_set[j]
                    time += "/"
                }
            }
        }
        text_finding.text =time
        time=""
        for(i in 0..3) {
            if(info.dinner[i]) {
                time += time_set[i+4]
                time += "/"
            }
        }
        time+="\n"
        for(i in 0..2) {
            if(info.dinner_place[i]) {
                time += place_set[i]
                time += "/"
            }
        }
        time+="\n"
        for(i in 0..2) {
            for(j in 0..7) {
                if(info.dinner_menu[i]==j) {
                    time += menu_set[j]
                    time += "/"
                }
            }
        }
        text_finding1.text =time
    }
}
