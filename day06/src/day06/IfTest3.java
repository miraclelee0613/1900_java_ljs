package day06;

import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
		int num = 10;
		
		if(num < 20) 
		{
			System.out.println("20���� ����");
		}else if(num == 10) {
			System.out.println("10�Դϴ�.");
		}
		
		// ����ڿ��� ������ �Է¹޾�
		// 3�� ������ 3�� ����Դϴ�.
		// 4�� ������ 4�� ����Դϴ�.
		// ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� >> ");
		
		int input = sc.nextInt();
		
		if(input % 3 == 0) 
		{
			System.out.println("3�� ����Դϴ�.");
		}
		
		if(input % 4 == 0) 
		{
			System.out.println("4�� ����Դϴ�.");
		}
		
		
	}

}
