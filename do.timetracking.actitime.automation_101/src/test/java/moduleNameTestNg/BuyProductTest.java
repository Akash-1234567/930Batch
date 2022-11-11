package moduleNameTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyProductTest {
	
	@Test (priority = 1)
	public void loginTest() {
		
		System.out.println("Logged In");
		
	}
	
	@Test  (priority = 2)
	public void searchForTheProductTest() {
		
		System.out.println("Search for the product");
		
	}
	
	@Test (dependsOnMethods = "searchForTheProductTest")
	public void addProductToCartTest() {
		
		System.out.println("AddProductToCart");
		Assert.fail();
	}
	
	@Test (dependsOnMethods = "addProductToCartTest")
	public void paymentTest() {
		
		System.out.println("Payment was successfully");
		
	}
	@Test (priority = 3)
	public void logoutTest() {
		
		System.out.println("Logout successfully");
		
	}

}
