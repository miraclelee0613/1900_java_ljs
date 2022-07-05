package day10;

import java.util.Scanner;

public class ForEachTest {
	public static void main(String[] args) {
		// foreach문 (빠른for문 향상된for문)
		String[] names = { "김씨", "이씨", "박씨" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		// name이라는 변수는 names 속에 있는 요소가 차례로 대입된다.
		for (String name : names) {
			System.out.println(name);
		}
	}
}
