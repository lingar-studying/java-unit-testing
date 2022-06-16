package account;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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

class AccountTestDraft {
	Account account;

	@BeforeEach
	void setUp() {
		account = new Account();
		System.out.println("Hi" + account.testingField);
		
	}
	
//	@Test
	@DisplayName("Here come the display name" )
	@RepeatedTest(5)
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

		System.out.println("assert " + account2.testingField);
		assertEquals("default owner2", account2.testingField, "owner name not right");
	}

	
	
	//•	Check that the object created
	@Test
	@DisplayName("Checking that the object created")
	void objectHasCreated() {
		assertNotNull(account, "Object is NULL2");
		
	}
	
	
	//•	Checking that the Deposit is working when you are inserting x Money
	
	@Test
	@DisplayName("Checking that the Deposit is working when you are inserting x Money")
	void depositWorking() {
		int amount = 40;
		int expected = account.getBalanace() + amount;
		//
//		assertEquals​(int expected, int actual)
		account.deposit(amount);
		assertEquals(expected, account.getBalanace(), "deposit isn't working well");
	}
	
	@Test
	@DisplayName("Checking that the withdraw is working when you are removing x Money. ")
	void withdrawWorking() {
		int amount = 40;
		int expected = account.getBalanace() - amount;
		//
//		assertEquals​(int expected, int actual)
		account.withdraw(amount);
		assertEquals(expected, account.getBalanace(), "withdraw isn't working well");
	}
	
	
	@Test
	@DisplayName("Checking that you cannot exceed the maxDeviation")
	void cannotExceedMaxDeviation() {
		int amount = 100;
		int originalBalance = account.getBalanace();
		account.setMaxDeviation(amount);
		account.withdraw(amount+1);		
		assertTrue(account.getBalanace() == originalBalance  );		
		
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
