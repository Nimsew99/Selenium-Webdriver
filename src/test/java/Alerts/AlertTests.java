package Alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class AlertTests extends BaseTests{
    @Test
    public void testAcceptAlert() {
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerAlert();
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResult(), "You successfully clicked an alert" , "Results text incorrect");
    }

    @Test
    public void testGetFromAlert() {
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerConfirm();
        String text = alertPage.alert_getText();
        alertPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm" , "Alert text incorrect");

    }

    @Test
    public void testSetInputInAlert() {
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerPrompt();
        String text = "TAU rocks";
        alertPage.alert_setInput(text);
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResult(), text,"Results text incorrect");

    }




}
