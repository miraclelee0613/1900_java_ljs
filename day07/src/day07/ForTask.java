package day07;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 프로그램을 고르시오."
				+ "\n1. 이름을 [횟수]만큼 출력"
				+ "\n2. 사용자에게 [정수]를 입력받아 1부터 해당 정수까지 가로로 출력하기"
				+ "\n3. 10부터 1까지 가로로 출력하기"
				+ "\n4. 1부터 100까지의 숫자 중 짝수만 가로로 출력하기"
				+ "\n5. 사용자에게 [정수]를 입력받아 1부터 해당 수까지의 총합 출력하기"
				+ "\n6. 사용자에게 [단]을 입력받아 해당 구구단 출력하기"
				+ "\n7. 별출력하기");
		System.out.print("\n번호 입력 >> ");
		
		int num = sc.nextInt();
		switch(num) {
		case 1:
		
		
			// 1. 사용자에게 반복 횟수를 입력받아, 해당 횟수만큼 이름 출력하기

			// 입력예시
			// 반복횟수 >> 5
			System.out.print("반복횟수 >> ");
			int repeat = sc.nextInt();

			// 출력예시
			// 이준상
			// 이준상
			// 이준상
			// 이준상
			// 이준상

			for (int i = 0; i < repeat; i++) {
				System.out.println("이준상");
			}
			System.out.println("1번 프로그램 종료");
		break;
		case 2:
//
//		// 2. 사용자에게 정수를 입력받아 1부터 해당 정수까지 가로로 출력하기
//		
//		String res = "";
//		for(int i = 0; i < 10; i++) {
//			res += i + 1 + " ";// res = res + (i+1) + " ";
////			System.out.print(i + 1 + " ");
////			num++; //
//		}

		// 입력예시
		// 정수 >> 10
		System.out.print("정수 >> ");
		int int1 = sc.nextInt();
		// 출력예시
		// 1 2 3 4 5 6 7 8 9 10

		for (int i = 0; i < int1; i++) {
			System.out.print(i + 1 + " ");
		}
		System.out.println("2번 프로그램 종료");
		break;
		
		
		case 3:
		System.out.println("\n3. 10부터 1까지 가로로 출력");
		// 3. 10부터 1까지 가로로 출력하기
		// 10 9 8 7 6 5 4 3 2 1
		for (int i = 0; i < 10; i++) {
			System.out.print(10 - i + " ");
		}
		break;
		
		
		case 4:
		// 4. 1부터 100까지의 숫자 중 짝수만 가로로 출력하기
		System.out.println("\n1부터 100까지 짝수 나열");
		// 1번 방법
		System.out.println("1번 방법");
		for (int i = 0; i < 100; i = i++) {
			System.out.print(++i * 2 + " ");
			if (i == 50) {
				break;
			}
		}

		System.out.println("\n2번 방법");

		// 2번 방법
		for (int i = 0; i < 100; i++) {
			System.out.print(++i + 1 + " ");
		}

		// 번외 99까지 홀수 가로 출력
//		for (int i = 0; i < 100; i++) {
//			System.out.print(i++ + 1 + " ");
//		}
		break;

		case 5:
		// 5. 사용자에게 정수를 입력받아 1부터 해당 수까지의 총합 출력하기
		{
			System.out.print("\n(합연산)정수 입력 >> ");

			int input = sc.nextInt();
			int sum = 0;

			for (int i = 0; i < input; i++) {
				sum = sum + i;
//				System.out.print("sum = " + sum + " ");	// 확인코드
//				System.out.println("i = " + i + " ");	// 확인코드
			}
			System.out.println(sum + input);
		}
		break;
		
		case 6:
		// 6. 사용자에게 단을 입력받아 해당 구구단 출력하기
		System.out.print("\n단 입력 >> ");
		int dan = sc.nextInt();
		// ---3단---
		// 3x1 = 3
		// 3x2 = 6
		// ...
		// 3x9 = 27
		System.out.printf("\n---%d단---\n", dan);

		for (int i = 0; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", dan, i + 1, dan * (i + 1));
		}
		break;
		
		case 7:
		// 7. 별출력하기
		// *
		// **
		// ***
		// ****
		System.out.println("--------------");
		for (int i = 0; i < 4; i++) {
			switch (i) {
			case 3:
				System.out.print("*");
			case 2:
				System.out.print("*");
			case 1:
				System.out.print("*");
			case 0:
				System.out.println("*");
			}
		}
		// System.out.println("별 좌측 정렬 종료");
		// *
		// **
		// ***
		// ****
		System.out.println("--------------");
		for (int i = 0; i < 4; i++) {
			switch (i) {
			case 0:
				System.out.print(" ");
			case 1:
				System.out.print(" ");
			case 2:
				System.out.print(" ");
			case 3:
				System.out.print(" ");
			}
			switch (i) {
			case 3:
				System.out.print("*");
			case 2:
				System.out.print("*");
			case 1:
				System.out.print("*");
			case 0:
				System.out.println("*");
			}
		}
//	System.out.println("별 우측 정렬 종료");
	break;
		default:
			System.err.println("잘못된 입력입니다. 프로그램을 종료합니다.");
		}

	}

}