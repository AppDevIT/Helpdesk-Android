package com.Depauw.dpuhelpdesk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class knowledgebase1_activity extends Activity{
	
	private Button accounts, basic, dyknow, eservices, google, hardware, healthy, instructional, moodle, multimedia, network, phones, printing;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.knowledgebase_activity);
		Initialize();
	}
	
	private void Initialize(){
		accounts = (Button) findViewById(R.id.knowledgeBaseButton1);
		basic = (Button) findViewById(R.id.knowledgeBaseButton2);
		dyknow = (Button) findViewById(R.id.knowledgeBaseButton3);
		eservices = (Button) findViewById(R.id.knowledgeBaseButton4);
		google = (Button) findViewById(R.id.knowledgeBaseButton5);
		hardware = (Button) findViewById(R.id.knowledgeBaseButton6);
		healthy = (Button) findViewById(R.id.knowledgeBaseButton7);
		instructional = (Button) findViewById(R.id.knowledgeBaseButton8);
		moodle = (Button) findViewById(R.id.knowledgeBaseButton9);
		multimedia = (Button) findViewById(R.id.knowledgeBaseButton10);
		network = (Button) findViewById(R.id.knowledgeBaseButton11);
		phones = (Button) findViewById(R.id.knowledgeBaseButton12);
		printing = (Button) findViewById(R.id.knowledgeBaseButton13);
		
		accounts.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent knowledgeIntent = new Intent(knowledgebase1_activity.this, accounts_activity1.class);
				startActivity(knowledgeIntent);
			}
		});
		
		basic.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent knowledgeIntent = new Intent(knowledgebase1_activity.this, basic_activity1.class);
				startActivity(knowledgeIntent);
			}
		});
		
		dyknow.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent knowledgeIntent = new Intent(knowledgebase1_activity.this, dyknow_activity1.class);
				startActivity(knowledgeIntent);
			}
		});
		
		eservices.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent knowledgeIntent = new Intent(knowledgebase1_activity.this, eservices_activity1.class);
				startActivity(knowledgeIntent);
			}
		});
		
		google.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent knowledgeIntent = new Intent(knowledgebase1_activity.this, google_activity1.class);
				startActivity(knowledgeIntent);
			}
		});
		
		hardware.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent knowledgeIntent = new Intent(knowledgebase1_activity.this, hardware_activity1.class);
				startActivity(knowledgeIntent);
			}
		});
		
		healthy.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent knowledgeIntent = new Intent(knowledgebase1_activity.this, healthy_activity1.class);
				startActivity(knowledgeIntent);
			}
		});
		
		instructional.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent knowledgeIntent = new Intent(knowledgebase1_activity.this, instructional_activity1.class);
				startActivity(knowledgeIntent);
			}
		});
		
		moodle.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent knowledgeIntent = new Intent(knowledgebase1_activity.this, moodle_activity1.class);
				startActivity(knowledgeIntent);
			}
		});
		
		multimedia.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent knowledgeIntent = new Intent(knowledgebase1_activity.this, multimedia_activity1.class);
				startActivity(knowledgeIntent);
			}
		});
		
		network.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent knowledgeIntent = new Intent(knowledgebase1_activity.this, network_activity1.class);
				startActivity(knowledgeIntent);
			}
		});
		
		phones.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent knowledgeIntent = new Intent(knowledgebase1_activity.this, phones_activity1.class);
				startActivity(knowledgeIntent);
			}
		});
		
		
		printing.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent knowledgeIntent = new Intent(knowledgebase1_activity.this, printing_activity1.class);
				startActivity(knowledgeIntent);
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
