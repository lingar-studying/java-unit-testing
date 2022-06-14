package account;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
//Annotaion list:
//https://junit.org/junit5/docs/current/user-guide/#writing-tests-annotations

/**
 * Official API :
 * 
 * https://junit.org/junit5/docs/current/api/
 * 
 * @author lingar
 *
 */

class AccountTest {
	Account account;

	@BeforeEach
	void setUp() {
		account = new Account();
		System.out.println("Hi" + account.testingField);
		
	}
	
	@Test
//	@RepeatedTest(5)
	void assertBeforeEachWorking() {
		// https://junit.org/junit5/docs/current/api/org.junit.jupiter.api/org/junit/jupiter/api/Assertions.html
		// - Assertion API
		System.out.println("Befroe each? ");
		System.out.println(account.testingField);
//		assertEquals("default owner2", account2.owner, "owner name not right" );
	}


	@Test
	void tryTest() {
//		Assert(accou)
		System.out.println("Hi test");

	}

	@Test
	void tryTest2() {
//		Assert(accou)
		System.out.println("Hi test");

		fail("Failing for stand up again");

	}

	// assertions-and-assumptions
	// https://www.vogella.com/tutorials/JUnit/article.html#assertions-and-assumptions
	@Test
	void assertString() {
		// https://junit.org/junit5/docs/current/api/org.junit.jupiter.api/org/junit/jupiter/api/Assertions.html
		// - Assertion API
		Account account2 = new Account();

		System.out.println(account2.testingField);
		assertEquals("default owner2", account2.testingField, "owner name not right");
	}


	/**
	 * 
	 * assertEquals
	 * 
	 * assertEquals(4, calculator.multiply(2, 2),"optional failure message");
	 * 
	 * assertTrue
	 * 
	 * assertTrue('a' < 'b', () → "optional failure message");
	 * 
	 * assertFalse
	 * 
	 * assertFalse('a' > 'b', () → "optional failure message");
	 * 
	 * assertNotNull
	 * 
	 * assertNotNull(yourObject, "optional failure message");
	 * 
	 * assertNull
	 * 
	 * assertNull(yourObject, "optional failure message");
	 */

}
