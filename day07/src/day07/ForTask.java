package day07;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���α׷��� ���ÿ�."
				+ "\n1. �̸��� [Ƚ��]��ŭ ���"
				+ "\n2. ����ڿ��� [����]�� �Է¹޾� 1���� �ش� �������� ���η� ����ϱ�"
				+ "\n3. 10���� 1���� ���η� ����ϱ�"
				+ "\n4. 1���� 100������ ���� �� ¦���� ���η� ����ϱ�"
				+ "\n5. ����ڿ��� [����]�� �Է¹޾� 1���� �ش� �������� ���� ����ϱ�"
				+ "\n6. ����ڿ��� [��]�� �Է¹޾� �ش� ������ ����ϱ�"
				+ "\n7. ������ϱ�");
		System.out.print("\n��ȣ �Է� >> ");
		
		int num = sc.nextInt();
		switch(num) {
		case 1:
		
		
			// 1. ����ڿ��� �ݺ� Ƚ���� �Է¹޾�, �ش� Ƚ����ŭ �̸� ����ϱ�

			// �Է¿���
			// �ݺ�Ƚ�� >> 5
			System.out.print("�ݺ�Ƚ�� >> ");
			int repeat = sc.nextInt();

			// ��¿���
			// ���ػ�
			// ���ػ�
			// ���ػ�
			// ���ػ�
			// ���ػ�

			for (int i = 0; i < repeat; i++) {
				System.out.println("���ػ�");
			}
			System.out.println("1�� ���α׷� ����");
		break;
		case 2:
//
//		// 2. ����ڿ��� ������ �Է¹޾� 1���� �ش� �������� ���η� ����ϱ�
//		
//		String res = "";
//		for(int i = 0; i < 10; i++) {
//			res += i + 1 + " ";// res = res + (i+1) + " ";
////			System.out.print(i + 1 + " ");
////			num++; //
//		}

		// �Է¿���
		// ���� >> 10
		System.out.print("���� >> ");
		int int1 = sc.nextInt();
		// ��¿���
		// 1 2 3 4 5 6 7 8 9 10

		for (int i = 0; i < int1; i++) {
			System.out.print(i + 1 + " ");
		}
		System.out.println("2�� ���α׷� ����");
		break;
		
		
		case 3:
		System.out.println("\n3. 10���� 1���� ���η� ���");
		// 3. 10���� 1���� ���η� ����ϱ�
		// 10 9 8 7 6 5 4 3 2 1
		for (int i = 0; i < 10; i++) {
			System.out.print(10 - i + " ");
		}
		break;
		
		
		case 4:
		// 4. 1���� 100������ ���� �� ¦���� ���η� ����ϱ�
		System.out.println("\n1���� 100���� ¦�� ����");
		// 1�� ���
		System.out.println("1�� ���");
		for (int i = 0; i < 100; i = i++) {
			System.out.print(++i * 2 + " ");
			if (i == 50) {
				break;
			}
		}

		System.out.println("\n2�� ���");

		// 2�� ���
		for (int i = 0; i < 100; i++) {
			System.out.print(++i + 1 + " ");
		}

		// ���� 99���� Ȧ�� ���� ���
//		for (int i = 0; i < 100; i++) {
//			System.out.print(i++ + 1 + " ");
//		}
		break;

		case 5:
		// 5. ����ڿ��� ������ �Է¹޾� 1���� �ش� �������� ���� ����ϱ�
		{
			System.out.print("\n(�տ���)���� �Է� >> ");

			int input = sc.nextInt();
			int sum = 0;

			for (int i = 0; i < input; i++) {
				sum = sum + i;
//				System.out.print("sum = " + sum + " ");	// Ȯ���ڵ�
//				System.out.println("i = " + i + " ");	// Ȯ���ڵ�
			}
			System.out.println(sum + input);
		}
		break;
		
		case 6:
		// 6. ����ڿ��� ���� �Է¹޾� �ش� ������ ����ϱ�
		System.out.print("\n�� �Է� >> ");
		int dan = sc.nextInt();
		// ---3��---
		// 3x1 = 3
		// 3x2 = 6
		// ...
		// 3x9 = 27
		System.out.printf("\n---%d��---\n", dan);

		for (int i = 0; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", dan, i + 1, dan * (i + 1));
		}
		break;
		
		case 7:
		// 7. ������ϱ�
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
		// System.out.println("�� ���� ���� ����");
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
//	System.out.println("�� ���� ���� ����");
	break;
		default:
			System.err.println("�߸��� �Է��Դϴ�. ���α׷��� �����մϴ�.");
		}

	}

}