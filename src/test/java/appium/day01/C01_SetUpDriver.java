package appium.day01;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class C01_SetUpDriver {

    @Test
    public void testDesiredCapabilities() throws MalformedURLException {
     //   String appUrl = System.getProperty("user.dir")
    //            + File.separator + "src"
     //           + File.separator + "test"
    //            + File.separator + "resources"
    //            + File.separator + "General-Store.apk";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android"); //Zorunlu
        capabilities.setCapability("automationName", "uiautomator2"); // Zorunlu
       // capabilities.setCapability("app", appUrl);
       // capabilities.setCapability("udid", "5554"); // Duruma göre değişir, zorunlu değil
        capabilities.setCapability("appPackage", "com.google.android.dialer");
       capabilities.setCapability("appActivity", "com.google.android.dialer.extensions.GoogleDialtactsActivity");

        URL url = new URL("http://127.0.0.1:4723");

        AndroidDriver driver = new AndroidDriver(url, capabilities);
    }


    @Test
    public void testUiAutomator2Options() throws MalformedURLException {
      //  String appUrl = System.getProperty("user.dir")
        //        + File.separator + "src"
        //        + File.separator + "test"
        //        + File.separator + "resources"
       //         + File.separator + "ApiDemos-debug.apk";

        UiAutomator2Options options = new UiAutomator2Options()
        //        .setApp(appUrl)
         //       .setUdid("")
                .setAppPackage("com.mobisoft.kitapyurdu")
                .setAppActivity(".main.SplashActivit")
                ;

        URL url = new URL("http://0.0.0.0:4723");

        AndroidDriver driver = new AndroidDriver(url, options);

    }

}

