package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class IndeedLoginPage {

	public IndeedLoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(linkText = "Sign in")
	WebElement singinPage_ReadyToNextStepText;

	@FindBy(xpath = "")
	WebElement signinButton;

	@FindBy(name = "")
	WebElement emailAddressField;

	@FindBy(xpath = "")
	WebElement continueButton;

	@FindBy(xpath = "")
	WebElement createAcctButton;

	@FindBy(linkText = "")
	WebElement signupWithPasswordInstead;

}
