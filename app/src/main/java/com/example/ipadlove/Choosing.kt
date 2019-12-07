package com.example.ipadlove

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import kotlinx.android.synthetic.main.activity_choosing.*
import kotlinx.android.synthetic.main.fragment_choose_time.*
import java.time.LocalDate

class Choosing : AppCompatActivity() {
    private fun createNotificationChannel(context: Context, importance: Int, showBadge: Boolean,
                                          name: String, description: String) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channelId = "${context.packageName}-$name"
            val channel = NotificationChannel(channelId, name, importance)
            channel.description = description
            channel.setShowBadge(showBadge)

            val notificationManager = context.getSystemService(NotificationManager::class.java)
            notificationManager.createNotificationChannel(channel)
        }
    }
    fun change_noti(title:String, content: String){

        createNotificationChannel(this, NotificationManagerCompat.IMPORTANCE_DEFAULT,
            false, getString(R.string.app_name), "App notification channel")

        val channelId = "$packageName-${getString(R.string.app_name)}"

        val intent = Intent(baseContext, Title::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        val pendingIntent = PendingIntent.getActivity(baseContext, 0,
            intent, PendingIntent.FLAG_UPDATE_CURRENT)

        val builder = NotificationCompat.Builder(this, channelId)
        builder.setSmallIcon(R.drawable.icon)
        builder.setContentTitle(title)
        builder.setContentText(content)
        builder.priority = NotificationCompat.PRIORITY_DEFAULT
        builder.setAutoCancel(true)
        builder.setContentIntent(pendingIntent)

        val notificationManager = NotificationManagerCompat.from(this)
        notificationManager.notify(1, builder.build())
    }
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choosing)
        val onlyDate: LocalDate = LocalDate.now()
        Log.i("proc",onlyDate.toString())
        today.text = onlyDate.toString()

        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_choose, choose_time())
            .commit()
        info.status=1
        save.setOnClickListener {
            if(info.status==3) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frame_choose, choose_time())
                    .commit()
            }
            else if(info.status%3 == 1) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frame_choose, choose_place())
                    .commit()
            }
            else if(info.status%3 ==2){
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frame_choose, choose_menu())
                    .commit()
            }
            if(info.status==5) {

                save.text = "  저장 및 완료  "
                save.setOnClickListener {
                    info.title = "오늘 메뉴 선정이 완료되었습니다!!"
                    info.content = "파티를 찾을 때까지 기대려주세요"
                    change_noti(info.title,info.content)
                    finish()

                }
            }
            Log.i("bt",info.status.toString())
            info.status+=1
        }
    }
    override fun onBackPressed() {

        Toast.makeText(baseContext,"정보를 입력하시면 자동으로 종료됩니다",Toast.LENGTH_SHORT).show()
        return
    }
}
