package day10;
import java.util.Scanner;
public class ArrayTask {
	public static void main(String[] args) {
		// 사용자에게 국어, 영어, 수학 점수를 입력 받아서
		// 평균 출력하기(배열활용)
		Scanner sc = new Scanner(System.in);
		String[] sub = { "국어", "영어", "수학" };
		int[] score = new int[3];
		double avr;
		int sum = 0;

		for (int i = 0; i < score.length; i++) {
			System.out.printf("%s 점수를 입력하세요\n", sub[i]);
			System.out.print("입력 >> ");
			score[i] = sc.nextInt();
			sum += score[i];
		}
		avr = (double) sum / score.length;
		System.out.printf("평균점수 : %.1f", avr);
		System.out.println();

		// 사용자에게 입력받을 정수의 개수를 입력받는다
		System.out.println("\n입력받을 정수의 개수를 입력하세요");
		System.out.print("입력 >> ");
		int num = sc.nextInt();
		int[] array = new int[num];
		System.out.println();
		// 그후 정수를 입력받아 배열에 담아준다
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d번째 배열 숫자 입력 >> ", i + 1);
			array[i] = sc.nextInt();
		}

		// 1. 배열에 담긴 요소들을 배열 모양으로 출력하기
		System.out.println("배열 모양으로 출력하기");
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.print(array[i] + " ");
			} else {
				System.out.print(array[i] + ", ");
			}
		}
		System.out.println();

		// 2. 배열 속 최댓값 출력하기
		int max = array[0];
//	for (int i = 0; i < array.length; i++) {
//		if (array[i] > max) {
//			max = array[i];
//		}
//	} // 반복문 끝
//	System.out.printf("최댓값 : %d", max);
//	System.out.println();

		// 3. 배열 속 최솟값 출력하기
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
			if (array[i] > max) {
				max = array[i];
			}
		} // 반복문 끝
		System.out.printf("최댓값 : %d", max);
		System.out.println();

		System.out.printf("최솟값 : %d", min);
		System.out.println();
	}
}
