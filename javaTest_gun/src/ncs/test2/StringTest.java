package ncs.test2;

public class StringTest {

	public static void main(String[] args) {

		String str = " A, b, c, D, a, B, C, d, f, F";
		String[] st = str.split(",");

		// st[0] = " A"
		// st[1] = " b"
		// st[2] = " c"
		// st[3] = " D"
		
		char[] data = new char[st.length];

		int i = 0;
		for (String var : st) {
			data[i] = var.trim().charAt(0);
			i++;
		}

		i = 0;
		// 대문자만 출력
		while (i < data.length) {
			if (Character.isUpperCase(data[i])) {
				System.out.println(data[i]);
			}
			i++;
		}
//		String[] st = ;/* str에서 „, „ 으로 데이터를 분리한다. */ 

		// st 에서 char[] 로 바꾼다. char[] data = /* 배열 할당 선언 */;

//		for(){     //for~each 문 사용한다.   // char[] 배열에 문자 데이터를 넣는다.  }   
//		 
//		        // char[] 에서 대문자만 골라서 출력 한다. continue 문 사용할 것  while(){  }  //while loop 문 사용한다. 
//		
	}
}
