package com.logograb.sampleapp;

import org.json.JSONObject;

import com.logograb.app.LogoGrabInterface;
import com.logograb.sampleapp.R;
import com.togocms.togoapp.logograb.LogoGrab.LogoGrabListener;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity {
	public static final String TAG = "LogoGrabSample";
	public Button logoGrabButton;
	public LogoGrabListener logoGrabListener;
	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);
	}
	
	@Override
	public void onResume() {
		super.onResume();
		init();
	}
	
	@Override
	public void onStop() {
		super.onStop();
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
	}
	
	public void init() {
		// init LogoGrabInterface parameters
		LogoGrabInterface.setShowCloseButton(true);
		LogoGrabInterface.setShowLogoGrabLandingPage(true);
		LogoGrabInterface.setShowAdditionalFeatures(false);
		LogoGrabInterface.setStartAtHomeFeed(false);
		
		// init Listener of LogoGrab application
		logoGrabListener = new LogoGrabListener() {
			
			@Override
			public void onResponse(JSONObject response) {
				Log.i(TAG, "LogoGrab Application responded with: " + response.toString());
			}
		};
		
		// init Button
		logoGrabButton = (Button) findViewById(R.id.LogoGrabButton);
		logoGrabButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				LogoGrabInterface.startLogoGrab(MainActivity.this, logoGrabListener);
			}
		});
	}
}