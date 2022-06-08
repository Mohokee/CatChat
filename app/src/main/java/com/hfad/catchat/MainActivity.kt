package com.hfad.catchat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Create a val for the custom theme toolbar
        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)

        //set custom theme toolbar
        setSupportActionBar(toolbar)
    }
}