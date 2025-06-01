package com.example.autologin

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val webView = WebView(this)
        setContentView(webView)

        webView.settings.javaScriptEnabled = true
        webView.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView?, url: String?) {
                view?.evaluateJavascript("""
                    (function() {
                        document.querySelector('input[name="username"]').value = "Minibones12";
                        document.querySelector('input[name="password"]').value = "chohAfRiHlxoqUs";
                        document.querySelector('form').submit();
                    })();
                """.trimIndent(), null)
            }
        }

        webView.loadUrl("https://bozo1.site/cHFbisAs")
    }
}