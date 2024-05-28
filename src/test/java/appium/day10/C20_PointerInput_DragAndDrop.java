package appium.day10;

import appium.basetest.ApiDemosBaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Collections;

public class C20_PointerInput_DragAndDrop extends ApiDemosBaseTest {

    @Test
    public void testDragAndDrop(){

        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");


        Sequence sequence = new Sequence(finger,1)
                .addAction(finger.createPointerMove(Duration.ofMillis(0),PointerInput.Origin.viewport(),210,540))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger,Duration.ofMillis(200)))

                .addAction(finger.createPointerMove(Duration.ofMillis(2000),PointerInput.Origin.viewport(),627,540));


        driver.perform(Collections.singletonList(sequence));

        waitt(2);





    }


}
