package day06;

import java.util.Scanner;

public class IfTest 
{

	public static void main(String[] args) 
	{
		
		System.out.println("���α׷� ����");
		
		if(false)
		{
			System.out.println("if�� ���ʹ���1");
			System.out.println("if�� ���ʹ���2");
		}
		System.out.println("if�� �ٱ�����");
		
		// ����ڿ��� ������ �޾Ƽ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� >> ");
		int int1 = sc.nextInt();
		
		// �ش� ������ ¦����� ¦���Դϴ� ����ϱ�
		if(int1 % 2 == 0)
		{
			System.out.println("¦���Դϴ�.");
		}
		
		// �ش� ������ Ȧ����� Ȧ���Դϴ� ����ϱ�
		if(int1 % 2 != 0)
//		if(int1 % 2 == 1)
//		if(!(int1 % 2 == 0))
		{
			System.out.println("Ȧ���Դϴ�.");			
		}
		
		System.out.println("-----------------");
		// if ~ else
		if(int1 % 2 == 0)
		{
			System.out.println("¦���Դϴ�.");
		}else
		{
			System.out.println("Ȧ���Դϴ�.");
		}
		
		
		
		
	}

}
