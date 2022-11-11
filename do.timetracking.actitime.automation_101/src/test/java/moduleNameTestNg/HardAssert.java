package moduleNameTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
@Test
public void demo() {
	boolean expectedResult = true;
	
	boolean ActualResult = false;
	
	Assert.assertEquals(ActualResult, expectedResult);
	System.out.println("pass");
}
}
