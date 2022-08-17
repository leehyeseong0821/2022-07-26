package projectA04;

import java.util.Scanner;

public class projectA1411 {

	public static void main(String[] args) {
		int a =100;
		int b =50;
		Scanner in = new Scanner(System.in);
		System.out.println((double)(a/b));
		
		int c =a/b;
		
//		c의 값이 5의 배수인지 아닌지 두번 비교 하도록 하시오.
		
		if(c%5==0) {
			System.out.println("5의 배수입니다.");
		}
		if(c%5!=0) {
			System.out.println("5의 배수가아닙니다.");
		}
		if(c%5==0) {
			System.out.println("5의 배수입니다.");
		}else {
			System.out.println("5의 배수가아닙니다.");
		}

	}

}
