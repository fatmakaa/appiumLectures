package appium.day08practice;

import appium.basetest.HaritalarBaseTest;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class P07_Harita_PinchOpenAndClose extends HaritalarBaseTest {

     /*
    Uygulama: Haritalar
        Haritalar uygulamasına gir
        Harita türü olarak Uydu seçeneğini seç
        Arama motorunda Taj Mahal kelimelerini arat
        Haritada Taj Mahal bölgesine zoom in ve zoom out işlemlerini yap
    */


    @Test
    public void mapTest() throws InterruptedException {


       WebElement layouts =  driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(8)"));
       clickGesture(driver,layouts);

       WebElement stateLine = driver.findElement(AppiumBy.id("com.google.android.apps.maps:id/layers_menu_satellite_layer"));
        clickGesture(driver,stateLine);

        WebElement close = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(0)"));
        clickGesture(driver,close);

        WebElement searchBox = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Search here\")"));
        clickGesture(driver,searchBox);

        WebElement searchBoxx = driver.findElement(AppiumBy.id("com.google.android.apps.maps:id/search_omnibox_edit_text"));
        searchBoxx.sendKeys("Taj Mahal");

        KeyEvent enter = new KeyEvent(AndroidKey.ENTER);
        driver.pressKey(enter);

        Thread.sleep(3000);


        driver.executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
                "left", 330,
                "top", 560,
                "width", 430,
                "height", 500,
                "percent", 0.75,
                "speed", 300
        ));

        Thread.sleep(2000);

        driver.executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
                "left", 330,
                "top", 560,
                "width", 430,
                "height", 500,
                "percent", 0.75,
                "speed", 300
        ));



        Thread.sleep(5000);






    }

}
