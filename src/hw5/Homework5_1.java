package hw5;
//請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如
//圖:

import java.util.Scanner;

public class Homework5_1 {
    public static void main(String[] args) {
        System.out.println("請輸入寬與高:");
        
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();

        if (width <= 0 || height <= 0) {
            System.out.println("寬或高不能小於等於 0！");
            return;
        }

        Homework5_1_Method h1 = new Homework5_1_Method();
        h1.starSquare(width, height);

    }
}