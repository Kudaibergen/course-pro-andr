package com.kay.progayim

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import com.kay.progayim.databinding.Fragment1Binding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_1.*

class Fragment1 : Fragment(R.layout.fragment_1) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        frgTxt.text = ""
        btnGo.setOnClickListener {

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}