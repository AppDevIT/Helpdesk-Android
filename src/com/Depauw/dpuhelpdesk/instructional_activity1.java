package com.Depauw.dpuhelpdesk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class instructional_activity1 extends Activity {
	
	
	private Button absence, chemDraw, dyknowMain, dyknowInstall, dyknowHelpSupport, dyknowfaq, dyknowInstructor, dyknowStudent, moodleMain, moodleNavigation, moodleFacultyLogin, moodleFaculty19to23, moodleFacultyChangePass, moodleFacultyManage, moodleFacultyCreateAssign, moodleFacultyCreateForum, moodleFacultyWiki, moodleFacultyCreateGroups, moodleFacultyUseGradebook, moodleFacultyExportGrade, moodleFacultyOverview, moodleFacultyMacSaving, moodleFacultyManageCourse, moodleFacultyManageContent, moodleFAQ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.instructional_activity_main);
		Initialize();
	}
	
	private void Initialize(){
		absence = (Button) findViewById(R.id.instructional_activity_Button1);
		dyknowMain = (Button) findViewById(R.id.instructional_activity_Button2);
		dyknowInstall = (Button) findViewById(R.id.instructional_activity_Button3);
		dyknowHelpSupport = (Button) findViewById(R.id.instructional_activity_Button4);
		dyknowfaq = (Button) findViewById(R.id.instructional_activity_Button5);
		dyknowInstructor = (Button) findViewById(R.id.instructional_activity_Button6);
		dyknowStudent = (Button) findViewById(R.id.instructional_activity_Button7);
		chemDraw = (Button) findViewById(R.id.instructional_activity_Button8);
		moodleMain = (Button) findViewById(R.id.instructional_activity_Button9);
        moodleNavigation = (Button) findViewById(R.id.instructional_activity_Button10);
		moodleFacultyLogin = (Button) findViewById(R.id.instructional_activity_Button11);
        moodleFaculty19to23 = (Button) findViewById(R.id.instructional_activity_Button12);
        moodleFacultyChangePass = (Button) findViewById(R.id.instructional_activity_Button13);
        moodleFacultyManage = (Button) findViewById(R.id.instructional_activity_Button14);
        moodleFacultyCreateAssign = (Button) findViewById(R.id.instructional_activity_Button15);
        moodleFacultyCreateForum = (Button) findViewById(R.id.instructional_activity_Button16);
        moodleFacultyWiki = (Button) findViewById(R.id.instructional_activity_Button17);
        moodleFacultyCreateGroups = (Button) findViewById(R.id.instructional_activity_Button18);
        moodleFacultyUseGradebook = (Button) findViewById(R.id.instructional_activity_Button19);
        moodleFacultyExportGrade = (Button) findViewById(R.id.instructional_activity_Button20);
        moodleFacultyOverview = (Button) findViewById(R.id.instructional_activity_Button21);
        moodleFacultyMacSaving = (Button) findViewById(R.id.instructional_activity_Button22);
        moodleFacultyManageCourse = (Button) findViewById(R.id.instructional_activity_Button23);
        moodleFacultyManageContent = (Button) findViewById(R.id.instructional_activity_Button24);
        moodleFAQ = (Button) findViewById(R.id.instructional_activity_Button25);

        
		absence.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(instructional_activity1.this, instructional_activity_absence.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		dyknowMain.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(instructional_activity1.this, dyknow_activity_main.class);
				startActivity(burncdmacIntent);
			}
		});
		
		dyknowInstall.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(instructional_activity1.this, dyknow_activity_install.class);
				startActivity(burncdmacIntent);
			}
		});
		
		dyknowHelpSupport.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(instructional_activity1.this, dyknow_activity_helpsupport.class);
				startActivity(burncdmacIntent);
			}
		});
		
		dyknowfaq.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(instructional_activity1.this, dyknow_activity_faq.class);
				startActivity(burncdmacIntent);
			}
		});
		
		dyknowInstructor.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(instructional_activity1.this, dyknow_activity_instructor.class);
				startActivity(burncdmacIntent);
			}
		});
		
		dyknowStudent.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(instructional_activity1.this, dyknow_activity_student.class);
				startActivity(burncdmacIntent);
			}
		});
		
		chemDraw.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(instructional_activity1.this, instructional_activity_chemDraw.class);
				startActivity(burncdmacIntent);
			}
		});
		
		moodleMain.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(instructional_activity1.this, instructional_activity_moodlemain.class);
				startActivity(burncdmacIntent);
			}
		});
		
		moodleNavigation.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(instructional_activity1.this, instructional_activity_moodlenavigation.class);
				startActivity(burncdmacIntent);
			}
		});
		
		moodleFacultyLogin.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(instructional_activity1.this, instructional_activity_facultylogin.class);
				startActivity(burncdmacIntent);
			}
		});
		
		moodleFaculty19to23.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(instructional_activity1.this, instructional_activity_faculty19to23.class);
				startActivity(burncdmacIntent);
			}
		});
		
		moodleFacultyChangePass.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(instructional_activity1.this, instructional_activity_changepass.class);
				startActivity(burncdmacIntent);
			}
		});
		
		moodleFacultyManage.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(instructional_activity1.this, instructional_activity_managecourse.class);
				startActivity(burncdmacIntent);
			}
		});
		
		moodleFacultyCreateAssign.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(instructional_activity1.this, instructional_activity_createassign.class);
				startActivity(burncdmacIntent);
			}
		});
		
		moodleFacultyCreateForum.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(instructional_activity1.this, instructional_activity_createforum.class);
				startActivity(burncdmacIntent);
			}
		});
		
		moodleFacultyWiki.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(instructional_activity1.this, instructional_activity_wiki.class);
				startActivity(burncdmacIntent);
			}
		});
		
		moodleFacultyCreateGroups.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(instructional_activity1.this, instructional_activity_creategroup.class);
				startActivity(burncdmacIntent);
			}
		});
		
		moodleFacultyUseGradebook.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(instructional_activity1.this, instructional_activity_usegrade.class);
				startActivity(burncdmacIntent);
			}
		});
		
		moodleFacultyExportGrade.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(instructional_activity1.this, instructional_activity_exportgrade.class);
				startActivity(burncdmacIntent);
			}
		});
		
		moodleFacultyOverview.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(instructional_activity1.this, instructional_activity_facultyoverview.class);
				startActivity(burncdmacIntent);
			}
		});
		
		moodleFacultyMacSaving.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(instructional_activity1.this, instructional_activity_macsaving.class);
				startActivity(burncdmacIntent);
			}
		});
		
		moodleFacultyManageCourse.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(instructional_activity1.this, instructional_activity_moodlemanagecourse.class);
				startActivity(burncdmacIntent);
			}
		});
		
		moodleFacultyManageContent.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(instructional_activity1.this, instructional_activity_moodlemanagecourse.class);
				startActivity(burncdmacIntent);
			}
		});
		
		moodleFAQ.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(instructional_activity1.this, instructional_activity_faq.class);
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