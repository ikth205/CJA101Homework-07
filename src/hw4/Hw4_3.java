package hw4;
//有個字串陣列如下 (八大行星):
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
	public class Hw4_3 {
		public static void main (String[] args) {
			String[] s8={"mercury","venus","earth","mars","jupiter","saturn","uranus","neptune"} ;
			int count = 0;
			for(int i=0; i<s8.length;i++) {
				for(int j=0; j<s8[i].length();j++) {
					switch(s8[i].charAt(j)){
					case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        count = count + 1;
                        break;
					}
				}
				
			}
		
			System.out.println("八大行星字串陣列共有"+count+"個母音(a,e,i,o,u)");
		}
}
