package com.Depauw.dpuhelpdesk;

import android.app.Activity;  
import android.os.Bundle;   
import android.webkit.WebChromeClient;  
import android.webkit.WebView;  
import android.widget.ProgressBar;
    
public class google_activity_schedulegoogle extends Activity {
    WebView webview;
    private String url = "https://docs.google.com/a/depauw.edu/document/d/1TGdK72bz1Zn1RNhJQedRE02HLGXf1T4cRRfQSdM5hOQ/edit?hl=en&authkey=CNCw16EI";
    ProgressBar pd = null;
     
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);        
         
        setContentView(R.layout.webview_main);
         
        pd = (ProgressBar) findViewById(R.id.progressBar);
         
        webview = (WebView) findViewById(R.id.webView1);
        webview.setWebChromeClient(new WebChromeClient() {
        
        	public void onProgressChanged(WebView view, int progress) {
               if(progress < 100 && pd.getVisibility() == ProgressBar.GONE){
                   pd.setVisibility(ProgressBar.VISIBLE);
               }
               pd.setProgress(progress);
               if(progress == 100) {
                  pd.setVisibility(ProgressBar.GONE);
               }
            }
        });
         
        webview.loadUrl(this.getUrl());        
    }
     
    public void setUrl(String url) {
        this.url = url;
    }
 
    public String getUrl() {
        return url;
    }
}