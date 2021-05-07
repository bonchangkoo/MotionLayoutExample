package com.example.mymotionlayout.scenes

import android.graphics.Color
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mymotionlayout.scenes.models.ContactCardModel
import com.example.mymotionlayout.scenes.models.ContactModel

class ContactViewModel : ViewModel() {

    private val _contact = MutableLiveData<ContactModel>()

    val contact: LiveData<ContactModel>
        get() = _contact

    private val contactCardList = listOf(
        ContactCardModel(
            name = "구 본창", age = 27, description = "예시 설명입니다.", backgroundColor = Color.parseColor("#c50e29")
        ),
        ContactCardModel(
            name = "김 희수", age = 2, description = "예시 설명입니다.", backgroundColor = Color.parseColor("#c60055")
        ),
        ContactCardModel(
            name = "양 용직", age = 27, description = "예시 설명입니다.", backgroundColor = Color.parseColor("#aa00c7")
        ),
        ContactCardModel(
            name = "성 찬호", age = 34, description = "예시 설명입니다.", backgroundColor = Color.parseColor("#3f1dcb")
        ),
        ContactCardModel(
            name = "박 홍철", age = 27, description = "예시 설명입니다.", backgroundColor = Color.parseColor("#0043ca")
        ),
        ContactCardModel(
            name = "박 병용", age = 222, description = "예시 설명입니다.", backgroundColor = Color.parseColor("#005ecb")
        ),
        ContactCardModel(
            name = "정 혜진", age = 5, description = "예시 설명입니다.", backgroundColor = Color.parseColor("#00b686")
        ),
        ContactCardModel(
            name = "이 서현", age = 3, description = "예시 설명입니다.", backgroundColor = Color.parseColor("#00b248")
        ),
        ContactCardModel(
            name = "윤 태식", age = 44, description = "예시 설명입니다.", backgroundColor = Color.parseColor("#32cb00")
        ),
        ContactCardModel(
            name = "최 인호", age = 87, description = "예시 설명입니다.", backgroundColor = Color.parseColor("#90cc00")
        ),
        ContactCardModel(
            name = "조 현준", age = 23, description = "예시 설명입니다.", backgroundColor = Color.parseColor("#c7b800")
        ),
        ContactCardModel(
            name = "강 신봉", age = 27, description = "예시 설명입니다.", backgroundColor = Color.parseColor("#c79400")
        ),
        ContactCardModel(
            name = "남 경식", age = 237, description = "예시 설명입니다.", backgroundColor = Color.parseColor("#c56200")
        )
    )
    private var currentIndex = 0

    private val topCard
        get() = contactCardList[currentIndex % contactCardList.size]

    private val bottomCard
        get() = contactCardList[(currentIndex + 1) % contactCardList.size]

    init {
        updateCards()
    }

    fun swipe() {
        currentIndex += 1
        updateCards()
    }

    private fun updateCards() {
        _contact.value = ContactModel(
            cardTop = topCard,
            cardBottom = bottomCard
        )
    }
}
