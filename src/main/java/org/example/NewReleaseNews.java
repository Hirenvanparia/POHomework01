package org.example;

import org.openqa.selenium.By;

public class NewReleaseNews extends Utils{
    private By _detailsButton = By.className("read-more");
    private By _typeATitle = By.className("enter-comment-title");
    private By _typeAComment = By.className("enter-comment-text");
    private By _clickOnNewComment = By.cssSelector("div.buttons");




    public void clickOnDetailsButton() {

        // click on Details button
        clickOnElement(_detailsButton);
        // type a title
        typeText(_typeATitle, "Harry");
        //type a comment
        typeText(_typeAComment, "Please send me New item");
        // click on new comment
        clickOnElement(_clickOnNewComment);


    }
}
