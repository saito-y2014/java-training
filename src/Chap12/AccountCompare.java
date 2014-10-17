package Chap12;

public class AccountCompare {
	static int compBalance(Account a, Account b){
		long totalBalanceA = a instanceof TimeAccount ? ((TimeAccount)a).getBalance() + ((TimeAccount)b).getTimeBalance() : a.getBalance();
		
		long totalBalanceB = b instanceof TimeAccount ? ((TimeAccount)b).getBalance() + ((TimeAccount)b).getTimeBalance() : b.getBalance();
		
		if(totalBalanceA > totalBalanceB)
			return 1;
		else if (totalBalanceA < totalBalanceB)
			return -1;
		return 0;
	}
	
	public static void main(String[] args){
		Account adachi = new Account("足立幸一", "123456", 500);
		TimeAccount nakata = new TimeAccount("仲田真二", "654321", 300, 400);
		
		System.out.println("足立君と仲田君の貯金残高の比較結果です。");
		switch (compBalance(adachi, nakata)){
		case 0 : System.out.println("二人の貯金残高は同じ。");			break;
		case 1 : System.out.println("足立君のほうが貯金残高が多い。");	break;
		case -1: System.out.println("仲田君のほうが貯金残高が多い。");	break;
		}
	}

}
