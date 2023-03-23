package com.qaprosoft.carina.demo.gui.rozetka.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.rozetka.constants.TimeOut;
import com.qaprosoft.carina.demo.gui.rozetka.pages.HomePage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class HamburgerMenu extends AbstractUIObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(xpath = "//button[contains(@class, 'side-menu__close')]")
    private ExtendedWebElement closeButton;

    @FindBy(xpath = "//button[@id='fat-menu' and contains(@class, 'side-menu__button')]")
    private ExtendedWebElement catalogButton;

    @FindBy(xpath = "//a[contains(@class, 'side-menu__button') and contains(@href, 'help.rozetka')]")
    private ExtendedWebElement helpCenterButton;

    @FindBy(xpath = "//a[contains(@class, 'side-menu__button') and contains(@href, 't.me/Rozetka')]")
    private ExtendedWebElement telegramChatButton;

    @FindBy(xpath = "//button[contains(@class, 'side-menu__button') and contains(text(), 'Кошик')]")
    private ExtendedWebElement cartButton;

    public HamburgerMenu(WebDriver driver) {
        super(driver);
    }

    public HamburgerMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public HomePage closeHamburgerMenu() {
        pause(TimeOut.FIVE_SEC);
        closeButton.click();
        return new HomePage(getDriver());
    }
}
