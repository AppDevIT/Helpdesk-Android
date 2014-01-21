package com.Depauw.dpuhelpdesk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class healthy_activity1 extends Activity {
	
	
	private Button healthyMain, backup, options, keychain, protect1, protect2, protect3, protect4, protect5, protect6, spam;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.healthy_activity_main);
		Initialize();
	}
	
	private void Initialize(){
		healthyMain = (Button) findViewById(R.id.healthy_activity_Button1);
		backup = (Button) findViewById(R.id.healthy_activity_Button2);
		options = (Button) findViewById(R.id.healthy_activity_Button3);
		keychain = (Button) findViewById(R.id.healthy_activity_Button4);
		protect1 = (Button) findViewById(R.id.healthy_activity_Button5);
		protect2 = (Button) findViewById(R.id.healthy_activity_Button6);
		protect3 = (Button) findViewById(R.id.healthy_activity_Button7);
		protect4 = (Button) findViewById(R.id.healthy_activity_Button8);
		protect5 = (Button) findViewById(R.id.healthy_activity_Button9);
		protect6 = (Button) findViewById(R.id.healthy_activity_Button10);
		spam = (Button) findViewById(R.id.healthy_activity_Button11);

		
		healthyMain.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(healthy_activity1.this, healthy_activity_main.class);
				startActivity(burncdwindowsIntent);
			}
		});
				
		backup.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(healthy_activity1.this, healthy_activity_backup.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		options.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(healthy_activity1.this, healthy_activity_option.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		keychain.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(healthy_activity1.this, healthy_activity_keychain.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		protect1.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(healthy_activity1.this, healthy_activity_protect1.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		protect2.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(healthy_activity1.this, healthy_activity_protect2.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		protect3.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(healthy_activity1.this, healthy_activity_protect3.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		protect4.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(healthy_activity1.this, healthy_activity_protect4.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		protect5.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(healthy_activity1.this, healthy_activity_protect5.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		protect6.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(healthy_activity1.this, healthy_activity_protect6.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		spam.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(healthy_activity1.this, healthy_activity_spam.class);
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