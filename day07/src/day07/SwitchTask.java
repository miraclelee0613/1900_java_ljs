package day07;

import java.util.Scanner;

public class SwitchTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		 사용자에게 점수를 입력받고(단 점수는 0 ~ 100 사이의 정수만 입력 받는다) 
//		System.out.print("점수 입력 >> ");
//		int score = sc.nextInt();
		// 90이상 100점이라면 A
		// 80이상 90미만이라면 B
		// 70이상 80미만이라면 C
		// 70미만이라면 F
//		switch(score) {
//		case 100: case 99:case 98:case 97:case 96:case 95:case 94:case 93:case 92:case 91:case 90:
//			System.out.println("A");
//			break;
//		case 89:case 88:case 87:case 86:case 85:case 84:case 83:case 82:case 81:case 80:
//			System.out.println("B");
//			break;
//		case 79:case 78:case 77:case 76:case 75:case 74:case 73:case 72:case 71:case 70:
//			System.out.println("C");
//			break;
//		default :
//			System.out.println("F");
//			}
//
//		String grade = "";
//		switch(score/10) 
//		{
//		case 10, 9:	// case 10: case 9:
////			System.out.println("A");
//			grade = "A";
//			break;
//		case 8:
////			System.out.println("B");
//			grade = "B";
//			break;
//		case 7:
////			System.out.println("C");
//			grade = "C";
//			break;
//			default:
//				grade = "F";
////		case 6: case 5: case 4: case 3: case 2: case 1: case 0:
////			System.out.println("F");
//			break;
//		}
//		System.out.println("당신의 학점은 " + grade + "입니다.");
//		
//	}
		
		
		
//		  사용자에게 월을 입력받고, 해당 월의 마지막 일을 출력하기 (2월은 28일이 마지막이라고 가정한다)
		System.out.println("월 입력 >> ");
		int month = sc.nextInt();
		
		int lastday = 0;
		
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12:
			lastday = 31;
		break;
		case 2:
			lastday = 28;
			break;
		case 4,6,9,11:
			lastday = 30;
		break;
		default:
			System.err.println("잘못 입력했습니다.");
			break;
		}
//		if(month >= 1 && month <=12) {
		if(lastday != 0) {	// 잘못 입력하지 않았다면
			System.out.println(month + "월의 마지막 날은 " + lastday + "입니다.");
		}

		
		
		
		
	}

}
