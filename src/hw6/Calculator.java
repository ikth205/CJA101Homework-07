package hw6;

public class Calculator {

	public double powerXY(int x, int y) {
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義!");
		}
		return Math.pow(x, y);
	}
}
