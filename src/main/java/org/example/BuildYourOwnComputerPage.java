package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utils {
    private By _ClickOnProduct=By.xpath("//div[contains(@class,'product-grid')]/div[2]/div[1]");

    private By _processor =By.xpath("//select[@data-attr='1']");
    private By _ram = By.xpath("//select[@id='product_attribute_2']");
    private By _hdd =By.cssSelector("input#product_attribute_3_6");
    private By _os =By.cssSelector("input#product_attribute_4_9");
    // private By _software1 =By.cssSelector("input#product_attribute_5_10");
    private By _software2 =By.cssSelector("input#product_attribute_5_11");
    private By _software3 =By.cssSelector("input#product_attribute_5_12");

    private By _addToCart =By.cssSelector("button#add-to-cart-button-1");
    //  private By _ShoppingCart =By.linkText("Shopping cart");
    private By _shoppingCartButton =By.xpath("//*[@id=\"bar-notification\"]/div/p/a");

    public void verifyUserShouldEnterAllDetailsOfBuildYourOwnComputer(){
        // select the product
        clickOnElement(_ClickOnProduct);
        //select processor type
        selectElementsByText(_processor,"2.2 GHz Intel Pentium Dual-Core E2200");
        //select ram size
        selectElementsByText(_ram,"8GB [+$60.00]");
        //select hdd
        clickOnRadioButtonElement(_hdd);
        //select os
        clickOnRadioButtonElement(_os);
        //select all software
        clickOnElement(_software2);
        clickOnElement(_software3);
        //click on add to cart button
        clickOnElement(_addToCart);
        //click on shopping cart button
        clickOnElement(_shoppingCartButton);

    }

}
