<<<<<<< HEAD
package day08;

import java.util.Scanner;

public class NestedForTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 2�ܺ��� 9�ܱ��� ����ϱ�
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println("---" + dan + "��---");
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
			}
		}

		// *****
		// *****
		// *****
		// *****
		// *****
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// *
		// **
		// ***
		// ****
		// *****

//		String star = "*";

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
//				System.out.print(star);
				System.out.print("*");
			}
			System.out.println();
		}

		// *
		// **
		// ***
		// ****
		// *****
		for (int i = 0; i < 5; i++) {
//			for (int j = 5 - i; j > 0; j--) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// *
		// ***
		// *****
		// *******
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
//			for (int j = 0; j < 4 - i; j++) {
//				System.out.print(" ");
//			}
			System.out.println();
		}

		// �Է¹��� ��ŭ ū �� �����
		System.out.print("�� ũ�� �Է� >> ");
		int input = sc.nextInt();
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < (input * 2 - 1) - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
//			for (int j = 0; j < 4 - i; j++) {
//				System.out.print(" ");
//			}
			System.out.println();
		}
		for (int i = 0; i < args.length; i++) {
			
		}
		
	}

}
=======
package day08;

import java.util.Scanner;

public class NestedForTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 2�ܺ��� 9�ܱ��� ����ϱ�
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println("---" + dan + "��---");
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
			}
		}

		// *****
		// *****
		// *****
		// *****
		// *****
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// *
		// **
		// ***
		// ****
		// *****

//		String star = "*";

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
//				System.out.print(star);
				System.out.print("*");
			}
			System.out.println();
		}

		// *
		// **
		// ***
		// ****
		// *****
		for (int i = 0; i < 5; i++) {
//			for (int j = 5 - i; j > 0; j--) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// *
		// ***
		// *****
		// *******
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
//			for (int j = 0; j < 4 - i; j++) {
//				System.out.print(" ");
//			}
			System.out.println();
		}

		// �Է¹��� ��ŭ ū �� �����
		System.out.print("�� ũ�� �Է� >> ");
		int input = sc.nextInt();
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < (input * 2 - 1) - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
//			for (int j = 0; j < 4 - i; j++) {
//				System.out.print(" ");
//			}
			System.out.println();
		}
		for (int i = 0; i < args.length; i++) {
			
		}
		
	}

}
>>>>>>> refs/remotes/origin/master
