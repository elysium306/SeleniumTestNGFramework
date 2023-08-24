package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class EtsyHomePage {

	public EtsyHomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//a[@class='wt-display-table wt-width-full wt-text-link-no-underline']")
	public WebElement jewelryAccesories;

	@FindBy(css = "span[id='catnav-primary-link-10855']")
	public WebElement clothingShoes;

	@FindBy(css = "span[id='catnav-primary-link-10923']")
	public WebElement homeLiving;

	@FindBy(css = "span[id='catnav-primary-link-891']")
	public WebElement weddingLiving;

	@FindBy(css = "span[id='catnav-primary-link-10983']")
	public WebElement toysEntertainment;

	@FindBy(css = "span[id='catnav-primary-link-66']")
	public WebElement artCollections;

}
