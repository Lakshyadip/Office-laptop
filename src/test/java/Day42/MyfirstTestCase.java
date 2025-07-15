package Day42;

import org.testng.annotations.Test;

/*open appl
 * login
 * logout
 */

public class MyfirstTestCase {
	
	
	@Test(priority=1)
	void openapplicaton() {
		System.out.println("Open the application");
	}
	
	@Test(priority=2)
	void loginapplication(){
		System.out.println("Login the application");
	}
	
	@Test(priority=3)
	void logoutapplication() {
		System.out.println("logout the application");
	}
}
