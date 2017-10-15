package Com.pracselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Exercise2PaymentPage extends LoadableComponent <Exercise2PaymentPage> {

	private WebDriver driver;
	private WebElement email;
	private WebElement name;
	private WebElement address;
	// private WebElement card_type;
	private WebElement card_number;
	private WebElement cardholder_name;
	private WebElement verification_code;
	private String btn = ".//button[@class='btn btn-primary']";
	private String url = " http://www.practiceselenium.com/check-out.html";

	Exercise4BasePage exercise4BasePage = new Exercise4BasePage();
	
	public Exercise2PaymentPage() {//constructor

		System.setProperty("webdriver.chrome.driver", "C:/WS/chromedriver.exe");
		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);

	}//end of constructor

	
	@Override
	public void load() {
		this.driver.get(url);

	}

public void isLoaded(Object title) {
	this.driver.get(url);
Assert.assertTrue(driver.getTitle().equals(title));
}





public void close() {
		this.driver.close();
	}

	public void SetCustomerInfoFields(String email1, String name1, String address1) {
		email.sendKeys(email1);
		name.sendKeys(name1);
		address.sendKeys(address1);
	}

	public void setCardType(String cardType) {
		Select card_type = new Select(driver.findElement(By.id("card_type")));
		card_type.selectByVisibleText("Visa");
		// assertEquals("Visa", CardType.getFirstSelectedOption().click());

	}

	
	
	
	public void SetPaymentFields(String card_number1, String cardholder_name1, String verification_code1) {

		card_number.sendKeys(card_number1);
		cardholder_name.sendKeys(cardholder_name1);
		verification_code.sendKeys(verification_code1);

	}

	public void submit() {

		driver.findElement(By.ByXPath.xpath(".//button[@class='btn btn-primary']")).click();
	}

	public void assertTitle() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Menu";
		Assert.assertEquals(expectedTitle, actualTitle);
		// assertTrue(driver.getTitle().contains("Title of Page"));

	}
	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}

}
