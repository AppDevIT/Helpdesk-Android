package com.Depauw.dpuhelpdesk;

import android.app.Activity;  
import android.os.Bundle;   
import android.webkit.WebChromeClient;  
import android.webkit.WebView;  
import android.widget.ProgressBar;
    
public class network_activity_offcampusmac extends Activity {
    WebView webview;
    private String url = "http://kb.wordpress.depauw.edu/?page_id=3632";
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