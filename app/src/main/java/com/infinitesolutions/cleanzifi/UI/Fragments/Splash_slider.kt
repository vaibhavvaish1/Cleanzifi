package com.infinitesolutions.cleanzifi.UI.Fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import com.infinitesolutions.cleanzifi.databinding.FragmentSplashSliderBinding


class Splash_slider : Fragment() {

    lateinit var splash_slider_binding: FragmentSplashSliderBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        splash_slider_binding = FragmentSplashSliderBinding.inflate(inflater, container, false)
        return splash_slider_binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            val homeIntent = Intent(Intent.ACTION_MAIN)
            homeIntent.addCategory(Intent.CATEGORY_HOME)
            homeIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(homeIntent)
        }

    }

}