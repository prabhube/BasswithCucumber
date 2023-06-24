package org.basec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pommanage {
	public static WebDriver driver;
	@FindBy(id="email")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}
	@FindBy(id="pass")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	// Constructor
	public Pommanage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
}
	

		
	

}
