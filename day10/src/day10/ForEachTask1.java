package day10;

import java.util.Scanner;

public class ForEachTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ����ڿ��� �Է¹��� ������ ������ �Է¹޴´�
		System.out.println("\n�Է¹��� ������ ������ �Է��ϼ���");
		System.out.print("�Է� >> ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		System.out.println();
		// ���� ������ �Է¹޾� �迭�� ����ش�
//for (int i = 0; i < arr.length; i++) {
//	System.out.printf("%d��° �迭 ���� �Է� >> ", i + 1);
//	arr[i] = sc.nextInt();
//}
		String nums;
		for (int ar : arr) {
			System.out.printf("%d��° �迭�� ���� �Է� >> ", ar + 1);
			ar = sc.nextInt();
		}

//// 1. �迭�� ��� ��ҵ��� �迭 ������� ����ϱ�
//System.out.println("�迭 ������� ����ϱ�");
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
		System.out.printf("�ִ� : %d", max);

//// 2. �迭 �� �ִ� ����ϱ�
//int max = array[0];
////for (int i = 0; i < array.length; i++) {
////	if (array[i] > max) {
////		max = array[i];
////	}
////} // �ݺ��� ��
////System.out.printf("�ִ� : %d", max);
////System.out.println();
//
//// 3. �迭 �� �ּڰ� ����ϱ�
//int min = array[0];
//for (int i = 0; i < array.length; i++) {
//	if (array[i] < min) {
//		min = array[i];
//	}
//	if (array[i] > max) {
//	max = array[i];
//	}
//}	// �ݺ��� ��
//System.out.printf("�ִ� : %d", max);
//System.out.println();
//
//System.out.printf("�ּڰ� : %d", min);
//System.out.println();
	}
}
