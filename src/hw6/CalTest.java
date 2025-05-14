package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calc = new Calculator();

		try {
			System.out.print("請輸入x的值：");
			int x = scanner.nextInt();
			System.out.print("請輸入y的值：");
			int y = scanner.nextInt();

			int result = (int)calc.powerXY(x, y);

			if (y < 0) {
				System.out.println("次方為負數，結果回傳值不為整數");
			}
			else
			System.out.println(x + " 的 " + y + " 次方結果為：" + result);
		} catch (CalException e) {
			System.out.println("發生錯誤：" + e.getMessage());
		} catch (Exception e) {
			System.out.println("輸入錯誤：" + e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
