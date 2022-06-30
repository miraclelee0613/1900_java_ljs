<<<<<<< HEAD
package day08;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		// 3. 10 부터 1까지 가로로 출력하기
		// 10 9 8 7 6 5 4 3 2 1

		Scanner sc = new Scanner(System.in);
		int num = 10;
		for (int i = 0; i < 10; i++) {
			System.out.print(num + " ");
			num--; // num = num -1;
		}
		System.out.println();

		for (int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 0; i < 10; i++) {
			System.out.print(10 - i + " ");
		}
		System.out.println();

		String res = "";
		for (int i = 0; i < 10; i++) {
			res += 10 - i + " "; // res = res + (10 - i) + " ";
		}
		System.out.println("결과 : " + res);
		// 4. 1부터 100까지의 숫자 중 짝수만 가로로 출력하기

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				continue; // 즉시 다음 반복을 실행한다.
			}
		}
		System.out.println();

		for (int i = 2; i <= 100; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 0; i <= 50; i++) {
			System.out.print((i + 1) * 2 + " ");
		}
		System.out.println();

		// 5. 사용자에게 정수를 입력 받아 1부터 해당 수까지의 총합 출력하기
//		System.out.print("입력 >> ");
//		int input = sc.nextInt();
//		int sum = 0;
//		for(int i = 1; i <= input; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//		
//System.out.println(((input + 1) * input) / 2);

		// 6. 사용자에게 단을 입력 받아 해당 구구단 출력하기
		// ---3단---
		// 3x1=3
		// 3x2=6
		// ...
		// 3x9=27
//		{
//			System.out.print("단 입력 >> ");
//			int dan = sc.nextInt();
//			for (int i = 0; i < 9; i++) {
//				System.out.printf("%d x %d = %d\n", dan, (i+1), dan * (i+1));
//			}
//
//		}

		// 7. 별출력하기
		// *
		// **
		// ***
		// ****
		String star = "*";
		for (int i = 0; i < 4; i++) {
			System.out.println(star);
			star += "*";
		}
		
		
		// *
		// **
		// ***
		// ****
		star = "*";
		for (int i = 0; i < 4; i++) {
			System.out.printf("%4s\n", star);
			star += "*";
		}
		
		
		
		
		
		
	}

}
=======
package day08;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		// 3. 10 부터 1까지 가로로 출력하기
		// 10 9 8 7 6 5 4 3 2 1

		Scanner sc = new Scanner(System.in);
		int num = 10;
		for (int i = 0; i < 10; i++) {
			System.out.print(num + " ");
			num--; // num = num -1;
		}
		System.out.println();

		for (int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 0; i < 10; i++) {
			System.out.print(10 - i + " ");
		}
		System.out.println();

		String res = "";
		for (int i = 0; i < 10; i++) {
			res += 10 - i + " "; // res = res + (10 - i) + " ";
		}
		System.out.println("결과 : " + res);
		// 4. 1부터 100까지의 숫자 중 짝수만 가로로 출력하기

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				continue; // 즉시 다음 반복을 실행한다.
			}
		}
		System.out.println();

		for (int i = 2; i <= 100; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 0; i <= 50; i++) {
			System.out.print((i + 1) * 2 + " ");
		}
		System.out.println();

		// 5. 사용자에게 정수를 입력 받아 1부터 해당 수까지의 총합 출력하기
//		System.out.print("입력 >> ");
//		int input = sc.nextInt();
//		int sum = 0;
//		for(int i = 1; i <= input; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//		
//System.out.println(((input + 1) * input) / 2);

		// 6. 사용자에게 단을 입력 받아 해당 구구단 출력하기
		// ---3단---
		// 3x1=3
		// 3x2=6
		// ...
		// 3x9=27
//		{
//			System.out.print("단 입력 >> ");
//			int dan = sc.nextInt();
//			for (int i = 0; i < 9; i++) {
//				System.out.printf("%d x %d = %d\n", dan, (i+1), dan * (i+1));
//			}
//
//		}

		// 7. 별출력하기
		// *
		// **
		// ***
		// ****
		String star = "*";
		for (int i = 0; i < 4; i++) {
			System.out.println(star);
			star += "*";
		}
		
		
		// *
		// **
		// ***
		// ****
		star = "*";
		for (int i = 0; i < 4; i++) {
			System.out.printf("%4s\n", star);
			star += "*";
		}
		
		
		
		
		
		
	}

}
>>>>>>> refs/remotes/origin/master
