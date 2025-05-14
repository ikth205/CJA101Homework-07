package hw5;

public class Homework5_5 {
	  public static void main(String[] args) {
		  
	        System.out.println("本次隨機產生驗證碼為：");
	        Homework5_5_Method x = new Homework5_5_Method();
	        String authCode = x.genAuthCode();
	        System.out.println(authCode);
	    }
	}
