package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By addCustomerTab = By.xpath("//button[@ng-click='addCust()']");
    By openAccountTab = By.xpath("//button[@ng-click='openAccount()']");
    By customersTab = By.xpath("//button[@ng-click='showCust()']");

    public void clickOnAddCustomerTab() {
        clickOnElement(addCustomerTab);
    }

    public void clickOnOpenAccountTab() {
        clickOnElement(openAccountTab);
    }

    public void clickOnCustomers() {
        clickOnElement(customersTab);
    }

    public String getPopupMsg() {
        return getTextFromAlert();
    }

    public void clickOKOnPopup() {
        acceptAlert();
    }
}
