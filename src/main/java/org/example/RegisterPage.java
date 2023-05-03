package org.example;

import org.openqa.selenium.By;

import static org.example.Utils.*;

public class RegisterPage extends Utils {
    private By _firstName = By.id("FirstName");

    private By _lastName = By.id("LastName");

    private By _email = By.name("Email");

    private By _password = By.id("Password");

    private By _confirmPassword = By.id("ConfirmPassword");

    private By _register = By.id("register-button");

    public void enterRegistrationDetails(){
        // type Firstname
        typeText(_firstName,"jo");
        // type LastName
        typeText(_lastName, "Peter");
        // type email Address
        typeText(_email, "Test1email+" + timestamp() + "@gmail.com");
        // type password
        typeText(_password, "Peter1234");
        // type confirm password
        typeText(_confirmPassword, "Peter1234");
        // click on register submit button
        clickOnElement(_register);

    }
}
