package day06;

import java.util.Scanner;

public class IfTest2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// 1. 두 정수를 입력받고 둘 중 더 큰수, 만일 같다면 같다고 출력
		System.out.print("정수1입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("정수2입력 >> ");
		int num2 = sc.nextInt();
		
		System.out.println("---삼항연산자결과---");
		String res = num1 > num2 ? num1 + "" : num2 > num1 ? num2 + "" : "같다";
		System.out.println(res);
		
		System.out.println("---if문결과---");
		if(num1 > num2)
		{
			System.out.println("두 정수 중 더 큰 수는 " + num1 + "입니다.");
		}else 
		{
			if(num1 == num1) {
				System.out.println("두 정수는 크기가 같습니다.");
			}else {
				System.out.println("두 정수 중 더 큰 수는 " + num2 + "입니다.");
			}
		}

		
		if(num1 > num2)
		{
			System.out.println("두 정수 중 더 큰 수는 " + num1 + "입니다.");
		}else if(num2 > num1) {
			System.out.println("두 정수 중 더 큰 수는 " + num2 + "입니다.");
		}else {
			System.out.println("두 정수는 크기가 같습니다.");
		}
		
		
		
		
		
		
		
		// 2. target에 들어있는 값이 대문자라면 소문자로, 소문자라면 대문자로, 그외의 문자라면 그대로 출력하기
		char target = '?';

		System.out.println("----삼항연산자결과----");
		char res2 = target >= 'A' && target <= 'Z' ? (char) (target + 32)
				: target >= 'a' && target <= 'z' ? (char) (target - 32) : target;
		System.out.println(res2);
		System.out.println("----if문결과----");
		
		if(target >= 'A' && target <= 'Z')
		{
			System.out.println((char)(target + 32));
		}else {
			if(target >= 'a' && target <= 'z')
			{
				System.out.println((char)(target - 32));
			}else {
				System.out.println((char)target);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
