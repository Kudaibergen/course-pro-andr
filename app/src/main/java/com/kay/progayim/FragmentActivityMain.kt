package com.kay.progayim

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment

class FragmentActivityMain : Fragment(R.layout.fragment_act_main) {

    private lateinit var txt: AppCompatTextView
    private lateinit var listener: OnButtonClicked

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as OnButtonClicked
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txt = view.findViewById(R.id.txt_fragment)

        val edit = view.findViewById<AppCompatEditText>(R.id.frg_edit)
        val btn = view.findViewById<AppCompatButton>(R.id.frg1_btn)

        btn.setOnClickListener {
            listener.onButtonClicked(edit.text.toString())
        }
    }

    fun setText(enteredText: String) {
        txt.text = enteredText
    }

}