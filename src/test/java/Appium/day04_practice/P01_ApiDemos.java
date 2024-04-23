package Appium.day04_practice;

import Appium.basedtest.ApiDemosBasedTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class P01_ApiDemos extends ApiDemosBasedTest {
      /*
    Uygulama: ApiDemos
        API Demos uygulamasına gir
        Preference seçeneğine tıkla
        3. Preference dependencies seçeneğine tıkla
        WiFi kontrol kutusunu seç
        WiFi settings seçeneğine tıkla
        Açılan ekrandaki başlığın WiFi settings olduğunu doğrula
        Metin kutusuna adını yaz
        Tamam butonuna tıkla

     */


    @Test
    public void testApiDemos() {
        By preference = AppiumBy.accessibilityId("Preference");
        By preferenceDep = AppiumBy.accessibilityId("3. Preference dependencies");
        By checkBox = AppiumBy.className("android.widget.CheckBox");
        By wifiSet = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.RelativeLayout\").instance(1)");


        driver.findElement(preference).click();
        driver.findElement(preferenceDep).click();
        driver.findElement(checkBox).click();
        driver.findElement(wifiSet).click();

        //Assertion
        By assertWifi = AppiumBy.className("android.widget.TextView");
        String actual = driver.findElement(assertWifi).getText();
        System.out.println("actual = " + actual);
        assertTrue(actual.equals("WiFi settings"));

        //Type your name to the text box
        By textBox = AppiumBy.className("android.widget.EditText");
        driver.findElement(textBox).sendKeys("Fatma");

        // Click on ok
        By okButton = AppiumBy.id("android:id/button1");
        driver.findElement(okButton).click();


    }


}
