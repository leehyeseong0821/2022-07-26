package projectA04;

import java.util.Scanner;

public class projectA1420 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int time = in.nextInt();
		
		
		int 시간 = (time/60)/60;
		int 분 = (time/60)%60;
		int 초 = time/60;
		
		System.out.println(time+"초는");
		System.out.println(시간+"시간");
		System.out.println(분+"분");
		System.out.println(초+"초 입니다.");
       in.close();
	}

}
