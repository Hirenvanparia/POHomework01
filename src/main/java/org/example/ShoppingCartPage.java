package org.example;

import org.openqa.selenium.By;

public class ShoppingCartPage extends Utils{
    private By _Electronics = By.linkText("Electronics");
    private By _CamaraAndPhoto = By.linkText("Camera & photo");
    private By _SelectAProduct = By.linkText("Leica T Mirrorless Digital Camera");

    private By _AddToCart = By.id("add-to-cart-button-16");
    private By _ShoppingCart = By.linkText("Shopping cart");
    public void UserShouldBeAbleToAddProductInShoppingCart(){
        // click on electronics
        clickOnElement(_Electronics);
        // click on camara & photo
        clickOnElement(_CamaraAndPhoto);
        // select the product
        clickOnElement(_SelectAProduct);
        // add to cart
        clickOnElement(_AddToCart);
        //click on shopping cart
        clickOnElement(_ShoppingCart);
    }

}
