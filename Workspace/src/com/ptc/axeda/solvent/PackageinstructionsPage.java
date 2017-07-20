package com.ptc.axeda.solvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ptc.axeda.config.Configuration;

public class PackageinstructionsPage {

	WebDriver driver;

	public PackageinstructionsPage(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(xpath = Configuration.select)
	public WebElement select;

	@FindBy(xpath = Configuration.Application)
	public WebElement Application;

	@FindBy(xpath = Configuration.finish)
	public WebElement finish;
	
	@FindBy(xpath = Configuration.add)
	public WebElement add;
	
	

	public PackageconfirmationPage selectExecuite() {

		Select objSelect = new Select(select);
		objSelect.selectByIndex(9);
		Application.sendKeys("notepad.exe");
		add.click();
		
		finish.click();

		return PageFactory.initElements(driver, PackageconfirmationPage.class);
	}

}
