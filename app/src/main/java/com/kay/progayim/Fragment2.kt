package com.kay.progayim

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment

class Fragment2 : Fragment(R.layout.fragment_2) {
    private lateinit var txt: AppCompatTextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        txt = view.findViewById(R.id.txt)

        val text = arguments?.getString("key") ?: "defaultText"
        txt.text = text

    }

    companion object {
        const val TAG = "Fragment2"
    }
}