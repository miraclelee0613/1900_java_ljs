package day03;
import java.util.Scanner;

public class InputTask 
{

	public static void main(String[] args) 
	{
		// 사용자에게 이름을 입력 받아서
		// ---님 환영합니다
		// ---님의 등급은 VIP입니다
		// 출력하기
		// 입력예시:
		//  이름 : 김철수
		// 출력예시:
		//	배상엽님 환영합니다
		//	배상엽님의 등급은 VIP입니다
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		// next() : 띄어쓰기로 구분하여 String 타입으로 받아옴.
		// nextLine() : 엔터로 구분하여 String 타입으로 받아옴.
		String name = sc.nextLine();		// 변수 선언으로 입력받은 값을 재사용
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		
//		System.out.println(name + "님 환영합니다.");		// 앞사람이 쓴 코드
//		System.out.println(name + "님의 등급은 VIP입니다.");//    "		"
		System.out.printf("%s 님 환영합니다.\n"
						+ "%s 님의 등급은 VIP입니다.\n", name, name);
		System.out.printf("%s 님의 나이는 %d살입니다.\n", name, age);
//		System.out.printf("%s 님 환영합니다\n", name);			// 강사가 쓴 코드
//		System.out.printf("%s 님의 등급은 VIP입니다.", name);	// 	"	"	"
		
		
	}

}
