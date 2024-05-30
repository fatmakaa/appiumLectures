package appium.day12;

import appium.basetest.ChromeBrowserBaseTest;
import org.testng.annotations.Test;

public class C27_MobileWebAppTest extends ChromeBrowserBaseTest {
    @Test
    public void testBrowser() {
        driver.get("https://www.amazon.com");

        waitt(3);

    }
}