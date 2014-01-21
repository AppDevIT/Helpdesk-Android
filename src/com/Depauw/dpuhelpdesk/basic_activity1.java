package com.Depauw.dpuhelpdesk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class basic_activity1 extends Activity {
	
	
	private Button burncdmac, burncdwindows, optimizingImagesMacWindows, optimizingImagesMaciPhoto, optimizingImagesWindowsMicrosoft, optimizingImagesWindowsAdobe, pdfInstallWindows, pdfCreateWindows, pdfCreateMac, pdfScan, scanninghp, scanningadobe, scanningocr, screenshotmac, screenshotwindows, screenshotwindowsxp, softwareupdatewindows, softwareupdatemac, technologyPurchasesInstitutional, technologyPurchaseStudentLaptopProgram, technologyPurchaseLaptop, technologyPurchaseSoftware, technologyPurchasefaq, technologyPurchaseInternationalStudents;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.basic_activity1_main);
		Initialize();
	}
	
	private void Initialize(){
		burncdmac = (Button) findViewById(R.id.basic_activity_Button1);
		burncdwindows = (Button) findViewById(R.id.basic_acitivty_Button2);
		optimizingImagesMacWindows = (Button) findViewById(R.id.basic_activity_Button3);
		optimizingImagesMaciPhoto = (Button) findViewById(R.id.basic_activity_Button4);
		optimizingImagesWindowsMicrosoft = (Button) findViewById(R.id.basic_activity_Button5);
		optimizingImagesWindowsAdobe = (Button) findViewById(R.id.basic_activity_Button6);
		pdfInstallWindows = (Button) findViewById(R.id.basic_activity_Button7);
		pdfCreateWindows = (Button) findViewById(R.id.basic_activity_Button8);
		pdfCreateMac = (Button) findViewById(R.id.basic_activity_Button9);
		pdfScan = (Button) findViewById(R.id.basic_activity_Button10);
		scanninghp = (Button) findViewById(R.id.basic_activity_Button11);
		scanningadobe = (Button) findViewById(R.id.basic_activity_Button12);
		scanningocr = (Button) findViewById(R.id.basic_activity_Button13);
		screenshotmac = (Button) findViewById(R.id.basic_activity_Button14);
		screenshotwindows = (Button) findViewById(R.id.basic_activity_Button15);
		screenshotwindowsxp = (Button) findViewById(R.id.basic_activity_Button16);
		softwareupdatewindows = (Button) findViewById(R.id.basic_activity_Button17);
		softwareupdatemac = (Button) findViewById(R.id.basic_activity_Button18);
		technologyPurchasesInstitutional = (Button) findViewById(R.id.basic_activity_Button19);
		technologyPurchaseStudentLaptopProgram = (Button) findViewById(R.id.basic_activity_Button20);
		technologyPurchaseLaptop = (Button) findViewById(R.id.basic_activity_Button21);
		technologyPurchaseSoftware = (Button) findViewById(R.id.basic_activity_Button22);
		technologyPurchasefaq = (Button) findViewById(R.id.basic_activity_Button23);
		technologyPurchaseInternationalStudents = (Button) findViewById(R.id.basic_activity_Button24);
		
		
		
		
		burncdmac.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdmacIntent = new Intent(basic_activity1.this, basic_activity_burncdmac.class);
				startActivity(burncdmacIntent);
			}
		});
		
		burncdwindows.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(basic_activity1.this, basic_activity_burncdwindows.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		optimizingImagesMacWindows.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(basic_activity1.this, basic_activity_optimizingmacwindows.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		optimizingImagesMaciPhoto.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(basic_activity1.this, basic_activity_optimizingmaciphoto.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		optimizingImagesWindowsMicrosoft.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(basic_activity1.this, basic_activity_optimizingimageswindowsmicrosoft.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		optimizingImagesWindowsAdobe.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(basic_activity1.this, basic_activity_optimizingimageswindowsadobe.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		pdfInstallWindows.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(basic_activity1.this, basic_activity_pdfInstall.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		pdfCreateWindows.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(basic_activity1.this, basic_activity_pdfCreate.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		pdfCreateMac.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(basic_activity1.this, basic_activity_pdfcreatemac.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		pdfScan.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(basic_activity1.this, basic_activity_pdfscan.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		scanninghp.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(basic_activity1.this, basic_activity_scanninghp.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		scanningadobe.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(basic_activity1.this, basic_activity_scanningadobe.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		scanningocr.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(basic_activity1.this, basic_activity_scanningocr.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		screenshotmac.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(basic_activity1.this, basic_activity_screenshotmac.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		screenshotwindows.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(basic_activity1.this, basic_activity_screenshotwindows.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		screenshotwindowsxp.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(basic_activity1.this, basic_activity_screenshotwindowsxp.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		softwareupdatewindows.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(basic_activity1.this, basic_activity_softwareupdatewindows.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		softwareupdatemac.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(basic_activity1.this, basic_activity_softwareupdatemac.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		technologyPurchasesInstitutional.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(basic_activity1.this, basic_activity_technologypurchasesinstitutional.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		technologyPurchaseStudentLaptopProgram.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(basic_activity1.this, basic_acitvity_technologypurchaselaptopprogram.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		technologyPurchaseLaptop.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(basic_activity1.this, basic_acitvity_technologypurchaselaptop.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		technologyPurchaseSoftware.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(basic_activity1.this, basic_acitvity_technologypurchasesoftware.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		technologyPurchasefaq.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(basic_activity1.this, basic_activity_technologypurchasefaq.class);
				startActivity(burncdwindowsIntent);
			}
		});
		
		technologyPurchaseInternationalStudents.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent burncdwindowsIntent = new Intent(basic_activity1.this, basic_acitvity_technologypurchaseinternaitonal.class);
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