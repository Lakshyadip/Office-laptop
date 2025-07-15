package Day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	
	
	@Test
	
	void test() {
		
		String title1="opencart";
		String title2="openshop";
		
		Assert.assertEquals("opencart", "openshop");
	}

}
