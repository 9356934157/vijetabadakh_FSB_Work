class ElectricityBill{

static int ratePerUnit=7;
String customerName;
int customerId;
int unitConsumed;
int calculateBill;

ElectricityBill(){
this.customerName="manjiri";
this.customerId=1;
this.unitConsumed=40;
}


ElectricityBill(int id, String nm,int unit){
this.customerName=nm;
this.customerId=id;
this.unitConsumed=unit;
}

void setCustomerName(String nm){
this.customerName=nm;
}
void setCustomerId(int id){
this.customerId= id;
}
void setUnitConsumed(int unit){
this.unitConsumed=unit;
}
static void setRatePerUnit(int rate){
ratePerUnit=rate;
}

int calculateBill(){
return unitConsumed * ratePerUnit;
}

String getCustomerName(){
return this.customerName;
}

int getCustomerId(){
return this.customerId;
}

int getUnitConsumed(){
return this.unitConsumed;

}

int getRatePerUnit(){
return this.ratePerUnit;

}

void display(){
System.out.println("Customer Name :"+this.customerName);
System.out.println("Customer Id :"+this.customerId);
System.out.println("Unit Consumed :"+this.unitConsumed);
System.out.println("Rate Per Unit :"+this.ratePerUnit);
System.out.println("Total Bill :"+this.calculateBill());

}
}

class Test{
public static void main(String[] args){

ElectricityBill e1= new ElectricityBill(101,"vijeta",250);
ElectricityBill e2= new ElectricityBill();

ElectricityBill.setRatePerUnit(8);

e1.calculateBill();
e2.calculateBill();

e1.display();
e2.display();

}
}