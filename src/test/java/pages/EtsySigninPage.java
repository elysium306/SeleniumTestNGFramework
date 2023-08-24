package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class EtsySigninPage {

	public EtsySigninPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(css = "*[class=\"wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin header-button\"]")
	public WebElement signinPage_signinBtnLink;

	@FindBy(css = "h1[id=join-neu-overlay-title]")
	public WebElement signinPage_signinBtnText;

	@FindBy(css = "button[class='wt-btn wt-btn--secondary wt-btn--small inline-overlay-trigger register-header-action select-register']")
	public WebElement signinPage_registerBtn;

	@FindBy(css = "input[id='join_neu_email_field']")
	public WebElement signinPage_emailField;

	@FindBy(css = "input[id='join_neu_password_field']")
	public WebElement signinPage_passwordField;

	@FindBy(xpath = "//*[@for='persisent']")
	public WebElement signinPage_staySignedInBtn;

	@FindBy(xpath = "//div[@class='wt-mt-xs-1']")
	public WebElement signinPage_forgotPasswordLink;

	@FindBy(xpath = "//button[@name='submit_attempt']")
	public WebElement signinPage_signinBtn;

	// after click on registration page

	@FindBy(xpath = "//button[@name='submit_attempt']")
	public WebElement signinPage_registration_CreateYourAcctText;

	@FindBy(xpath = "//*[@id='join_neu_first_name_field']")
	public WebElement signinPage_Register_FirstNameField;

	@FindBy(xpath = "//*[@id='join_neu_password_field']")
	public WebElement signinPage_Register_PasswordField;

	@FindBy(linkText = "Register")
	public WebElement signinPage_Register_RegisterBtn;

}
