package com.example.ahmedali.prowserapp;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Ahmed Ali on 1/1/2016.
 */
public class getweb extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);  //// get webview from the web browser and show in my app

        return true;
    }
}
