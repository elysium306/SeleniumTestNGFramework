package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class IndeedHomePage {

	public IndeedHomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "")
	WebElement whatField;

	@FindBy(id = "text-input-where")
	WebElement whereField;

	@FindBy(css = "")
	WebElement searchButton;

	@FindBy(linkText = "Post your resume")
	WebElement postYourResume;

}
