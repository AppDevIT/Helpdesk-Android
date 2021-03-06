package com.Depauw.dpuhelpdesk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class submit_technician_request extends Activity{
	
	Button buttonSend;
	EditText textTo;
	EditText textMessage;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.email_technician_activity);
		Initialize();
	}
	
	private void Initialize(){
		buttonSend = (Button) findViewById(R.id.button1);
		textMessage = (EditText) findViewById(R.id.editText2);
 
		buttonSend.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View v) {
			  
			  String subject = "Technician, Application Issue";
			  String message = textMessage.getText().toString();
              
			  Intent email = new Intent(Intent.ACTION_SEND);
			  email.putExtra(Intent.EXTRA_EMAIL, new String[]{ "helpdesk@depauw.edu"});
			  email.putExtra(Intent.EXTRA_SUBJECT, subject);
			  email.putExtra(Intent.EXTRA_TEXT, message);
 
			  //need this to prompts email client only
			  email.setType("message/rfc822");
 
			  startActivity(Intent.createChooser(email, "Choose an Email client:"));
 
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
