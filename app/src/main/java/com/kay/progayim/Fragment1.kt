package com.kay.progayim

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment

class Fragment1 : Fragment(R.layout.fragment_1) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn = view.findViewById<AppCompatButton>(R.id.frg1_btn)
        btn.setOnClickListener {
            Toast.makeText(requireContext(), "This is Fragment 1 !!!", Toast.LENGTH_SHORT).show()
        }
    }

    companion object {
        const val TAG = "Fragment1"
    }
}