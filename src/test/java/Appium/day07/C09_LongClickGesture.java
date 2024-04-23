package Appium.day07;

import Appium.basedtest.ApiDemosBasedTest;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

public class C09_LongClickGesture extends ApiDemosBasedTest {

    @Test
    public void testLongClickGestureElement() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("App")).click();
        driver.findElement(AppiumBy.accessibilityId("Fragment")).click();
        driver.findElement(AppiumBy.accessibilityId("Context Menu")).click();



        WebElement element = driver.findElement(AppiumBy.accessibilityId("Long press me"));

        //  driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of(
        //                "elementId", ((RemoteWebElement) element).getId(),
       //              "duration","1000"


           //       ));

        longClickGesture(driver,element,1000);
        Thread.sleep(3000);


    }


    @Test
    public void testLongClickGestureCoordinate() throws InterruptedException {

        driver.findElement(AppiumBy.accessibilityId("App")).click();
        driver.findElement(AppiumBy.accessibilityId("Fragment")).click();
        driver.findElement(AppiumBy.accessibilityId("Context Menu")).click();


      longClickGesture(driver,544,417,1000);

      Thread.sleep(5000);




    }


}
