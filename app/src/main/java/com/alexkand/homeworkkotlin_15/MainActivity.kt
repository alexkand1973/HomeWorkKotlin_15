package com.alexkand.homeworkkotlin_15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.navigateToFragment(fragment = HomeFragment(), addToBackStack = false)
    }
}
//Сделайте приложение в котором будут находиться 4 экрана.
// На первом экране у нас находится 3 кнопки. С текстами: "Виды котов",
// "Виды собак", "Виды пингвинов". По нажатию на кнопки должна совершаться навигация
// на соответствующие фрагменты с WebView в котором указан соответствующий сайт.
