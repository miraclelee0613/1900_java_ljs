package day10;

import java.util.Scanner;

public class ForEachTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 사용자에게 입력받을 정수의 개수를 입력받는다
		System.out.println("\n입력받을 정수의 개수를 입력하세요");
		System.out.print("입력 >> ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		System.out.println();
		// 그후 정수를 입력받아 배열에 담아준다
//for (int i = 0; i < arr.length; i++) {
//	System.out.printf("%d번째 배열 숫자 입력 >> ", i + 1);
//	arr[i] = sc.nextInt();
//}
		String nums;
		for (int ar : arr) {
			System.out.printf("%d번째 배열의 숫자 입력 >> ", ar + 1);
			ar = sc.nextInt();
		}

//// 1. 배열에 담긴 요소들을 배열 모양으로 출력하기
//System.out.println("배열 모양으로 출력하기");
//for (int i = 0; i < array.length; i++) {
//	if (i == array.length - 1) {
//		System.out.print(array[i] + " ");
//	} else {
//		System.out.print(array[i] + ", ");
//	}
//}
//System.out.println();
		int max = arr[0];
		for (int ar : arr) {
			if (ar > max) {
				max = ar;
			}
		}
		System.out.printf("최댓값 : %d", max);

//// 2. 배열 속 최댓값 출력하기
//int max = array[0];
////for (int i = 0; i < array.length; i++) {
////	if (array[i] > max) {
////		max = array[i];
////	}
////} // 반복문 끝
////System.out.printf("최댓값 : %d", max);
////System.out.println();
//
//// 3. 배열 속 최솟값 출력하기
//int min = array[0];
//for (int i = 0; i < array.length; i++) {
//	if (array[i] < min) {
//		min = array[i];
//	}
//	if (array[i] > max) {
//	max = array[i];
//	}
//}	// 반복문 끝
//System.out.printf("최댓값 : %d", max);
//System.out.println();
//
//System.out.printf("최솟값 : %d", min);
//System.out.println();
	}
}
