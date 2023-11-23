package Helper;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Config {
	
	public static WebDriver driver;
	
	public static Actions actions ;
public static Actions actions2 ;
	
	public static void initialzeDriver() throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", Utils.getProperty("TestDriverPatrh"));
		driver = new ChromeDriver(options);
		
		}
	public static void maximaseWindow() {
		driver.manage().window().maximize();
	}
	
	public static void navigate (String URL) {
		Config.driver.get(URL);
	}
	
	public static void driverQuit() {
		driver.quit();
	}
	
	
	

}
