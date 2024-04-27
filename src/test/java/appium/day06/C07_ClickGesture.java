package appium.day06;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import appium.basetest.ApiDemosBaseTest;

public class C07_ClickGesture extends ApiDemosBaseTest {
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