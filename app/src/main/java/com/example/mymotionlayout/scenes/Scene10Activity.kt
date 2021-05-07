package com.example.mymotionlayout.scenes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.TransitionAdapter
import androidx.lifecycle.ViewModelProvider
import com.example.mymotionlayout.R
import com.example.mymotionlayout.scenes.models.ContactModel
import kotlinx.android.synthetic.main.activity_scene10.*

class Scene10Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scene10)

        val viewModel = ViewModelProvider(this)
            .get(ContactViewModel::class.java)

        viewModel
            .contact
            .observe(this, {
                bindCard(it)
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

        likeFloating.setOnClickListener {
             // motionLayout.transitionToState(R.id.like)
        }

        unlikeFloating.setOnClickListener {
             // motionLayout.transitionToState(R.id.unlike)
        }
    }

    private fun bindCard(model: ContactModel) {
        containerCardOne.setBackgroundColor(model.cardTop.backgroundColor)
        name.text = "${model.cardTop.name}, ${model.cardTop.age}"
        description.text = model.cardTop.description
        containerCardTwo.setBackgroundColor(model.cardBottom.backgroundColor)
    }
}