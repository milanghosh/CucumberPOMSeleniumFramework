package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

    WebDriver driver;

    //By locators
    private By backpack = By.id("add-to-cart-sauce-labs-backpack");
    private By bikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    private By boltTShirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private By addToCartButton(String str){
       return By.id("add-to-cart-sauce-labs-"+ str);
    }
    private By addToCartLink = By.xpath("//a[@class=\"shopping_cart_link\"]");
    //constructor
    public InventoryPage(WebDriver driver){
        this.driver=driver;
    }

    // page actions: features(behavior) of the page in the form of methods
    public void add_to_cart_BackPack(){
        driver.findElement(backpack).click();
    }

    public void add_to_cart_bikeLight(){
        driver.findElement(bikeLight).click();
    }

    public void add_to_cart_boltTShirt(){
        driver.findElement(boltTShirt).click();
    }

    public void add_to_cart(String product){
        driver.findElement(addToCartButton(product)).click();
    }

    public void add_to_cart_link(){
        driver.findElement(addToCartLink).click();
    }


}
