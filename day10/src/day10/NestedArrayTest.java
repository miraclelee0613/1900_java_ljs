package day10;

import java.util.Scanner;

public class NestedArrayTest {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("i : " + i + " j : " + j);
			}
		}

		int[][] arr = { { 1, 2 }, { 10, 20 }, { 100, 200 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}

	}

}
