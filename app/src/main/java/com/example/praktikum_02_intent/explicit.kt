package com.example.praktikum_02_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class explicit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit)

        val t_nama : TextView = findViewById(R.id.tampil_nama)
        val t_nomor : TextView = findViewById(R.id.tampil_nomor)

        t_nama.setText(intent.getStringExtra("nama"))
        t_nomor.setText(intent.getStringExtra("nomor"))
    }
}