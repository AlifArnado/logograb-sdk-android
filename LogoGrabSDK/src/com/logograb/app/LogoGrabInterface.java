package com.logograb.app;

import android.app.Activity;

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
public class LogoGrabInterface {
	
	/**
	 * Private Constructor to suppress default constructor for noninstantiability.
	 */
	private LogoGrabInterface() {
		// insurance
		throw new AssertionError();
	}
	
	/**
	 * If <b>true:</b> the default logograb landing page is shown when grabing a logo.<br>
	 * If <b>false:</b> you can customize the behavior by responding to the logograb listener "LogoGrabListener"./<br>
	 * By <b>default:</b> false.
	 * 
	 * @param show The boolean
	 */
	public static void setShowLogoGrabLandingPage(boolean show) {
		LogoGrab.SHOW_LOGOGRAB_LANDING_PAGE = show;
	}
	
	/**
	 * If <b>true:</b> additional features can be seen on the side bar.<br>
	 * If <b>false:</b> the SDK doesn't show any additional/social features on the left side bar.<br>
	 * By <b>default:</b> false.
	 * 
	 * @param show The boolean
	 */
	public static void setShowAdditionalFeatures(boolean show) {
		LogoGrab.SHOW_ADDITIONAL_FEATURES = show;
	}
	
	/**
	 * If <b>true:</b> show the close button in the upper left corner.<br>
	 * If <b>false:</b> do not show the close button in the upper left corner.<br>
	 * By <b>default:</b> true.
	 * 
	 * @param show The boolean
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
	 * 
	 * @param startAtHomeFeed The boolean
	 */
	public static void setStartAtHomeFeed(boolean startAtHomeFeed) {
		LogoGrab.START_AT_HOME_FEED = startAtHomeFeed;
	}
	
	/**
	 * Starts the LogoGrab Activity. Sets also the LogoGrab listener, to listen to the response given by the LogoGrab Server.
	 * This Listener listens to the responses of the LogoGrab Server. Provide <b>null</b> if you don't care.<br>
	 * It implements the abstract method:
	 * <ul>
	 * <li>onResponse
	 * </ul>
	 * <b>onResponse(JSONObject response):</b><br>
	 * The response from the LogoGrab Server after a successful grab. This method gets invoked twice
	 * after a successful grab. First, to give some brief information about the grabbed Logo:
	 * <ul>
	 * <li>"<b>session_id</b>": The session ID
	 * <li>"<b>confidence</b>": confidence score of the detection
	 * <li>"<b>image_type</b>": The image type (= 0, not used at the moment)
	 * <li>"<b>logo_version_id</b>": The Logo version ID
	 * </ul>
	 * <br>
	 * The second invocation is a detailed JSONObject about the grabbed Logo:
	 * <ul>
	 * <li>"<b>icon_url</b>": The URL to the Icon image of the Logo
	 * <li>"<b>share_url</b>": The LogoGrab Logo Content page
	 * <li>"<b>description</b>": The description of the Logo
	 * <li>"<b>name</b>": The name of the Logo
	 * </ul>
	 * <br>
	 * NOTE: Some JSONObject fields might not always be available.
	 * <br>
	 * 
	 * @param caller The Activity from where this method was called
	 * @param logoGrabListener The LogoGrab listener
	 */
	public static <T extends Activity> void startLogoGrab(T caller, LogoGrabListener logoGrabListener) {
		if (logoGrabListener != null)
			LogoGrab.LOGOGRAB_LISTENER = logoGrabListener;
		LogoGrab.startLogoGrab(caller);
	}
}
