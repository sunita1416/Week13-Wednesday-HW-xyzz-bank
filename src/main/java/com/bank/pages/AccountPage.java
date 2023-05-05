package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By depositTab = By.xpath("//button[@ng-click='deposit()']");
    By amountField = By.xpath("//input[@ng-model='amount']");
    By depositButton = By.xpath("//button[text()='Deposit']");
    By depositMsg = By.xpath("//span[text()='Deposit Successful']");
    By withdrawTab = By.xpath("//button[@ng-click='withdrawl()']");
    By withdrawButton = By.xpath("//button[text()='Withdraw']");
    By withdrawMsg = By.xpath("//span[text()='Transaction Successful']");

    public void clickOnDepositTab() {
        clickOnElement(depositTab);
    }

    public void enterAmountToDeposit(String text) {
        sendTextToElement(amountField, text);
    }

    public void clickOnDepositButton() {
        clickOnElement(depositButton);
    }

    public String getDepositMsg() {
        return getTextFromElement(depositMsg);
    }

    public void clickOnWithdrawTab() {
        clickOnElement(withdrawTab);
    }

    public void enterAmountToWithdraw(String text) {
        sendTextToElement(amountField, text);
    }

    public void clickOnWithdrawButton() {
        clickOnElement(withdrawButton);
    }

    public String getWithdrawMsg() {
        return getTextFromElement(withdrawMsg);
    }
}

