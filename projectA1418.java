package projectA04;

import java.util.Scanner;

public class projectA1418 {

	public static void main(String[] args) {
		int 등급=2;
		switch(등급) {
		case 1:
			System.out.println("1등급");
		  break;
		case 2:
			System.out.println("2등급");
			break;
		case 3:
			System.out.println("3등급");
			break;
			default:
				System.out.println("등급이 없습니다.");
			break;
		}
//			if문으로 바꿔보시오
			if(등급==1) {
				System.out.println("1등급");
			}else if(등급==2) {
			System.out.println("2등급");
			}else if(등급==3) {
				System.out.println("3등급");
			}else {
				System.out.println("등급이 없습니다.");
			}
			
			
		}

	}


