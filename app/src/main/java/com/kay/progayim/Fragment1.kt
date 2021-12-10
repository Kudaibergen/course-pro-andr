package com.kay.progayim

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.kay.progayim.databinding.Fragment1Binding

class Fragment1 : Fragment(R.layout.fragment_1) {
    private var _binding: Fragment1Binding? = null
    private val binding = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = Fragment1Binding.bind(view)

        binding.apply {
            frgTxt.text = ""
            btnToast.setOnClickListener {}
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}