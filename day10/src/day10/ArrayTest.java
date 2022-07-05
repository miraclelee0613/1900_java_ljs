package day10;

public class ArrayTest {
	public static void main(String[] args) {

		int[] ar = { 50, 100, 150 };

		System.out.println(ar);

		// 배열.length : 배열의 길이(요소의 개수)를 int타입의 값으로 가져온다.
		System.out.println("ar.length " + ar.length);

		// 배열 속 요소 수정
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
