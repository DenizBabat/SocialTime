package com.example.deniz.socialtime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by deniz on 12.10.2017.
 */

public class Facebook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face);

        WebView wv = (WebView) findViewById(R.id.web_face);

        WebSettings webSettings = wv.getSettings();
        wv.getSettings().setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);
        wv.loadUrl("https://www.facebook.com/");
        wv.setWebViewClient(new WebViewClient());

    }
}