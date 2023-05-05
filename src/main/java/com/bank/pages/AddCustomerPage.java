package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    By firstNameField = By.xpath("//input[@placeholder='First Name']");
    By lastNameField = By.xpath("//input[@placeholder='Last Name']");
    By postcodeField = By.xpath("//input[@placeholder='Post Code']");
    By addCustomerButton = By.xpath("//button[@class='btn btn-default']");

    public void enterFirstName(String text) {
        sendTextToElement(firstNameField, text);
    }

    public void enterLastName(String text) {
        sendTextToElement(lastNameField, text);
    }

    public void enterPostcode(String text) {
        sendTextToElement(postcodeField, text);
    }

    public void clickOnAddCustomerButton() {
        clickOnElement(addCustomerButton);
    }


}
