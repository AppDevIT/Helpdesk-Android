package com.Depauw.dpuhelpdesk;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.os.CountDownTimer;

public class MainActivity extends Activity {

	private Button knowledgeBase, submitRequest, helpme, faq, technician, call, develop;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);			
		
		Initialize();
	}

	private void Initialize(){
		knowledgeBase = (Button) findViewById(R.id.knowledgebase1);
		submitRequest = (Button) findViewById(R.id.submitrequest1);
		helpme = (Button) findViewById(R.id.helpButton);
		faq = (Button) findViewById(R.id.faqButton);
		technician = (Button) findViewById(R.id.submitrequest2);
		call = (Button) findViewById(R.id.callButton);
		develop = (Button) findViewById(R.id.developerButton);
		
		knowledgeBase.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent knowledgeIntent = new Intent(MainActivity.this, knowledgebase1_activity.class);
				startActivity(knowledgeIntent);
			}
		});
		
		submitRequest.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent requestIntent = new Intent(MainActivity.this, submitRequest_activity.class);
				startActivity(requestIntent);
			}
		});
		
		helpme.setOnClickListener(new OnClickListener(){ //dialog box
			public void onClick(View arg0){
			
			final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
		    builder.setTitle("Help");
		    builder.setMessage("This app allows you to access the IT KnowledgeBase from DePauw's website." + " " +
		    		"If you experience any issues using our app, please send us an email to helpdesk@depauw.edu or call 765-658-4294");
		    builder.setCancelable(true);
		    builder.setIcon(R.drawable.ic_launcher);
		    builder.setPositiveButton("Close", new DialogInterface.OnClickListener() {
		               
		        public void onClick(DialogInterface dialog, int id) {
		        	builder.setOnCancelListener(null);
		                }
		            });
		        builder.create().show();  // create and show the alert dialog
			}
		});
		
		faq.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent requestIntent = new Intent(MainActivity.this, activity_main_faq.class);
				startActivity(requestIntent);
			}
		});
		
		technician.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent requestIntent = new Intent(MainActivity.this, submit_technician_request.class);
				startActivity(requestIntent);
			}
		});
		
		call.setOnClickListener(new OnClickListener(){ //dialog box
			public void onClick(View arg0){
			
			final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
		    builder.setTitle("Complete the call?");
		    builder.setMessage("Click yes to connect your call. Otherwise, click no.");
		    builder.setCancelable(true);
		    builder.setIcon(R.drawable.ic_launcher);
		  //saying yes completes the call. This way, we don't get accidently calls as often
			builder.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog,int id) {
					try {
	                    Intent callIntent = new Intent(Intent.ACTION_CALL);
	                    callIntent.setData(Uri.parse("tel:17656584294"));
	                    startActivity(callIntent);
	                } catch (ActivityNotFoundException activityException) {
	                    Log.e("Calling a Phone Number", "Call failed", activityException);
	                }
	        }
			  });
			builder.setNegativeButton("No",new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog,int id) {
					dialog.cancel();
				}
			});

			// create alert dialog
			AlertDialog alertDialog = builder.create();

			// show it
			alertDialog.show();
		}
	});

		develop.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent requestIntent = new Intent(MainActivity.this, developer.class);
				startActivity(requestIntent);
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
