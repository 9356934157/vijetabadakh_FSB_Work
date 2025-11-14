package assingent0;

public class Payment {
	int paymentId;
    double amount;
    String date;
    
    Payment(){
    	this.paymentId=345;
    	this.amount=53;
    	this.date="12-4-200";
    }
    Payment(int pay,double amt,String da){
    	this.paymentId=pay;
    	this.amount=amt;
    	this.date=da;
    }
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
    
	 void display() {
	        System.out.println("Payment ID: " + paymentId);
	        System.out.println("Amount: " + amount);
	        System.out.println("Date: " + date);
	    }   
	 double withdro() {
		 return amount;
	 }
}
class CreditCardPayment extends Payment {
    String cardNumber;
    String cardHolder;
    String bankName;
    
    CreditCardPayment(){
    	super();
    	this.cardNumber="fsdgd";
    	this.cardHolder="dfdfg";
    	this.bankName="gdfht";
    }
    CreditCardPayment(int pay,double amt,String da,String no,String hold,String bank){
    	super(pay,amt,da);
    	this.cardNumber=no;
    	this.cardHolder=hold;
    	this.bankName=bank;
    }
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardHolder() {
		return cardHolder;
	}
	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	void display() {
        super.display();
        System.out.println("Card Number: " + this.cardNumber);
        System.out.println("Card Holder: " + this.cardHolder);
        System.out.println("Bank Name: " +this. bankName);
    } 
	 double withdro() {
		 return amount;
	 }
}
class UPIPayment extends Payment {
    String upiId;
    String appName;
    boolean transactionSuccess;
    
    UPIPayment(){
    	super();
    	this.upiId="efrg";
    	this.appName="grhtj";
    	this.transactionSuccess=true;
    }
    UPIPayment(String id,String name,boolean tra){
    	this.upiId=id;
    	this.appName=name;
    	this.transactionSuccess=tra;
    }
	public String getUpiId() {
		return upiId;
	}
	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public boolean isTransactionSuccess() {
		return transactionSuccess;
	}
	public void setTransactionSuccess(boolean transactionSuccess) {
		this.transactionSuccess = transactionSuccess;
	}
	void display() {
        super.display();
        System.out.println("UPI ID: " + this.upiId);
        System.out.println("App Name: " +this. appName);
        System.out.println("Transaction Success: " +this. transactionSuccess);
    }
	 double withdro() {
		 return amount;
	 }
}
class CashPayment extends Payment {
    String receiverName;
    String location;

    CashPayment (){
    	super();
    	this.receiverName="erger";
    	this.location="fsdf";
    }
    CashPayment (int pay,double amt,String da,String nm,String loc){
    	super(pay,amt,da);
    	this.receiverName=nm;
    	this.location=loc;
    }
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
    void display() {
    	super.display();
        System.out.println("receiverName: " +this.receiverName);
        System.out.println("location: " +this.location);
    }
    double withdro() {
		 return amount;
	 }
}


class test10{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Payment p1= new Payment();
//		Payment p2= new Payment();
//		
//		p1.display();
//		p2.display();
//		
//		
//		CreditCardPayment c1= new CreditCardPayment();
//		CreditCardPayment c2= new CreditCardPayment();
//		
//		c1.display();
//		c2.display();
//		
//		CashPayment cp1= new CashPayment();
//		CashPayment cp2= new CashPayment();
//		
//		cp1.display();
//		cp2.display();
		Payment p1;
		p1=new CreditCardPayment();
		p1.display();
		p1.withdro();
		
		p1= new CashPayment();
		p1.display();
		p1.withdro();
		
	
	}

}
