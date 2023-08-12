package com.example.technicaltest.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Driver;
import com.codeborne.selenide.Selenide;
import com.example.technicaltest.MainPage;
import com.example.technicaltest.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeOptions;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest {
    HomePage homePage = new HomePage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1920x1080";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        homePage.open();
    }

    @Test
    public void buyTest() {
        homePage.moveDown();
        homePage
                .hoverProductImg(1)
                .clickProductAddToCartBtn(1)
                .clickContinueBtn()
                .hoverProductImg(2)
                .clickProductAddToCartBtn(2)
                .clickContinueBtn()
                .hoverProductImg(3)
                .clickProductAddToCartBtn(3)
                .clickContinueBtn()
                .hoverProductImg(4)
                .clickProductAddToCartBtn(4)
                .clickCartBtn()
                .moveDown()
                .clickCheckoutBtn()
                .inputEmail("qwertyak@mail.ru")
                .inputPassword("qwertyuio")
                .clickProceedAddressBtn()
                .clickProceedCarrierBtn();
    }

}
