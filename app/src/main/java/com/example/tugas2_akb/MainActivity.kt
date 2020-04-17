package com.example.tugas2_akb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

//Tanggal : 17 - 18 April 2020
//NIM     : 10117198
//Nama    : Mochamad Fikri Fadila Akbar
//Kelas   : IF-5

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txtregister = findViewById<TextView>(R.id.txt_main_does)

        txtregister.setOnClickListener{
            startActivity(Intent(this,Register::class.java))
        }

    }
}
