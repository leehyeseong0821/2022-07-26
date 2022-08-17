package projectA04;

import java.util.Scanner;

public class projectA1415 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int a=1;
		int b=2;
		int c=2;
		int d=1;
        
		if((a+b)==(c+d)) {
			System.out.println("두수의 합은 같다.");
		}else {
			System.out.println("두수의 합은 다르다.");
			
		}
//		문자비교 
		if('A'=='B') {
			System.out.println("같은 문자입니다.");
		}else if('A'=='A') {
			System.out.println("같은 문자입니다.");
		}
		
		if("test"=="test") { //이렇게쓰면안댐
			System.out.println("test");
		}
		
		if("test".equals("test")) {
			System.out.println("문자열이 같습니다.");
		}
		String str="ABCD";
		
		if(str.equals("ABCD")) {
			System.out.println("같습니다.");
		}
		
	}

}
