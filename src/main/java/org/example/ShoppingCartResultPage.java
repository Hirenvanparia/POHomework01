package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartResultPage extends Utils {
    // expected Massage for  item in shopping cart
    static String expectedCartMsg = "Leica T Mirrorless Digital Camera";

    public void verifyUserShouldBeAbleToAddProductInShoppingCartSuccessfully(){

    //get text web element
        String actualProductInBasket = getTextFromElement(By.xpath("//*[@id=\"shopping-cart-form\"]/div[1]/table/tbody/tr/td[3]"));
        System.out.println("product In Basket:" + actualProductInBasket);
        //Checking Actual product And add to basket product name is Same or not
        Assert.assertEquals(actualProductInBasket, expectedCartMsg, "Before adding to basket and After adding to the basket Both product is same");
}

}
