package hw4;
//• 有個一維陣列如下:
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
public class Hw4_1 {
	public static void main (String[] args) {
		int[] i1 = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum =0;
		for (int i=0; i<i1.length;i++) {
			sum += i1[i];			
		}
		int avg = (sum / i1.length);
		System.out.println("所有元素的平均值=" +avg);
		
		System.out.print("大於平均值的元素=");
		for (int j=0; j<i1.length;j++) {
			if (i1[j]> avg) {
				System.out.print(i1[j] + " ");
			}
		}
		
	}

}
