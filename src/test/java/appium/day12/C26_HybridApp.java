package appium.day12;

import appium.basetest.ApiDemosBaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class C26_HybridApp extends ApiDemosBaseTest {

    @Test
    public void testHybrid() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))"));
        driver.findElement(AppiumBy.accessibilityId("WebView")).click();

        waitt(3);

//        Set<String> contextHandles = driver.getContextHandles();
//        for (String contextName : contextHandles){
//            System.out.println(contextName);
//        }

        /*
         Test çalıştırdığımızda eğer "ChromeDriver bulunamadı" şeklinde bir hata mesajı alırsak, server'ı aşağıdaki
         komut ile çalıştırıp, testi tekrar çalıştırırız. Böylece chromedriver bilgisayarımıza otomatik olarak yüklenir.
         appium --allow-insecure chromedriver_autodownload
         */

        driver.context("WEBVIEW_io.appium.android.apis");

        System.out.println("URL: " + driver.getCurrentUrl());

        System.out.println("Başlık: " + driver.findElement(By.tagName("h1")).getText());

        driver.pressKey(new KeyEvent(AndroidKey.BACK));

        driver.context("NATIVE_APP");

        driver.findElement(AppiumBy.accessibilityId("Visibility")).click();

        waitt(2);

    }
}