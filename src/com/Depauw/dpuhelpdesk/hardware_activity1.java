package com.Depauw.dpuhelpdesk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class hardware_activity1 extends Activity {
	
	
	private Button hardwareMain, tech, media, att;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hardwar_main_activity);
		Initialize();
	}
	
	private void Initialize(){
		hardwareMain = (Button) findViewById(R.id.hardware_activity_Button1);
		tech = (Button) findViewById(R.id.hardware_activity_Button2);
		media = (Button) findViewById(R.id.hardware_activity_Button3);
		att = (Button) findViewById(R.id.hardware_activity_Button4);
		
		
		hardwareMain.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(hardware_activity1.this, hardware_activity_main.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		tech.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(hardware_activity1.this, hardware_activity_tech.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		media.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(hardware_activity1.this, hardware_activity_media.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		att.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(hardware_activity1.this, hardware_activity_att.class);
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
