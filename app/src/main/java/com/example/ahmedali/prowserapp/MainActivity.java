package com.example.ahmedali.prowserapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    WebView wv;
    EditText editText;
    Button search;
    Button forward;
    Button backward;
    Button history;
    Button refresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search= (Button) findViewById(R.id.search);
        forward= (Button) findViewById(R.id.forward);
        backward= (Button) findViewById(R.id.backward);
        history= (Button) findViewById(R.id.history);
        refresh= (Button) findViewById(R.id.refresh);

        editText= (EditText) findViewById(R.id.edit);

        wv= (WebView) findViewById(R.id.web);

        //getweb obj=new getweb();

       // obj.shouldOverrideUrlLoading(wv,"http://google.com");

        wv.getSettings().setJavaScriptEnabled(true);

        wv.loadUrl("http://google.com");

        wv.setWebViewClient(new getweb());


        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url_str;
                url_str=editText.getText().toString();
                wv.loadUrl("http://"+url_str+".com");

            }
        });

        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(wv.canGoForward())
                {
                    wv.goForward();
                }

            }
        });

        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(wv.canGoBack())
                    wv.goBack();

            }
        });

        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.reload();
            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.clearHistory();
            }
        });
    }


}