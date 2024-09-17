package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class WaitTests extends BaseTests {


    @Test
    public void testWaitUntilHidden() {

        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStart();
        String actualText = loadingPage.getLoadedText();
        System.out.println("Actual Text: " + actualText); // Debug statement
        assertEquals("Loaded text incorrect", "Hello World!", actualText);
    }

}
