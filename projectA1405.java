package projectA04;

import java.util.Scanner;

public class projectA1405 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("5의 배수를 입력하세요");
		int i =in.nextInt();
		
		if(i%5==0) {
			System.out.println("5의 배수입니다.");
		}else {
			System.out.println("5의 배수가 아닙니다.");
		}
		
in.close();
	}

}
