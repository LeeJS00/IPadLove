package com.example.ipadlove


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_choose_time.*
import kotlinx.android.synthetic.main.fragment_choose_time.view.*
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException
import java.util.*

/**
 * A simple [Fragment] subclass.
 */
class choose_time : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var bo = arrayOf(false,false,false,false)
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_choose_time, container, false)
        Log.i("bt",info.status.toString())
        if(info.status!=1){
            view.checkbox_time1.text="5시"
            view.checkbox_time2.text="5시반"
            view.checkbox_time3.text="6시"
            view.checkbox_time4.text="6시반"
        }
        view.checkbox_time1.setOnClickListener { view ->
            bo[0] = !bo[0]
            if (info.status ==1) {
                info.lunch = bo
                Log.i("bt","lunch comp22")
            }
            if(info.status == 4){
                info.dinner = bo
                Log.i("bt","dinner comp22")
            }
        }
        view.checkbox_time2.setOnClickListener { view ->
            bo[1] = !bo[1]
            if (info.status ==1) {
                info.lunch = bo
                Log.i("bt","lunch comp22")
            }
            if(info.status == 4){
                info.dinner = bo
                Log.i("bt","dinner comp22")
            }
        }
        view.checkbox_time3.setOnClickListener { view ->
            bo[2] = !bo[2]
            if (info.status ==1) {
                info.lunch = bo
                Log.i("bt","lunch comp22")
            }
            if(info.status == 4){
                info.dinner = bo
                Log.i("bt","dinner comp22")
            }
        }
        view.checkbox_time4.setOnClickListener { view ->
            bo[3] = !bo[3]
            if (info.status ==1) {
                info.lunch = bo
                Log.i("bt","lunch comp22")
            }
            if(info.status == 4){
                info.dinner = bo
                Log.i("bt","dinner comp22")
            }
        }
        return view
    }


}
