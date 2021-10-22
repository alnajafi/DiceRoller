package com.akram.diceroller

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter(value = ["dicaImage"])
fun diceImage(view: ImageView?, value: Int) {
    when (value) {
        1 -> view?.setImageResource(R.drawable.a)
        2 -> view?.setImageResource(R.drawable.b)
        3 -> view?.setImageResource(R.drawable.c)
        4 -> view?.setImageResource(R.drawable.d)
        5 -> view?.setImageResource(R.drawable.e)
        6 -> view?.setImageResource(R.drawable.f)
    }
}