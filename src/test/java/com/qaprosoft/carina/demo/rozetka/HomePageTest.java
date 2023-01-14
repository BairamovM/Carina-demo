package com.qaprosoft.carina.demo.rozetka;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;

public class HomePageTest implements IAbstractTest {

    @Test()
    @MethodOwner(owner = "mbairamov")
    @TestLabel(name = "feature", value = {"web", "regression"})
    public void testModelSpecs() {

        HomePage homePage = new HomePage(getDriver());
        homePage.open();
      //  Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");

    }

}
