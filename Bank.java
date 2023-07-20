class Bank {
	String custName;
	double balance;
	
	void setData(String name,double amount){
		custName = name;
		balance = amount;
	}
	
	void debitAmt(double debitedAmt){
		balance-=debitedAmt;
	}
	
	void creAmt(double creditedAmt){
		balance+=creditedAmt;
	}
	
	void display(){
		System.out.println("Available balance is "+balance);
		System.out.println("Customer name is "+custName);	
	}
	
	public static void main(String[] s){
		Bank bank = new Bank();
		bank.setData("Aniket",10000);
		bank.debitAmt(2000);
		bank.display();//8000.0
		bank.creAmt(5000);
		bank.display();//13000.0
		
	}
	

}