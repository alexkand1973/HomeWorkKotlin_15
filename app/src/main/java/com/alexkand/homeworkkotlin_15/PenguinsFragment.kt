package com.alexkand.homeworkkotlin_15

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.fragment_penguins.*

class PenguinsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_penguins, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setWebView()
    }

    private fun setWebView(){
        wbv_family_penguins.webViewClient = WebViewClient()
        wbv_family_penguins.loadUrl("https://yandex.ru/images/search?text=виды%20пингвинов&from=tabbar")
        wbv_family_penguins.settings.javaScriptEnabled = true
    }
}