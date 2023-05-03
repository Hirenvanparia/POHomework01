package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisteredUserVotePage extends Utils {
    private By _poll1 = By.id("pollanswers-2");
    private By _votePoll1 = By.id("vote-poll-1");


    public void verifyRegisteredUserShouldBeAbleToVoteSuccessfully() {


        //click on good button
        clickOnElement(_poll1);
        //click on vote button
        clickOnElement(_votePoll1);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"poll-vote-error\"]")));
    }
}
