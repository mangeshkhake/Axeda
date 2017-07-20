package com.ptc.axeda.config;

public class Configuration {

	// Enterprise URL
	public static final String enterprise = "https://10.84.43.64";

	// Login Page
	public static final String userName = ".//*[@id='username']";
	public static final String password = ".//*[@id='password']";
	public static final String login = ".//*[@id='loginBtn']";
	public static final String browseForasset = ".//*[@id='hierarchyId']";
	
	

	// ContentPage
	public static final String Content = ".//div[@title='Content']/div[text()='Content']";
	public static final String Package = ".//*[@id='MainContentArea']/table/tbody/tr/td[2]/table[2]/tbody/tr[2]/td[2]/span/b/a";

	// Package Definition Page
	public static final String Name = ".//*[@id='Name']";
	public static final String Model = "modelId";
	public static final String Version = ".//*[@id='Version']";
	public static final String Next = ".//*[@id='MainContentArea']/table/tbody/tr/td/table/tbody/tr[5]/td/input[4]";

	// Package Dependency Page

	public static final String dNext = ".//*[@id='MainContentArea']/table/tbody/tr/td/table/tbody/tr[5]/td/form/input[5]";

	// Package instructions
	public static final String piNext = ".//*[@id='MainContentArea']/table/tbody/tr/td/table/tbody/tr[5]/td/form/input[5]";
	public static final String select = ".//*[@id='selectList']";
	public static final String Application = ".//*[@id='Application']";
	public static final String add = ".//*[@id='form-execute']/table/tbody/tr[6]/td[2]/input";
	public static final String finish = ".//*[@id='MainContentArea']/table/tbody/tr/td/table/tbody/tr[5]/td/form/input[7]";

	// Package confirmation Page
	
	
	
	// Package Manager
	
	
	//NotesTabAssetPage
	
	public static final String notesAdd = ".//*[@id='service.device.notes']/table/tbody/tr[1]/td[2]/span[2]/nobr/a[2]";
}
