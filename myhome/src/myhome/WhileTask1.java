package myhome;

import java.util.Scanner;

public class WhileTask1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		1. ���γ뷡�����α׷�
		
		
		
		
		
		
//		2. Ű����ũ���α׷�
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		3. ATM���α׷�
		int choice = 0;
		int money = 0;
		do {
			System.out.println("����ʽÿ�\n���ϴ� ������ �������ּ���\n1.�Ա�\n2.���\n3.�ܾ���ȸ");
			System.err.println("0.�������");
			System.out.print(" >> ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("�Ա� �������Դϴ�.\n�Ա� ��� �ݾ��� �Է��ϼ���\n >> ");
				int within = sc.nextInt();
				money += within;
				System.out.println("��ݾ� : " + within + "\n�ܾ� : " + money);
				break;
			case 2:
				System.out.print("��� �������Դϴ�.\n��� ��� �ݾ��� �Է��ϼ���\n >> ");
				int withdraw = sc.nextInt();
				if (money >= withdraw) {
					money += -withdraw;
					System.out.println("��� �ݾ� :" + withdraw + "\n�ܾ� : " + money);
				} else {
					System.out.println("�ܾ��� �����մϴ�. �ݾ��� Ȯ���Ͻð� �ٽ� �õ����ֽñ� �ٶ��ϴ�.");
				}
				break;

			case 3:
				System.out.println("�ܾ� Ȯ�� �������Դϴ�.\n�ܾ� : " + money);
				break;

			case 0:
				System.err.println("�ý����� �����մϴ�.");
				System.out.println();
				break;
			}
			System.out.println("�ý��� ����");

		} while (choice != 0);

	}

}
