package com.qaprosoft.carina.demo.gui.rozetka.pages;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.rozetka.components.HeaderMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class HomePage extends AbstractPage {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(xpath = "//header[@class='header']")
    private HeaderMenu headerMenu;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HeaderMenu getHeaderMenu() {
        LOGGER.info("Getting access to the Header Menu");
        return headerMenu;
    }
}
