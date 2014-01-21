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
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class accounts_activity1 extends Activity {
	//This here helps pre-define for the entire page what each variable will contain.
	//You need to define what type of variables you will be using.
	
	private Button id, mealplan, payroll, passwords, vpn, printQuota;
	
	//This onCreate will help explain what happens to the page
    //as it loads.
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//this here links the page to the xml
		setContentView(R.layout.accounts_activity_main);
		//I created an "Initialize()" method for the sake of splitting everything up.
		//Its been more of a personal preference over anything else.
		//You can name it whatever you want, if you choose to use a separate 
		//initialize method.
		Initialize();
	}
	
	private void Initialize(){
		//This helps link up the xml page with the variables I have declared
		id = (Button) findViewById(R.id.accountsActivityButton1);
		mealplan = (Button) findViewById(R.id.accountsActivityButton2);
		payroll = (Button) findViewById(R.id.accountsActivityButton3);
		passwords = (Button) findViewById(R.id.accountsActivityButton4);
		vpn = (Button) findViewById(R.id.accountsActivityButton5);
		printQuota = (Button) findViewById(R.id.accountsActivityButton6);
		
		//All of these bulky setOnclickListeners are doing is allowing 
		//the user to open new Intents (or java classes) to view other pages.
		//The way it works is in the line:
		//Intent myIntent = new Intent(accounts_activity1.this, accounts_activity_id.class);
		//  This is the activity you are on ^^  This is the activity you are opening ^^
		//Then you finally open it with this: startActivity(myIntent);
		id.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent idIntent = new Intent(accounts_activity1.this, accounts_activity_id.class);
				startActivity(idIntent);
			}
		});
		
		mealplan.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent mealIntent = new Intent(accounts_activity1.this, accounts_activity_mealplan.class);
				startActivity(mealIntent);
			}
		});
		
	    payroll.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent payIntent = new Intent(accounts_activity1.this, accounts_activity_payroll.class);
				startActivity(payIntent);
			}
		});
	   
	    passwords.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent passIntent = new Intent(accounts_activity1.this, accounts_activity_passwards.class);
				startActivity(passIntent);
			}
		});
	    
	    vpn.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent vpnIntent = new Intent(accounts_activity1.this, accounts_activity_vpn.class);
				startActivity(vpnIntent);
			}
		});
	    
	    printQuota.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent knowledgeIntent = new Intent(accounts_activity1.this, accounts_activity_printing.class);
				startActivity(knowledgeIntent);
			}
		});
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
