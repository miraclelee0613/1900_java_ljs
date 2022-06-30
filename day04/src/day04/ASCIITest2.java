package day04;

import java.util.Scanner;

public class ASCIITest2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		int num = sc.nextInt();
		char ch = (char)num;
		
		System.out.println(ch);
		
	}

}
