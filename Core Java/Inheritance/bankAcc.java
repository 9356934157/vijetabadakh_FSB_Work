

 class BankAccount {
	 String name;
	 double number;
	 double balance;
	 
	 BankAccount(){
		 this.name="vijeta";
		 this.number=3243547;
		 this.balance=2434;
	 }
	 BankAccount(String nm,double no,double bal){
		 this.name=nm;
		 this.number=no;
		 this.balance=bal;
	 }
	 String getName() {
		return name;
	}
	 void setName(String name) {
		this.name = name;
	}
	 double getNumber() {
		return number;
	}
	 void setNumber(double number) {
		this.number = number;
	}
	 double getBalance() {
		return balance;
	}
	 void setBalance(double balance) {
		this.balance = balance;
	}
	 void display() {
		 System.out.println("Name is :"+this.name);
		 System.out.println("Bnak Number is :"+ this.number);
		 System.out.println("Balance is :"+ this.balance);
	 }	 
}
 class SavingAccount extends BankAccount{
	 double interestRate;
	 
	 SavingAccount(){
		 super();
		 this.interestRate=4365;	
	 }
	 
	 SavingAccount(String nm,double no,double bal,double rate){
		 super(nm,no,bal);
		 this.interestRate=rate;	 
	 }

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	 void display() {
		 super.display();
		 System.out.println("InterstRate is :"+this.interestRate);
	 }	
 }
 class CurrentAccount extends BankAccount {
	 double overdraftLimit;
	 
	 CurrentAccount(){
		 super();
		 this.overdraftLimit=23435;
	 }
	 CurrentAccount(String nm,double no,double bal,double limit){
		 super(nm,no,bal);
		 this.overdraftLimit=limit;
	 }
	 void display() {
		 super.display();
		 System.out.println("OverDraftLimit is :"+this.overdraftLimit);
	 }	
 }
class test4{
	public static void main(String[] args) {
		
		BankAccount b1=new BankAccount();
		BankAccount b2= new BankAccount("sadsf",23423,3243253);
		
		b1.display();
		b2.display();
		
		SavingAccount s1= new SavingAccount();
		SavingAccount s2= new SavingAccount("qwrew",213423,2143,34);
		
		s1.display();
		s2.display();
		
		CurrentAccount c1= new CurrentAccount();
		CurrentAccount c2= new CurrentAccount("werr",23435,35345,23);
		
		c1.display();
		c2.display();
		
	}
}