package kr.co.isdev.gitget

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.webkit.WebView

/**
 * Created by word on 21/12/2017.
 */

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val myWebView = findViewById<View>(R.id.webview) as WebView
        myWebView.loadUrl("https://api.github.com/user")

    }
}
