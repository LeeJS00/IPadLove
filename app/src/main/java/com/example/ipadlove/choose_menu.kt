package com.example.ipadlove


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_choose_menu.*
import kotlinx.android.synthetic.main.fragment_choose_menu.view.*
import kotlinx.android.synthetic.main.fragment_choose_place.view.*

/**
 * A simple [Fragment] subclass.
 */
class choose_menu : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var now:Int = 0
        var bo = arrayOf(-1,-1,-1)
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_choose_menu, container, false)

        Log.i("bt",info.status.toString())
        view.ib_1.setOnClickListener {
            val num = 1
            bo[now%3] = num
            now+=1
            if(now %3 == 1){
                show1.setImageResource(R.drawable.chicken)
            }
            if(now %3 == 2){
                if(bo[0]!=num) {
                    show2.setImageResource(R.drawable.chicken)
                }
                else{
                    now-=1
                }
            }
            if(now %3 == 0){
                if(bo[0]!=num && bo[1]!=num) {
                    show3.setImageResource(R.drawable.chicken)
                }
                else{
                    now-=1
                }
            }
            if (info.status == 3) {
                info.lunch_menu = bo
                Log.i("bt","lunch comp11")
            }
            if(info.status == 6){
                info.dinner_menu = bo
                Log.i("bt","dinner comp11")
            }
        }
        view.ib_2.setOnClickListener {
            val num = 2
            bo[now%3] = num
            now+=1
            if((now %3 == 1)){
                show1.setImageResource(R.drawable.korean)
            }
            if((now %3 == 2)){
                if(bo[0]!=num) {
                    show2.setImageResource(R.drawable.korean)
                }
                else{
                    now-=1
                }
            }
            if((now %3 == 0)){
                if(bo[0]!=num && bo[1]!=num) {
                    show3.setImageResource(R.drawable.korean)
                }
                else{
                    now-=1
                }
            }
            if (info.status == 3) {
                info.lunch_menu = bo
                Log.i("bt","lunch comp11")
            }
            if(info.status == 6){
                info.dinner_menu = bo
                Log.i("bt","dinner comp11")
            }
        }
        view.ib_3.setOnClickListener {
            val num = 3
            bo[now%3] = num
            now+=1
            if(now %3 == 1){
                show1.setImageResource(R.drawable.hamburg)
            }
            if((now %3 == 2)){
                if(bo[0]!=num) {
                    show2.setImageResource(R.drawable.hamburg)
                }
                else{
                    now-=1
                }
            }
            if((now %3 == 0)){
                if(bo[0]!=num && bo[1]!=num) {
                    show3.setImageResource(R.drawable.hamburg)
                }
                else{
                    now-=1
                }
            }
            if (info.status == 3) {
                info.lunch_menu = bo
                Log.i("bt","lunch comp11")
            }
            if(info.status == 6){
                info.dinner_menu = bo
                Log.i("bt","dinner comp11")
            }
        }

        view.ib_4.setOnClickListener {
            val num = 4
            bo[now%3] = num
            now+=1
            if((now %3 == 1)){
                show1.setImageResource(R.drawable.china)
            }
            if((now %3 == 2)){
                if(bo[0]!=num) {
                    show2.setImageResource(R.drawable.china)
                }
                else{
                    now-=1
                }
            }
            if((now %3 == 0)){
                if(bo[0]!=num && bo[1]!=num) {
                    show3.setImageResource(R.drawable.china)
                }
                else{
                    now-=1
                }
            }
            if (info.status == 3) {
                info.lunch_menu = bo
                Log.i("bt","lunch comp11")
            }
            if(info.status == 6){
                info.dinner_menu = bo
                Log.i("bt","dinner comp11")
            }
        }
        view.ib_5.setOnClickListener {
            val num = 5
            bo[now%3] = num
            now+=1
            if((now %3 == 1)){
                show1.setImageResource(R.drawable.pig)
            }
            if((now %3 == 2)){
                if(bo[0]!=num) {
                    show2.setImageResource(R.drawable.pig)
                }
                else{
                    now-=1
                }
            }
            if((now %3 == 0)){
                if(bo[0]!=num && bo[1]!=num) {
                    show3.setImageResource(R.drawable.pig)
                }
                else{
                    now-=1
                }
            }
            if (info.status == 3) {
                info.lunch_menu = bo
                Log.i("bt","lunch comp11")
            }
            if(info.status == 6){
                info.dinner_menu = bo
                Log.i("bt","dinner comp11")
            }
        }
        view.ib_6.setOnClickListener {
            val num = 6
            bo[now%3] = num
            now+=1
            if((now %3 == 1)){
                show1.setImageResource(R.drawable.pizza)
            }
            if((now %3 == 2)){
                if(bo[0]!=num) {
                    show2.setImageResource(R.drawable.pizza)
                }
                else{
                    now-=1
                }
            }
            if((now %3 == 0)){
                if(bo[0]!=num && bo[1]!=num) {
                    show3.setImageResource(R.drawable.pizza)
                }
                else{
                    now-=1
                }
            }
            if (info.status == 3) {
                info.lunch_menu = bo
                Log.i("bt","lunch comp11")
            }
            if(info.status == 6){
                info.dinner_menu = bo
                Log.i("bt","dinner comp11")
            }
        }
        view.ib_7.setOnClickListener {
            val num = 7
            bo[now%3] = num
            now+=1
            if((now %3 == 1)){
                show1.setImageResource(R.drawable.seafood)
            }
            if((now %3 == 2)){
                if(bo[0]!=num) {
                    show2.setImageResource(R.drawable.seafood)
                }
                else{
                    now-=1
                }
            }
            if((now %3 == 0)){
                if(bo[0]!=num && bo[1]!=num) {
                    show3.setImageResource(R.drawable.seafood)
                }
                else{
                    now-=1
                }
            }
            if (info.status == 3) {
                info.lunch_menu = bo
                Log.i("bt","lunch comp11")
            }
            if(info.status == 6){
                info.dinner_menu = bo
                Log.i("bt","dinner comp11")
            }
        }
        view.ib_8.setOnClickListener {
            val num = 8
            bo[now%3] = num
            now+=1
            if((now %3 == 1)){
                show1.setImageResource(R.drawable.snack)
            }
            if((now %3 == 2)){
                if(bo[0]!=num) {
                    show2.setImageResource(R.drawable.snack)
                }
                else{
                    now-=1
                }
            }
            if((now %3 == 0)){
                if(bo[0]!=num && bo[1]!=num) {
                    show3.setImageResource(R.drawable.snack)
                }
                else{
                    now-=1
                }
            }
            if (info.status == 3) {
                info.lunch_menu = bo
                Log.i("bt","lunch comp11")
            }
            if(info.status == 6){
                info.dinner_menu = bo
                Log.i("bt","dinner comp11")
            }
        }
        return view
    }


}
