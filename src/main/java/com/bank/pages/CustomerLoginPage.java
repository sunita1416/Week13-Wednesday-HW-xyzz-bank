package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {
    By loginButton = By.xpath("//button[contains(text(),'Login')]");
    By logoutText = By.xpath("//button[contains(text(),'Logout')]");
    By logoutButton = By.xpath("//button[contains(text(),'Logout')]");
    By yourNameTextAfterLogout = By.xpath("//label[contains(text(),'Your Name :')]");

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getLogoutText() {
        return getTextFromElement(logoutText);
    }

    public void clickOnLogoutButton() {
        clickOnElement(logoutButton);
    }

    public String getNameTextAfterLogout() {
        return getTextFromElement(yourNameTextAfterLogout);
    }
}
