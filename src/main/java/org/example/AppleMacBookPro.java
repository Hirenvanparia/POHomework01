package org.example;

import org.openqa.selenium.By;

public class AppleMacBookPro extends Utils {
    private By _emailAFriend = By.className("email-a-friend");

    public void productDetailPage() {//click on Email
        clickOnElement(_emailAFriend);

    }
}
