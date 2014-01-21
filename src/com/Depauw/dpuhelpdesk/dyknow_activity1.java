package com.Depauw.dpuhelpdesk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class dyknow_activity1 extends Activity {
	
	
	private Button dyknowMain, dyknowInstall, dyknowHelpSupport, dyknowfaq, dyknowInstructor, dyknowStudent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dyknow_activity_main);
		Initialize();
	}
	
	private void Initialize(){
		dyknowMain = (Button) findViewById(R.id.dyknow_activity_Button1);
		dyknowInstall = (Button) findViewById(R.id.dyknow_activity_Button2);
		dyknowHelpSupport = (Button) findViewById(R.id.dyknow_activity_Button3);
		dyknowfaq = (Button) findViewById(R.id.dyknow_activity_Button4);
		dyknowInstructor = (Button) findViewById(R.id.dyknow_activity_Button5);
		dyknowStudent = (Button) findViewById(R.id.dyknow_activity_Button6);
		
		dyknowMain.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(dyknow_activity1.this, dyknow_activity_main.class);
				startActivity(burncdmacIntent);
			}
		});
		
		dyknowInstall.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(dyknow_activity1.this, dyknow_activity_install.class);
				startActivity(burncdmacIntent);
			}
		});
		
		dyknowHelpSupport.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(dyknow_activity1.this, dyknow_activity_helpsupport.class);
				startActivity(burncdmacIntent);
			}
		});
		
		dyknowfaq.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(dyknow_activity1.this, dyknow_activity_faq.class);
				startActivity(burncdmacIntent);
			}
		});
		
		dyknowInstructor.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(dyknow_activity1.this, dyknow_activity_instructor.class);
				startActivity(burncdmacIntent);
			}
		});
		
		dyknowStudent.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(dyknow_activity1.this, dyknow_activity_student.class);
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