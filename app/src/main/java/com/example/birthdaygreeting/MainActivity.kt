package com.example.birthdaygreeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun BirthdayActivity(view: View) {
        val name = NameInput.editableText.toString()
        val intent = Intent(this,BirthdayActivity2::class.java)
        intent.putExtra(BirthdayActivity2.NAME_EXTRA, name)
        Toast.makeText(this,"Button is clicked",Toast.LENGTH_LONG).show()
        startActivity(intent)
    }
}