package com.Depauw.dpuhelpdesk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class google_activity1 extends Activity {
	
	
	private Button googleMain, activateGoogle, loginGoogle, changeGoogle, makeGoogle, createHtml, mobileGoogle, popSettings, readGoogle, faqGoogle, scheduleGoogle, setupGoogle, viewGoogle, driveGoogle, createDriveGoogle, editDriveGoogle, insertDriveGoogle, shareDriveGoogle, createSpread, editSpread, addSpread, insertSpread, shareSpread, createForm, addForm, collectForm, pageForm;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.google_activity_main);
		Initialize();
	}
	
	private void Initialize(){
		googleMain = (Button) findViewById(R.id.google_activity_Button1);
		activateGoogle = (Button) findViewById(R.id.google_activity_Button2);
		loginGoogle = (Button) findViewById(R.id.google_activity_Button3);
		changeGoogle = (Button) findViewById(R.id.google_activity_Button4);
		makeGoogle = (Button) findViewById(R.id.google_activity_Button5);
		createHtml = (Button) findViewById(R.id.google_activity_Button6);
		mobileGoogle = (Button) findViewById(R.id.google_activity_Button7);
		popSettings = (Button) findViewById(R.id.google_activity_Button8);
		readGoogle = (Button) findViewById(R.id.google_activity_Button9);
		faqGoogle = (Button) findViewById(R.id.google_activity_Button10);
		scheduleGoogle = (Button) findViewById(R.id.google_activity_Button11);
		setupGoogle = (Button) findViewById(R.id.google_activity_Button12);
		viewGoogle = (Button) findViewById(R.id.google_activity_Button13);
		driveGoogle = (Button) findViewById(R.id.google_activity_Button14);
		createDriveGoogle = (Button) findViewById(R.id.google_activity_Button15);
		editDriveGoogle = (Button) findViewById(R.id.google_activity_Button16);
		insertDriveGoogle = (Button) findViewById(R.id.google_activity_Button17);
		shareDriveGoogle = (Button) findViewById(R.id.google_activity_Button18);
		createSpread = (Button) findViewById(R.id.google_activity_Button19);
		editSpread = (Button) findViewById(R.id.google_activity_Button20);
		addSpread = (Button) findViewById(R.id.google_activity_Button21);
		insertSpread = (Button) findViewById(R.id.google_activity_Button22);
		shareSpread = (Button) findViewById(R.id.google_activity_Button23);
		createForm = (Button) findViewById(R.id.google_activity_Button24);
		addForm = (Button) findViewById(R.id.google_activity_Button25);
		collectForm = (Button) findViewById(R.id.google_activity_Button26);
		pageForm = (Button) findViewById(R.id.google_activity_Button27);
		
		googleMain.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_main.class);
				startActivity(burncdwindowsIntent);
			}
		});
				
		activateGoogle.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_activitygoogle.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		loginGoogle.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_logingoogle.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		changeGoogle.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_changegoogle.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		makeGoogle.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_makegoogle.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		createHtml.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_createhtml.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		mobileGoogle.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_mobilegoogle.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		popSettings.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_popsettings.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		readGoogle.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_readgoogle.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		faqGoogle.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_activitygoogle.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		scheduleGoogle.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_schedulegoogle.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		setupGoogle.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_activitygoogle.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		viewGoogle.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_viewgoogle.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		driveGoogle.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_drive.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		editDriveGoogle.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_editdrive.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		createDriveGoogle.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_createdrive.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		shareDriveGoogle.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_sharedrive.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		insertDriveGoogle.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_insertdrive.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		createSpread.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_createspread.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		editSpread.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_editspread.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		insertSpread.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_insertspread.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		shareSpread.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_sharespread.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		createForm.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_createform.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		addForm.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_addform.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		collectForm.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_collectform.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		pageForm.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(google_activity1.this, google_activity_pageform.class);
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