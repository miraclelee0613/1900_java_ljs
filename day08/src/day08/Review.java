<<<<<<< HEAD
package day08;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		// 3. 10 ���� 1���� ���η� ����ϱ�
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
		System.out.println("��� : " + res);
		// 4. 1���� 100������ ���� �� ¦���� ���η� ����ϱ�

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				continue; // ��� ���� �ݺ��� �����Ѵ�.
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

		// 5. ����ڿ��� ������ �Է� �޾� 1���� �ش� �������� ���� ����ϱ�
//		System.out.print("�Է� >> ");
//		int input = sc.nextInt();
//		int sum = 0;
//		for(int i = 1; i <= input; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//		
//System.out.println(((input + 1) * input) / 2);

		// 6. ����ڿ��� ���� �Է� �޾� �ش� ������ ����ϱ�
		// ---3��---
		// 3x1=3
		// 3x2=6
		// ...
		// 3x9=27
//		{
//			System.out.print("�� �Է� >> ");
//			int dan = sc.nextInt();
//			for (int i = 0; i < 9; i++) {
//				System.out.printf("%d x %d = %d\n", dan, (i+1), dan * (i+1));
//			}
//
//		}

		// 7. ������ϱ�
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
		// 3. 10 ���� 1���� ���η� ����ϱ�
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
		System.out.println("��� : " + res);
		// 4. 1���� 100������ ���� �� ¦���� ���η� ����ϱ�

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				continue; // ��� ���� �ݺ��� �����Ѵ�.
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

		// 5. ����ڿ��� ������ �Է� �޾� 1���� �ش� �������� ���� ����ϱ�
//		System.out.print("�Է� >> ");
//		int input = sc.nextInt();
//		int sum = 0;
//		for(int i = 1; i <= input; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//		
//System.out.println(((input + 1) * input) / 2);

		// 6. ����ڿ��� ���� �Է� �޾� �ش� ������ ����ϱ�
		// ---3��---
		// 3x1=3
		// 3x2=6
		// ...
		// 3x9=27
//		{
//			System.out.print("�� �Է� >> ");
//			int dan = sc.nextInt();
//			for (int i = 0; i < 9; i++) {
//				System.out.printf("%d x %d = %d\n", dan, (i+1), dan * (i+1));
//			}
//
//		}

		// 7. ������ϱ�
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
