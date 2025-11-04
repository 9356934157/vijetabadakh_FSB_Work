class price{
public static void main(String arg []){	
	double price= 700, discount=0;
	char ch= 'yes';
	if(ch== 'yes'){
		if(price>500){
			discount = price*0.20;
		}
		else{
			discount = price*0.10;
		}
	}
	else{
		if(price>600){
		discount =price* 0.15;
	}
	else{
		discount =0.0;
	}
	double total = price -discount;
     System.out.printf("%lf",total);
}

}
}