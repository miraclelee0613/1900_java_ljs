package day05;

import java.util.Scanner;

public class COTtest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.println(age > 8 && 19 < age ? "2500원입니다" : "무료입니다");

	}

}
