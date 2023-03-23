package com.qaprosoft.carina.demo.gui.rozetka.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.rozetka.constants.TimeOut;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class ProductListPage extends AbstractPage {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(xpath = "//h1[contains(@class, 'catalog-heading')]")
    private ExtendedWebElement plpTitle;

    public ProductListPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPLPTitlePresent() {
        pause(TimeOut.FIVE_SEC);
        LOGGER.info("Checking is PLP Title present");
        return plpTitle.isElementPresent();
    }

    public String getPLPTitleText() {
        pause(TimeOut.FIVE_SEC);
        return plpTitle.getElement().getText();
    }
}
