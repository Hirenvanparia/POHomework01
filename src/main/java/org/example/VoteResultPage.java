package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class VoteResultPage extends Utils {
    // expected Massage for  vote
    static String expectedUserVoteMsg = "Only registered users can vote.";

    public void verifyUserShouldBeAbleToVoteSuccessfully(){
        // get text from web element
        String voteMassage = getTextFromElement(By.xpath("//div[@class=\"poll-vote-error\"]"));
        System.out.println("My Massage:" + voteMassage);
        Assert.assertEquals(voteMassage, expectedUserVoteMsg, " Your Vote Can Not Registered Successfully");
    }


    }


