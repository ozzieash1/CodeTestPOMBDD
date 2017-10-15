package practiceSelenium.StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Com.pracselenium.Exercise2PaymentPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustPaymentSteps {

	Exercise2PaymentPage exercise2PaymentPage = new Exercise2PaymentPage();

	@Given("^cust navigates to \"([^\"]*)\"$")
	public void cust_navigates_to(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exercise2PaymentPage.load();
		// throw new PendingException();
	}

	@When("^cust pass in parameters \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" into cust info fields$")
	public void cust_pass_in_parameters_into_cust_info_fields(String email1, String name1, String address1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exercise2PaymentPage.SetCustomerInfoFields(email1, name1, address1);
		// throw new PendingException();
	}

	@When("^cust pass in cardtype param1  \"([^\"]*)\"$")
	public void cust_pass_in_cardtype_param1(String cardType) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exercise2PaymentPage.setCardType(cardType);
		// throw new PendingException();
	}

	@When("^cust pass in card detail param2  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void cust_pass_in_card_detail_param2(String card_number1, String cardholder_name1, String verification_code1 
		) throws Throwable {
		
		exercise2PaymentPage.SetPaymentFields(card_number1, cardholder_name1, verification_code1);
		// throw new PendingException();
	}

	@When("^cust click on placeOrder$")
	public void cust_click_on_placeOrder() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exercise2PaymentPage.submit();
		// throw new PendingException();
	}

	@Then("^cust views page title$")
	public void cust_views_page_title() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exercise2PaymentPage.assertTitle();
		// throw new PendingException();
	}

	@Then("^cust logs out of the AUT$")
	public void cust_logs_out_of_the_AUT() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exercise2PaymentPage.close();
		// throw new PendingException();
	}

}
