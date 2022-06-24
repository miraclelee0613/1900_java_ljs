package day02;

public class PrintTest
{

	public static void main(String[] args)
	{
		System.out.print("안녕\n하세요");		// \n : 문자열 안에서 줄바꿈을 표현하는 제어문자
		System.out.print("반갑습니다\n");
		System.out.print("대신귀\n여운알\n파카를\n드리겠\n습니다\n");
		
		// \" : 문자열 안에서 "를 표현하는 제어문자
		System.out.println("나는 말했다 \"배고프다\" 라고");
		
		// \t : 문자열 안에서 일정 간격(탭tab)을 띄어주는 제어문자
		System.out.println("껌\t500원");
		System.out.println("사탕\t1000원");

		// \\ : 문자열 안에서 \를 표현하는 제어문자
		System.out.println("역슬래시는 \\입니다");
	}

}
