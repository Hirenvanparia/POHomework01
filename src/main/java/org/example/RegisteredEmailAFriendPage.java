package org.example;

import org.openqa.selenium.By;

public class RegisteredEmailAFriendPage extends Utils {

    private By _AppleMacbookPro = By.xpath("// a [ @ href=\"/apple-macbook-pro-13-inch\"]");
    private By _EmailAFriend = By.className("email-a-friend");
    private By _TypeFriendEmail = By.id("FriendEmail");
    private By _PersonalMessage = By.id("PersonalMessage");
    private By _SendAMail = By.name("send-email");

    public void verifyRegisteredUserCanReferAFriendSuccessfully() {


        //click on Apple Macbook pro
        clickOnElement(_AppleMacbookPro);
        // click on email a friend
        clickOnElement(_EmailAFriend);
        //type friends email
        typeText(_TypeFriendEmail, "Potermail@gmail.com");
        //type a PersonalMassage
        typeText(_PersonalMessage, "This is a Very Good Macbook");
        //click on send mail
        clickOnElement(_SendAMail);
    }
}

