package day09;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// nextInt(), RandomŬ���� �ȿ� ������� �ִ�.
		Random r = new Random();
		// nextInt(��) : 0���� ��-1(���̸�)������ ���� �� ������ ������ �޾ƿ´�
		int ran = r.nextInt(10);
		System.out.println(ran + 1);
		int rand = r.nextInt(9999) + 1;
		System.out.printf("%04d", rand);

	} // main ����

}
