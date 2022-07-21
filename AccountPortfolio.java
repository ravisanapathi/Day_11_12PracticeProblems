package atmWithdrawProcess;

public class AccountPortfolio {
    private int numOfTransactions = 0;
    
    private AccountData[] AccountArray;
    
    public AccountPortfolio() {
    	AccountArray = new AccountData[2];
    }
    
    private void addAccountData(int accountAmount, int withDrawlAmount) {
    	AccountArray[numOfTransactions] = new AccountData(accountAmount, withDrawlAmount);
    	numOfTransactions++;
    }
    
    public void computeAmount() {
		for (int i = 0; i < numOfTransactions; i++) {
			AccountArray[i].setUpdatedAmount(this.computeAmount(AccountArray[i]));
			System.out.println(AccountArray[i]);
		}
    }
    public int computeAmount(AccountData acData) {
    	if (acData.accountAmount > acData.withDrawlAmount) {
    		System.out.println(acData.accountAmount - acData.withDrawlAmount);
    	}
    	else {
    		System.out.println("Your WithDrawl Amount is Exceeds Your Account Amount");
    	}
    	
    		return (int) (acData.accountAmount - acData.withDrawlAmount);
    }
    public static void main(String[] args){
    	AccountPortfolio AccountInfo = new AccountPortfolio();
    	AccountInfo.addAccountData(5000, 3000);
    	AccountInfo.computeAmount();
    }
}