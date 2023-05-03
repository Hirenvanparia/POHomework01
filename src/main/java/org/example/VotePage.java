package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VotePage extends Utils {
    private By _poll = By.id("pollanswers-2");
    private By _votePoll = By.id("vote-poll-1");

    public void SelectVoteCatgary() {
        clickOnElement(_poll);
        // click on vote
        clickOnElement(_votePoll);

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"poll-vote-error\"]")));


    }
}
