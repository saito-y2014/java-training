package Chap09;

public class Account2 {
	private String name;
	private String no;
	private long balance;
	private Day openDay;
	
	public Account2(String n, String num, long z, Day d){
		name = n;
		no = num;
		balance = z;
		openDay = new Day(d);
	}
	
	public String getName(){
		return name;
	}
	
	public String getNo(){
		return no;
	}
	
	public long getBalance(){
		return balance;
	}
	
	public Day getOpenDay(){
		return new Day(openDay);
	}
	
	public void deposit(long k){
		balance += k;
	}
	
	public void withdraw(long k){
		balance -= k;
	}
	
	public String toString(){
		return "{" + name + ", " + no + ", " + balance + "}";
	}

}
