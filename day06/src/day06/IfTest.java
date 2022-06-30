package day06;

import java.util.Scanner;

public class IfTest 
{

	public static void main(String[] args) 
	{
		
		System.out.println("프로그램 시작");
		
		if(false)
		{
			System.out.println("if문 안쪽문장1");
			System.out.println("if문 안쪽문장2");
		}
		System.out.println("if문 바깥문장");
		
		// 사용자에게 정수를 받아서
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >> ");
		int int1 = sc.nextInt();
		
		// 해당 정수가 짝수라면 짝수입니다 출력하기
		if(int1 % 2 == 0)
		{
			System.out.println("짝수입니다.");
		}
		
		// 해당 정수가 홀수라면 홀수입니다 출력하기
		if(int1 % 2 != 0)
//		if(int1 % 2 == 1)
//		if(!(int1 % 2 == 0))
		{
			System.out.println("홀수입니다.");			
		}
		
		System.out.println("-----------------");
		// if ~ else
		if(int1 % 2 == 0)
		{
			System.out.println("짝수입니다.");
		}else
		{
			System.out.println("홀수입니다.");
		}
		
		
		
		
	}

}
