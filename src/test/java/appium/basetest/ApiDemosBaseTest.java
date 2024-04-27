package appium.basetest;

import appium.utilities.ReusableMethods;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class ApiDemosBaseTest extends ReusableMethods {
   public AndroidDriver driver ;
   @BeforeClass
    public void setUp() throws MalformedURLException {
        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "ApiDemos-debug.apk";

        UiAutomator2Options options = new UiAutomator2Options()
                .setApp(appUrl); // Çalıştıracağımız uygulamayı seçmek için

        URL url = new URL("http://0.0.0.0:4723");


         driver = new AndroidDriver(url, options);


    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
