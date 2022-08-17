package projectA04;

import java.util.Scanner;

public class projectA1416 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		char grade;
		System.out.println("점수를 입력하세요(0~100):");
		int score = in.nextInt();
		
		switch(score/10) {
		case 10://score 100
		case 9://score99~90
			grade='A';
			break;
		case 8://score89~80
			grade='B';
			break;
		case 7://score79~70
		    grade='C';
		    break;
		case 6: //score 69~60
			grade='D';
			break;
			default:
				grade='F';
				break;	
		}
		System.out.println(grade+"학점 입니다.");
		

	}

}
