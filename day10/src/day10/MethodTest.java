package day10;

public class MethodTest {

	public static void printName(String name, int n) {

		for (int i = 0; i < n; i++) {
			System.out.println(name);
		}

	}

	// �� ������ ���ϴ� �޼ҵ�
	// void �ڸ��� ���� ���� Ÿ���� ���� �ڸ��̴�
	// ����Ÿ���̶�? return ���� �ִ� ���� Ÿ��
	public static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		printName("���ػ�", 3);
		System.out.println(add(5, 5) / 2);

		int res = MethodTest.add(30, 45);
		System.out.println(res);

	}

}
