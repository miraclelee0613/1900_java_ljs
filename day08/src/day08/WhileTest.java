
package day08;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			System.out.println("이준상");
		}
		System.out.println("for문 바깥 문장");

		int i = 0;
		while (i < 3) {
			System.out.println("이준상");
			i++;
		}
		System.out.println("while문 바깥 문장");

		Scanner sc = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println("1.주문하기\n0.종료하기");
			choice = sc.nextInt();
		} while (choice != 0);

//		while (choice != 2) {
//			System.out.println("1.주문하기\n2.종료하기");
//			choice = sc.nextInt();
//		}

//		while(true) {
//			System.out.println("1.주문하기\n2.종료하기");
//			int choice = sc.nextInt();
//			if(choice == 2) {
//				break;	// 반복문을 즉시 종료한다.
//			}
		System.out.println("while문 아래 문장");

	}

}
=======
package day08;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			System.out.println("이준상");
		}
		System.out.println("for문 바깥 문장");

		int i = 0;
		while (i < 3) {
			System.out.println("이준상");
			i++;
		}
		System.out.println("while문 바깥 문장");

		Scanner sc = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println("1.주문하기\n0.종료하기");
			choice = sc.nextInt();
		} while (choice != 0);

//		while (choice != 2) {
//			System.out.println("1.주문하기\n2.종료하기");
//			choice = sc.nextInt();
//		}

//		while(true) {
//			System.out.println("1.주문하기\n2.종료하기");
//			int choice = sc.nextInt();
//			if(choice == 2) {
//				break;	// 반복문을 즉시 종료한다.
//			}
		System.out.println("while문 아래 문장");

	}

}
>>>>>>> refs/remotes/origin/master
