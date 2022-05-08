package com.cookandroid.lolchampion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class GarenActivity extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garen);

        mWebView = findViewById(R.id.WebView1);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl("https://www.op.gg/champions/garen/top/build");
        mWebView.setWebChromeClient(new WebChromeClient());

    }
}