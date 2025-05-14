package hw2;

public class Hw2 {
//	• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
	public static void main (String[] args) {
		
		int sum1 = 0;
		for(int i = 1; i <= 1000; i++) {
			if( i%2 == 0 ) {
				sum1 +=i;
			}		
		}
		System.out.println(sum1);
		System.out.println("==========");
	
//	• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		
		int sum2 = 1;
		for(int i = 1; i <= 10; i++) {
			sum2 *= i;
		}
		System.out.println(sum2);
		System.out.println("==========");

//	• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
	
		int sum3 = 1;
		int i =1;
		while(i <= 10) {
			sum3 *= i;
			i++;
		}
		System.out.println(sum3);
		System.out.println("==========");
		
//	• 請設計一隻Java程式,輸出結果為以下:
//	1 4 9 16 25 36 49 64 81 100
		
		int a = 1;
		for(a = 1; a <= 10; a++) {
		
		System.out.print(a*a + " ");	
		}
		
		System.out.println(" ");
		
		System.out.println("==========");
//	• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//	輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
	

		int b = 1;
		for(b = 1; b < 50; b++) {
			if( b%10 == 4 || (b >= 40 && b< 50)) {
				continue;
			}
		System.out.print(b+ " ");	
		}
		System.out.println();
		System.out.println("==========");
		
//	• 請設計一隻Java程式,輸出結果為以下:
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
			
		int c, d ;
		for (c=10; c>=0; c--) {
			for(d=1; d<=c; d++) {
				System.out.print(d);
				}
			System.out.println();
			}
		
		System.out.println("==========");
		
//	• 請設計一隻Java程式,輸出結果為以下:
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF	
		
		int e, f;
		for (e=1; e<=6; e++) {
			for (f=1; f<=e; f++) {
				switch(e) {
				case 1:				
					System.out.print("A");
					break;
				case 2:
					System.out.print("B");
					break;
				case 3:
					System.out.print("C");
					break;
				case 4:
					System.out.print("D");
					break;
				case 5:
					System.out.print("E");
					break;
				case 6:
					System.out.print("F");
					break;
				}	
			}
			System.out.println();
		}
	}
}