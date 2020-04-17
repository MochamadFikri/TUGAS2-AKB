package com.example.tugas2_akb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

//Tanggal : 17 - 18 April 2020
//NIM     : 10117198
//Nama    : Mochamad Fikri Fadila Akbar
//Kelas   : IF-5

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        var btnregister = findViewById<Button>(R.id.btn_register)

        btnregister.setOnClickListener{
            startActivity(Intent(this,Almost::class.java))
        }
    }
}
