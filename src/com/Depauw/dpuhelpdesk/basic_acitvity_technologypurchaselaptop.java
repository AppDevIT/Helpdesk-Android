//Everything needs to be created in a package environment
package com.Depauw.dpuhelpdesk;

//When working with software that requires extra libraries, 
//you need to import the "rules" pertaining to said software.
//For those who are beginners, don't worry about this. A lot
//of times, when you add code eclipse doesn't recognize,
//there will be a red syntax error line under the code
//like this word gpiwegipn. All you need to do is right click
//the underlined code and go to quick-fix. Then an import option
//should be at the very top of options. Just click on it and eclipse
//will do the rest.
import android.app.Activity;  
import android.os.Bundle;   
import android.webkit.WebChromeClient;  
import android.webkit.WebView;  
import android.widget.ProgressBar;
    
public class basic_acitvity_technologypurchaselaptop extends Activity {
	//This here helps pre-define for the entire page what each variable will contain
    WebView webview;
    private String url = "http://www.depauw.edu/it/laptop/purchasing/";
    ProgressBar pd = null;
    //This onCreate will help explain what happens to the page
    //as it loads.
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);        
        //this here links the page to the webview xml
        //which allows the web page to be viewed.
        setContentView(R.layout.webview_main);
        //This tells the component within webview what to do
        //with the progress bar if pd is used. This just connects
        //it to the webview xml.
        pd = (ProgressBar) findViewById(R.id.progressBar);
         
        webview = (WebView) findViewById(R.id.webView1);
        webview.setWebChromeClient(new WebChromeClient() {
        	//This is the spine of the progress bar within the webview
        	//xml file. This tells the page what to do as information is 
        	//being received.
        	public void onProgressChanged(WebView view, int progress) {
               if(progress < 100 && pd.getVisibility() == ProgressBar.GONE){
                   pd.setVisibility(ProgressBar.VISIBLE);
               }
               //once the page has fully loaded, make the progress bar
               //invisible and give the entire space to the web page.
               pd.setProgress(progress);
               if(progress == 100) {
                  pd.setVisibility(ProgressBar.GONE);
               }
            }
        });
        //this is the part of the code that actually loads the page
        webview.loadUrl(this.getUrl());        
    }
    //these two are just helpers in returning and setting the urls
    public void setUrl(String url) {
        this.url = url;
    }
 
    public String getUrl() {
        return url;
    }
}