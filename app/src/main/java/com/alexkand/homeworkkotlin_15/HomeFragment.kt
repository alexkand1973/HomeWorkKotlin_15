package com.alexkand.homeworkkotlin_15

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setListenerFragment()
    }

    private fun setListenerFragment() {
        btn_go_to_cats.setOnClickListener {
            requireActivity().supportFragmentManager.navigateToFragment(
                fragment = CatsFragment(), addToBackStack = true
            )
        }

        btn_go_to_dogs.setOnClickListener {
            requireActivity().supportFragmentManager.navigateToFragment(
                fragment = DogsFragment(), addToBackStack = true
            )
        }

        btn_go_to_penguins.setOnClickListener {
            requireActivity().supportFragmentManager.navigateToFragment(
                fragment = PenguinsFragment(), addToBackStack = true
            )
        }
    }
}