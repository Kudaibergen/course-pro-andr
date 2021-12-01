package com.kay.progayim

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.fragment.app.Fragment

class Fragment1 : Fragment(R.layout.fragment_1) {
    private lateinit var listener: OnFragmentClickListener

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as OnFragmentClickListener
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val editText = view.findViewById<AppCompatEditText>(R.id.edit)
        val btn = view.findViewById<AppCompatButton>(R.id.btn)

        btn.setOnClickListener {
            listener.onClick(editText.text.toString())
        }
    }
}