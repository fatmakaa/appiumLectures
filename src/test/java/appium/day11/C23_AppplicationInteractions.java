package appium.day11;

import appium.basetest.ApiDemosBaseTest;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;

public class C23_AppplicationInteractions extends ApiDemosBaseTest {


    @Test
    public void testTerminateApp(){
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Custom")).click();
        waitt(2);
        driver.terminateApp("io.appium.android.apis");
        waitt(2);


    }



    @Test
    public void testActivitiesApp(){
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Custom")).click();
        waitt(2);
        driver.terminateApp("io.appium.android.apis");
        waitt(2);
        driver.activateApp("com.google.android.calculator");
        waitt(2);
        driver.activateApp("io.appium.android.apis");
        waitt(2);


    }

    @Test
    public void RunAppInBackground() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Custom")).click();
        waitt(2);

        driver.runAppInBackground(Duration.ofSeconds(5));

        waitt(3);

    }


    @Test
    public void testInstallApp() {
        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "Android-MyDemoAppRN.1.3.0.build-244.apk";

        driver.installApp(appUrl);


    }

    @Test
    public void testIsAppInstall(){

        System.out.println(driver.isAppInstalled("com.saucelabs.mydemoapp.rn"));

    }
    @Test
    public void testQueryAppState() {
        System.out.println(driver.queryAppState("io.appium.android.apis"));
        waitt(3);

        driver.terminateApp("io.appium.android.apis");
        System.out.println(driver.queryAppState("io.appium.android.apis"));
        waitt(3);

        driver.activateApp("io.appium.android.apis");
        System.out.println(driver.queryAppState("io.appium.android.apis"));
        waitt(3);

        driver.activateApp("com.google.android.calculator");
        System.out.println(driver.queryAppState("io.appium.android.apis"));
        waitt(3);
    }





}
