package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTests{
    @Test
    public void DropDownTest(){
        var DropDownPage = homePage.clickDropDown();

        String option = "Option 1";
        DropDownPage.selectFromDropDown(option);
        var selectedOptions = DropDownPage.getSelectedOption();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of Selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }



    private void assertEquals(int size, int i, String incorrectNumberOfSelections) {
        
    }
}
