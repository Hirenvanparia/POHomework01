package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HomePage extends Utils {
    private By _registerButton = By.className("ico-register");
    private By _searchAProduct = By.id("small-searchterms");
    private By _productName = By.cssSelector("div.details h2");

    private By _searchButton = By.cssSelector("div.header-lower button");
    private By _selectUSDollar = By.cssSelector("select#customerCurrency");
    private By _selectEuro = By.cssSelector("select#customerCurrency");
    private By _priceList = By.xpath("//span[contains(@class,'price actual-price')]");
    private By _faceBook = By.xpath("//a[contains(text(),'Facebook')]");
    private By _welcomeMessage = By.cssSelector("div.topic-block-title h2");
    private By _voteButton = By.cssSelector("#vote-poll-1");


    public void clickOnRegisterButton() {

        // click on register button
        clickOnElement(_registerButton);
    }

    public void clickOnSearch() {
        // click on search bar
        clickOnElement(_searchButton);
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Please enter some search keyword");
        alert.accept();
    }

    public void currencySelector() {
        //select US Dollar currency
        selectElementsByText(_selectUSDollar, "US Dollar");
        System.out.println("Select US Dollar Currency");
        //print featured product price in US Dollar to verify currency
        List<WebElement> productPrices1 = driver.findElements(_priceList);
        for (WebElement e : productPrices1) {
            System.out.println(e.getText());
        }
        //select Euro currency
        selectElementsByText(_selectEuro, "Euro");
        System.out.println("Select Euro Currency");
        //print featured product price in Euro to verify currency
        List<WebElement> productPrices2 = driver.findElements(_priceList);
        for (WebElement p : productPrices2) {
            System.out.println(p.getText());
        }
    }

    public void searchProduct() {
        // type a Product Name
        typeText(_searchAProduct, "nike");
        //Click on Search Button
        clickOnElement(_searchButton);
        System.out.println("Search product list:");
        List<WebElement> productlist = driver.findElements(_productName);
        for (WebElement e : productlist) {
            System.out.println(e.getText());
        }
    }

    public void clickOnFaceBookFollowButton() {
        // click on FaceBook
        clickOnElement(_faceBook);
        String MainWindow = driver.getWindowHandle();
        // To handle all new opened window.
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();
            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
            }
        }
    }

    public void mainPageWelcomeToOurStore() {
        String expectedWelcomeMessage = "Welcome to our store";
        String actualMessage = getTextFromElement(_welcomeMessage);
        System.out.println("get message on Homepage:" + actualMessage);
        //Close URL
        Assert.assertEquals(actualMessage, expectedWelcomeMessage, "Welcome Homepage");
    }

    public void verifyToPrintVoteAlertMessage() {
        //click the vote button
        clickOnElement(_voteButton);
        Alert alert1 = driver.switchTo().alert();
        Assert.assertEquals(alert1.getText(), "Please select an answer");
        alert1.accept();

    }
}














