package day07;

import java.util.Scanner;

public class Review 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
//		System.out.println("���� �Է� >> ");
//		int score = sc.nextInt();
//
//		char alpha = '.';
//		
//		if (score >= 90) 
//		{
//			System.out.println("����� ������ A�Դϴ�.");
//		} else if (score >= 80) {
//			System.out.println("����� ������ B�Դϴ�.");
//		} else if (score >= 70) {
//			System.out.println("����� ������ C�Դϴ�.");
//		} else {
//			System.out.println("����� ������ F�Դϴ�.");
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
//		// �ϰ�ó��
//		System.out.println("����� ������ " + alpha + "�Դϴ�.");
		

		System.out.print("���� �Է� >> ");
		int year = sc.nextInt();
		// 4�� ��� O 100�� ��� O 400�� ��� O --> ����
		// 4�� ��� O 100�� ��� O 400�� ��� X --> ���
		// 4�� ��� O 100�� ��� X 400�� ��� X --> ����
		// 4�� ��� X 100�� ��� X 400�� ��� X --> ���

		
		if(year % 4 == 0) 
		{
			if(year % 100 == 0) 
			{
				if(year % 400 == 0) {
					System.out.println("�����Դϴ�.");
				}else {
					System.out.println("����Դϴ�.");
				}
			}else 
			{
				System.out.println("�����Դϴ�.");
			}
		}else {
			System.out.println("����Դϴ�.");			
		}
		
		if((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0) {
			
		}
		
		
		
		
		
		
		
		
		String yy = "";
		
		if(year % 400 == 0) {
			yy = "����";
		}else if(year % 100 == 0) {
			yy = "���";
		}else if(year % 4 == 0) {
			yy = "����";
		}else {
			yy = "���";
		}
		System.out.println(yy + "�Դϴ�.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
