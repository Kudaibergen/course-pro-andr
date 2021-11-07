package com.kay.progayim

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment

class Fragment1 : Fragment(R.layout.fragment_1) {
    private lateinit var listener: OnButtonClicked

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as OnButtonClicked
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn1 = view.findViewById<AppCompatButton>(R.id.frg1_btn1)
        val btn2 = view.findViewById<AppCompatButton>(R.id.frg1_btn2)

        btn1.setOnClickListener(::onClick)
        btn2.setOnClickListener(::onClick)
    }

    private fun onClick(view: View) {
        when(view.id) {
            R.id.frg1_btn1 -> {
                listener.onButtonClicked("ice_cream")
            }
            R.id.frg1_btn2 -> {
                listener.onButtonClicked("smart_prone")
            }
        }
    }
}