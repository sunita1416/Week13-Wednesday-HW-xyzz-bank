package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {
    By nameDropdown = By.id("userSelect");

    public void searchAndSelectNameFormDropdown(String text) {
        selectByVisibleTextFromDropDown(nameDropdown, text);
    }
}
