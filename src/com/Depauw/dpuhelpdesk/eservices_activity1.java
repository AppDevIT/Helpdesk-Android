package com.Depauw.dpuhelpdesk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class eservices_activity1 extends Activity {
	
	
	private Button eservicesMain, eservicesLogin, eservicespass;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.eservices_main_activity);
		Initialize();
	}
	
	private void Initialize(){
		eservicesMain = (Button) findViewById(R.id.eservices_activity_Button1);
		eservicesLogin = (Button) findViewById(R.id.eservices_activity_Button2);
		eservicespass = (Button) findViewById(R.id.eservices_activity_Button3);
		
		eservicesMain.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(eservices_activity1.this, eservices_activity_main.class);
				startActivity(burncdmacIntent);
			}
		});
		
		eservicesLogin.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(eservices_activity1.this, eservices_activity_login.class);
				startActivity(burncdmacIntent);
			}
		});
		
		eservicespass.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(eservices_activity1.this, eservices_activity_passchange.class);
				startActivity(burncdmacIntent);
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