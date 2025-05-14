package hw5;
//利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//可以找出二維陣列的最大值並回傳,如圖:
public class Homework5_3 {
	 public static void main(String[] args) {
	        System.out.println("利用Overloading，設計兩個方法double maxElement(int x[][])與double maxElement(double x[][])，可以找出二維陣列的最大值並回傳");

	        int[][] intArray = {
	            {1, 6, 3},
	            {9, 5, 2}
	        };

	        double[][] doubleArray = {
	            {1.2, 3.5, 2.2},
	            {7.4, 2.1, 8.2}
	        };

	        System.out.println("兩個二維陣列的最大值回傳：");

	        Homework5_3_Method h3 = new Homework5_3_Method();
	        System.out.println((int) h3.maxElement(intArray)); // 強制轉成 int 顯示
	        System.out.println(h3.maxElement(doubleArray));     // 顯示 double
	    }
	}

