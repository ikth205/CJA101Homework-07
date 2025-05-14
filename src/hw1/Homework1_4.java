package hw1;
//• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
public class Homework1_4 {
	public static void main (String[] args) {
		double pi=3.1415 ,r= 5;
		
		double SQ= (r*r*pi);
		double L= (2*pi*r);
	
		System.out.println("面積為"+ SQ);
		System.out.println("周長為"+ L);

	}
}
