package com.example.birthdaygreeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_birthday2.*

class BirthdayActivity2 : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday2)
        val name=intent.getStringExtra(NAME_EXTRA)
        birthdayGreeting.text="Happy Birthday\n$name!"


    }
}