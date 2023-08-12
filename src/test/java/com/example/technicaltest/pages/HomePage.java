package com.example.technicaltest.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class HomePage extends BasePage {
    private final By continueBtnLocator= By.xpath("//*[contains(@class, \"continue\")]");
    private final By cartBtnLocator= By.xpath("//*[contains(@class, \"shopping_cart\")]//a");
    private SelenideElement cartBtn=$(cartBtnLocator);
    private SelenideElement continueBtn=$(continueBtnLocator);
    private By getProductImgLocator(int whichInTheList){
        return By.xpath(String.format("//*[@id=\"homefeatured\"]/li[%s]", whichInTheList) );
    }

    private By getProductAddToCartBtnLocator(int whichInTheList){
        return By.xpath(String.format("//*[@data-id-product=\"%s\"]", whichInTheList) );
    }
    public HomePage moveDown(){
        executeJavaScript("window.scrollBy(0,600)");
        return this;
    }

    private SelenideElement getProductImg(int whichInTheList){
        return $(getProductImgLocator(whichInTheList));
    }

    private SelenideElement getProductAddToCartBtn(int whichInTheList){
        return $(getProductAddToCartBtnLocator(whichInTheList));
    }

    public HomePage clickProductAddToCartBtn(int whichInTheList){
        getProductAddToCartBtn(whichInTheList).click();
        return this;
    }

    public HomePage hoverProductImg(int whichInTheList){
        getProductImg(whichInTheList).hover();
        return this;
    }
    public HomePage clickContinueBtn(){
        continueBtn.click();
        return this;
    }

    public CartPage clickCartBtn(){
        cartBtn.click();
        return new CartPage();
    }
}
