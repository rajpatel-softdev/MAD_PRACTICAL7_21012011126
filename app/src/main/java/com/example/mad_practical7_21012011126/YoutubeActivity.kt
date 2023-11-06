package com.example.mad_practical7_21012011126

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YoutubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        val toMainActBtn = findViewById<FloatingActionButton>(R.id.fb2)
        toMainActBtn.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        initYoutubePlayer()
    }
    private fun initYoutubePlayer(){
        val id = "fJn9B64Znrk"
        val webView = findViewById<WebView>(R.id.wv1)
        val webSettings = webView.settings
        webSettings.javaScriptEnabled=true
        webView.settings.loadWithOverviewMode = true
        webView.settings.useWideViewPort = true
        webView.loadUrl("https://www.youtube.com/embed/$id")
    }
}