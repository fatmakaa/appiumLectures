
package appium.day02;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class C02_Capabilities {
    AndroidDriver driver;
    @Test
    public void testUiAutomator2Options() throws MalformedURLException
    {String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "VodQA.apk";


        UiAutomator2Options options = new UiAutomator2Options()
                .setApp(appUrl) // Çalıştıracağımız uygulamayı seçmek için
                .setUdid("5554") // adb devices - Hangi cihazda testimi çalıştıracaksam onun udid bilgisini giriyorum
                //.setAppPackage("io.appium.android.apis") // Çalıştıracağımız uygulamayı seçmek için
               // .setAppActivity("io.appium.android.apis.ApiDemos") // Çalıştıracağımız uygulamayı seçmek için
                .setAvd("MyDevice1") // Kapalı emülatörü açmak için
                .setAvdLaunchTimeout(Duration.ofMinutes(5)) // Emülatörün açılışında süre tanımlaması yapmak için
                ;
        URL url = new URL("http://0.0.0.0:4723");

        AndroidDriver driver = new AndroidDriver(url, options);

    }



    @Test
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setAppPackage("com.mobisoft.kitapyurdu")
                .setAppActivity(".main.SplashActivity");
        URL url = new URL("http://0.0.0.0:4723");

        driver = new AndroidDriver(url, options);
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


}
