package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Helper.Config;

public class OrdinateurPortable {
	
	@FindBy(xpath="/html/body/main/div[3]/section[2]/div[1]/div/div/h1/span")
	WebElement vpage;
	
	@FindBy(id="sort-dropdown")
	WebElement triproductselect;
	
	public OrdinateurPortable() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public String verifMessage() {
	String actualMessage	=vpage.getText();
	return actualMessage;
	}
	
public void triProductSortByName(String sortTri) {
	Select select = new Select(triproductselect);
	select.selectByVisibleText(sortTri);
	
}
	
}
