package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class CraterHomePage {

	public CraterHomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(css = "svg.block.w-48")
	public WebElement crater_text;

	@FindBy(linkText = "Email")
	public WebElement email_text;

	@FindBy(name = "email")
	public WebElement email_field;

	@FindBy(linkText = "Password")
	public WebElement password_text;

	@FindBy(name = "password")
	public WebElement password_field;

	@FindBy(xpath = "//*[@href='/forgot-password']")
	public WebElement forgot_password;

	@FindBy(xpath = "//*[@type='submit']")
	public WebElement login_button;

	@FindBy(xpath = "//*[contains(text(),'Simple Invoicing for Individuals Small Businesses')]")
	public WebElement h1_title_text;

	@FindBy(xpath = "//div[3]/div/p")
	public WebElement p_display_text;

	@FindBy(css = "p.mb-3")
	public WebElement copyright_disclaimer;

}
