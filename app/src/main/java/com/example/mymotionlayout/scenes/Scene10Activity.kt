package com.example.mymotionlayout.scenes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mymotionlayout.R

class Scene10Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scene10)

        val viewModel = ViewModelProvider(this)
            .get(ContactViewModel::class.java)

        viewModel
            .contact
            .observe(this, Observer {
                // todo: bindCard
            })
    }
}