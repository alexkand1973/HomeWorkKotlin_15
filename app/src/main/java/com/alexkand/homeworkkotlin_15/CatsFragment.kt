package com.alexkand.homeworkkotlin_15

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.fragment_cats.*

class CatsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cats, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setWebView()
    }

    private fun setWebView(){
        wbv_family_cats.webViewClient = WebViewClient()
        wbv_family_cats.loadUrl("https://yandex.ru/images/search?from=tabbar&text=виды%20котов")
        wbv_family_cats.settings.javaScriptEnabled = true
    }
}