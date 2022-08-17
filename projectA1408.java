package projectA04;

import java.util.Scanner;

public class projectA1408 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("2자리 정수 입력(10~99)");
		int n=in.nextInt();
		
		if(n<10||n>99) {
			System.out.println("10~99사이의 정수만 입력하세요");
			in.close();
			return;
		}
		
		
		int ten =n/10;
 		int one =n%10; //% 나머지 
		
		if(ten==one) {
			System.out.println("Yes 10의 자리와 1의 자리가 같습니다");
		}else {
			System.out.println("NO 10의 자리와 1의 자리가 다릅니다.");
		}
		in.close();
		

	}

}
