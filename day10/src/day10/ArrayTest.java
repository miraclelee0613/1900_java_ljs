package day10;

public class ArrayTest {
	public static void main(String[] args) {

		int[] ar = { 50, 100, 150 };

		System.out.println(ar);

		// �迭.length : �迭�� ����(����� ����)�� intŸ���� ������ �����´�.
		System.out.println("ar.length " + ar.length);

		// �迭 �� ��� ����
		ar[1] = 200;

		for (int i = 0; i < 3; i++) {
			System.out.println(ar[i]);
		}

		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
//		System.out.println(ar[3]); java.lang.ArrayIndexOutOfBoundsException

	}
}
