package hw1;

public class Hw1 {
	public static void main (String[] args) {
		int num1 = 12 ,num2 =6;
	
		int A= num1+ num2;
		int B= num1* num2;
		
		System.out.println("和=" +A);
		System.out.println("積=" +B);
	

		int num3 = 200 ,num4 =12;
	
		int C= num3/ num4;
		int D= num3% num4;
	
		System.out.println("共是"+ C+ "打"+ D+ "顆");
	
	
		int num5 = 256559;
	
		int day= num5/86400;
		int hour=(num5%86400)/3600;
		int min=((num5%86400)%3600)/60;
		int sec=((num5%86400)%3600)%60;
	
		System.out.println(day+"天"+ hour+"小時"+ min+ "分"+ sec+ "秒");
	
	
		double pi=3.1415 ,r= 5;
	
		double SQ= (r*r*pi);
		double L= (2*pi*r);
	
		System.out.println("面積為"+ SQ);
		System.out.println("周長為"+ L); //?

		double R=0.02 ,PV=1500000 ,n=10;
		double FV =PV *Math.pow((1 +R) ,n);
	
		System.out.println(FV);
	
	
		System.out.println(5+5);//數字相加 5+5=10
		System.out.println(5+'5');//''內數字對照Unicode的5為53,5+53=58
		System.out.println(5+"5");//""轉為字元,串接相加 5串接字元5=55
		}
	
	
	}

