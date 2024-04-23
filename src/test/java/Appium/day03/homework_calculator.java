package Appium.day03;

import Appium.basedtest.ApiDemosBasedTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class homework_calculator extends Appium.basedtest.CalculatorBasedTest {

    @Test
    public void additionTest(){

        By eight = AppiumBy.accessibilityId("8");
        By plus = AppiumBy.accessibilityId("plus");
        By four = AppiumBy.accessibilityId("4");
        By equals = AppiumBy.accessibilityId("equals");

        driver.findElement(eight).click();
        driver.findElement(plus).click();
        driver.findElement(four).click();
        driver.findElement(equals).click();


        By result = AppiumBy.className("android.widget.TextView");
        driver.findElement(result).getText();
        System.out.println("result = " + result);
       // assertTrue(result.equals("12"));

    }


    @Test
    public void subtractionTest(){

        By eight = AppiumBy.accessibilityId("8");
        By minus = AppiumBy.accessibilityId("minus");
        By four = AppiumBy.accessibilityId("4");
        By equals = AppiumBy.accessibilityId("equals");

        driver.findElement(eight).click();
        driver.findElement(minus).click();
        driver.findElement(four).click();
        driver.findElement(equals).click();

      //  By result = AppiumBy.className("android.widget.TextView");
     //   assertEquals(4, result);


    }

    @Test
    public void multiplicationTest(){
        By eight = AppiumBy.accessibilityId("8");
        By multiply = AppiumBy.accessibilityId("multiply");
        By four = AppiumBy.accessibilityId("4");
        By equals = AppiumBy.accessibilityId("equals");

        driver.findElement(eight).click();
        driver.findElement(multiply).click();
        driver.findElement(four).click();
        driver.findElement(equals).click();

    //    By result = AppiumBy.className("android.widget.TextView");




    }



}
