package com.example.mymotionlayout.scenes.models

import androidx.annotation.ColorInt

data class ContactCardModel(
    val name: String,
    val age: Int,
    val description: String,
    @ColorInt val backgroundColor: Int
)