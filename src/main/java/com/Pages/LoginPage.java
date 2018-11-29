package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
		//Initialize objects in the Page
		public LoginPage(WebDriver driver){
			PageFactory.initElements(driver, this);
		}
		
		public String strWebURL = "http://192.168.1.12:8000";
		public String strLoginPageTitle = "Login | Bynry";
		public String txt_emptyUsername_msg="Username is required.";
		public String txtPassword_msg="Password is required.";
		public String txtBothEmpty_err_msg=" Enter any username and password. ";
		public String txtWrongUsername="Please enter valid Password";
		public String txtWrongPassword="Please enter valid Password";
		public String txtLogo="Meter Reading";
		
		@FindBy(xpath = ".//div[@class='logo1']")
		public WebElement Landinglogo;
		
		@FindBy(name = "username")
		public WebElement txtUsername;
		
		@FindBy(name = "password")
		public WebElement txtPassword;
		
		@FindBy(xpath = ".//button[@class='btn green pull-right']")
		public WebElement btnLogin;
		
		@FindBy(id="username-error")
		public WebElement errUsername;
		
		@FindBy(id="password-error")
		public WebElement errPassword;
		
		@FindBy(className="alert alert-danger display-hide")
		public WebElement alertError;
		
		//Wrong username or password
		@FindBy(xpath=".//div[@class=\'modal-content\']")
		public WebElement errorPopup;
		
		
		
		
		
		

}
