package com.qaprosoft.carina.demo.rozetka.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@HomePage", features = {"src/test/resources/features/rozetka/HomePage.feature"})
public class HomePageRunnerTest extends AbstractTestNGCucumberTests {

}
