package day07;

import java.util.Scanner;

public class Review 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
//		System.out.println("점수 입력 >> ");
//		int score = sc.nextInt();
//
//		char alpha = '.';
//		
//		if (score >= 90) 
//		{
//			System.out.println("당신의 학점은 A입니다.");
//		} else if (score >= 80) {
//			System.out.println("당신의 학점은 B입니다.");
//		} else if (score >= 70) {
//			System.out.println("당신의 학점은 C입니다.");
//		} else {
//			System.out.println("당신의 학점은 F입니다.");
//		}
//
//		if (score >= 90)
//		{
//			alpha = 'A';
//		}else if (score >= 80)
//		{
//			alpha = 'B';
//		}else if (score >= 70)
//		{
//			alpha = 'C';
//		}else {
//			alpha = 'F';
//		}
//		// 일괄처리
//		System.out.println("당신의 학점은 " + alpha + "입니다.");
		

		System.out.print("연도 입력 >> ");
		int year = sc.nextInt();
		// 4의 배수 O 100의 배수 O 400의 배수 O --> 윤년
		// 4의 배수 O 100의 배수 O 400의 배수 X --> 평년
		// 4의 배수 O 100의 배수 X 400의 배수 X --> 윤년
		// 4의 배수 X 100의 배수 X 400의 배수 X --> 평년

		
		if(year % 4 == 0) 
		{
			if(year % 100 == 0) 
			{
				if(year % 400 == 0) {
					System.out.println("윤년입니다.");
				}else {
					System.out.println("평년입니다.");
				}
			}else 
			{
				System.out.println("윤년입니다.");
			}
		}else {
			System.out.println("평년입니다.");			
		}
		
		if((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0) {
			
		}
		
		
		
		
		
		
		
		
		String yy = "";
		
		if(year % 400 == 0) {
			yy = "윤년";
		}else if(year % 100 == 0) {
			yy = "평년";
		}else if(year % 4 == 0) {
			yy = "윤년";
		}else {
			yy = "평년";
		}
		System.out.println(yy + "입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
