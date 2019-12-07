package com.example.ipadlove


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_choose_place.view.*
import kotlinx.android.synthetic.main.fragment_choose_time.view.*

/**
 * A simple [Fragment] subclass.
 */
class choose_place : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var bo = arrayOf(false,false,false)
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_choose_place, container, false)
        Log.i("bt",info.status.toString())
        view.checkbox_place1.setOnClickListener {
            bo[0] = !bo[0]
            if (info.status == 2) {
                info.lunch_place = bo
                Log.i("bt","lunch comp33")
            }
            if(info.status == 5){
                info.dinner_place = bo
                Log.i("bt","dinner comp33")
            }
        }
        view.checkbox_place2.setOnClickListener {
            bo[1] = !bo[1]
            if (info.status == 2) {
                info.lunch_place = bo
                Log.i("bt","lunch comp33")
            }
            if(info.status == 5){
                info.dinner_place = bo
                Log.i("bt","dinner comp33")
            }
        }
        view.checkbox_place3.setOnClickListener {
            bo[2] = !bo[2]
            if (info.status == 2) {
                info.lunch_place = bo
                Log.i("bt","lunch comp33")
            }
            if(info.status == 5){
                info.dinner_place = bo
                Log.i("bt","dinner comp33")
            }
        }

        return view
    }


}
