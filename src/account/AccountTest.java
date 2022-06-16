package account;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


/**
 * Official API :
 * 
 * https://junit.org/junit5/docs/current/api/
 * 
 * //Annotaion list:
//https://junit.org/junit5/docs/current/user-guide/#writing-tests-annotations
 * 
 * Recommended guides:
 * https://www.vogella.com/tutorials/JUnit/article.html
 * https://junit.org/junit5/docs/current/user-guide/#writing-tests-annotations
 * 
 * @author lingar
 *
 */

class AccountTest {
	Account account;
	@BeforeEach
	void setUp() {
		account = new Account();
		System.out.println("Preparing to the next test");
		
	}
	
	@DisplayName("Here come the display name" )//The test will be shown with that name
	@RepeatedTest(5)//will cause it to repreat 5 times
	void exampleTest() {
		System.out.println("See here example ");		
	}
	
	@Test
	void assertString() {
		assertEquals("default owner2", account.testingField, "owner name not right");
	}	
	
	//Checking that the object created
	@Test
	@DisplayName("Checking that the object created")
	void objectHasCreated() {
		assertNotNull(account, "Object is NULL2");
		
	}
	
	
	//Checking that the Deposit is working when you are inserting x Money
	@Test
	@DisplayName("Checking that the Deposit is working when you are inserting x Money")
	void depositWorking() {
		int amount = 40;
		int expected = account.getBalanace() + amount;
//		assertEquals​(int expected, int actual)
		account.deposite(amount);
		assertEquals(expected, account.getBalanace(), "deposit isn't working well");
	}
	
	@Test
	@DisplayName("Checking that the withdraw is working when you are removing x Money. ")
	void withdrawWorking() {
		int amount = 40;
		int expected = account.getBalanace() - amount;
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
	 * Some examples...
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
