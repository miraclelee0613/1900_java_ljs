<<<<<<< HEAD
package day06;

import java.util.Scanner;

public class IfTask1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("실행하려는 프로그램의 번호를 입력하세요.");
		System.out.println("1.학점계산프로그램\n2.학점세분화프로그램\n3.윤년계산프로그램");
		int num = sc.nextInt();
		char stScore = 'n';
		if (num == 1) {

			System.out.println("학점을 알려주는 프로그램입니다.");
			// 사용자에게 점수를 입력받는다(정수)

			System.out.println("점수 입력(정수) >> ");
			int score = sc.nextInt();
			if (score >= 90) {
				stScore = 'A'; // 90이상 A

			} else if (score >= 80) {
				stScore = 'B'; // 80이상 90미만 B
			} else if (score >= 70) {
				stScore = 'C'; // 70이상 80미만 C
			} else {
				stScore = 'F'; // 70미만 F
			}

//		당신의 학점은 0입니다
			System.out.println("당신의 학점은 " + stScore + "입니다.");
		} else if (num == 2) {
			System.out.println("학점 세분화 프로그램입니다.");
			System.out.print("점수 입력(정수) >> ");
			int score = sc.nextInt();


			if (score >= 90) 
			{
				stScore = 'A'; // 90이상 A

			} else if (score >= 80) {
				stScore = 'B'; // 80이상 90미만 B
			} else if (score >= 70) {
				stScore = 'C'; // 70이상 80미만 C
			} else {
				stScore = 'F'; // 70미만 F
			}

			// 일의자리가 8보다 크거나 같으면 +를 붙이고
			// 일의자리가 2보다 작거나 같으면 -를 붙임

			String pm = "";			// +와 -를 넣을 자리
			int scorepm = score % 10;// 일의자리를 구하는 코드
			if (score == 100) {		// 100점은 10으로 나눴을 때 0이 나오므로
				pm = "+";			// 따로 설정을 해줘야 함.
			} else if (scorepm >= 8 || scorepm <= 2) // 일의 자리가
			{
				if (scorepm >= 8) {	// 일의자리가 8보다 크거나 같은 경우
					pm = "+";
				} else if (scorepm <= 2) {	// 일의자리가 2보다 작거나 같은 경우
					pm = "-";
				}
				
			}	// 일의자리가 위의 두 경우가 아닐 경우 '!(scorepm <= && scorepm >= 8)' 등급만 나오게 함.
			
			System.out.println("당신의 학점은 " + stScore + pm + "입니다.");

		} else if (num == 3) {
			//		사용자에게 연도를 입력받는다
			System.out.println("윤년여부를 알려주는 프로그램입니다.");
			System.out.print("연도 입력 >> ");
			int year = sc.nextInt();

			//		해당 연도가 윤년이라면 윤년, 아니라면 윤년이 아니라고 출력하기
			//		4의배수 : 윤년
			//		4의배수O 100의배수 :윤년X(평년)
			//		4의배수O 100의배수O 400의배수 : 윤년
			
			String yy = "";
			if (year % 400 == 0) 
			{
				// 햇수가 400의 배수일 경우
				yy = "윤년입니다.";
			} else if (year % 100 == 0) {
				// 햇수가 100의 배수지만 400의 배수는 아닌 경우
				yy = "윤년이 아닙니다.";
			} else if (year % 4 == 0) {
				// 햇수가 4의 배수지만 100의 배수는 아닌 경우
				yy = "윤년입니다.";
			} else {
				// 햇수가 4의 배수가 아닌 경우
				yy = "윤년이 아닙니다.";
			}
			System.out.println(year + "년은 " + yy);
		} else {
			System.err.println("error - 잘못된 입력입니다.\n프로그램을 종료합니다.");
			// 프로그램 지정 숫자인 1, 2, 3이 아닌 다른 입력을 받을 경우 에러메시지 출력
		}
		System.out.println("---------프로그램 종료---------");
	}

}
=======
package day06;

import java.util.Scanner;

public class IfTask1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("실행하려는 프로그램의 번호를 입력하세요.");
		System.out.println("1.학점계산프로그램\n2.학점세분화프로그램\n3.윤년계산프로그램");
		int num = sc.nextInt();
		char stScore = 'n';
		if (num == 1) {

			System.out.println("학점을 알려주는 프로그램입니다.");
			// 사용자에게 점수를 입력받는다(정수)

			System.out.println("점수 입력(정수) >> ");
			int score = sc.nextInt();
			if (score >= 90) {
				stScore = 'A'; // 90이상 A

			} else if (score >= 80) {
				stScore = 'B'; // 80이상 90미만 B
			} else if (score >= 70) {
				stScore = 'C'; // 70이상 80미만 C
			} else {
				stScore = 'F'; // 70미만 F
			}

//		당신의 학점은 0입니다
			System.out.println("당신의 학점은 " + stScore + "입니다.");
		} else if (num == 2) {
			System.out.println("학점 세분화 프로그램입니다.");
			System.out.print("점수 입력(정수) >> ");
			int score = sc.nextInt();

			// 일의자리 >= 8 ? +
			// 일의자리 <= 2 ? -
			int scorepm = score % 10;
			if (score >= 90) 
			{
				stScore = 'A'; // 90이상 A

			} else if (score >= 80) {
				stScore = 'B'; // 80이상 90미만 B
			} else if (score >= 70) {
				stScore = 'C'; // 70이상 80미만 C
			} else {
				stScore = 'F'; // 70미만 F
			}
			String pm = "";
			if (score == 100) {
				pm = "+";
			} else if (scorepm >= 8 || scorepm <= 2) 
			{
				if (scorepm >= 8) {
					pm = "+";
				} else if (scorepm <= 2) {
					pm = "-";
				}
				
			}
			System.out.println("당신의 학점은 " + stScore + pm + "입니다.");

		} else if (num == 3) {
//		사용자에게 년도를 입력받는다
			System.out.println("윤년여부를 알려주는 프로그램입니다.");
			System.out.print("연도 입력 >> ");
			int year = sc.nextInt();

//		해당 년도가 윤년이라면 윤년, 아니라면 윤년이 아니라고 출력하기
//		4의배수 : 윤년
//		4의배수O 100의배수 :윤년X(평년)
//		4의배수O 100의배수O 400의배수 : 윤년
			String yy = "";
			if (year % 400 == 0) {
				yy = "윤년입니다.";
			} else if (year % 100 == 0) {
				yy = "윤년이 아닙니다.";
			} else if (year % 4 == 0) {
				yy = "윤년입니다.";
				;
			} else {
				yy = "윤년이 아닙니다.";
			}
			System.out.println(year + "년은 " + yy);
		} else {
			System.out.println("잘못된 입력입니다.\n프로그램을 종료합니다.");
		}
		System.out.println("---------프로그램 종료---------");
	}

}
>>>>>>> refs/remotes/origin/master
