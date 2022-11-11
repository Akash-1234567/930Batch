package moduleNameTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert {
@Test
public void demo(){
	
	String expectedResult = "acd";
	
	String ActualResult = "abc";
	
	
	org.testng.asserts.SoftAssert soft = new org.testng.asserts.SoftAssert();
	
	Assert.assertEquals(ActualResult, expectedResult);
	soft.assertAll();
	
}
}
