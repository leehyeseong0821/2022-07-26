package projectA04;

import java.util.Scanner;

public class projectA1412 {

	public static void main(String[] args) {
		String grade;
		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하시오(0~100):");
		int score = in.nextInt();
		
		if(score<=100 && score >=95) {
			grade ="A++";
		}else if(score<=94 &&score >=90) {
			grade ="A";
		}else if(score<=89 &&score>=85) {
			grade ="B++";
		}else if(score<=84 &&score>=80) {
			grade ="B";
		}else if(score<=79 &&score>=71) {
			grade ="C++";
		}else if(score>=70) {
			grade ="C";
		}else if(score<=69 && score>=61) {
			grade ="D";
		}else {
			grade ="F";
		}
		
		System.out.println("학점은:"+grade+"입니다.");

	}

}
