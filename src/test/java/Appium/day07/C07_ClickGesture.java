package Appium.day07;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;
import Appium.basedtest.ApiDemosBasedTest;
import Appium.utilities.ReusableMethods;

public class C07_ClickGesture extends ApiDemosBasedTest {
    @Test
    public void testClickGestureElement() throws InterruptedException {
        WebElement os = driver.findElement(AppiumBy.accessibilityId("OS"));
//        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
//                "elementId", ((RemoteWebElement) os).getId()
//        ));

        clickGesture(driver, os);
        Thread.sleep(2000);
    }

    @Test
    public void testClickGestureCoordinate() throws InterruptedException {
//        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
//                "x", 740,
//                "y", 1088
//        ));

        clickGesture(driver, 740, 1088);
    }
}