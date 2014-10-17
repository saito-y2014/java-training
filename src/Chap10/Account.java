package Chap10;

public class Account {
	private static int counter = 0;
	
	private String name;
	private String no;
	private long balance;
	private Day openDay;
	private int id;
	
	{
		id = ++counter;
		System.out.println("–¾‰ğ‹âs‚Å‚ÌŒûÀŠJİ‚ ‚è‚ª‚Æ‚¤‚²‚´‚¢‚Ü‚·B");
	}
	
	public Account(String name, String no){
		this(name, no, 0, new Day());
	}
	
	public Account(String name, String no, long balance, Day openDay){
		this.name = name;
		this.no = no;
		this.balance = balance;
		this.openDay = new Day(openDay);
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
	
	public int getId(){
		return id;
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
