package com.example.mymotionlayout.scenes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.TransitionAdapter
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mymotionlayout.R
import kotlinx.android.synthetic.main.activity_scene9.*

class Scene9Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scene9)

        val viewModel = ViewModelProvider(this)
            .get(ContactViewModel::class.java)

        viewModel
            .contact
            .observe(this, { model ->
                //containerCardOne.setBackgroundColor(model.cardTop.backgroundColor)
                //containerCardTwo.setBackgroundColor(model.cardBottom.backgroundColor)
            })

        motionLayout.setTransitionListener(object : TransitionAdapter() {
            override fun onTransitionCompleted(motionLayout: MotionLayout, currentId: Int) {
//                when (currentId) {
//                    R.id.offScreenUnlike,
//                    R.id.offScreenLike -> {
//                        motionLayout.progress = 0f
//                        motionLayout.setTransition(R.id.start, R.id.detail)
//                        viewModel.swipe()
//                    }
//                }
            }
        })
    }
}