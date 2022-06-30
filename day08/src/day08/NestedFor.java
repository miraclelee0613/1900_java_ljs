<<<<<<< HEAD
package day08;

import java.util.Iterator;
import java.util.Scanner;

public class NestedFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		for (int i = 0; i < 5; i++) {
//			System.out.println("out" + i);
//			for (i = 0; i < 3; i++)
//			{
//				System.out.println("in" + i);
//			}
//			System.out.println("out2" + i);
//		}

		for (int i = 0; i < 5; i++) {
			System.out.println("°ÑÀÇ for¹® À­¹®Àå" + i);
			for (int j = 0; j < 3; j++) {
//				System.out.println("¾ÈÂÊ for¹® ¹®Àå" + j);
				System.out.println("i:" + i + " j:" + j);
			}
			System.out.println("°ÑÀÇ for¹® ¾Æ·§¹®Àå" + i);
		}

	}

}
=======
package day08;

import java.util.Iterator;
import java.util.Scanner;

public class NestedFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		for (int i = 0; i < 5; i++) {
//			System.out.println("out" + i);
//			for (i = 0; i < 3; i++)
//			{
//				System.out.println("in" + i);
//			}
//			System.out.println("out2" + i);
//		}

		for (int i = 0; i < 5; i++) {
			System.out.println("°ÑÀÇ for¹® À­¹®Àå" + i);
			for (int j = 0; j < 3; j++) {
//				System.out.println("¾ÈÂÊ for¹® ¹®Àå" + j);
				System.out.println("i:" + i + " j:" + j);
			}
			System.out.println("°ÑÀÇ for¹® ¾Æ·§¹®Àå" + i);
		}

	}

}
>>>>>>> refs/remotes/origin/master
