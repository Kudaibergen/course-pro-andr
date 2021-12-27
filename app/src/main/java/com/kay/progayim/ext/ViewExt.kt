package com.kay.progayim.ext

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding

inline fun <T : ViewBinding> ViewGroup.viewBinding(block: (LayoutInflater, ViewGroup) -> T): T {
    return block.invoke(LayoutInflater.from(context), this)
}

fun AttributeSet?.obtainStyledAttributes(context: Context, styleable: IntArray, block: (TypedArray) -> Unit) {
    if (this == null) return

    val typedArray = context.obtainStyledAttributes(this, styleable, 0, 0)
    try {
        block(typedArray)
    } finally {
        typedArray.recycle()
    }
}