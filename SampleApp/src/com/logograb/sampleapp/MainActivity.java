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
	public OnClickListener onClickListener;
	

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
	
	public void initListeners() {
		// init Listener of LogoGrab application
		logoGrabListener = new LogoGrabListener() {
			
			@Override
			public void onResponse(JSONObject response) {
				Log.i(TAG, "LogoGrab Application responded with: " + response.toString());
			}
		};
		
		// set LogoGrabListener
		LogoGrabInterface.setLogoGrabListener(logoGrabListener);
		
		
		// init OnClickListener
		onClickListener = new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				LogoGrabInterface.startLogoGrab(MainActivity.this);
			}
		};
		
		// set OnClickListener
		logoGrabButton.setOnClickListener(onClickListener);
	}
	
	public void init() {
		// init LogoGrabInterface parameters
		LogoGrabInterface.setDevKey(getString(R.string.LOGOGRAB_DEVKEY));
		LogoGrabInterface.setShowCloseButton(true);
		LogoGrabInterface.setShowLogoGrabLandingPage(true);
		LogoGrabInterface.setShowAdditionalFeatures(false);
		LogoGrabInterface.setStartAtHomeFeed(false);
		
		// init Button
		logoGrabButton = (Button) findViewById(R.id.LogoGrabButton);
		
		// registers Listeners
		initListeners();
	}
}