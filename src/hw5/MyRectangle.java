package hw5;

public class MyRectangle {
	//兩個 double 型態的屬性
    private double width;
    private double depth;

    // 設定方法
    public void setWidth(double width) {
        this.width = width;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getArea() {
        return width * depth;
    }

    // 無參數建構子
    public MyRectangle() {
       
    }

    // 有參數建構子
    public MyRectangle(double width, double depth) {
        this.width = width;
        this.depth = depth;
    }
}
