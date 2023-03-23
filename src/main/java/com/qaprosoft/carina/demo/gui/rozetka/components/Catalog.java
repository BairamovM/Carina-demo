package com.qaprosoft.carina.demo.gui.rozetka.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.rozetka.enums.MenuCategories;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class Catalog extends AbstractUIObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(xpath = "//ul[contains(@class, 'menu-categories')]//a[contains(@href, '%s') and contains(@class, 'menu-categories')]")
    private ExtendedWebElement menuCategoriesButton;

    public Catalog(WebDriver driver) {
        super(driver);
    }

    public Catalog(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isMenuCategoriesButtonPresent(MenuCategories menuCategories) {
        LOGGER.info("checking is: " + menuCategories + " category button present");
        return menuCategoriesButton.format(menuCategories.getCategories()).isElementPresent();
    }

    public void clickCategory(MenuCategories menuCategories) {
        LOGGER.info("category button clicked: " + menuCategories);
        menuCategoriesButton.format(menuCategories.getCategories()).click();
    }
}
