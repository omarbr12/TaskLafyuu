package com.example.exercisefiqma

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController


class SplashFragment : Fragment(R.layout.fragment_splash) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val r = Runnable {

            view.findNavController().navigate(R.id.action_splashFragment_to_loginFragment)

        }

        Handler(Looper.getMainLooper()).postDelayed(r, 3000)

    }


}