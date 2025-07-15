package Day43;

import org.testng.annotations.*;

public class AllAnnotation {
	
	@BeforeSuite
	void bs() {
		System.out.println("before suite");
	}
	
	@AfterSuite
	void as() {
		System.out.println("after suite");
	}

	@BeforeTest
	void bt() {
		System.out.println("before test");
	}

	@AfterTest
	void at() {
		System.out.println("after test");
	}

	@BeforeClass
	void bc() {
		System.out.println("before class");
	}

	@AfterClass
	void ac() {
		System.out.println("After class");
	}

	@BeforeMethod
	void bm() {
		System.out.println("before method");
	}

	@AfterMethod
	void am() {
		System.out.println("After method");
	}

	@Test
	void tm1() {
		System.out.println("tm2");
	}

	@Test
	void tm2() {
		System.out.println("tm2");
	}


}
