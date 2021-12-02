package com.straucorp.scalablesize

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.straucorp.scalablesize.base.BaseFragment
import com.straucorp.scalablesize.databinding.FragmentSecondBinding


class SecondFragment : BaseFragment<FragmentSecondBinding>() {

    override fun inflateViewBinding(inflater: LayoutInflater, container: ViewGroup?, attachToParent: Boolean) =
        FragmentSecondBinding.inflate(inflater, container, attachToParent)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnPrev.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }
}