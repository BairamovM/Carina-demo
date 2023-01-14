package com.qaprosoft.carina.demo.gui.rozetka.components;

import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class Catalog extends AbstractUIObject {



    public Catalog(WebDriver driver) {
        super(driver);
    }

    public Catalog(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
