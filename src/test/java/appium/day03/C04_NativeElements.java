package appium.day03;

import appium.basedtest.ApiDemosBasedTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class C04_NativeElements  extends ApiDemosBasedTest {

    @Test
    public void testWebElement() throws MalformedURLException {

       WebElement app = driver.findElement(AppiumBy.accessibilityId("App"));
       app.click();

        WebElement alarm = driver.findElement(AppiumBy.accessibilityId("Alarm"));
        alarm.click();

        WebElement alarmController = driver.findElement(AppiumBy.accessibilityId("Alarm Controller"));
        alarmController.click();



    }


    @Test
    public void findBy() throws MalformedURLException {

        By app = AppiumBy.accessibilityId("App");

        By alarm = AppiumBy.accessibilityId("Alarm");

        By alarmController = AppiumBy.accessibilityId("Alarm Controller");


        driver.findElement(app).click();
        driver.findElement(alarm).click();
        driver.findElement(alarmController).click();


    }
}
