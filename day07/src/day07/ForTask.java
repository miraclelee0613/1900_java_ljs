package day07;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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

		// 2. ����ڿ��� ������ �Է¹޾� 1���� �ش� �������� ���η� ����ϱ�
		
		String res = "";
		for(int i = 0; i < 10; i++) {
			res += i + 1 + " ";// res = res + (i+1) + " ";
//			System.out.print(i + 1 + " ");
//			num++; //
		}
		
		
		
		
		
		
		
		// �Է¿���
		// ���� >> 10
		System.out.print("���� >> ");
		int int1 = sc.nextInt();
		// ��¿���
		// 1 2 3 4 5 6 7 8 9 10

		for (int i = 0; i < int1; i++) {
			System.out.print(i + 1);
		}

		// 3. 10���� 1���� ���η� ����ϱ�
		// 10 9 8 7 6 5 4 3 2 1

		for (int i = 0; i > 0; i++) {
			System.out.print(10 - i);
		}
		System.out.println("");
		// 4. 1���� 100������ ���� �� ¦���� ���η� ����ϱ�

		for (int i = 0; i < 100; i = i + 2) {
			System.out.println(i + 2);
			// if(i == 100){
			// break;
			// }
		}
		System.out.println("");
		// 5. ����ڿ��� ������ �Է¹޾� 1���� �ش� �������� ���� ����ϱ�
		System.out.print("���� �Է� >> ");
		int int2 = sc.nextInt();
		for (int i = 0; i < int2; i++) {
			System.out.println((i + (i + 1)));
		}

		// 6. ����ڿ��� ���� �Է¹޾� �ش� ������ ����ϱ�
		System.out.print("�� �Է� >> ");
		int dan = sc.nextInt();
		// ---3��---
		// 3x1 = 3
		// 3x2 = 6
		// ...
		// 3x9 = 27
		System.out.printf("---%d��---\n", dan);

		for (int i = 0; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", dan, i + 1, dan * (i + 1));
		}

		// 7. �� ����ϱ�
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
