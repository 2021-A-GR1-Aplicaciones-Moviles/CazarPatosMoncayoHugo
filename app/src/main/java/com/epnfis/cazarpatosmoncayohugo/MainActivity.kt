package com.epnfis.cazarpatosmoncayohugo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Toast.makeText(this,"Saludos",Toast.LENGTH_LONG).show()
        Toast.makeText(this, getString(R.string.saludos) ,Toast.LENGTH_LONG).show()
    }
}