package hw5;

public class Homework5_5_Method {
	
	public String genAuthCode() {
		StringBuilder code = new StringBuilder();
	    int r;
	
	    for (int i = 0; i < 8; i++) {
	        while (true) {
	            r = (int) (Math.random() * 75) + 48;
	            if ((r >= 48 && r <= 57) || (r >= 65 && r <= 90) || (r >= 97 && r <= 122)) {
	                code.append((char) r);
	                break;
	            }
	        }
	    }
	    return code.toString(); // 回傳驗證碼
	}
}