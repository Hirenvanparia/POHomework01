package org.example;

import org.openqa.selenium.By;

public class CompareProductPage extends Utils {
    private By _Electronics = By.xpath("//div [@class=\"header-menu\"]/ul[1]/li[2]/a[1]");
    private By _CellPhone = By.xpath("//div [@class=\"category-grid sub-category-grid\"]/div[1]/div[2]");
    private By _FirstProduct = By.linkText("HTC One M8 Android L 5.0 Lollipop");
    private By _AddToCompare = By.xpath("//div[@class=\"compare-products\"]");
    private  By _GiftCard = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[7]/a[1]");
    private By _SecondProduct = By.linkText("$25 Virtual Gift Card");
    private By _AddToCompareSecond = By.xpath("//div[@class=\"compare-products\"]");
    private By _ComparisonProduct = By.xpath("//div[@id=\"bar-notification\"]/div[1]/p[1]/a[1]");
    private By _ClearList = By.className("clear-list");
    public void verifyUserShouldBeAbleToCompareProduct() {
        //click on Electronics
        clickOnElement(_Electronics);
        // click on Cell Phone
        clickOnElement(_CellPhone);
        //select the Product
        clickOnElement(_FirstProduct);
        //click on add to compare list
        clickOnElement(_AddToCompare);
        //click on Gift Cards
        clickOnElement(_GiftCard);
        //select the Product
        clickOnElement(_SecondProduct);
        //click on add to compare list
        clickOnElement(_AddToCompareSecond);
        // click on Product comparison
        clickOnElement(_ComparisonProduct);
        // print first product name
        // click on clear list
        clickOnElement(_ClearList);
    }
}

