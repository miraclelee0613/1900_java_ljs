package day10;
import java.util.Scanner;
public class ArrayTask {
	public static void main(String[] args) {
		// ����ڿ��� ����, ����, ���� ������ �Է� �޾Ƽ�
		// ��� ����ϱ�(�迭Ȱ��)
		Scanner sc = new Scanner(System.in);
		String[] sub = { "����", "����", "����" };
		int[] score = new int[3];
		double avr;
		int sum = 0;

		for (int i = 0; i < score.length; i++) {
			System.out.printf("%s ������ �Է��ϼ���\n", sub[i]);
			System.out.print("�Է� >> ");
			score[i] = sc.nextInt();
			sum += score[i];
		}
		avr = (double) sum / score.length;
		System.out.printf("������� : %.1f", avr);
		System.out.println();

		// ����ڿ��� �Է¹��� ������ ������ �Է¹޴´�
		System.out.println("\n�Է¹��� ������ ������ �Է��ϼ���");
		System.out.print("�Է� >> ");
		int num = sc.nextInt();
		int[] array = new int[num];
		System.out.println();
		// ���� ������ �Է¹޾� �迭�� ����ش�
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d��° �迭 ���� �Է� >> ", i + 1);
			array[i] = sc.nextInt();
		}

		// 1. �迭�� ��� ��ҵ��� �迭 ������� ����ϱ�
		System.out.println("�迭 ������� ����ϱ�");
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.print(array[i] + " ");
			} else {
				System.out.print(array[i] + ", ");
			}
		}
		System.out.println();

		// 2. �迭 �� �ִ� ����ϱ�
		int max = array[0];
//	for (int i = 0; i < array.length; i++) {
//		if (array[i] > max) {
//			max = array[i];
//		}
//	} // �ݺ��� ��
//	System.out.printf("�ִ� : %d", max);
//	System.out.println();

		// 3. �迭 �� �ּڰ� ����ϱ�
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
			if (array[i] > max) {
				max = array[i];
			}
		} // �ݺ��� ��
		System.out.printf("�ִ� : %d", max);
		System.out.println();

		System.out.printf("�ּڰ� : %d", min);
		System.out.println();
	}
}
