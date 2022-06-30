package day04;

import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 사용자에게 나이를 입력 받아서 10 년 후의 나이를 계산하여 출력하라
		// 입력 예시
		// 나이 >> 27
		// 출력 예시
		// 10년 후 당신의 나이는 37살입니다.

//		System.out.print("나이 >> ");	// 안내문구
//		int age = sc.nextInt();	// 나이 입력
//
//		age = age + 10; // age에 10을 직접 추가
//
//		System.out.println("10년 후 당신의 나이는 " + age + "살입니다.\n");	// 변수 선언으로 최종 나이 출력
//
//		System.out.println("10년 후 당신의 나이는 " + (age + 10) + "살입니다.\n");	// 괄호를 활용
//		

//		System.out.print("\n나이 >> ");	// 안내문구
//		int age = sc.nextInt();	// 현재나이 입력
//
//		System.out.print("더할 나이 >>");	// 안내문구
//		int old = sc.nextInt();	// 더할 나이 입력
//		age = age + old;	// 현재나이 + 더할 나이
//		System.out.println(old + "년 후 당신의 나이는 " + age + "살입니다.");	// 더할 나이도 입력하는 코드

		// 2. 사용자에게 정수 하나를 입력 받아서, 5로 나누었을 때 몫과 나머지를 출력하라
		// 입력 예시
		// 정수 >> 27
		// 출력 예시
		// 27을 5로 나눈 몫은 5, 나머지는 2입니다.

//
//		System.out.print("정수 >> ");
//			int num1 = sc.nextInt();
//			int quot5 = num1 / 5;		// 입력한 값을 5로 나눈 몫
//			int rem5 = num1 % 5;		// 입력한 값을 5로 나눴을 때 나머지
//			
//		System.out.println(num1 + "을 5로 나눈 몫은 "	+ quot5 
//								+ ", 나머지는 "		+ rem5 + "입니다.\n");

//		System.out.print("정수 >> ");
//		int sc1 = sc.nextInt();
//
//		System.out.println("나눌 값 >> ");
//		int sc2 = sc.nextInt();
//		
//		int sc1_1 = sc1 / sc2;
//		int sc1_2 = sc1 % sc2;

//		System.out.println(sc1 + "을 " + sc2 + "로 나눈 몫은 " + sc1_1 + ", 나머지는 " + sc1_2 + "입니다.");

		// 3. 사용자에게 두 자릿수 정수를 입력 받아서, 십의 자리와 일의 자리를 각각 출력하라
		// 입력 예시
		// 정수 >> 85
		// 출력 예시
		// 십의자리 : 8
		// 일의자리 : 5

		System.out.print("\n정수 >> ");
		int numb1 = sc.nextInt();
		int numbs10 = numb1 / 10;
		int numbs1 = numb1 % 10;

		System.out.println("십의 자리 : " + numbs10);
		System.out.println("일의 자리 : " + numbs1);

		// 4. 노래 한 곡당 300원인 코인노래방이 있다. 사용자에게 금액을 입력 받고,
		// 부를 수 있는 노래 곡수와 잔돈을 출력하라.
		// 입력 예시
		// 금액 입력 >> 1600
		// 출력 예시
		// 부를 수 있는 노래 : 5 곡
		// 잔돈 100원이 반환되었습니다.
		int price = 300;
		System.out.print("\n금액 입력 >>");
		int won = sc.nextInt();
		int song = won / price;
//		int song = won / 300;

		System.out.println("부를 수 있는 노래 : " + song + "곡");

		int etc = won % price;
//		int etc = won % 300;
		System.out.println("잔돈 " + etc + "원이 반환되었습니다.\n");

		// 5. 사용자에게 국어, 영어, 수학 점수를 입력 받아서 평균을 출력하라(단, 점수는 정수로 입력받는다.)
		// 입력 예시
		// 국어점수 >> 80
		// 영어점수 >> 80
		// 수학점수 >> 81
		// 출력 예시
		// 당신의 평균점수는 80.33점입니다.

		System.out.print("국어점수 >> ");
		double kor = sc.nextInt();
		System.out.print("\n영어점수 >> ");
		double eng = sc.nextInt();
		System.out.print("\n수학점수 >> ");
		double mat = sc.nextInt();

		double aver = (kor + eng + mat) / 3;

		System.out.printf("당신의 평균점수는 %.2f점입니다.", aver);

	}

}
