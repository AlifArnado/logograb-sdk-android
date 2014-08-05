
----------------------------------------------------------

GETTING STARTED WITH THE LOGOGRAB SDK

We guide you through all the steps needed to get started with your own application that uses the LogoGrab SDK:

STEP 1:
Checkout the LogoGrabSDK in &lt;MY_WORKSPACE&gt; and create your own new android project (if not already available) in your desired ADT. &lt;MY_WORKSPACE&gt; will be referred to your workspace throughout this README. Also &lt;MY_PACKAGE&gt; will be referred to your package name of your application.

STEP 2:
Import the project library (LogoGrabSDK) into your workspace. In Eclipse this can be done under File/Import…/Existing\ Projects\ into\ Workspace.
Make sure you update this libraries to create their build.xml with your path to the android sdk. This is explained in the official android developer
homepage:
	http://developer.android.com/tools/projects/projects-cmdline.html#UpdatingAProject
Additionally import the google-play-service project library. For more information check out the official android developer homepage at:
	http://developer.android.com/google/play-services/setup.html

STEP 3:
Make sure, that the library project LogoGrabSDK has the reference of the library  google-play-services_lib. For Eclipse user:
<ul>
<li>Right-click LogoGrabSDK library project and click Properties<br>
<li>Under Android / Library just add the google-play-services_lib
<li>Under Android / Library also tick “is Library”
</ul>
Your project should then also reference the project library LogoGrabSDK.

STEP 4:
Make sure your project.properties file includes the line:<br>
<code>manifestmerger.enabled=true</code><br>
This way, you do not need to copy-paste all the activities from the LogoGrabSDK library project.

STEP 5:
Your Manifest.xml file should include these lines:

	<uses-sdk
		android:minSdkVersion="9"
		android:targetSdkVersion="9" />    

	<uses-feature android:name="android.hardware.camera" />
	<uses-feature android:name="android.hardware.camera.autofocus" />
	<uses-feature
		android:glEsVersion="0x00020000"
		android:required="true" />

	<!-- the LogoGrab application has a subclass routine, therefore you need also a subclass, more to that later. Obviously, it is your choice how to name this application class, which here is named "MainApplication" -->
	<application
		android:name="<MY_PACKAGE>.MainApplication" 
		android:allowBackup="true"
		android:hardwareAccelerated="true"
		android:largeHeap="true" >
	</application>

STEP 6:
Move the assets/fonts folder to the assets/ folder of your project, to be able to see all LogoGrab fonts used by the SDK.

STEP 7:
Create the class "MainApplication.java" under &lt;MY_PACKAGE&gt;, which should inherit "LogoGrabApplication.java". If you also have your own application file, just complete this class with your own desires. There is an example application file in LogoGrab\ Sample project to get some inspiration.

STEP 8:
Create the class "MainActivity.java" under &lt;MY_PACKAGE&gt;. You need to assign your SDK Developer Key to the LogoGrabSDK. This can easily be done in the activity file you just created by giving the String to the LogoGrabInterface:
<br><code>
LogoGrabInterface.setDevKey(“&lt;YOUR DEVELOPER KEY&gt;");
</code><br>
To Start the LogoGrab Application simply call the LogoGrabMainActivity from your project:
<br><code>
LogoGrabInterface.startLogoGrab(MainActivity.this);
<br></code>
Also see the MainActivity.java file inside the LogoGrab\ SampleApp application for illustration (also how to provide a listener to the LogoGrab Application).

----------------------------------------------------------

Once you completed the steps above, you're ready to compile and run SampleApp, your first application based on the LogoGrab SDK.

----------------------------------------------------------

CREATING YOUR CUSTOM LOGOGRAB-ENABLED APP

You have total freedom to integrate the LogoGrab functionality inside your own app. Just remember, it is mandatory for the users of your app to tap on the official LogoGrab icon to launch the SDK.

In your own custom app, you might find useful to access the identity of a logo given the ID returned by our SDK upon successful scanning. For this purpose please refer to the web function:<br>
<code>
http://logograb.com/api/getLogoVersions.json?developerKey= &lt;CYOUR_SDK_ACCESS_KEY&gt;
</code><br>
The function returns a JSON-formatted list of the "logo_version_id" of the logos present on the platform and their name.

Need to upload missing logos on the LogoGrab platform? You can do so at www.logograb.com/upload

Have fun!

----------------------------------------------------------

-- 
Alessandro Prest<br>
CTO<br>
LogoGrab<br>
http://www.logograb.com<br>
<br>
<br>
E-mail: alessandro@logograb.com<br>
Skype:	alessandro.prest<br>
