package com.qaprosoft.carina.demo.rozetka.cucumber.common_steps;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.gui.rozetka.components.HamburgerMenu;
import com.qaprosoft.carina.demo.gui.rozetka.components.HeaderMenu;
import com.qaprosoft.carina.demo.gui.rozetka.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;

import org.testng.Assert;

public class HomePageSteps implements IAbstractTest {


@Given("Open Home Page")
    public void openHomePage() {
    HomePage homePage = new HomePage(getDriver());
    homePage.open();

    HeaderMenu headerMenu = homePage.getHeaderMenu();
    Assert.assertTrue(headerMenu.isHamburgerMenuButtonPresent(), "HamburgerMenuButton is not Present");
    Assert.assertTrue(headerMenu.isHomePageLogoPresent(), "HomePageLogo is not Present");
    Assert.assertTrue(headerMenu.isCatalogButtonPresent(), "CatalogButton is not Present");
    Assert.assertTrue(headerMenu.isSearchPresent(), "Search is not Present");
    Assert.assertTrue(headerMenu.isSearchSubmitButtonPresent(), "SearchSubmitButton is not Present");
    Assert.assertTrue(headerMenu.isRuLanguageButtonPresent(), "RuLanguageButton is not Present");
    Assert.assertTrue(headerMenu.isUaLanguageButtonPresent(), "UaLanguageButton is not Present");
    Assert.assertTrue(headerMenu.isMyOrdersButtonPresent(), "MyOrdersButton is not Present");
    Assert.assertTrue(headerMenu.isCartButtonPresent(), "CartButton is not Present");


    headerMenu.searchProduct("Samsung");
    pause(5);


    HamburgerMenu hamburgerMenu = headerMenu.clickHamburgerMenuButton();
    hamburgerMenu.closeHamburgerMenu();
    pause(5);
}

@And("Close Browser")
    public void closeBrowser() {
    getDriver().close();
    getDriver().quit();
}

}
