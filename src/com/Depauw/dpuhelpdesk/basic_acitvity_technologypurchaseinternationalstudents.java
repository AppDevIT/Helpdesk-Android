package com.Depauw.dpuhelpdesk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

@SuppressLint("SetJavaScriptEnabled")
public class basic_acitvity_technologypurchaseinternationalstudents extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview_main);
		Initialize();
	}
	
	private void Initialize(){
	
		WebView mainWebView = (WebView) findViewById(R.id.webView1);

        WebSettings webSettings = mainWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        mainWebView.setWebViewClient(new MyCustomWebViewClient());
        mainWebView.loadUrl("http://www.depauw.edu/it/laptop/international/");
        
    	mainWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
    }

    private class MyCustomWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl("http://www.depauw.edu/it/laptop/international/");
            return true;
        }
	}

}


