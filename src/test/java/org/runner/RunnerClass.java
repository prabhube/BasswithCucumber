package org.runner;


import java.io.IOException;

import org.basec.Base_Class;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import com.helper.File_Reader_manager;
import com.sun.xml.internal.ws.api.pipe.helper.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\org\\hotelapp\\feature\\Hotel.feature",
glue="org.stepdef",
monochrome=true,
//tags="smoketesting",
plugin= {"html:Report/Cucumber_Report",
		"json:Report/Cucumber.json"})

public class RunnerClass {
	public static WebDriver driver;
	@BeforeClass
		public static void browserlaunch() throws IOException {
							
		String browser = File_Reader_manager.getInstance().getInstanceCR().getBrowser();
		driver=Base_Class.browserLaunch(browser);			
			}
	
}
