package hw4;
//班上有8位同學,他們進行了6次考試結果如下:
//請算出每位同學考最高分的次數

import java.util.Arrays;

public class Hw4_6 {
	
	    public static void main(String[] args) {
	        int[][] exam = {
	            {10, 35, 40, 100, 90, 85, 75, 70},
	            {37, 75, 77, 89, 64, 75, 70, 95},
	            {100, 70, 79, 90, 75, 70, 79, 90},
	            {77, 95, 70, 89, 60, 75, 85, 89},
	            {98, 70, 89, 90, 75, 90, 89, 90},
	            {90, 80, 100, 75, 50, 20, 99, 75},
	        };

	        int[] student = new int[8]; // 記錄每位同學得最高分的次數

	        for (int i = 0; i < exam.length; i++) {
	            int max = -1;
	            int maxIndex = -1;

	            // 找出這次考試的最高分和對應學生
	            for (int j = 0; j < exam[i].length; j++) {
	                if (exam[i][j] > max) {
	                    max = exam[i][j];
	                    maxIndex = j;
	                }
	            }

	            student[maxIndex]++; // 該學生得一次最高分
	        }

	        // 輸出結果
	        for (int i = 0; i < student.length; i++) {
	            System.out.println((i + 1) + "號同學考最高分次數 = " + student[i]);
	        }
	    }
	}


