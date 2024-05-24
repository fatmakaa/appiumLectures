package appium.day09;

import appium.basetest.CalculatorBaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Collections;

public class C16_PointerInput_DoubleTap extends CalculatorBaseTest {

    @Test
    public void testDoubleTap() throws InterruptedException {

        driver.findElement(AppiumBy.accessibilityId("9")).click();
        driver.findElement(AppiumBy.accessibilityId("5")).click();
        driver.findElement(AppiumBy.accessibilityId("2")).click();


        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");

        Sequence sequence = new Sequence(finger,1)
                //First tap step
                .addAction(finger.createPointerMove(Duration.ofMillis(0),PointerInput.Origin.viewport(),875,400))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger , Duration.ofMillis(300)))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()))

                //Second step
                .addAction(finger.createPointerMove(Duration.ofMillis(10),PointerInput.Origin.viewport(),870,405))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger,Duration.ofMillis(300)))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(sequence));
        Thread.sleep(3000);


    }

}
