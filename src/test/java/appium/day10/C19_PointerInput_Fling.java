package appium.day10;

import appium.basetest.ApiDemosBaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Collections;

public class C19_PointerInput_Fling extends ApiDemosBaseTest {

    @Test
    public void testFling(){
        driver.findElement(AppiumBy.accessibilityId("Views")).click();

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");

        Sequence sequence = new Sequence(finger,1)
                .addAction(finger.createPointerMove(Duration.ofMillis(0),PointerInput.Origin.viewport(),487,1373))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger,Duration.ofMillis(200)))
                .addAction(finger.createPointerMove(Duration.ofMillis(80),PointerInput.Origin.viewport(), 490, 746))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(sequence));
        waitt(2);


    }



}
