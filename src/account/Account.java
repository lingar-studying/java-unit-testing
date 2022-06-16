package account;
/**
 * See the read me for details
 * @author lingar
 *
 */
public class Account {
	
	private int balanace ;
	private int maxDeviation;
	
	//Currently not in use - Only for checking etc.. 
	String testingField = "Default";
	
	
	/**
	 * Insert money into the account
	 */
	public void deposite(int amount) {
		
	}
	
	
	/**
	 * Remove money from the account
	 */
	public void withdraw(int amout) {
		
	}	
	
	//GETTERS AND SETTERS
	public int getBalanace() {
		return balanace;
	}


//	public void setBalanace(int balanace) {
//		this.balanace = balanace;
//	}


	public int getMaxDeviation() {
		return maxDeviation;
	}


	public void setMaxDeviation(int maxDeviation) {
		this.maxDeviation = maxDeviation;
	}
	
	

}
