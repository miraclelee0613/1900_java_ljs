
package day08;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			System.out.println("���ػ�");
		}
		System.out.println("for�� �ٱ� ����");

		int i = 0;
		while (i < 3) {
			System.out.println("���ػ�");
			i++;
		}
		System.out.println("while�� �ٱ� ����");

		Scanner sc = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println("1.�ֹ��ϱ�\n0.�����ϱ�");
			choice = sc.nextInt();
		} while (choice != 0);

//		while (choice != 2) {
//			System.out.println("1.�ֹ��ϱ�\n2.�����ϱ�");
//			choice = sc.nextInt();
//		}

//		while(true) {
//			System.out.println("1.�ֹ��ϱ�\n2.�����ϱ�");
//			int choice = sc.nextInt();
//			if(choice == 2) {
//				break;	// �ݺ����� ��� �����Ѵ�.
//			}
		System.out.println("while�� �Ʒ� ����");

	}

}
=======
package day08;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			System.out.println("���ػ�");
		}
		System.out.println("for�� �ٱ� ����");

		int i = 0;
		while (i < 3) {
			System.out.println("���ػ�");
			i++;
		}
		System.out.println("while�� �ٱ� ����");

		Scanner sc = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println("1.�ֹ��ϱ�\n0.�����ϱ�");
			choice = sc.nextInt();
		} while (choice != 0);

//		while (choice != 2) {
//			System.out.println("1.�ֹ��ϱ�\n2.�����ϱ�");
//			choice = sc.nextInt();
//		}

//		while(true) {
//			System.out.println("1.�ֹ��ϱ�\n2.�����ϱ�");
//			int choice = sc.nextInt();
//			if(choice == 2) {
//				break;	// �ݺ����� ��� �����Ѵ�.
//			}
		System.out.println("while�� �Ʒ� ����");

	}

}
>>>>>>> refs/remotes/origin/master
