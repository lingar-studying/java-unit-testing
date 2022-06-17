package account;
/**
 * See the read me for details
 * @author lingar
 *
 */
public class Account {
	
	private int balance ;
	private int maxDeviation = 50;
	
	//Currently not in use - Only for checking etc.. 
	String testingField = "Default";
	
	
	/**
	 * Insert money into the account
	 */
	public void deposit(int amount) {
		if (amount < 0) {
			return;
		}
		
		balance +=amount;
	}
	
	
	/**
	 * Remove money from the account
	 */
	public void withdraw(int amount) {
		
		if (amount < 0) {
			return;
		}
		if(balance- amount < -maxDeviation) {
			
			System.out.println("maxdeviation = " + maxDeviation);
			return;

			
		}
		balance -= amount;
	}	
	
	//GETTERS AND SETTERS
	public int getBalanace() {
		return balance;
	}


//	public void setBalanace(int balanace) {
//		this.balanace = balanace;
//	}


	public int getMaxDeviation() {
		return maxDeviation;
	}


	public void setMaxDeviation(int maxDeviation) {
		if (maxDeviation < 0) {
			return;
		}
		this.maxDeviation = maxDeviation;
	}
	
	

}
