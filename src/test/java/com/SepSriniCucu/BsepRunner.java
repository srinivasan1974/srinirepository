package com.SepSriniCucu;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import baseclass.BaseClasssep;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"feature2"}, glue={"com.SepSriniCucu"})
public class BsepRunner {
	public static WebDriver driver;
	@BeforeClass
	public static void setup() throws Throwable {
			 driver = BaseClasssep.getBrowser();}
}
