package day09;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// nextInt(), Random클래스 안에 만들어져 있다.
		Random r = new Random();
		// nextInt(값) : 0부터 값-1(값미만)까지의 정수 중 랜덤한 정수를 받아온다
		int ran = r.nextInt(10);
		System.out.println(ran + 1);
		int rand = r.nextInt(9999) + 1;
		System.out.printf("%04d", rand);

	} // main 종료

}
