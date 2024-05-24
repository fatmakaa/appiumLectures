package appium.day09;

import appium.basetest.ApiDemosBaseTest;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Collections;

public class C15_PointerInput_Tap extends ApiDemosBaseTest {



    @Test
    public void testTap() throws InterruptedException {

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        Sequence sequence = new Sequence(finger, 1)
                // Parmak, ekran üzerindeki tap yapılacak koordinata hareket ettirilir.
                .addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 867, 1530))
                // Parmak ile, farenin sol tuşuna basar gibi, ekranda belirlediğimiz koordinata bastık.
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                // Ekranda parmağın basılı olarak duracağı süreyi belirledik.
                .addAction(new Pause(finger, Duration.ofMillis(300)))
                // Parmağı ekranda bastığımız koordinattan kaldırdık.
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        // Sıralı adımları topluca eyleme dönüştürdük.
        driver.perform(Collections.singletonList(sequence));

        Thread.sleep(3000);




    }
}
