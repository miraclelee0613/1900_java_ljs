package day05;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 4. 노래 한 곡당 300원인 코인노래방이 있다. 사용자에게 금액을 입력 받고,
		// 부를 수 있는 노래 곡수와 잔돈을 출력하라
		// 입력예시
		// 금액입력 >> 1600

//		int price = 300;

//		System.out.print("금액입력 >> ");
//		int money = sc.nextInt();

		// 출력예시
		// 부를 수 있는 노래 : 5곡
		// 잔돈 100원이 반환되었습니다
//		  System.out.println("부를 수 있는 노래 : " + money / price + "곡");
//		  System.out.println("잔돈 " + money % price + "원이 반환되었습니다.");

		// 5. 사용자에게 국어, 영어, 수학 점수를 입력 받아서 평균을 출력하라(단, 점수는 정수로 입력받는다)
		// 입력예시
		// 국어점수 >> 80
		// 영어점수 >> 80
		// 수학점수 >> 81
		System.out.print("국어점수 >> ");
		double kor = sc.nextInt();
		System.out.print("영어점수 >> ");
		double eng = sc.nextInt();
		System.out.print("수학점수 >> ");
		double math = sc.nextInt();

		// 출력예시
		// 당신의 평균점수는 80.33점 입니다
//		 System.out.println("당신의 평균점수는 " + (kor + eng + math) / 3.0 + "점입니다.");
		System.out.printf("당신의 평균점수는 %.2f점입니다\n", (kor + eng + math) / 3.0);
//		 System.out.printf("당신의 평균점수는 %.2f점입니다\n", (double)(kor + eng + math) / 3.0);

	}

}
