package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    static HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    CompareProductPage compareProductPage = new CompareProductPage();
    CompareProductResultPage compareProductResultPage = new CompareProductResultPage();
    EmailAFriendResultPage emailAFriendResultPage = new EmailAFriendResultPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    ShoppingCartResultPage shoppingCartResultPage = new ShoppingCartResultPage();
    VotePage votePage = new VotePage();
    VoteResultPage voteResultPage = new VoteResultPage();
    NewReleaseNews newReleaseNews = new NewReleaseNews();
    NewReleaseNewsResultPage newReleaseNewsResultPage = new NewReleaseNewsResultPage();
    FaceBookPage faceBookPage = new FaceBookPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    BuildYourOwnComputerResultPage buildYourOwnComputerResultPage = new BuildYourOwnComputerResultPage();
    CheckOutAsGuest checkOutAsGuest = new CheckOutAsGuest();
    OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage();



    @Test
    public void verifyUserShouldBeAbleToSearch(){
        //click on search button
        homePage.clickOnSearch();
    }

    @Test
    public void verifyUserShouldBeAbleToRegistrationSuccessfully() {
        // click on register button
        homePage.clickOnRegisterButton();
        // fill in registration details
        registerPage.enterRegistrationDetails();
        // register result
        registerResultPage.verifyUserRegisteredSuccessfully();
    }

    @Test
    public void verifyUserShouldBeAbleToCompareSuccessfully() {
        // Product Comparison
        compareProductPage.verifyUserShouldBeAbleToCompareProduct();
        // compare product result
        compareProductResultPage.verifyUserCompareProductSuccessfully();
    }

    @Test
    public void verifyUserShouldBeAbleToReferAFriendSuccessfully() {
        // email a friend
        emailAFriendPage.verifyUserShouldBeABleToEmailAFriend();
        //email a friend result
        emailAFriendResultPage.verifyUserEmailAFriendSuccessfully();
    }

    @Test
    public void verifyUserShouldBeAbleToAddProductInCartSuccessfully() {
        // add to shopping cart
        shoppingCartPage.UserShouldBeAbleToAddProductInShoppingCart();
        // shopping cart result
        shoppingCartResultPage.verifyUserShouldBeAbleToAddProductInShoppingCartSuccessfully();
    }

    @Test
    public void verifyUserShouldBeAbleToVoteSuccessfully() {
        //Vote page
        votePage.SelectVoteCatgary();
        //vote result page
        voteResultPage.verifyUserShouldBeAbleToVoteSuccessfully();
    }

    @Test
    public static void verifyRegisteredUserShouldBeAbleToReferAFriend() {
        // registered user should be abel to refer friend
        RegisteredEmailAFriendPage registeredEmailAFriendPage = new RegisteredEmailAFriendPage();
        // registered email result page
        RegisteredEmailAFriendResultPage registeredEmailAFriendResultPage = new RegisteredEmailAFriendResultPage();
    }
    @Test
    public static void verifyRegisteredUserShouldBeAbleTOVote() {
        // registered user should be abel to vote
        RegisteredUserVotePage registeredUserVotePage = new RegisteredUserVotePage();
        // registered voter result
        RegisteredUserVoteResultPage registeredUserVoteResultPage = new RegisteredUserVoteResultPage();
    }
    @Test
    public void verifyUserShouldBeAbleToSelectTheCurrency(){
        // home page
        homePage.currencySelector();
    }
    @Test
    public static void verifyUserShouldBeAbleToSearchAProduct(){
        //homepage
        homePage.searchProduct();
    }
    @Test
    public void verifyUserShouldBeBAleTOCommentOnNews(){
        //News Comments
        newReleaseNews.clickOnDetailsButton();
        //News Comments Results
        newReleaseNewsResultPage.verifyUserShouldBeABleTOAddCommentSuccessfully();

    }
    @Test
    public void verifyUserShouldBeABleTOFollowOnFaceBOOk(){
        homePage.clickOnFaceBookFollowButton();
        faceBookPage.goToFaceBookPage();
        homePage.mainPageWelcomeToOurStore();


    }
    @Test
    public void verifyUserShouldBeAbleToBuildOwnComputer(){
        buildYourOwnComputerPage.verifyUserShouldEnterAllDetailsOfBuildYourOwnComputer();
        buildYourOwnComputerResultPage.checkOut();
        buildYourOwnComputerResultPage.productInShoppingCart();
        checkOutAsGuest.CheckOutAsGuestSuccessfully();
        checkOutAsGuest.BillingAddress();
        checkOutAsGuest.PaymentInformation();
        orderConfirmationPage.verifyUserShouldBeSeeOrderConformationSuccessfully();

    }



}

