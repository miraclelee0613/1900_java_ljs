package day06;

import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
		int num = 10;
		
		if(num < 20) 
		{
			System.out.println("20보다 작음");
		}else if(num == 10) {
			System.out.println("10입니다.");
		}
		
		// 사용자에게 정수를 입력받아
		// 3의 배수라면 3의 배수입니다.
		// 4의 배수라면 4의 배수입니다.
		// 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 >> ");
		
		int input = sc.nextInt();
		
		if(input % 3 == 0) 
		{
			System.out.println("3의 배수입니다.");
		}
		
		if(input % 4 == 0) 
		{
			System.out.println("4의 배수입니다.");
		}
		
		
	}

}
