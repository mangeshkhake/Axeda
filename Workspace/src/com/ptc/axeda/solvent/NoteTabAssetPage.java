package com.ptc.axeda.solvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptc.axeda.config.Configuration;

public class NoteTabAssetPage {
	
	WebDriver driver;
	
	public  NoteTabAssetPage(WebDriver driver) {
		this.driver = driver;
		
	}

	
	@FindBy(xpath = Configuration.notesAdd)
	public WebElement noteAdd;
	
	
	public void addNotesVerify(String note){
	System.out.println("************Before***************");	
		noteAdd.click();
		System.out.println("************After***************");		
		String handle= driver.getWindowHandle();
		 
        System.out.println(handle);
    
		
		
		
	}
}
