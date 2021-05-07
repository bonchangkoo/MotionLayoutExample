package com.example.mymotionlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mymotionlayout.scenes.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        scene_1.setOnClickListener {
            startActivity(
                Intent(this, Scene1Activity::class.java)
            )
        }

        scene_2.setOnClickListener {
            startActivity(
                Intent(this, Scene2Activity::class.java)
            )
        }

        scene_3.setOnClickListener {
            startActivity(
                Intent(this, Scene3Activity::class.java)
            )
        }

        scene_4.setOnClickListener {
            startActivity(
                Intent(this, Scene4Activity::class.java)
            )
        }

        scene_5.setOnClickListener {
            startActivity(
                Intent(this, Scene5Activity::class.java)
            )
        }

        scene_6.setOnClickListener {
            startActivity(
                Intent(this, Scene6Activity::class.java)
            )
        }

        scene_7.setOnClickListener {
            startActivity(
                Intent(this, Scene7Activity::class.java)
            )
        }

        scene_8.setOnClickListener {
            startActivity(
                Intent(this, Scene8Activity::class.java)
            )
        }

        scene_9.setOnClickListener {
            startActivity(
                Intent(this, Scene9Activity::class.java)
            )
        }

        scene_10.setOnClickListener {
            startActivity(
                Intent(this, Scene10Activity::class.java)
            )
        }
    }
}