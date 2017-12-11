package com.example.deniz.socialtime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by deniz on 13.10.2017.
 */

public class Snapchat extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snap);

        WebView wv = (WebView) findViewById(R.id.web_snap);

        WebSettings webSettings = wv.getSettings();
        wv.getSettings().setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);
        wv.loadUrl("https://accounts.snapchat.com/accounts/login?continue=https%3A%2F%2Faccounts.snapchat.com%2Faccounts%2Fwelcome");
        wv.setWebViewClient(new WebViewClient());
    }
}
