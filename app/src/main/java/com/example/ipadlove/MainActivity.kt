package com.example.ipadlove

import android.app.*
import android.content.Context
import android.content.Intent
import android.media.session.PlaybackState
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import kotlinx.android.synthetic.main.activity_main.*
import com.example.ipadlove.info
import kotlinx.android.synthetic.main.dialog.view.*
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException
import java.time.LocalDate
import java.util.*

class MainActivity : AppCompatActivity() {
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
        setContentView(R.layout.activity_main)
        val pastid = intent.getStringExtra("id")
        val pastpasswd = intent.getStringExtra("passwd")
        info.id=pastid
        /*save_cache(info.instance.show())*/
        info.title = "오늘의 계획을 결정하세요!"
        info.content = "메뉴 결정을 위해 누르세요"
        change_noti(info.title,info.content)
        Toast.makeText(baseContext,info.id+"님 안녕하세요??",Toast.LENGTH_SHORT).show()
        find_party.setOnClickListener {
            val intent1 = Intent(baseContext,Choosing::class.java)
            startActivity(intent1)
        }
        see_party.setOnClickListener {
            val intent2 = Intent(baseContext,SeeParty::class.java)
            startActivity(intent2)
        }
        my_info.setOnClickListener {
            val intent3 = Intent(baseContext,MyInfo::class.java)
            intent3.putExtra("id",pastid)
            intent3.putExtra("passwd",pastpasswd)
            startActivity(intent3)
        }
        find.setOnClickListener {
            info.title = "밥 친구가 모였습니다!"
            info.content = "밥 친구 확인과 결제를 위해 누르세요"
            change_noti(info.title,info.content)
            val builder = AlertDialog.Builder(this)
            val dialogView = layoutInflater.inflate(R.layout.dialog, null)
            dialogView.ok.setOnClickListener {
                val intent4 = Intent(baseContext,fin::class.java)
                startActivity(intent4)
            }
            dialogView.no.setOnClickListener {

            }
            builder.setView(dialogView)
                .show()
        }
        exit.setOnClickListener {
            finishAffinity()
            System.exit(0)
        }
    }

    override fun onBackPressed() {
        Toast.makeText(baseContext,"단식을 눌러 종료하세요",Toast.LENGTH_SHORT).show()
        return
    }
}
