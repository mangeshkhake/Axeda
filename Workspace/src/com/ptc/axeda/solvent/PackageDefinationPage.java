package com.ptc.axeda.solvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ptc.axeda.config.Configuration;

public class PackageDefinationPage {

	WebDriver driver;

	public PackageDefinationPage(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(xpath = Configuration.Name)
	public WebElement Name;

	@FindBy(id = Configuration.Model)
	public WebElement Model;

	@FindBy(xpath = Configuration.Version)
	public WebElement Version;

	@FindBy(xpath = Configuration.Next)
	public WebElement Next;

	public PackagedependenciesPage createPackage(String pName, String pModel, String pVersion) {

		Name.sendKeys(pName);
		
		Select objSelect = new Select(Model);
		objSelect.selectByIndex(4);
		Version.sendKeys(pVersion);
		
		Next.click();

		return PageFactory.initElements(driver, PackagedependenciesPage.class);
	}

}
