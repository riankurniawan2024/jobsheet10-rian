package com.example.job10

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_2 : AppCompatActivity() {

    private lateinit var namaView: TextView
    private lateinit var kelasView: TextView
    private lateinit var  nisView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_2)
        namaView = findViewById(R.id.namaView)
        kelasView = findViewById(R.id.kelasView)
        nisView = findViewById(R.id.nisView)

        val extras = intent.extras

        namaView.text = extras?.getString("nama")
        kelasView.text = extras?.getString("Kelas")
        nisView.text = extras?.getString("Nis")


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}