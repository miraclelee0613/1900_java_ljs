package day02;

public class PrintfTest
{

	public static void main(String[] args)
	{
		// ctrl + m : 전체화면 단축키
		System.out.printf("오늘은 \t%04d일입니다.\n", 14);
		System.out.printf("원주율은 \t%04.2f입니다.\n", 3.14);
		System.out.printf("나의 학점은 %c입니다\n", 'A');
		System.out.printf("나의 이름은 %s입니다\n", "이준상");
		
		// 여러개의 형식지정자가 사용된다면 순서대로 전달한다.
		System.out.printf("%s %d %c %.2f\n", "안녕", 10, 'A', 3.14);
		
	}

}
