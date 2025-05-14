package hw1;
//• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
public class Homework1_2 {
	public static void main (String[] args) {
		int num1 = 200 ,num2 =12;
	
		int C= num1/ num2;
		int D= num1% num2;

		System.out.println("共是"+ C+ "打"+ D+ "顆");
	}
}
