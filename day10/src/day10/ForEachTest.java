package day10;

import java.util.Scanner;

public class ForEachTest {
	public static void main(String[] args) {
		// foreach�� (����for�� ����for��)
		String[] names = { "�达", "�̾�", "�ھ�" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		// name�̶�� ������ names �ӿ� �ִ� ��Ұ� ���ʷ� ���Եȴ�.
		for (String name : names) {
			System.out.println(name);
		}
	}
}
