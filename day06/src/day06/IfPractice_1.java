package day06;

import java.util.Scanner;
import java.util.random.*;

public class IfPractice_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("if문 연습예제프로그램입니다.");
		System.out.println("실행할 프로그램의 번호를 입력하세요");
		System.out.println("1.홀/짝/0/음수 판별프로그램\n2.강의실안내\n3.가위바위보 게임");
		System.out.print("입력 >> ");
		int select = sc.nextInt();
		if (select == 1) {

			// if 문 [문제 1]
			// 숫자을 입력 받아 아래와 같이 출력 되는 프로그램을 만들어 보자
			System.out.println("짝/홀 판별 프로그램입니다.\n숫자를 입력해주세요.");
			System.out.print("숫자 >> ");
			int num = sc.nextInt();
//				입력받은 수가 양수 일 때 짝수 이면 "짝수" 출력
//				홀수이면 "홀수" 출력 음수이면 "음수" 출력 0이면 "0" 으로 출력 해보자  

			if (num >= 0) {
				if (num == 0) {
					System.out.println("0");
				} else if (num % 2 == 0) {
					System.out.println("짝수");
				} else {
					System.out.println("홀수");
				}
			} else {
				System.out.println("음수");
			}
			System.out.println("----프로그램 종료----");
		}

		if (select == 2) {
//			if ~ else if ~ else  [ 문제 2]
//					과목 번호를 입력 받아 강의실 번호를 출력하는 프로그램을 만들어보자
//					과목은 1.수학 2.과학 3.영어 4.역사
			System.out.println("과목번호를 입력하면 강의실을 알려줍니다.");
			System.out.println("1.수학 2.과학 3.영어 4.역사");
			System.out.print("해당하는 과목의 번호를 입력 >> ");
			int num = sc.nextInt();
//			String room = ""
//			과목 code 값이 
//			1이면 "101호 입니다"
//			2이면 "102호 입니다"
//			3이면 "203호 입니다"
//			4이면 " 202호 입니다"
//			나머지는 "상담원에게 문의 해주세요" 를 출력해보자 
			if (num == 1) {
				System.out.println("101호입니다.");
			} else if (num == 2) {
				System.out.println("102호입니다.");
			} else if (num == 3) {
				System.out.println("201호입니다.");
			} else if (num == 4) {
				System.out.println("202호입니다.");
			} else {
				System.out.println("상담원에게 문의해 주세요.");
			}
			System.out.println("----강의실 안내 프로그램 종료----");
		}

		if (select == 3) {

//			if ~ else if ~ else [문제 3]
//					가위 바위 보 게임 만들기 
			System.out.println("## 가위바위보 게임##");
			System.out.println("1.가위 2.바위 3.보");
			int com = (int) (Math.random() * 3) + 1; // 컴퓨터 가위바위보 랜덤
			int player = sc.nextInt(); // 플레이어 입력. 윗줄 코드와 자리 바꾸면 안 됨.

			String player_ = ""; // 플레이어 결과
			String com_ = ""; // 컴퓨터 결과

//			System.out.println(com); // 랜덤변수를 잘 받았는지 확인하는 코드
						
			if (player == 1) {
				player_ = "가위"; // 1 입력 = 가위 출력
			} else if (player == 2) {
				player_ = "바위"; // 2 입력 = 바위 출력
			} else if (player == 3) {
				player_ = "보"; // 3 입력 = 보 출력
			}
			System.out.println("플레이어 :" + player_);

			if (com == 1) {
				com_ = "가위";
			} else if (com == 2) {
				com_ = "바위";
			} else if (com == 3) {
				com_ = "보";
			}
			System.out.println("컴퓨터 : " + com_);

			if (player == com) {
				System.out.println("무승부");
			} else if (player == com + 1 || (player == 1/* 가위 */ && com == 3/* 보 */)) {
				System.out.println("플레이어 승");
			} else if (player + 1 == com || (player == 3 && com == 1)) {
				System.out.println("컴퓨터 승");
			}
			System.out.println("----게임 종료----");
		}

		if (select == 4) {
//			switch ~ case  [문제 4]

//					[숫자] 월을 입력받아 해당 월의 일수를 출력하는 프로그램 작성
//
//					1월 은 31일
//					2월 은 29일
//					3월 은 31일
//					4월 은 30일
//					5월 은 31일
//					6월 은 30일
//					7월 은 31일
//					8월 은 31일
//					9월 은 30일
//					10월 은 31일
//					11월 은 30일
//					12월 은 31일

			
			
		}

	}

}
