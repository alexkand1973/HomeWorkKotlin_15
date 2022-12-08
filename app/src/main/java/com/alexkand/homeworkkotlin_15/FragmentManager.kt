package com.alexkand.homeworkkotlin_15

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

fun FragmentManager.navigateToFragment(fragment: Fragment, addToBackStack: Boolean) {
    if (addToBackStack) {
        beginTransaction().replace(R.id.fragmentContainer, fragment)
            .addToBackStack(null).commit()
    } else {
        beginTransaction().replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}