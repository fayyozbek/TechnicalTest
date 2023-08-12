package com.example.technicaltest.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class BasePage {
    protected String BASE_URL = "http://prestashop.qatestlab.com.ua/ru/";

    public void open() {
        Selenide.open(BASE_URL);
    }
    public BasePage moveDown(){
        executeJavaScript("window.scrollBy(0,600)");
        return this;
    }
}




