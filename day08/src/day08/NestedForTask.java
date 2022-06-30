package day08;

import java.util.Scanner;

public class NestedForTask {

	public static void main(String[] args) {
		// 2단부터 9단까지 출력하기
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println("---" + dan + "단---");
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d\n",dan,i,dan * i);
			}
		}
		
		
		
		// *****
		// *****
		// *****
		// *****
		// *****
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
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
		
		//     *
		//    **
		//   ***
		//  ****
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
		
		
		
		
		//   *
		//  ***
		// *****
		//*******
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++ ) {
				System.out.print("*");
			}
//			for (int j = 0; j < 4 - i; j++) {
//				System.out.print(" ");
//			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
