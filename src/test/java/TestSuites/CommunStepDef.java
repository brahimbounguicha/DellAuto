package TestSuites;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import Helper.Config;
import Helper.Utils;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import org.openqa.selenium.TakesScreenshot;

public class CommunStepDef {
	
	@Given("admin is on HomePage")
	public void admin_is_on_home_page() throws Exception {
Config.initialzeDriver();
Config.navigate(Utils.getProperty("Web_Portal_Link"));
Config.maximaseWindow();

	}
@After
public void tearDown(Scenario sc) {
	if(sc.isFailed()) {
		File screenShotSource = ((TakesScreenshot)Config.driver).getScreenshotAs(OutputType.FILE);
		File screenshotDestination = new File("c:\\faileSc.png");
		
		try {
			FileUtils.copyFile(screenShotSource, screenshotDestination);
		}catch(IOException e) {
			
		}
	}
}
}
