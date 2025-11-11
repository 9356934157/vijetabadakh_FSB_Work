class Distance{
int km;
int m;

Distance(){
System.out.println("constrctor is called..");
this.km=23;
this.m=546;
}

Distance(int r,int i){
System.out.println("parametric constrctor is called..");
this.km=r;
this.m=i;
}

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
 Distance [] arr= new Distance[3];
arr[0]= new  Distance();
arr[1]=new  Distance(11,55);
arr[2]=new  Distance();

for(int i=0;i<arr.length;i++){
arr[i].display();
}


Distance e1,e2,e3;
e1= new Distance();
e2= new Distance();
e3= new Distance(22,11);

e1.setKM(34);
e1.setMater(3);

e1.display();
e2.display();
e3.display();

//System .out. println ("KM : "+ e1.km+ "Mater :"+e1.m);
}// main end here
} // test end here


