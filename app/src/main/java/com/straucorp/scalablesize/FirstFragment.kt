package com.straucorp.scalablesize

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.straucorp.scalablesize.base.BaseFragment
import com.straucorp.scalablesize.databinding.FragmentFirstBinding


class FirstFragment : BaseFragment<FragmentFirstBinding>() {

    override fun inflateViewBinding(inflater: LayoutInflater, container: ViewGroup?, attachToParent: Boolean) =
        FragmentFirstBinding.inflate(inflater, container, attachToParent)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }
}