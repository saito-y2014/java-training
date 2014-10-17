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
		Account adachi = new Account("�����K��", "123456", 500);
		TimeAccount nakata = new TimeAccount("���c�^��", "654321", 300, 400);
		
		System.out.println("�����N�ƒ��c�N�̒����c���̔�r���ʂł��B");
		switch (compBalance(adachi, nakata)){
		case 0 : System.out.println("��l�̒����c���͓����B");			break;
		case 1 : System.out.println("�����N�̂ق��������c���������B");	break;
		case -1: System.out.println("���c�N�̂ق��������c���������B");	break;
		}
	}

}
