package day06;

import java.util.Scanner;

public class IfTest_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 국어, 수학, 영어의 점수를 입력받기
		// 국어 >> 수학 >> 영어 >>
		System.out.print("국어 >> ");
		int kor = sc.nextInt();
		System.out.print("수학 >> ");
		int mat = sc.nextInt();
		System.out.print("영어 >> ");
		int eng = sc.nextInt();
		// 세 과목의 평균을 double로 받아 소숫점 첫째자리까지 나오게 출력
		double aver = (double) (kor + mat + eng) / 3.0;
		// 평균점수 : 78.5점
		System.out.println("평균점수 : " + aver + "점");

		// 평균점수를 산정하여 100점부터 10점 단위로 1등급부터 10등급까지 나오게 변수 저장
		int grade = 0;
		if (aver >= 90) 
		{
			grade = 1;
			} else if (aver >= 80) {
			grade = 2;
			} else if (aver >= 70) {
			grade = 3;
			} else if (aver >= 60) {
			grade = 4;
			} else if (aver >= 50) {
			grade = 5;
			} else if (aver >= 40) {
			grade = 6;
			} else if (aver >= 30) {
			grade = 7;
			} else if (aver >= 20) {
			grade = 8;
			} else if (aver >= 10) {
			grade = 9;
			} else {
			grade = 10;
		}

		// 각 등급 점수 내에서 1의 자리가 9, 8, 7은 등급 뒤에 上 자가 붙게
		// 4, 5, 6은 등급 뒤에 中 자가 붙게
		// 1, 2, 3은 등급 뒤에 下 자가 붙게 출력
		char updown = '.';
		if((aver == 100) || (aver % 10 >= 7)) {
			updown = '上';
		}else if(aver % 10 >= 4) {
			updown = '中';
		}else {
			updown = '下';
		}		
		
		// 당신의 등급은 : 3등급下입니다.
//		System.out.println("당신의 등급은 " + grade +"등급" + updown + "입니다.");
		System.out.printf("당신의 등급은 %d등급%c입니다.\n", grade, updown);
		System.out.println("----------프로그램 종료----------");
		
		//

	}

}
