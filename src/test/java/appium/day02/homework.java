package appium.day02;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class homework {
    @Test
    public void testUiAutomator2Options() throws MalformedURLException {
        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "ApiDemos-debug.apk";

        UiAutomator2Options options = new UiAutomator2Options()
                .setApp(appUrl) // Çalıştıracağımız uygulamayı seçmek için
                .setUdid("5554") // adb devices - Hangi cihazda testimi çalıştıracaksam onun udid bilgisini giriyorum
                .setAppPackage("io.appium.android.apis") // Çalıştıracağımız uygulamayı seçmek için
                .setAppActivity("io.appium.android.apis.ApiDemos") // Çalıştıracağımız uygulamayı seçmek için
                .setAvd("MyDevice1") // Kapalı emülatörü açmak için
                .setAvdLaunchTimeout(Duration.ofMinutes(5)) // Emülatörün açılışında süre tanımlaması yapmak için
                ;

        URL url = new URL("http://0.0.0.0:4723");

        AndroidDriver driver = new AndroidDriver(url, options);


        //1 - Page = Accessibility  Locate with = accessibilityId
        WebElement element = driver.findElement(AppiumBy.accessibilityId("Accessibility"));
        System.out.println("Accessibility ID:" + element.getText());
        element.click();
        driver.navigate().back();

        //2 - Page = Content  Locate with = id
        WebElement element1 =  driver.findElements(AppiumBy.id("android:id/text1")).get(4);
        System.out.println("id:" + element1.getText());
        element1.click();
        driver.navigate().back();



        //3 - Page = Media  Locate with = className
        WebElement element2 =  driver.findElements(AppiumBy.className("android.widget.TextView")).get(5);
        System.out.println("className:" + element2.getText());
        element2.click();
        driver.navigate().back();


        //4 - Page = NFC  Locate with = androidUIAutomator
        WebElement element3 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"NFC\")"));
        System.out.println("androidUIAutomator:" + element3.getText());
        element3.click();

















    }



}
