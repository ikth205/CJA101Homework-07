package hw1;
//• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//5 + 5
//5 + ‘5’
//5 + “5”
public class Homework1_6 {
	public static void main (String[] args) {
		System.out.println(5+5);//數字相加 5+5=10
		System.out.println(5+'5');//''內數字對照Unicode的5為53,5+53=58
		System.out.println(5+"5");//""轉為字元,串接相加 5串接字元5=55
	}

}
