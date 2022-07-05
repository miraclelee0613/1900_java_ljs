package day10;

public class MethodTest {

	public static void printName(String name, int n) {

		for (int i = 0; i < n; i++) {
			System.out.println(name);
		}

	}

	// 두 정수를 더하는 메소드
	// void 자리는 원래 리턴 타입을 쓰는 자리이다
	// 리턴타입이란? return 옆에 있는 값의 타입
	public static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		printName("이준상", 3);
		System.out.println(add(5, 5) / 2);

		int res = MethodTest.add(30, 45);
		System.out.println(res);

	}

}
