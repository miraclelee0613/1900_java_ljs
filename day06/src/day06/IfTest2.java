package day06;

import java.util.Scanner;

public class IfTest2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// 1. �� ������ �Է¹ް� �� �� �� ū��, ���� ���ٸ� ���ٰ� ���
		System.out.print("����1�Է� >> ");
		int num1 = sc.nextInt();
		System.out.print("����2�Է� >> ");
		int num2 = sc.nextInt();
		
		System.out.println("---���׿����ڰ��---");
		String res = num1 > num2 ? num1 + "" : num2 > num1 ? num2 + "" : "����";
		System.out.println(res);
		
		System.out.println("---if�����---");
		if(num1 > num2)
		{
			System.out.println("�� ���� �� �� ū ���� " + num1 + "�Դϴ�.");
		}else 
		{
			if(num1 == num1) {
				System.out.println("�� ������ ũ�Ⱑ �����ϴ�.");
			}else {
				System.out.println("�� ���� �� �� ū ���� " + num2 + "�Դϴ�.");
			}
		}

		
		if(num1 > num2)
		{
			System.out.println("�� ���� �� �� ū ���� " + num1 + "�Դϴ�.");
		}else if(num2 > num1) {
			System.out.println("�� ���� �� �� ū ���� " + num2 + "�Դϴ�.");
		}else {
			System.out.println("�� ������ ũ�Ⱑ �����ϴ�.");
		}
		
		
		
		
		
		
		
		// 2. target�� ����ִ� ���� �빮�ڶ�� �ҹ��ڷ�, �ҹ��ڶ�� �빮�ڷ�, �׿��� ���ڶ�� �״�� ����ϱ�
		char target = '?';

		System.out.println("----���׿����ڰ��----");
		char res2 = target >= 'A' && target <= 'Z' ? (char) (target + 32)
				: target >= 'a' && target <= 'z' ? (char) (target - 32) : target;
		System.out.println(res2);
		System.out.println("----if�����----");
		
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
