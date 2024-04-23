package appium.day07;

import appium.basedtest.CalculatorBasedTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class C08_DoubleClickGesture extends CalculatorBasedTest {

    @Test
    public void testDoubleClick() throws InterruptedException {

        driver.findElement(AppiumBy.accessibilityId("9")).click();
        driver.findElement(AppiumBy.accessibilityId("5")).click();
        driver.findElement(AppiumBy.accessibilityId("2")).click();

        WebElement element = driver.findElement(AppiumBy.id("com.google.android.calculator:id/formula"));


     //   driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of(
      //         "elementId", ((RemoteWebElement) element).getId()
   //  ));

        doubleClickGesture(driver,element);
        Thread.sleep(2000);


    }


    @Test
    public void testDoubleClickCoordinate(){

        driver.findElement(AppiumBy.accessibilityId("9")).click();
        driver.findElement(AppiumBy.accessibilityId("5")).click();
        driver.findElement(AppiumBy.accessibilityId("2")).click();


    //    driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of(
        //             "x", "875",
          //      "y","400"
       // ));

        doubleClickGesture(driver,875,400);



    }





}
