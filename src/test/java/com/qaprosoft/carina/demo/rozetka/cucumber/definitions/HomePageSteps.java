package com.qaprosoft.carina.demo.rozetka.cucumber.definitions;

import org.testng.Assert;

import com.qaprosoft.carina.core.foundation.webdriver.IDriverPool;
import com.qaprosoft.carina.demo.gui.rozetka.components.Catalog;
import com.qaprosoft.carina.demo.gui.rozetka.components.HamburgerMenu;
import com.qaprosoft.carina.demo.gui.rozetka.components.HeaderMenu;
import com.qaprosoft.carina.demo.gui.rozetka.enums.MenuCategories;
import com.qaprosoft.carina.demo.gui.rozetka.pages.HomePage;
import com.qaprosoft.carina.demo.gui.rozetka.pages.ProductListPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.qaprosoft.carina.demo.gui.rozetka.constants.CucumberPhrases.*;

public class HomePageSteps extends CommonSteps implements IDriverPool {

    HomePage homePage = null;
    HeaderMenu headerMenu = null;
    ProductListPage productListPage = null;
    HamburgerMenu hamburgerMenu = null;
    Catalog catalog = null;

    @Given(OPEN_HOME_PAGE)
    public void openHomePage() {
        homePage = new HomePage(getDriver());
        homePage.open();
    }

    @And("Check all element headerMenu is present")
    public void checkHeaderMenuElementsIsPresent() {
        homePage = new HomePage(getDriver());
        headerMenu = homePage.getHeaderMenu();
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
        homePage = new HomePage(getDriver());
        headerMenu = homePage.getHeaderMenu();
        productListPage = headerMenu.searchProduct(brand);
    }

    @Then("^We get PLP with this \"(.*)\"")
    public void getResultPLP(String resultBrand) {
        homePage = new HomePage(getDriver());
        headerMenu = homePage.getHeaderMenu();

        Assert.assertTrue(productListPage.getPLPTitleText().contains(resultBrand), "PLP Title is not present");

        hamburgerMenu = headerMenu.clickHamburgerMenuButton();
        hamburgerMenu.closeHamburgerMenu();

        catalog = headerMenu.clickCatalogButton();
        catalog.clickCategory(MenuCategories.COMPUTERS_NOTEBOOKS);
        pause(10);
    }

}
