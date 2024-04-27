package appium.day03;

import appium.basetest.ApiDemosBaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class C06_ElementDegerleriniCekme extends ApiDemosBaseTest {

    @Test
    public void testElementDegerleriniCekme() throws MalformedURLException {

        By accessibility = AppiumBy.accessibilityId("Accessibility");

        System.out.println("Get Text: " +driver.findElement(accessibility).getText());
        System.out.println("Get Attribute: " + driver.findElement(accessibility).getAttribute("package"));


        System.out.printf("isSelected: " + driver.findElement(accessibility).isSelected());
        System.out.println();
        System.out.printf("isEnabled: " + driver.findElement(accessibility).isEnabled());
        System.out.println();
        System.out.printf("isDisplayed: " + driver.findElement(accessibility).isDisplayed());


        System.out.println("Get Size: " + driver.findElement(accessibility).getSize());
        System.out.println("Get Location : " + driver.findElement(accessibility).getLocation());
    }
}
