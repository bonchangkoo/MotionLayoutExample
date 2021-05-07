package com.example.mymotionlayout.scenes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mymotionlayout.R

class Scene9Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scene9)

        val viewModel = ViewModelProvider(this)
            .get(ContactViewModel::class.java)

        viewModel
            .contact
            .observe(this, Observer {
                // todo: bindCard
            })
    }
}