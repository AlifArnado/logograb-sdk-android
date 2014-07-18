package com.logograb.app;

import com.togocms.togoapp.logograb.LogoGrab;
import com.togocms.togoapp.logograb.LogoGrab.LogoGrabListener;


/**
 * LogoGrabInit
 * <p>
 * LogoGrab initializing Class
 * 
 * @author Jo&euml;l Smely
 * @version 1.0
 * @since 2014-01-14
 */
public class LogoGrabInit {
	
	/**
	 * Private Constructor to suppress default constructor for noninstantiability.
	 */
	private LogoGrabInit() {
		// insurance
		throw new AssertionError();
	}
	
	/**
	 * The developer key is a key string to distinguish between different developer,
	 * which modified the LogoGrab application to their use, but still using the LogoGrab server to
	 * use the logo recognition algorithm provided by the LogoGrab server.
	 */
	public static void setDEVKEY(String _DEVKEY) {
		LogoGrab._DEVKEY = _DEVKEY;
	}
	
	/**
	 * If <b>true:</b> the default logograb landing page is shown when grabing a logo.<br>
	 * If <b>false:</b> you can customize the behavior by responding to the logograb listener "LogoGrabListener"./<br>
	 * By <b>default:</b> false.
	 */
	public static void setShowLogoGrabLandingPage(boolean show) {
		LogoGrab.SHOW_LOGOGRAB_LANDING_PAGE = show;
	}
	
	/**
	 * If <b>true:</b> additional features can be seen on the side bar.<br>
	 * If <b>false:</b> the SDK doesn't show any additional/social features on the left side bar.<br>
	 * By <b>default:</b> false.
	 */
	public static void setShowAdditionalFeatures(boolean show) {
		LogoGrab.SHOW_ADDITIONAL_FEATURES = show;
	}
	
	/**
	 * If <b>true:</b> show the close button in the upper left corner.<br>
	 * If <b>false:</b> do not show the close button in the upper left corner.<br>
	 * By <b>default:</b> true.
	 */
	public static void setShowCloseButton(boolean show) {
		LogoGrab.SHOW_CLOSE_BUTTON = show;
	}
	
	/**
	 * If <b>true:</b> the LogoGrab application starts at the homefeed instead of the scanner.<br>
	 * If <b>false:</b> the LogoGrab application starts at the scanner.<br>
	 * By <b>default:</b> false.<br>
	 * Additional note: When <code>setShowAdditionalFeatures</code> is set to false,
	 * the application ALWAYS starts at the scanner, since the homefeed is disabled (additional feature).
	 */
	public static void setStartAtHomeFeed(boolean startAtHomeFeed) {
		LogoGrab.START_AT_HOME_FEED = startAtHomeFeed;
	}
	
	/**
	 * Sets the LogoGrab listener, to listen to the response given by the LogoGrab Server.
	 */
	public static void setLogoGrabListener(LogoGrabListener logoGrabListener) {
		LogoGrab.LOGOGRAB_LISTENER = logoGrabListener;
	}
}
