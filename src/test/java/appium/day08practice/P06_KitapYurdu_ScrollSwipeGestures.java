package appium.day08practice;

import appium.basetest.KitapYurduBaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class P06_KitapYurdu_ScrollSwipeGestures extends KitapYurduBaseTest {

      /*
    Uygulama: Kitap Yurdu
        Kitap Yurdu uygulamasına gir
        İlgi Görenler bölümündeki 5. kitaba tıkla
        Kitap adı, Yazar adı ve Yayınevi adı bilgilerini yazdır
        Künye başlıklarını ve bilgilerini yazdır
    */


    @Test
    public void testKitapYurdu() throws InterruptedException {

        driver.findElement(AppiumBy.id("com.mobisoft.kitapyurdu:id/btnLaterOn")).click();

        WebElement swipeElement = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.mobisoft.kitapyurdu:id/recyclerViewList\").instance(0)"));

        swipeGesture(driver,swipeElement,"left",1.0,1000);


        WebElement fifthBook = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.mobisoft.kitapyurdu:id/imageViewProduct\").instance(1)"));

         clickGesture(driver,fifthBook);


        List<WebElement> bookInfo = driver.findElements(AppiumBy.xpath("//android.widget.ScrollView[@resource-id=\"com.mobisoft.kitapyurdu:id/productDetailScrollView\"]/android.view.ViewGroup/android.widget.TextView"));

        System.out.println("Book Name:" + bookInfo.get(0).getText());
        System.out.println("Author Name:" + bookInfo.get(1).getText());
        System.out.println("Publisher Name:" + bookInfo.get(2).getText());
        System.out.println("________________________________");


        WebElement scrollElement = driver.findElement(AppiumBy.id("com.mobisoft.kitapyurdu:id/productDetailScrollView"));
        scrollGesture(driver,scrollElement,"down",2.4,1000);


        List<WebElement> kunyeTitle = driver.findElements(AppiumBy.id("com.mobisoft.kitapyurdu:id/textViewAttributeTitle"));

        List<WebElement> kunyeInfo = driver.findElements(AppiumBy.id("com.mobisoft.kitapyurdu:id/textViewAttributeName"));
        for (int i = 0; i < kunyeTitle.size(); i++) {
            System.out.print(kunyeTitle.get(i).getText() + "\t");
            System.out.println(kunyeInfo.get(i).getText());
        }


    }


}
