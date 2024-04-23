package Appium.day05_practice;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import Appium.basedtest.MyDemoAppBaseTest;

import java.util.List;

public class P04_MyDemoApp_ColorTest extends MyDemoAppBaseTest {
    /*
    Uygulama: MyDemoApp
        MyDemoApp uygulamasına gir
        Menüyü aç
        Login ol (bob@example.com, 10203040)
        Login butonuna tıkla
        İlk ürünü seç
        Renk olarak mavi seç
        Add To Cart butonuna tıkla
        Renk olarak kırmızı seç
        Add To Cart butonuna tıkla
        Sepete git
        Listede iki ürün olduğunu doğrula
        Listedeki ürünlerin mavi ve kırmızı olduğunu doğrula
     */

    @Test
    public void testColor() throws InterruptedException {
        WebElement menu = driver.findElement(AppiumBy.accessibilityId("open menu"));
        menu.click();

        WebElement menuItemLogIn = driver.findElement(AppiumBy.accessibilityId("menu item log in"));
        menuItemLogIn.click();

        WebElement usernameInputField = driver.findElement(AppiumBy.accessibilityId("Username input field"));
        usernameInputField.click();
        usernameInputField.sendKeys("bob@example.com");

        WebElement passwordInputField = driver.findElement(AppiumBy.accessibilityId("Password input field"));
        passwordInputField.sendKeys("10203040");
        driver.hideKeyboard();  // Keyboard acidligi zaman login butonunu görmediği icin
        Thread.sleep(3000);

        WebElement loginButton = driver.findElement(AppiumBy.accessibilityId("Login button"));
        loginButton.click();

        WebElement productTitle = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Sauce Labs Backpack\")"));
        productTitle.click();

//        WebElement blueCircle = driver.findElement(AppiumBy.accessibilityId("blue circle"));
        By blueCircle = AppiumBy.accessibilityId("blue circle"); // Sayfa değiştiğinde aynı elementi kullanmak istiyorum. SataleElement almamak için By ile tanımladım.
        driver.findElement(blueCircle).click();

        WebElement addToCartButton = driver.findElement(AppiumBy.accessibilityId("Add To Cart button"));
        addToCartButton.click();

//        WebElement redCircle = driver.findElement(AppiumBy.accessibilityId("red circle"));
        By redCircle = AppiumBy.accessibilityId("red circle"); // Sayfa değiştiğinde aynı elementi kullanmak istiyorum. SataleElement almamak için By ile tanımladım.
        driver.findElement(redCircle).click();

        addToCartButton.click();

        WebElement cartBadge = driver.findElement(AppiumBy.accessibilityId("cart badge"));
        cartBadge.click();

        List<WebElement> productRow = driver.findElements(AppiumBy.accessibilityId("product row"));
        Assert.assertEquals(productRow.size(), 2);

        List<WebElement> blueCircle2 = driver.findElements(AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"product row\"])[1]//android.view.ViewGroup[contains(@content-desc, 'blue circle')]"));
        Assert.assertFalse(blueCircle2.isEmpty());

        Assert.assertTrue(driver.findElement(redCircle).isDisplayed());

    }
}