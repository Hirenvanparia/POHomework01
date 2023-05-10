package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class NewReleaseNewsResultPage extends Utils {

    static String expectedNewsCommentMsg = "News comment is successfully added.";
    private By _getCommentResult = By.cssSelector("div.result");
    private By _comments = By.cssSelector("div.comment-body");

    public void verifyUserShouldBeABleTOAddCommentSuccessfully() {
        // gettext from Web element
        String actualMassage = getTextFromElement(By.cssSelector("div.result"));
        System.out.println("My Massage:" + actualMassage);
        String actualMassage1 = getTextFromElement(By.cssSelector("div.comments"));
        System.out.println("My Massage:" + actualMassage1);
        Assert.assertEquals(actualMassage, expectedNewsCommentMsg, "News Comment Added");
        //get text message
        String expectedRegistrationCompletedMessage = "News comment is successfully added.";
        String actualMessage1 = getTextFromElement(_getCommentResult);
        System.out.println("Result Message:"+actualMessage1);
        Assert.assertEquals(actualMessage1,expectedRegistrationCompletedMessage,"News comment is not added.");
        //new comments results
        System.out.println("Comments:");
        List<WebElement> productList =driver.findElements(_comments);

    }
}
