package com.qaprosoft.carina.demo.gui.rozetka.components;

import java.lang.invoke.MethodHandles;

import com.qaprosoft.carina.demo.gui.rozetka.constants.TimeOut;
import com.qaprosoft.carina.demo.gui.rozetka.pages.ProductListPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.rozetka.pages.HomePage;

public class HeaderMenu extends AbstractUIObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(xpath = "//button[contains(@class, 'header__button ng-tns')]")
    private ExtendedWebElement hamburgerMenuButton;

    @FindBy(xpath = "//div[contains(@id, 'cdk-overlay')]")
    private HamburgerMenu hamburgerMenu;

    @FindBy(xpath = "//a[@class='header__logo']")
    private ExtendedWebElement homePageLogoButton;

    @FindBy(xpath = "//button[@id='fat-menu']")
    private ExtendedWebElement catalogButton;

    @FindBy(xpath = "//ul[contains(@class, 'menu-categories')]")
    private Catalog catalog;

    @FindBy(xpath = "//input[contains(@class, 'search-form__input')]")
    private ExtendedWebElement searchTextField;

    @FindBy(xpath = "//button[contains(@class, 'search-form__submit')]")
    private ExtendedWebElement searchSubmitButton;

    @FindBy(xpath = "//li[contains(@class, 'lang__item lang-header')][1]")
    private ExtendedWebElement ruLanguageButton;

    @FindBy(xpath = "//li[contains(@class, 'lang__item lang-header')][2]")
    private ExtendedWebElement uaLanguageButton;

    @FindBy(xpath = "//li[contains(@class, 'header-actions__item--user')]")
    private ExtendedWebElement myOrdersButton;

    @FindBy(xpath = "//li[contains(@class, 'header-actions__item--wishlist')]")
    private ExtendedWebElement wishlistButton;

    @FindBy(xpath = "//li[contains(@class, 'header-actions__item--cart')]")
    private ExtendedWebElement cartButton;

    public HeaderMenu(WebDriver driver) {
        super(driver);
    }

    public HeaderMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isHamburgerMenuButtonPresent() {
        return hamburgerMenuButton.isElementPresent();
    }

    public HamburgerMenu clickHamburgerMenuButton() {
        pause(TimeOut.FIVE_SEC);
        hamburgerMenuButton.click();
        return hamburgerMenu;
    }

    public boolean isHomePageLogoPresent() {
        return homePageLogoButton.isElementPresent();
    }

    public HomePage clickHeaderLogo() {
        homePageLogoButton.click();
        return new HomePage(getDriver());
    }

    public boolean isCatalogButtonPresent() {
        return catalogButton.isElementPresent();
    }

    public Catalog clickCatalogButton() {
        catalogButton.click();
        return catalog;
    }

    public boolean isSearchPresent() {
        return searchTextField.isElementPresent();
    }

    public void typeSearchField(String text) {
        LOGGER.info(text);
        searchTextField.type(text);
    }

    public boolean isSearchSubmitButtonPresent() {
        return searchSubmitButton.isElementPresent();
    }

    public void clickSearchSubmitButton() {
        searchSubmitButton.click();
    }

    public boolean isRuLanguageButtonPresent() {
        return ruLanguageButton.isElementPresent();
    }

    public void clickRuLanguageButton() {
        ruLanguageButton.click();
    }

    public boolean isUaLanguageButtonPresent() {
        return uaLanguageButton.isElementPresent();
    }

    public void clickUaLanguageButton() {
        uaLanguageButton.click();
    }

    public boolean isMyOrdersButtonPresent() {
        return myOrdersButton.isElementPresent();
    }

    public void clickMyOrdersButton() {
        myOrdersButton.click();
    }

    public boolean isWishlistButtonPresent() {
        return wishlistButton.isElementPresent();
    }

    public void clickWishlistButton() {
        wishlistButton.click();
    }

    public boolean isCartButtonPresent() {
        return cartButton.isElementPresent();
    }

    public void clickCartButton() {
        cartButton.click();
    }

    public ProductListPage searchProduct(String product) {
        typeSearchField(product);
        clickSearchSubmitButton();
        return new ProductListPage(getDriver());
    }

}
