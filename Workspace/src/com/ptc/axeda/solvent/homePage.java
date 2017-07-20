package com.ptc.axeda.solvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptc.axeda.config.Configuration;

public class homePage {

	WebDriver driver;

	public homePage(WebDriver driver) {

		this.driver = driver;

	}
	
	@FindBy(xpath=Configuration.Content)
	public WebElement Content;

	public void clickContenttab() {
		
		Content.click();



	}

}
