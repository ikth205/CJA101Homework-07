package hw4;
//請建立一個字串,經過程式執行後,輸入結果是反過來的
//例如String s = “Hello World”,執行結果即為dlroW olleH
public class Hw4_2 {
	public static void main (String[] args) {
		String s1[] = {"H","e","l", "l","o"," ","W","o","r","l","d"};
		for (int i=s1.length-1; i>=0;i--) {
			System.out.print(s1[i]);
			}
	}
}
