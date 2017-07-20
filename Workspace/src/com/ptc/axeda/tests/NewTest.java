package com.ptc.axeda.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ptc.axeda.config.Configuration;
import com.ptc.axeda.solvent.ContentPage;
import com.ptc.axeda.solvent.LoginPage;
import com.ptc.axeda.solvent.PackageDefinationPage;
import com.ptc.axeda.solvent.PackagedependenciesPage;
import com.ptc.axeda.solvent.PackageinstructionsPage;
import com.ptc.axeda.solvent.homePage;

public class NewTest {
	@Test
	public void f() {
		
		System.setProperty("webdriver.gecko.driver", "D:/Automation/geckodriver/geckodriver.exe");

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

		desiredCapabilities.setAcceptInsecureCerts(true);

		WebDriver driver = new FirefoxDriver(desiredCapabilities);

		driver.get(Configuration.enterprise);
		LoginPage objLogin = PageFactory.initElements(driver, LoginPage.class);
		objLogin.login();
		ContentPage obje = objLogin.clickCOntentTab();
		
		PackageDefinationPage pnjpak = obje.clickCreatePacakge();
		
		PackagedependenciesPage objPd = pnjpak.createPackage("MMMM", "MK_MODEL", "1");
		PackageinstructionsPage objdd=  objPd.clickNext();
		objdd.selectExecuite();
	}
}
