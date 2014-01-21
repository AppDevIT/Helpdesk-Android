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

public class developer extends Activity{
	//This here helps pre-define for the entire page what each variable will contain.
	//You need to define what type of variables you will be using.
	private TextView Intro, body1, body2;
	
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
	    body2 = (TextView) findViewById(R.id.textView3);
	    
	    //All of the dialog for the FAQ
	    Intro.setText("Become a developer");
	    //This bellow just tells the TextView what to say on load.
	    //You can go to the res-->values-->strings.xml and write the text
	    //there but I prefer this method.
	    body1.setText("Want to become a developer of this app?");    
	    body2.setText("I have uploaded all of this app's to Github.com at the url: http://www.github.com/code. Please feel free to download it and edit it however you want. " +
	    "If you would like to submit your work to us, please do so by emailing either the page you want to add, or the full zip file to helpdesk@depauw.edu. " +
	    "ATTENTION: Submission of code without comments of what has been newly added and how it works, will be discarded. You can just include in the main tree a text file named something like " +
	    "NEWADDITIONS.txt naming which pages were editted and a breif description of how you updated this code. " +
	    "If your code works fine on our end (if it works on your phone and emulator, you should be fine) then we will upload it to Google Play " +
	    "and list your name on both Google Play and Github as a co-developer unless otherwise stated.");	    
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


