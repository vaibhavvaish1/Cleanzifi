package com.infinitesolutions.cleanzifi.UI.Fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.infinitesolutions.cleanzifi.R
import com.infinitesolutions.cleanzifi.databinding.FragmentSplashMainBinding

class Splash_main : Fragment() {

    lateinit var splash_main_binding: FragmentSplashMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        splash_main_binding = FragmentSplashMainBinding.inflate(inflater, container, false)
        return splash_main_binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Handler(Looper.getMainLooper()).postDelayed({
            getView()?.let { Navigation.findNavController(it).navigate(R.id.action_splash_main_to_splash_slider) }
        }, 3000)
    }
}