package Appium.day02;

import Appium.basedtest.ApiDemosBasedTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class C03_Locators extends ApiDemosBasedTest {
    @Test
    public void testLocators() {

        // 1 - With Accessibility ID:
        WebElement element = driver.findElement(AppiumBy.accessibilityId("Accessibility"));
        System.out.println("Accessibility ID:" + element.getText());

        // 2 - With id:
        element = driver.findElements(AppiumBy.id("android:id/text1")).get(1);
        System.out.println("id:" + element.getText());

        // 3 - With ClassName:
        element = driver.findElements(AppiumBy.className("android.widget.TextView")).get(2);
        System.out.println("className:" + element.getText());

        // 4 - androidUIAutomator:
        element = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Accessibility\")"));
        System.out.println("Android UI Automator : " + element.getText());

        // 5 - xpath:
        element = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
        element = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Accessibility\"]"));
        System.out.println("XPath : " + element.getText());
    }

}
