package assingent0;
import java.time.LocalDate;
import java.time.Period;


 abstract class BankAccount {
	 String name;
	 double number;
	 double balance;
	 //double withadro;
	 
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
	 public String toString() {
		  return "\n id Bank Number :"+this.number+ "/"+ "Name is :" +this.name +"Year is: "+this.balance;
	  }
	abstract void withadro(double balance);
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
	 void withadro(double balance) {
		 if(balance<3000) {
		    System.out.println("withadro...");
		 }else {
			 System.out.println("check the balance...");
		 }
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
	 void withadro(double balance) {
		 if(balance<3000) {
		    System.out.println("withadro...");
		 }else {
			 System.out.println("check the balance...");
		 }
	 }
 }
 class SalaryAcc extends BankAccount{
	 LocalDate lastdate = LocalDate.of(2022, 12, 25);
	 
	 SalaryAcc(){
		 super();
		 this.lastdate= LocalDate.of(2022, 9, 22);
	 }
	 SalaryAcc(String nm,double no,double bal,LocalDate d){
		 super(nm,no,bal);
		 this.lastdate=d;
	 }
	public LocalDate getDate() {
		return lastdate;
	}
	public void setDate(LocalDate date) {
		this.lastdate = date;
	}
	 void display() {
		 System.out.println("DATE IS :"+this.lastdate);
	 }
	 void withadro(double balance) {
		 Period diff = Period.between(lastdate,LocalDate.now() );
	 
 
		 if(diff.getMonths() >= 2) {
		    System.out.println(" Transaction denied! Last transaction was over 2 months ago");
		 }else {
			 System.out.println("Withdrawal successful");
		 }
	 }
 }
class test4{
	public static void main(String[] args) {
		
//		BankAccount b1=new BankAccount();
//		BankAccount b2= new BankAccount("sadsf",23423,3243253);
//		
//		
//		b1.display();
//		b2.display();
//		
//		SavingAccount s1= new SavingAccount();
//		SavingAccount s2= new SavingAccount("qwrew",213423,2143,34);
//		
//		s1.display();
//		s2.display();
//		
//		CurrentAccount c1= new CurrentAccount();
//		CurrentAccount c2= new CurrentAccount("werr",23435,35345,23);
//		
//		c1.display();
//		c2.display();
		
		BankAccount b1;
		b1= new SavingAccount();
		b1= new SavingAccount("qwrew",213423,2143,34);
		b1.display();
		b1.withadro(342423);
		
		
		 b1= new CurrentAccount();
		 b1= new CurrentAccount("werr",23435,35345,23);
		 b1.display();
		 b1.withadro(342423);
		 
		 b1=new SalaryAcc();
		 b1= new SalaryAcc("efwer",231,324,LocalDate.of(2022, 12, 2));
		 b1.display();
		 b1.withadro(564);
		 
		 System.out.println(b1.toString());
	}
	
}