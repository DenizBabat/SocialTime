package com.example.deniz.socialtime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by deniz on 12.10.2017.
 */

public class Github extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inst);

        WebView wv = (WebView) findViewById(R.id.web_ins);

        WebSettings webSettings = wv.getSettings();
        wv.getSettings().setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);
        wv.loadUrl("https://www.github.com/login");
        wv.setWebViewClient(new WebViewClient());

    }
}
