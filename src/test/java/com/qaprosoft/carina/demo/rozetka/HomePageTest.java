package com.qaprosoft.carina.demo.rozetka;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.demo.gui.rozetka.components.HeaderMenu;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.gui.rozetka.pages.HomePage;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;

public class HomePageTest implements IAbstractTest {

    @Test(description = "Checking functionality on the Home Page")
    @MethodOwner(owner = "mbairamov")
    @TestLabel(name = "home page", value = {"web"})
    public void testHeader() {

        HomePage homePage = new HomePage(getDriver());
        homePage.open();
      //  Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");

        HeaderMenu headerMenu = homePage.getHeaderMenu();
        Assert.assertTrue(headerMenu.isHeaderMenuButtonPresent(), "HeaderMenuButton is not Present");
        Assert.assertTrue(headerMenu.isHomePageLogoPresent(), "HomePageLogo is not Present");
        Assert.assertTrue(headerMenu.isCatalogButtonPresent(), "CatalogButton is not Present");
        Assert.assertTrue(headerMenu.isSearchPresent(), "Search is not Present");
        Assert.assertTrue(headerMenu.isSearchSubmitButtonPresent(), "SearchSubmitButton is not Present");
        Assert.assertTrue(headerMenu.isRuLanguageButtonPresent(), "RuLanguageButton is not Present");
        Assert.assertTrue(headerMenu.isUaLanguageButtonPresent(), "UaLanguageButton is not Present");
        Assert.assertTrue(headerMenu.isMyOrdersButtonPresent(), "MyOrdersButton is not Present");
        Assert.assertTrue(headerMenu.isCartButtonPresent(), "CartButton is not Present");


        headerMenu.searchProduct("Iphone");
        pause(5);

    }

}
