package com.Depauw.dpuhelpdesk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class network_activity1 extends Activity {
	
	
	private Button networkMain, wiredwireless, netdrives, accessrights, VPN, wireless, DNS, drivesWindows, drivesMac, offCampusMac, offCampusWindows;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.network_activity_main);
		Initialize();
	}
	
	private void Initialize(){
		networkMain = (Button) findViewById(R.id.network_activity_Button1);
		wiredwireless = (Button) findViewById(R.id.network_activity_Button2);
		netdrives = (Button) findViewById(R.id.network_activity_Button3);
		accessrights = (Button) findViewById(R.id.network_activity_Button4);
		VPN = (Button) findViewById(R.id.network_activity_Button5);
		wireless = (Button) findViewById(R.id.network_activity_Button6);
		DNS = (Button) findViewById(R.id.network_activity_Button7);
		drivesWindows = (Button) findViewById(R.id.network_activity_Button8);
		drivesMac = (Button) findViewById(R.id.network_activity_Button9);
		offCampusMac = (Button) findViewById(R.id.network_activity_Button10);
		offCampusWindows = (Button) findViewById(R.id.network_activity_Button11);
		
		
	     networkMain.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(network_activity1.this, network_activity_main.class);
				startActivity(burncdwindowsIntent);
			}
		});
	     
	      wiredwireless.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(network_activity1.this, network_activity_wiredwireless.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     netdrives.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(network_activity1.this, network_activity_netdrives.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     //the reason why I copied the same 3 classes to 3 different subjects is due to the fact
	     //that all of the 3 different topics are within the same page.
	     accessrights.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(network_activity1.this, network_activity_netdrives.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     VPN.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(network_activity1.this, network_activity_netdrives.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     wireless.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(network_activity1.this, network_activity_wireless.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     DNS.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(network_activity1.this, network_activity_dns.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     drivesWindows.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(network_activity1.this, network_activity_driveswindows.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     drivesMac.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(network_activity1.this, network_activity_drivesmac.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     offCampusMac.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(network_activity1.this, network_activity_offcampusmac.class);
					startActivity(burncdwindowsIntent);
				}
			});
	     
	     offCampusWindows.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					Intent burncdwindowsIntent = new Intent(network_activity1.this, network_activity_offcampuswindows.class);
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