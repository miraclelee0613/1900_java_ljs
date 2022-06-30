<<<<<<< HEAD
package day03;

import java.util.Scanner;

public class BufferTest 
{

	public static void main(String[] args) 
	{
		// 참고사항
		// next(). nextInt(), nextDouble(), nextLine()은 버퍼에서
		// 입력을 받는다.
		// 만약에 버퍼가 비어있다면 사용자가 입력을 해줘야 한다.
		// 범위주석 단축키 : ctrl + shift + /
		// 범위주석 해제 : ctrl + shift + \
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 >> ");
		int age		= sc.nextInt();
		sc.nextLine();		//
		System.out.print("이름 >> ");
		String name	= sc.nextLine();
		
//		System.out.printf("age : %d, name : %s", age, name);
	}

}
=======
package day03;

import java.util.Scanner;

public class BufferTest 
{

	public static void main(String[] args) 
	{
		// 참고사항
		// next(). nextInt(), nextDouble(), nextLine()은 버퍼에서
		// 입력을 받는다.
		// 만약에 버퍼가 비어있다면 사용자가 입력을 해줘야 한다.
		// 범위주석 단축키 : ctrl + shift + /
		// 범위주석 해제 : ctrl + shift + \
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 >> ");
		int age		= sc.nextInt();
		sc.nextLine();		//
		System.out.print("이름 >> ");
		String name	= sc.nextLine();
		
//		System.out.printf("age : %d, name : %s", age, name);
	}

}
>>>>>>> refs/remotes/origin/master
