package com.ptc.axeda.solvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ptc.axeda.config.Configuration;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(xpath=Configuration.userName)
	public WebElement userName;

	@FindBy(xpath=Configuration.password)
	public WebElement password;

	@FindBy(xpath=Configuration.login)
	public WebElement login;
	
	@FindBy(xpath=Configuration.Content)
	public WebElement contentTab;
	
	@FindBy(xpath = Configuration.notesAdd)
	public WebElement noteAdd;
	
	@FindBy(xpath = Configuration.browseForasset)
	public WebElement browseForasset;

	public void login() {


		userName.sendKeys("admin");
		password.sendKeys("admin");
		login.click();
		
	}
	
	
	public ModelsPage selectModels(){
		System.out.println("************Before*********");
		Select objSelect = new Select(browseForasset);
		System.out.println("************After*********");
		objSelect.selectByIndex(2);
		
		
		
		return PageFactory.initElements(driver, ModelsPage.class);
		
	}
	

	
	public ContentPage clickCOntentTab() {

		contentTab.click();
		
		return PageFactory.initElements(driver, ContentPage.class);

	}
	
	
}
