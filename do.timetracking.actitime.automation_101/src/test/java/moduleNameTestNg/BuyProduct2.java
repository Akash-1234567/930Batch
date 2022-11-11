package moduleNameTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyProduct2 {

	
		
		@Test (groups = "smoke")
		public void loginTest() {
			
			System.out.println("Logged In");
			
		}
		
		@Test  (groups = "smoke")
		public void searchForTheProductTest() {
			
			System.out.println("Search for the product");
			
		}
		
		@Test (groups = "regression")
		public void addProductToCartTest() {
			
			System.out.println("AddProductToCart");
			Assert.fail();
		}
		
		@Test (groups = "regression")
		public void paymentTest() {
			
			System.out.println("Payment was successfully");
			
		}
		@Test (groups = "smoke")
		public void logoutTest() {
			
			System.out.println("Logout successfully");
			
	}

}
