package com.xpandeyed.webviewandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient




class WebActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        setContentView(R.layout.activity_web_actiivity)
        val wbMyWebView = findViewById<WebView>(R.id.wbMyWebView)
        wbMyWebView.webViewClient = WebViewClient()
        wbMyWebView.getSettings().setJavaScriptEnabled(true)
        wbMyWebView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfMmIbJaABCCrUleQn5eftLnyPZ9N9AMU96MvnDUdMzDJww7A/viewform?usp=sf_link")
    }
}