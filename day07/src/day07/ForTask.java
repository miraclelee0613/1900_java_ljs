package day07;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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

		// 2. 사용자에게 정수를 입력받아 1부터 해당 정수까지 가로로 출력하기
		
		String res = "";
		for(int i = 0; i < 10; i++) {
			res += i + 1 + " ";// res = res + (i+1) + " ";
//			System.out.print(i + 1 + " ");
//			num++; //
		}
		
		
		
		
		
		
		
		// 입력예시
		// 정수 >> 10
		System.out.print("정수 >> ");
		int int1 = sc.nextInt();
		// 출력예시
		// 1 2 3 4 5 6 7 8 9 10

		for (int i = 0; i < int1; i++) {
			System.out.print(i + 1);
		}

		// 3. 10부터 1까지 가로로 출력하기
		// 10 9 8 7 6 5 4 3 2 1

		for (int i = 0; i > 0; i++) {
			System.out.print(10 - i);
		}
		System.out.println("");
		// 4. 1부터 100까지의 숫자 중 짝수만 가로로 출력하기

		for (int i = 0; i < 100; i = i + 2) {
			System.out.println(i + 2);
			// if(i == 100){
			// break;
			// }
		}
		System.out.println("");
		// 5. 사용자에게 정수를 입력받아 1부터 해당 수까지의 총합 출력하기
		System.out.print("정수 입력 >> ");
		int int2 = sc.nextInt();
		for (int i = 0; i < int2; i++) {
			System.out.println((i + (i + 1)));
		}

		// 6. 사용자에게 단을 입력받아 해당 구구단 출력하기
		System.out.print("단 입력 >> ");
		int dan = sc.nextInt();
		// ---3단---
		// 3x1 = 3
		// 3x2 = 6
		// ...
		// 3x9 = 27
		System.out.printf("---%d단---\n", dan);

		for (int i = 0; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", dan, i + 1, dan * (i + 1));
		}

		// 7. 별 출력하기
		// *
		// **
		// ***
		// ****

//		for(int i = 0; i < 4; i++) {
//			System.out.print("*");
//			for(int i2 = 0; i2 < 4; i2++) {
//				System.out.print(" ");
//			}
//			System.out.println("");
//		}

		for (int i = 0; i < 4; i++) {
			for (int i2 = 0; i2 < i + 1; i2++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		//    *
		//   **
		//  ***
		// ****
		
		for(int i = 0; i < 4; i++) {
			for(int i2 = 0; i2 < i; i2++) {
				System.out.print(" ");
			}
			for(int i2 = 0; i2 < i; i2++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
