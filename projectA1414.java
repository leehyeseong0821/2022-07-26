package projectA04;

import java.util.Scanner;

public class projectA1414 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int num =in.nextInt();
		//100~95 A++
		//94~90 A
		//89~85 B++
		//84~80 B
		//C
		
		if(num<=100 && num>=95 ) {
			System.out.println("A++");
		}else if(num<=94 && num>=90) {
			System.out.println("A");
		}else if(num<=89 && num>=85) {
			System.out.println("B++");
		}else if(num<=84 && num>=80) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}
        in.close();
	}

}
