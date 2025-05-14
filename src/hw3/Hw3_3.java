package hw3;
//• 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//的號碼與總數,如圖:
import java.util.Scanner;

public class Hw3_3 {
	public static void main (String[] args) {
		int n =0;
		int n10, n1;
		int amount =0;

		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字？");
		n =sc.nextInt();
		for (n10=0; n10<=4; n10++) {
			if (n10 == n) {
				continue;
			}
			for (n1=0; n1<=9; n1++) {
					if (n1 == n) {
						continue;					
					}
					if (n1 != 0 && n10 == 0) {
						System.out.print(n1 + " ");
						amount = amount+1;
					}
					else if (n10 >0) {
						System.out.print(n10 +""+n1 + " ");
						amount = amount+1;
					}
			}
		}
		System.out.println();
		System.out.println("總共有"+ amount + "個數字可選");
	}
}
