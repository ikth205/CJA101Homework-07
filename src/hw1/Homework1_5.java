package hw1;
//• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//金加利息共有多少錢 (用複利計算,公式請自行google)
public class Homework1_5 {
	public static void main (String[] args) {
		double R=0.02 ,PV=1500000 ,n=10;
		double FV =PV *Math.pow((1 +R) ,n);
	
		System.out.println(FV);
	}

}
