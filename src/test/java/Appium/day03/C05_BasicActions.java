package Appium.day03;

import Appium.basedtest.ApiDemosBasedTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.*;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class C05_BasicActions extends ApiDemosBasedTest {

    @Test
    public void testActions() throws MalformedURLException, InterruptedException {


        By app = AppiumBy.accessibilityId("App");
        By activity = AppiumBy.accessibilityId("Activity");
        By customTitle = AppiumBy.accessibilityId("Custom Title");
        By leftTextBox = AppiumBy.id("io.appium.android.apis:id/left_text_edit");
        By rightBox = AppiumBy.id("io.appium.android.apis:id/right_text_edit");
        By leftButton = AppiumBy.accessibilityId("Change Left");
        By rightButton = AppiumBy.accessibilityId("Change Right");


        driver.findElement(app).click();
        driver.findElement(activity).click();
        driver.findElement(customTitle).click();

        driver.findElement(leftTextBox).clear();
        driver.findElement(leftTextBox).sendKeys("Fatma");
        driver.findElement(leftButton).click();


        driver.findElement(rightBox).clear();
        driver.setClipboardText("Fatmaa");// ctrl+c command
        Thread.sleep(3000);
        driver.findElement(rightBox).sendKeys(driver.getClipboardText()); //kinda paste command
        Thread.sleep(3000);
        driver.findElement(rightButton).click();

        KeyEvent back = new KeyEvent(AndroidKey.BACK);
        KeyEvent home = new KeyEvent(AndroidKey.HOME);

        driver.pressKey(back);
        Thread.sleep(2000);
        driver.pressKey(home);



    }
}
