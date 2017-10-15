package Com.pracselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Exercise4BasePage {
	
	
	WebElement dropdown;
	String cardtype;
	WebDriver driver;
	
	public void setDropDown(WebElement dropdown, String cardtype){
		
		Select card_type = new Select(driver.findElement(By.id("card_type")));
		card_type.selectByVisibleText("Visa");
		// assertEquals("Visa", CardType.getFirstSelectedOption().click());

		
		
		
	}

}
