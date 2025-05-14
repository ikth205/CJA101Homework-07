package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
        // (1) 使用無參數建構子 + 設定值
        MyRectangle rect1 = new MyRectangle();
        rect1.setWidth(10);
        rect1.setDepth(20);
        System.out.println("面積為：" + rect1.getArea());

        System.out.println("======================");

        // (2) 使用有參數建構子直接給值
        MyRectangle rect2 = new MyRectangle(10, 20);
        System.out.println("面積為：" + rect2.getArea());
    }
}