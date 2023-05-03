package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EmailAFriendPage extends Utils{
    private By _AppleMacBook = By.xpath("// a [ @ href=\"/apple-macbook-pro-13-inch\"]");
    private By _EmailAFriend = By.className("email-a-friend");

    private By _FriendEmail = By.id("FriendEmail");
    private By _YourEmail = By.id("YourEmailAddress");
    private By _PersonalMessage = By.name("PersonalMessage");

    private By _SendEmail = By.name("send-email");

    public void verifyUserShouldBeABleToEmailAFriend(){
        //click on Apple Macbook pro
        clickOnElement(_AppleMacBook);
        // click on email a friend
        clickOnElement(_EmailAFriend);
        //type friends email
        typeText(_FriendEmail,"Potermail+"+ timestamp() + "@gmail.com");
        // type your email
        typeText(_YourEmail,"Harryemail+" + timestamp() + "@gmail.com");
        // type personal massage
        typeText(_PersonalMessage,"\"This is a Very Good Macbook\"");
        // click on send email
        clickOnElement(_SendEmail);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    }

}
