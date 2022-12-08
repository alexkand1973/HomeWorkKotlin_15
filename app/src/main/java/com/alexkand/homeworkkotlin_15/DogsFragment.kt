package com.alexkand.homeworkkotlin_15

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.fragment_dogs.*


class DogsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dogs, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setWebView()
    }

    private fun setWebView(){
        wbv_family_dogs.webViewClient = WebViewClient()
        wbv_family_dogs.loadUrl("https://yandex.ru/images/search?text=виды%20собак&stype=image&lr=213&source=serp")
        wbv_family_dogs.settings.javaScriptEnabled = true
    }

}
