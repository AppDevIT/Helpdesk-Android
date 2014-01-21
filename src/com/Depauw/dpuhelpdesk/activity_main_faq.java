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
import android.view.Menu;
import android.widget.TextView;

public class activity_main_faq extends Activity{
	//This here helps pre-define for the entire page what each variable will contain.
	//You need to define what type of variables you will be using.
	private TextView Intro, body1, subBody1, body2, subBody2;
	
	//This onCreate will help explain what happens to the page
    //as it loads.
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//this here links the page to the xml
		setContentView(R.layout.activity_main_faq);
		//I created an "Initialize()" method for the sake of splitting everything up.
		//Its been more of a personal preference over anything else.
		//You can name it whatever you want, if you choose to use a separate 
		//initialize method.
		Initialize();
	}
	
	private void Initialize(){
		//This helps link up the xml page with the variables I have declared
	    Intro = (TextView) findViewById(R.id.textView1);
	    body1 = (TextView) findViewById(R.id.textView2);
	    subBody1 = (TextView) findViewById(R.id.textView3);
	    body2 = (TextView) findViewById(R.id.textView4);
	    subBody2 = (TextView) findViewById(R.id.textView5);
	    
	    //All of the dialog for the FAQ
	    Intro.setText("Freqeuntly Asked Questions");
	    //This bellow just tells the TextView what to say on load.
	    //You can go to the res-->values-->strings.xml and write the text
	    //there but I prefer this method.
	    body1.setText("Q: Why does this app not show the pages I want to see?");
	    subBody1.setText("A: This happens because you have either no internet connect or very weak signal. Please check your connection and try again.");
	    
	    body2.setText("Q: I am connected to the internet but still cannot load pages");
	    subBody2.setText("A: Either you have too weak of a connection or it is a bug within the app itself. If this occurs, please email the helpdesk using our 'Give feedback on this app' button on the homescreen of this app. A programmer will try to resolve the issue and release an update on Google Play if the issue can be resolved");
	    
    }

	//This right here is useless unless you program it to do something
	//The original version does not utilize this part of the system.
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}


