package com.example.praktikum_02_intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit_nama : EditText = findViewById(R.id.namabar)
        val edit_nomor : EditText = findViewById(R.id.nomorbar)
        val simpan : Button = findViewById(R.id.simpan)
        val nomorbtn : Button = findViewById(R.id.nomorbtn)

        simpan.setOnClickListener {
            val intent = Intent(this, explicit::class.java)
            intent.putExtra("nama", edit_nama.text.toString())
            intent.putExtra("nomor", edit_nomor.text.toString())
            startActivity(intent)
        }

        nomorbtn.setOnClickListener {
            val phoneNumber = edit_nomor.text.toString()
            val message = "Hai, ini pesan dari aplikasi saya!"
            val sendIntent = Intent(Intent.ACTION_VIEW)
                .setData(Uri.parse("https://api.whatsapp.com/send?phone=$phoneNumber&text=$message"))
            startActivity(sendIntent)
        }

    }
}