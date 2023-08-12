package com.example.technicaltest.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class OrderPage extends BasePage{
    private final By emailInputLocator= By.xpath("//*[contains(@id,\"login\")]//*[contains(@data-validate, \"isEmail\")]");
    private final By passwordInputLocator= By.xpath("//*[contains(@id,\"login\")]//*[contains(@data-validate, \"isPasswd\")]");
    private final By proceedAddressBtnLocator=By.xpath("//*[contains(@name,\"processAddress\")]");
    private final By proceedCarrierBtnLocator=By.xpath("//*[contains(@name,\"processCarrier\")]");
    private SelenideElement emailInput=$(emailInputLocator);
    private SelenideElement passwordInput=$(passwordInputLocator);
    private SelenideElement proceedAddressBtn=$(proceedAddressBtnLocator);
    private SelenideElement proceedCarrierBtn=$(proceedCarrierBtnLocator);

    public OrderPage inputEmail(String str){
        emailInput.setValue(str);
        return this;
    }
    public OrderPage inputPassword(String str){
        passwordInput.setValue(str).pressEnter();
        return this;
    }

    public OrderPage clickProceedAddressBtn(){
        proceedAddressBtn.click();
        return this;
    }
    public OrderPage moveDown(){
        executeJavaScript("window.scrollBy(0,600)");
        return this;
    }
    public OrderPage clickProceedCarrierBtn(){
        proceedCarrierBtn.click();
        return this;
    }
}
