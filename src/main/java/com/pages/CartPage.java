package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CartPage {

    WebDriver driver;

    //constructor
    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    //By Locator
    private By cartList = By.xpath("//div[@class='cart_item']/div[2]/a");
    private By inventoryItem = By.xpath("//a[@class='inventory_item_name']");

    //behavior
    public boolean check_product_in_cart_page(String product){
        List<WebElement> list = new ArrayList<>();
        list = driver.findElements(cartList);
        System.out.println(list.size());
        for(WebElement ele:list){
            if(ele.getText().equals(product)){
                return true;
            }
        }
        return false;
    }
}
