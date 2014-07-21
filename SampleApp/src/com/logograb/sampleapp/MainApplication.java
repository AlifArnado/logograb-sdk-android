package com.logograb.sampleapp;

import com.logograb.sampleapp.R;
import com.logograb.app.LogoGrabApplication;

public class MainApplication extends LogoGrabApplication {

	@Override
	public void onCreate() {
		super.onCreate();
		
		// inits logograb
		super.initLogoGrabServer(getString(R.string.LOGOGRAB_DEVKEY));
	}
}