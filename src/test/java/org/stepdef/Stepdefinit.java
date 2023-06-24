package org.stepdef;


import java.io.IOException;

import org.basec.Base_Class;
import org.basec.Pommanage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.runner.RunnerClass;

import com.helper.File_Reader_manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinit extends Base_Class {
	public static Pommanage g;
	public static WebDriver driver=RunnerClass.driver;
	@Given("user can able to launch the browser")
	public void user_can_able_to_launch_the_browser() throws IOException {
		
//	 geturl("https://www.facebook.com/login/");
		String url = File_Reader_manager.getInstance().getInstanceCR().geturl();
		geturl(url);
	}

	@When("user can able to write the username")
	public void user_can_able_to_write_the_username() throws IOException {
			g=new Pommanage(driver);
		
		
//		Input(g.getUsername(), "prabhube");
		String uservalue = File_Reader_manager.getInstance().getInstanceCR().getuservalue();
		Input(g.getUsername(),uservalue);

	}

	@When("user can able to write the password")
	public void user_can_able_to_write_the_password() throws IOException {
	
//	Input(g.getPassword(), "123456");
		String passwordvalue = File_Reader_manager.getInstance().getInstanceCR().getpasswordvalue();
		Input(g.getPassword(),passwordvalue );
	}

	@Then("user can able to login the page")
	public void user_can_able_to_login_the_page() {
		WebElement login = driver.findElement(By.id("loginbutton"));
	    click(login);
	}

}
