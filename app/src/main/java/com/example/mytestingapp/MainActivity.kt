package com.example.mytestingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnSetValue: Button? = null
    private lateinit var tvText: TextView

    private var names = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvText = findViewById(R.id.tv_text)
        btnSetValue = findViewById(R.id.btn_set_value)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.btn_set_value) {
            tvText.text = "19"
        }
    }

    // Ketika mengembangkan aplikasi Android, tentu salah satu hal yang paling menantang adalah saat menemukan bug ketika aplikasi dijalankan. Memecahkan sebuah bug di platform android bukanlah hal yang mudah. Ada beragam spesifikasi perangkat Android yang beredar di pasar. Aplikasi kita bisa jadi berjalan lancar di satu peranti. Namun, bermasalah di peranti yang berbeda. Oleh karena itu, kita perlu mengetahui beberapa cara untuk melakukan Debugging. Proses tersebut mengharuskan kita melakukan proses identifikasi bug atau masalah yang muncul dan mencari solusinya.
}