package Appium.day05_practice;

import Appium.basedtest.GeneralStoreBaseTest;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class P03_GeneralStore_NegativeTest extends GeneralStoreBaseTest {

      /*
    Uygulama: GeneralStore
        GeneralStore uygulamasına gir
        Menüden Angola seçeneğini seç
        Your Name kutusunu boş bırak
        Let’s Shop butonuna tıkla
        Hata mesajını doğrula (Toast Message)
     */


    @Test
    public void testGeneralStore(){

      driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
      String toastMessage = driver.findElement(AppiumBy.xpath("//android.widget.Toast")).getAttribute("name");
      assertTrue(toastMessage.equals("Please enter your name"));


    }
}
