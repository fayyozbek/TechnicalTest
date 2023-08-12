package com.example.technicaltest.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class CartPage extends BasePage{
    private final By checkoutBtnLocator= By.xpath("//*[contains(@class, \"checkout\")]");
    private SelenideElement checkoutBtn=$(checkoutBtnLocator);

    public CartPage moveDown(){
        executeJavaScript("window.scrollBy(0,600)");
        return this;
    }
    public OrderPage clickCheckoutBtn(){
        checkoutBtn.click();
        return new OrderPage();
    }
}
