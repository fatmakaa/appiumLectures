package appium.day10;

import appium.basetest.VodQABaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;

public class C22_PointerInputZoomOut extends VodQABaseTest {

    @Test
    public void testZoomOut() {

        driver.findElement(AppiumBy.className("android.widget.Button")).click();
        driver.findElement(AppiumBy.accessibilityId("Ping & Zoom")).click();

        waitt(2);

        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH,"finger1");
        PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH,"finger2");

        Sequence sequence1 = new Sequence(finger1,1);
        Sequence sequence2 = new Sequence(finger2,2);


        sequence1
                .addAction(finger1.createPointerMove(Duration.ofMillis(0),PointerInput.Origin.viewport(),173,1210))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1,Duration.ofMillis(300)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(500),PointerInput.Origin.viewport(),490,1210))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        sequence2
                .addAction(finger2.createPointerMove(Duration.ofMillis(0),PointerInput.Origin.viewport(),920,1210))
                .addAction(finger2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger2,Duration.ofMillis(300)))
                .addAction(finger2.createPointerMove(Duration.ofMillis(500),PointerInput.Origin.viewport(),619,1210))
                .addAction(finger2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));


        driver.perform(Arrays.asList(sequence1,sequence2));

        waitt(2);





    }

}



