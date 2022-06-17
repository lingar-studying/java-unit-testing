package account;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
	
	@DisplayName("Example test-Here come the display name" )//The test will be shown with that name
	@RepeatedTest(5)//will cause it to repreat 5 times
	void exampleTest() {
		System.out.println("See here example ");	
		fail("intended failure");

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
		account.deposit(amount);
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
		account.withdraw(amount+1+account.getBalanace());		
		assertTrue(account.getBalanace() == originalBalance  );		
		
	}
	
	@Test
	@DisplayName("Check that you can change the maxDeviation.")
	void canChangeMaxDeviation() {

		int amount = 100;		
		int firstRestriction = amount-10;
		int expected = account.getBalanace() - amount;
		account.setMaxDeviation(firstRestriction);


		account.withdraw(amount + account.getBalanace()  );//should not affect
		
		account.setMaxDeviation(amount+10);
		account.withdraw(amount + account.getBalanace()  );//should get affect
		
		assertEquals(-amount, account.getBalanace());	
		
	}
	
	@Test
	@DisplayName("Checking you cannot withdraw minus")
	void cannotWithdrawMinus() {
		int expected = account.getBalanace();
		account.withdraw(-1);
		assertEquals(expected, account.getBalanace());
		
	}
	
	@Test
	@DisplayName("Checking that you cannot deposit minus")
	void cannotDepositMinus() {
		int expected = account.getBalanace();
		account.deposit(-1);
		assertEquals(expected, account.getBalanace());
		
	}
	
	
	@Test
	@DisplayName("Checking that you cannot set maxDeviation minus")
	void cannotSetMaxDeviationMinus() {
		int expected = account.getMaxDeviation();
		account.setMaxDeviation(-1);
		assertFalse(account.getMaxDeviation()<0);
		
	}
	
	@Test
	@DisplayName("Checking that you can deposit 1 Million")
	void canDepositMillion() {
		int expected = account.getBalanace() + 1_000_000;
		account.deposit(1_000_000);
		assertEquals(expected, account.getBalanace());
		
	}
	
	@Test
	@DisplayName("Checking deposit and withdraw in the same test")
	void depositAndWithdraw() {
		int currBalance = account.getBalanace();
		int depositAmount = 55;
		
		int withdrawAmount = 25;
		int expected = currBalance +55 - 25;
		account.deposit(depositAmount);
		account.withdraw(withdrawAmount);
		assertEquals(expected, account.getBalanace());	
		
	}
		
	
	
	
	
	
//	@Test
//	@


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
