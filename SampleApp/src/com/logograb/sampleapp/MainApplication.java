package com.logograb.sampleapp;

import com.logograb.app.LogoGrabInit;
import com.logograb.sampleapp.R;
import com.togocms.togoapp.logograb.LogoGrabApp;

public class MainApplication extends LogoGrabApp {

	@Override
	public void onCreate() {
		super.onCreate();
		
		// inits logograb
		initLogoGrab();
	}
	
	public void initLogoGrab() {
		// set LogoGrab Constants
		LogoGrabInit.setDEVKEY(getString(R.string.LOGOGRAB_DEVKEY));
		LogoGrabInit.setShowCloseButton(true);
		LogoGrabInit.setShowLogoGrabLandingPage(true);
		LogoGrabInit.setShowAdditionalFeatures(false);
		LogoGrabInit.setStartAtHomeFeed(false);
		
		// init logo grab server
		super.initLogoGrabServer();
	}
}