package appium.day11;

import appium.basetest.ApiDemosBaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.testng.annotations.Test;

public class C25_Keyboard extends ApiDemosBaseTest {

    @Test
    public void testIsKeyboardShown() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"TextFields\"))"));
        driver.findElement(AppiumBy.accessibilityId("TextFields")).click();

        System.out.println(driver.isKeyboardShown());//false

        driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit")).click();
        System.out.println(driver.isKeyboardShown());//true


    }
        @Test
        public void testPressKey() {
            driver.findElement(AppiumBy.accessibilityId("Views")).click();
            driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"TextFields\"))"));
            driver.findElement(AppiumBy.accessibilityId("TextFields")).click();
            driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit")).click();

            driver.pressKey(new KeyEvent(AndroidKey.SHIFT_LEFT).withKey(AndroidKey.A));

            waitt(5);

            KeyEvent back = new KeyEvent(AndroidKey.BACK);
            driver.pressKey(back);

            waitt(3);

            KeyEvent appSwitch = new KeyEvent(AndroidKey.APP_SWITCH);
            driver.pressKey(appSwitch);

            waitt(3);

            KeyEvent home = new KeyEvent(AndroidKey.HOME);
            driver.pressKey(home);



        }

}
