BikeHelp
========

An Android app to help cyclists struck with mechanicals while out and about

-  Summer 2012: original idea developed over lunch between Oliver Lockwood & Mudit Matanhelia
-  November 2012: original sketch implementation with some rather hokey Java code
-  2014: v1.0 developed and released (hopefully!)

##Developer setup

-  Install JDK and Maven.  I've used 1.7 and 3.2.3, the latter installed through Homebrew.
-  Install the Android SDK and a dev environment as appropriate.  See https://developer.android.com/sdk/installing/index.html.  I'm using IntelliJ 13 so did the standalone install.  Note that IntelliJ 12 doesn't support AAR dependencies.
-  Download everything using the Android SDK manager.  (Yes, I did everything.)
-  Use https://github.com/mosabua/maven-android-sdk-deployer to get the Android stuff deployed to your local Maven repository.  Note that one item failed for me ("Android Google AdMob Ads Extra", or `admob`); to skip it I resumed using `mvn install -rf :google-play-services`.
-  Send me your debug.keystore SHA1 so I can add it to the allowed range for the Google Maps v2 API key (https://code.google.com/apis/console/?noredirect#project:438448208298:access).  If you're on Mac OSX, you can probably get this by running `keytool -list -v -keystore ~/.android/debug.keystore -alias androiddebugkey -storepass android -keypass android`.
-  Please update this information if you discover any of it to be inaccurate or incomplete!

##Useful references:
-  https://github.com/googlemaps/hellomap-android
-  https://groups.google.com/forum/#!forum/maven-android-developers
