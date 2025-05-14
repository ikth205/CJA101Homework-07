package hw5;

public class Homework5_3_Method {
	 public double maxElement(int[][] x) {
	        int max = x[0][0]; // 假設第一個就是最大值
	        for (int i = 0; i < x.length; i++) {
	            for (int j = 0; j < x[i].length; j++) {
	                if (x[i][j] > max) {
	                    max = x[i][j];
	                }
	            }
	        }
	        return max;
	    }

	    // 處理 double 二維陣列最大值
	    public double maxElement(double[][] x) {
	        double max = x[0][0]; // 假設第一個就是最大值
	        for (int i = 0; i < x.length; i++) {
	            for (int j = 0; j < x[i].length; j++) {
	                if (x[i][j] > max) {
	                    max = x[i][j];
	                }
	            }
	        }
	        return max;
	    }
	}

