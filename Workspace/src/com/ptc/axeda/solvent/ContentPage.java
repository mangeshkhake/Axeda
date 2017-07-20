package com.ptc.axeda.solvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptc.axeda.config.Configuration;

public class ContentPage {

	WebDriver driver;

	public ContentPage(WebDriver driver){
		
		this.driver = driver;
		
	}
	
	@FindBy(xpath=Configuration.Package)
	public WebElement Package;
	
	

	public PackageDefinationPage clickCreatePacakge() {
		
		Package.click();
		
		return PageFactory.initElements(driver, PackageDefinationPage.class);

	}

	public void clickDeployPacakge() {

	}

	public void clickViewPacakge() {

	}

	public void clickViewFiles() {

	}

}
