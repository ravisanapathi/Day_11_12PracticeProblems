package atmWithdrawProcess;

public class AccountData {
	public int accountAmount;
	public int withDrawlAmount;
	public int updatedAmount;
	
	public AccountData(int accountAmount, int withDrawlAmount) {
		this.accountAmount = accountAmount;
		this.withDrawlAmount = withDrawlAmount;
	}
	public void setUpdatedAmount(int updatedAmount) {
		this.updatedAmount = updatedAmount;
	}
	
	@Override
	public String toString() {
		return "Your debit Amount is: " +withDrawlAmount+ " And Your Current Balance is: "+updatedAmount;
	}
}
