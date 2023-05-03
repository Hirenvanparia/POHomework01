package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.Utils.getTextFromElement;

public class RegisteredUserVoteResultPage extends Utils {
    static String expectedRegisteredVoter = "15 vote(s)...";

    public void verifyRegisteredUserShouldBeAbleToVoteSuccessfully (){
        //get text web element
        String voteMsg = getTextFromElement(By.xpath("//span[@class=\"poll-total-votes\"]"));
        System.out.println("My Message:" + voteMsg);
        Assert.assertEquals(voteMsg, expectedRegisteredVoter, "Total Vote");
    }
}
