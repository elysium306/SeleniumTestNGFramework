package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class AmazonHomePage {
	
	public AmazonHomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(id = "twotabsearchtextbox")
	public WebElement searchField;
	
	
	@FindBy(css = "div.nav-search-submit")
	public WebElement search_btn;
	
	
	@FindBy(id = "nav-link-accountList")
	public WebElement signin_btn;
	
	
	@FindBy(name = "email")
	public WebElement sign_in_email_phone_box;
	
	
	@FindBy(id = "continue")
	public WebElement continue_btn;
	
	
	@FindBy(className = "a-box-inner a-alert-container")
	public WebElement incorrect_passwd_alert_message;
	
	
	@FindBy(xpath = "//*[contains(text(), 'Need help')]")
	public WebElement need_help_btn;
	
	@FindBy(id = "createAccountSubmit")
	public WebElement create_amazon_account_btn;
	
	
	@FindBy(name = "password")
	public WebElement password_field;
	
	
	@FindBy(id = "signInSubmit")
	public WebElement sign_in_btn;
	
	
	@FindBy(name = "rememberMe")
	public WebElement rememberMe_checkbox;
	
	
	@FindBy(linkText = "Forgot your password")
	public WebElement forgot_password_link;

}
