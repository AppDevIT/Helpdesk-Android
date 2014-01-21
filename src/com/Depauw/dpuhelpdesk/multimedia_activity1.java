package com.Depauw.dpuhelpdesk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class multimedia_activity1 extends Activity {
	
	
	private Button optimizingImagesMacWindows, optimizingImagesMaciPhoto, optimizingImagesWindowsMicrosoft, optimizingImagesWindowsAdobe, pdfInstallWindows, pdfCreateWindows, pdfCreateMac, pdfScan, scanninghp, scanningadobe, scanningocr, definewebmac, definewebwindows, javainstallxp, personalweb;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.multimedia_activity_main);
		Initialize();
	}
	
	private void Initialize(){
		optimizingImagesMacWindows = (Button) findViewById(R.id.multimedia_activity_Button1);
		optimizingImagesMaciPhoto = (Button) findViewById(R.id.multimedia_activity_Button2);
		optimizingImagesWindowsMicrosoft = (Button) findViewById(R.id.multimedia_activity_Button3);
		optimizingImagesWindowsAdobe = (Button) findViewById(R.id.multimedia_activity_Button4);
		pdfInstallWindows = (Button) findViewById(R.id.multimedia_activity_Button5);
		pdfCreateWindows = (Button) findViewById(R.id.multimedia_activity_Button6);
		pdfCreateMac = (Button) findViewById(R.id.multimedia_activity_Button7);
		pdfScan = (Button) findViewById(R.id.multimedia_activity_Button8);
		scanninghp = (Button) findViewById(R.id.multimedia_activity_Button9);
		scanningadobe = (Button) findViewById(R.id.multimedia_activity_Button10);
		scanningocr = (Button) findViewById(R.id.multimedia_activity_Button11);
		definewebmac = (Button) findViewById(R.id.multimedia_activity_Button12);
		definewebwindows = (Button) findViewById(R.id.multimedia_activity_Button13);
		javainstallxp = (Button) findViewById(R.id.multimedia_activity_Button14);
		personalweb = (Button) findViewById(R.id.multimedia_activity_Button15);
		
		
		optimizingImagesMacWindows.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(multimedia_activity1.this, basic_activity_optimizingmacwindows.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		optimizingImagesMaciPhoto.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(multimedia_activity1.this, basic_activity_optimizingmaciphoto.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		optimizingImagesWindowsMicrosoft.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(multimedia_activity1.this, basic_activity_optimizingimageswindowsmicrosoft.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		optimizingImagesWindowsAdobe.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(multimedia_activity1.this, basic_activity_optimizingimageswindowsadobe.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		pdfInstallWindows.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(multimedia_activity1.this, basic_activity_pdfInstall.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		pdfCreateWindows.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(multimedia_activity1.this, basic_activity_pdfCreate.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		pdfCreateMac.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(multimedia_activity1.this, basic_activity_pdfcreatemac.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		pdfScan.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(multimedia_activity1.this, basic_activity_pdfscan.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		scanninghp.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(multimedia_activity1.this, basic_activity_scanninghp.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		scanningadobe.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(multimedia_activity1.this, basic_activity_scanningadobe.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		scanningocr.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(multimedia_activity1.this, basic_activity_scanningocr.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		definewebmac.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(multimedia_activity1.this, multimedia_activity_definewebmac.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		definewebwindows.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(multimedia_activity1.this, multimedia_activity_definewebwindows.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		javainstallxp.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(multimedia_activity1.this, multimedia_activity_javainstall.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		personalweb.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(multimedia_activity1.this, multimedia_activity_personalweb.class);
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