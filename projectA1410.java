package projectA04;

import java.util.Scanner;

public class projectA1410 {

	public static void main(String[] args) {
	     Scanner in =new Scanner(System.in);
	     System.out.println("정수를 입력하세요:");
	     int number = in.nextInt();
	     
//	     10의 배수인지 아닌지를 비교하여 10의 배수이면 10의 배수입니다.
//	     10의 배수가 아니면 10의 배수가 아닙니다.
	     if(number%10==0) {
	    	 System.out.println("10의 배수입니다.");
	     }else {
	    	 System.out.println("10의 배수가아닙니다.");
	     }

	}

}
