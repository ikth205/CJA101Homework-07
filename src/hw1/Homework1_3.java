package hw1;
//• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
public class Homework1_3 {
	public static void main (String[] args) {
		int num1 = 256559;
		
		int day= num1/86400;
		int hour=(num1%86400)/3600;
		int min=((num1%86400)%3600)/60;
		int sec=((num1%86400)%3600)%60;
	
		System.out.println(day+"天"+ hour+"小時"+ min+ "分"+ sec+ "秒");

	}
}
