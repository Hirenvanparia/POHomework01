package org.example;

import com.sun.jdi.PathSearchingVirtualMachine;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.example.BasePage.driver;


public class PrintoutProductTitle {

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        List< WebElement > productList = driver.findElements(By.cssSelector("div.product-grid h2"));
        for (WebElement e:productList) {
            System.out.println(e.getText());



        }
    }
}
