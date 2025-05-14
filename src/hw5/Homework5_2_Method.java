package hw5;

public class Homework5_2_Method {
	 public void randAvg() {
	        int[] rArray = new int[10]; // 儲存10個亂數
	        int sum = 0; // 用來加總
	        System.out.println("本次亂數結果：");

	        for (int i = 0; i < 10; i++) {
	            int r = (int)(Math.random() * 101); // 產生 0~100 的亂數（包含100）
	            rArray[i] = r;
	            System.out.print(r + " ");
	            sum += r; // 同時加總
	        }

	        System.out.println(); // 換行
	        int avg = sum / rArray.length; // 算整數平均值（無小數點）
	        System.out.print("平均值：" + avg);
	    }
	}
