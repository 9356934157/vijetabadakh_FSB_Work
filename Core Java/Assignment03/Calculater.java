class Calculater{
void sub(int a, int b){
System.out.println("sf1");
System.out.println(a-b);
}

void sub(float a, float b){
System.out.println("sf2");
System.out.println(a-b);
}

void sub(double a, double b){
System.out.println("sf3");
System.out.println(a-b);
}

void sub(double a, float b){
System.out.println("sf4");
System.out.println(a-b);
}
//---------------------------------------------------------------------------
void add(int a, int b){
System.out.println("af1");
System.out.println(a+b);
}

void add(float a, float b){
System.out.println("af2");
System.out.println(a+b);
}

void add(double a, double b){
System.out.println("af3");
System.out.println(a+b);
}

void add(double a, float b){
System.out.println("af4");
System.out.println(a+b);
}
//--------------------------------------------------------------------------------------
void div(int a, int b){
System.out.println("df1");
System.out.println(a/b);
}

void div(float a, float b){
System.out.println("df2");
System.out.println(a/b);
}

void div(double a, double b){
System.out.println("df3");
System.out.println(a/b);
}

void div(double a, float b){
System.out.println("df4");
System.out.println(a/b);
}
//-------------------------------------------------------------------------
void mul(int a, int b){
System.out.println("mf1");
System.out.println(a*b);
}

void mul(float a, float b){
System.out.println("mf2");
System.out.println(a*b);
}

void mul(double a, double b){
System.out.println("mf3");
System.out.println(a*b);
}

void mul(double a, float b){
System.out.println("mf4");
System.out.println(a*b);
}
//-----------------------------------------------------------------------------------
}
class Test{
public static void main(String [] args){

Calculater c1= new Calculater();
int a=23;
double d=10.5;
float f=23.0f;
c1.add(a,a);
c1.add(f,f);
c1.add(d,d);
c1.add(d,f);

c1.sub(a,a);
c1.sub(f,f);
c1.sub(d,d);
c1.sub(d,f);

c1.div(a,a);
c1.div(f,f);
c1.div(d,d);
c1.div(d,f);

c1.mul(a,a);
c1.mul(f,f);
c1.mul(d,d);
c1.mul(d,f);

}
}





