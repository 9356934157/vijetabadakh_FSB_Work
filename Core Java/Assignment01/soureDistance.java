class Distance{
int km;
int m;
void setKM(int km){
this.km=km;
}
void setMater(int m){
this.m=m;
}
int getKM(){
return this.km;
}
int getMater(){
return this.m;
}
void display(){
System.out.println("kelometer is : "+this.km);
System.out.println("meter is : "+this.m);

}
}// Distance end here
class Test{
public static void main(String [] args){
Distance e1;
e1= new Distance();
e1.setKM(34);
e1.setMater(3);

e1.display();

//System .out. println ("KM : "+ e1.km+ "Mater :"+e1.m);
}// main end here
} // test end here


