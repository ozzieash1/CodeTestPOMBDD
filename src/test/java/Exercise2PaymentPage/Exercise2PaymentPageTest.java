package Exercise2PaymentPage;

import org.junit.Test;

import Com.pracselenium.Exercise2PaymentPage;

public class Exercise2PaymentPageTest {

	@Test
	public void testExercise2PaymentPage() {

		Exercise2PaymentPage exercise2PaymentPage = new Exercise2PaymentPage();

		exercise2PaymentPage.load();
		exercise2PaymentPage.SetCustomerInfoFields("uash@gmail.com", "Uash Ash", "7000 Estela");
		exercise2PaymentPage.setCardType("Visa");
		exercise2PaymentPage.SetPaymentFields("2345345645675678", "Uash Ash", "213");
		exercise2PaymentPage.submit();
		exercise2PaymentPage.assertTitle();
		exercise2PaymentPage.close();
	}

}
