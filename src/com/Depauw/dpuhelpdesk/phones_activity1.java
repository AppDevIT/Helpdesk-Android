package com.Depauw.dpuhelpdesk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class phones_activity1 extends Activity {
	
	
	private Button phoneMain, phoneBasic, google, discounts;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.phone_activity_main);
		Initialize();
	}
	
	private void Initialize(){
		phoneMain = (Button) findViewById(R.id.phone_activity_Button1);
		phoneBasic = (Button) findViewById(R.id.phone_activity_Button2);
		google = (Button) findViewById(R.id.phone_activity_Button3);
		discounts = (Button) findViewById(R.id.phone_activity_Button4);
		
		
	     phoneMain.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(phones_activity1.this, phone_activity_main.class);
				startActivity(burncdwindowsIntent);
			}
		});
	     
	     phoneBasic.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(phones_activity1.this, phone_activity_basic.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     google.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(phones_activity1.this, phone_activity_google.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     discounts.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(phones_activity1.this, phone_activity_discounts.class);
					startActivity(burncdwindowsIntent);
				}
			});
}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}