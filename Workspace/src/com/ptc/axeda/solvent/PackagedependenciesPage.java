package com.ptc.axeda.solvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptc.axeda.config.Configuration;

public class PackagedependenciesPage {
	
	WebDriver driver;

	public PackagedependenciesPage(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(xpath = Configuration.dNext)
	public WebElement dNext;
	
	public PackageinstructionsPage clickNext(){
		
		dNext.click();
		return PageFactory.initElements(driver, PackageinstructionsPage.class);
	}

}
