package day06;

import java.util.Scanner;

public class IfTask1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�����Ϸ��� ���α׷��� ��ȣ�� �Է��ϼ���.");
		System.out.println("1.����������α׷�\n2.��������ȭ���α׷�\n3.���������α׷�");
		int num = sc.nextInt();
		char stScore = 'n';
		if (num == 1) {

			System.out.println("������ �˷��ִ� ���α׷��Դϴ�.");
			// ����ڿ��� ������ �Է¹޴´�(����)

			System.out.println("���� �Է�(����) >> ");
			int score = sc.nextInt();
			if (score >= 90) {
				stScore = 'A'; // 90�̻� A

			} else if (score >= 80) {
				stScore = 'B'; // 80�̻� 90�̸� B
			} else if (score >= 70) {
				stScore = 'C'; // 70�̻� 80�̸� C
			} else {
				stScore = 'F'; // 70�̸� F
			}

//		����� ������ 0�Դϴ�
			System.out.println("����� ������ " + stScore + "�Դϴ�.");
		} else if (num == 2) {
			System.out.println("���� ����ȭ ���α׷��Դϴ�.");
			System.out.print("���� �Է�(����) >> ");
			int score = sc.nextInt();

			// �����ڸ� >= 8 ? +
			// �����ڸ� <= 2 ? -
			int scorepm = score % 10;
			if (score >= 90) 
			{
				stScore = 'A'; // 90�̻� A

			} else if (score >= 80) {
				stScore = 'B'; // 80�̻� 90�̸� B
			} else if (score >= 70) {
				stScore = 'C'; // 70�̻� 80�̸� C
			} else {
				stScore = 'F'; // 70�̸� F
			}
			String pm = "";
			if (score == 100) {
				pm = "+";
			} else if (scorepm >= 8 || scorepm <= 2) 
			{
				if (scorepm >= 8) {
					pm = "+";
				} else if (scorepm <= 2) {
					pm = "-";
				}
				
			}
			System.out.println("����� ������ " + stScore + pm + "�Դϴ�.");

		} else if (num == 3) {
//		����ڿ��� �⵵�� �Է¹޴´�
			System.out.println("���⿩�θ� �˷��ִ� ���α׷��Դϴ�.");
			System.out.print("���� �Է� >> ");
			int year = sc.nextInt();

//		�ش� �⵵�� �����̶�� ����, �ƴ϶�� ������ �ƴ϶�� ����ϱ�
//		4�ǹ�� : ����
//		4�ǹ��O 100�ǹ�� :����X(���)
//		4�ǹ��O 100�ǹ��O 400�ǹ�� : ����
			String yy = "";
			if (year % 400 == 0) {
				yy = "�����Դϴ�.";
			} else if (year % 100 == 0) {
				yy = "������ �ƴմϴ�.";
			} else if (year % 4 == 0) {
				yy = "�����Դϴ�.";
				;
			} else {
				yy = "������ �ƴմϴ�.";
			}
			System.out.println(year + "���� " + yy);
		} else {
			System.out.println("�߸��� �Է��Դϴ�.\n���α׷��� �����մϴ�.");
		}
		System.out.println("---------���α׷� ����---------");
	}

}
