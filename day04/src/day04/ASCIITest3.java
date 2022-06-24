package day04;

import java.util.Scanner;

public class ASCIITest3 {

	public static void main(String[] args) {
		char ch = 65; // A
		while (true) {

			if (ch == 91) {
				ch = 97;
			}

			String str = String.valueOf(ch);
			System.out.println(str);
			ch++;

			if (ch > 122) {
				break;
			}
		}

	}

}
