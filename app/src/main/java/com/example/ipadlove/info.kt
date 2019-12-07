package com.example.ipadlove

import android.app.Application
import android.content.Context
import android.provider.CalendarContract
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class info:Application(){
    init {
        instance = this
    }
    companion object {
        lateinit var instance: info
        lateinit var id:String
        var title:String =""
        var content:String =""
        var status:Int = 0
        lateinit var lunch:Array<Boolean>
        var lunch_place:Array<Boolean> = arrayOf(false,false,false)
        var lunch_menu:Array<Int> = arrayOf(-1,-1,-1)
        var dinner:Array<Boolean> = arrayOf(false,false,false,false)
        var dinner_place:Array<Boolean> = arrayOf(false,false,false)
        var dinner_menu:Array<Int> = arrayOf(-1,-1,-1)
    }

    override fun onCreate() {
        super.onCreate()
        id = "1"
        lunch = arrayOf(false,false,false,false)
    }
    fun context() : Context = applicationContext
    fun show():String {
        var temp = ""
        temp+=id
        temp+=" "
        temp+=status
        temp+=" "
        for(i in 0..4){
            temp+=lunch[i]
            temp+=" "
        }
        for(i in 0..3){
            temp+=lunch_place[i]
            temp+=" "
        }
        for(i in 0..3){
            temp+=lunch_menu[i]
            temp+=" "
        }
        for(i in 0..4){
            temp+=dinner[i]
            temp+=" "
        }
        for(i in 0..3){
            temp+=dinner_place[i]
            temp+=" "
        }
        for(i in 0..3){
            temp+=dinner_menu[i]
            temp+=" "
        }
        return temp
    }
}