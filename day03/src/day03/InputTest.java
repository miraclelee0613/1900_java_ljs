package day03;

// Scanner 클래스의 위치를 알려준다
// java.util 패키지 안에 있는 Scanner 클래스
import java.util.Scanner;

public class InputTest 
{

	public static void main(String[] args) 
	{
		//scanner 클래스 준비하기
		Scanner sc = new Scanner(System.in);
//		String name = "이준상";	
		
		System.out.print("이름 : ");		
		System.out.printf("%s 님 환영합니다\n", sc.next());	//가장 안쪽의 메소드부터 해석

		
		
	}

}
