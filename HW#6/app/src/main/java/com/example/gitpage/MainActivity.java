package com.example.gitpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView gitWebview = findViewById(R.id.webview);
        gitWebview.setWebViewClient(new WebViewClient());
//        setContentView(gitWebview);

        WebSettings webSettings = gitWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        gitWebview.loadUrl("https://shunCode.github.io");
    }
}

