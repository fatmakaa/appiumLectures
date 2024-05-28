package appium.day11;

import appium.basetest.DeviceBaseTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class C24_ScreenLock extends DeviceBaseTest {

    @Test
    public void testLockDevice() {

        driver.lockDevice(Duration.ofSeconds(5));
        waitt(3);
    }

    @Test
    public void testUnlockDevice() {
        driver.lockDevice();
        waitt(5);
        driver.unlockDevice();
        waitt(3);
    }

    @Test
    public void testIsDeviceLocked() {
        System.out.println(driver.isDeviceLocked()); //false
        driver.lockDevice();
        waitt(3);
        System.out.println(driver.isDeviceLocked()); //true
        driver.unlockDevice();
        waitt(2);
        System.out.println(driver.isDeviceLocked());//false
    }


}
