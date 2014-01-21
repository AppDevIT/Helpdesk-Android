package com.Depauw.dpuhelpdesk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class printing_activity1 extends Activity {
	
	
	private Button printingServices, printingMac, printingWindows, syncId, connectNetwork, releasePrint, printUSBBW, printUSBCLR, copyBW, copyCLR, sizeCopy, scanBW, scanColor, scanUSBBW, scanUSBCLR, learnMore, benefits, publicCLR, fee, student, maintainence, requestingSpecial;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.printing_activity_main);
		Initialize();
	}
	
	private void Initialize(){
		printingServices = (Button) findViewById(R.id.printing_activity_Button1);
		printingMac = (Button) findViewById(R.id.printing_activity_Button2);
		printingWindows = (Button) findViewById(R.id.printing_activity_Button3);
		syncId = (Button) findViewById(R.id.printing_activity_Button4);
		connectNetwork = (Button) findViewById(R.id.printing_activity_Button5);
		releasePrint = (Button) findViewById(R.id.printing_activity_Button6);
		printUSBBW = (Button) findViewById(R.id.printing_activity_Button7);
		printUSBCLR = (Button) findViewById(R.id.printing_activity_Button8);
		copyBW = (Button) findViewById(R.id.printing_activity_Button9);
		copyCLR = (Button) findViewById(R.id.printing_activity_Button10);
		sizeCopy = (Button) findViewById(R.id.printing_activity_Button11);
		scanBW = (Button) findViewById(R.id.printing_activity_Button12);
		scanColor = (Button) findViewById(R.id.printing_activity_Button13);
		scanUSBBW = (Button) findViewById(R.id.printing_activity_Button14);
		scanUSBCLR = (Button) findViewById(R.id.printing_activity_Button15);
		learnMore = (Button) findViewById(R.id.printing_activity_Button16);
		benefits = (Button) findViewById(R.id.printing_activity_Button17);
		student = (Button) findViewById(R.id.printing_activity_Button18);
		
		
	     printingServices.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(printing_activity1.this, printing_activity_services.class);
				startActivity(burncdwindowsIntent);
			}
		});
	     
	     printingMac.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(printing_activity1.this, printing_activity_printingmac.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     printingWindows.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(printing_activity1.this, printing_activity_windows.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     syncId.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(printing_activity1.this, printing_activity_sync.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     connectNetwork.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(printing_activity1.this, printing_activity_connectnetwork.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     releasePrint.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(printing_activity1.this, printing_activity_release.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     printUSBBW.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(printing_activity1.this, printing_activity_usbbw.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     printUSBCLR.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(printing_activity1.this, printing_activity_usbcolor.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     copyBW.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(printing_activity1.this, printing_activity_copybw.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     copyCLR.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(printing_activity1.this, printing_activity_copycolor.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     sizeCopy.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(printing_activity1.this, printing_activity_reduceenlarge.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     scanBW.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(printing_activity1.this, printing_activity_scanbw.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     scanColor.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(printing_activity1.this, printing_activity_scanstorecolor.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     scanUSBBW.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(printing_activity1.this, printing_activity_scanstorebw.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     scanUSBCLR.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(printing_activity1.this, printing_activity_scancolor.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     learnMore.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(printing_activity1.this, printing_activity_learnmore.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     benefits.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(printing_activity1.this, printing_activity_benefits.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     student.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(printing_activity1.this, phone_activity_main.class);
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