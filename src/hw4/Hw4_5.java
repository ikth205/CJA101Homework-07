package hw4;
//請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
import java.util.Scanner;

	public class Hw4_5 {
		public static void main (String[] args) {
		
		        // 每個月的天數（平年）
		        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		        Scanner sc = new Scanner(System.in);

		        // 輸入年份
		        System.out.println("請輸入西元年 (yyyy):");
		        int year = sc.nextInt();

		        // 輸入月份（並檢查合理性）
		        int month;
		        while (true) {
		            System.out.println("請輸入月份 (1~12):");
		            month = sc.nextInt();
		            if (month >= 1 && month <= 12) break;
		            System.out.println("月份不合理，請重新輸入！");
		        }

		        // 判斷是否為閏年
		        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		        if (isLeap) {
		            daysInMonth[1] = 29; // 如果是閏年，2月改為29天
		        }

		        // 輸入日（檢查該月最大天數）
		        int day;
		        while (true) {
		            System.out.println("請輸入日期:");
		            day = sc.nextInt();
		            if (day >= 1 && day <= daysInMonth[month - 1]) break;
		            System.out.println("輸入的日期不合理，請重新輸入！");
		        }

		        // 計算是第幾天
		        int totalDays = 0;
		        for (int i = 0; i < month - 1; i++) {
		            totalDays += daysInMonth[i]; // 加上前幾個月的天數
		        }
		        totalDays += day; // 加上這個月的天數

		        // 顯示結果
		        System.out.println("輸入的日期為 " + year + " 年的第 " + totalDays + " 天");
		}
	
}


