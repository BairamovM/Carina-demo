package com.qaprosoft.carina.demo.rozetka.cucumber.definitions;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.webdriver.IDriverPool;
import com.qaprosoft.carina.demo.gui.rozetka.components.Catalog;
import com.qaprosoft.carina.demo.gui.rozetka.components.HamburgerMenu;
import com.qaprosoft.carina.demo.gui.rozetka.components.HeaderMenu;
import com.qaprosoft.carina.demo.gui.rozetka.enums.MenuCategories;
import com.qaprosoft.carina.demo.gui.rozetka.pages.HomePage;
import com.qaprosoft.carina.demo.gui.rozetka.pages.ProductListPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import static com.qaprosoft.carina.demo.gui.rozetka.constants.CucumberPhrases.*;

public class HomePageSteps extends CommonSteps implements IDriverPool {

    @Given(OPEN_HOME_PAGE)
    public void openHomePage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
    }

    @And("Check all element headerMenu is present")
    public void checkHeaderMenuElementsIsPresent() {
        HomePage homePage = new HomePage(getDriver());
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
    }

    @When("^Search \"(.*)\"")
    public void searchBrand(String brand) {
        HomePage homePage = new HomePage(getDriver());
        HeaderMenu headerMenu = homePage.getHeaderMenu();
        headerMenu.searchProduct(brand);
    }

    @Then("^We get PLP with this \"(.*)\"")
    public void getResultPLP(String resultBrand) {
        HomePage homePage = new HomePage(getDriver());
        HeaderMenu headerMenu = homePage.getHeaderMenu();

        ProductListPage productListPage = new ProductListPage(getDriver());
        Assert.assertTrue(productListPage.getPLPTitleText().contains(resultBrand), "PLP Title is not present");

        HamburgerMenu hamburgerMenu = headerMenu.clickHamburgerMenuButton();
        hamburgerMenu.closeHamburgerMenu();

        Catalog catalog = headerMenu.clickCatalogButton();
        catalog.clickCategory(MenuCategories.COMPUTERS_NOTEBOOKS);
        pause(10);
    }

    @AfterMethod
    public void closeBrowser() {
        getDriver().close();
        getDriver().quit();
    }

}
