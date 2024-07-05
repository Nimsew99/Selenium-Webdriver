package contextMenu;

import keys.Test;
import base.BaseTests;
import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests{

    @Test
    public void testRightClick(){
        var ContextMenuPage = homePage.clickContextMenu();
        ContextMenuPage.rightClickInBox();
        String message = ContextMenuPage.getPopupText();
        ContextMenuPage.acceptPopup();
        assertEquals(message, "You selected a context menu", "Popup message incorrect");
    }
}
