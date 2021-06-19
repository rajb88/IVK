package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage   {
	
	@FindBy(xpath = "//h2[text()='Login to Kite']")
	private WebElement pagetitle;
	
	@FindBy(xpath = "//input[@id='userid']")
	private WebElement userid;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbutton;
	
	@FindBy(xpath = "//a[@href='/forgot']")
	private WebElement forgotpassword;
	
	@FindBy(xpath = "//input[@id='pin']")
	private WebElement pin;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement continuebutton;
	
	@FindBy(xpath = "//a[@href='/forgot']")
	private WebElement forgot2FA;
	
	@FindBy(xpath = "//span[@class='user-id']")
	private WebElement homepageusernid;

	@FindBy(xpath = "//a[@href='/logout']")
	private WebElement logout;
	
	private WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean checkPageTitle()
	{
		String e = "Login to Kite";
		String a= pagetitle.getText();
		boolean result = e.equals(a);
		return result;
	}
	
	public void SendUserID(String user)
	{
		userid.sendKeys(user);
		
	}
	public void SendPassword(String passwo)
	{
		password.sendKeys(passwo);
		
	}
	public void ClickonLogin()
	{
		loginbutton.click();
		
	}
	
	
	
}
