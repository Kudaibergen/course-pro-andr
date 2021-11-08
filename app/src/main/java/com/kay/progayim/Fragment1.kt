package com.kay.progayim

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment

class Fragment1 : Fragment(R.layout.fragment_1) {
    private lateinit var listener: OnClickListener
    private lateinit var txt: AppCompatTextView

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as OnClickListener
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        txt = view.findViewById(R.id.fragment1_txt1)
        val btn = view.findViewById<AppCompatButton>(R.id.fragment1_btn)
        btn.setOnClickListener {
            // -> send "AAA"
            listener.onClicked("AAA")
        }
    }

    fun setValue(value: String) {
        txt.text = value
    }

}