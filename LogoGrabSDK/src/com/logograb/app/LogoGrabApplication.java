package com.logograb.app;

import com.togocms.togoapp.logograb.LogoGrabApp;

public class LogoGrabApplication extends LogoGrabApp {

	public void onCreate() {
		super.onCreate();
	}

	/**
	 * The developer key is a key string to distinguish between different developer,
	 * which modified the LogoGrab application to their use, but still using the LogoGrab server to
	 * use the logo recognition algorithm provided by the LogoGrab server.
	 * 
	 * @param LOGOGRAB_DEVKEY The developer key to authenticate with the server
	 */
	@Override
	protected void initLogoGrabServer(String LOGOGRAB_DEVKEY) {
		super.initLogoGrabServer(LOGOGRAB_DEVKEY);
	}
}
