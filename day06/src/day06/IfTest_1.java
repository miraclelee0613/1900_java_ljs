package day06;

import java.util.Scanner;

public class IfTest_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ����, ����, ������ ������ �Է¹ޱ�
		// ���� >> ���� >> ���� >>
		System.out.print("���� >> ");
		int kor = sc.nextInt();
		System.out.print("���� >> ");
		int mat = sc.nextInt();
		System.out.print("���� >> ");
		int eng = sc.nextInt();
		// �� ������ ����� double�� �޾� �Ҽ��� ù°�ڸ����� ������ ���
		double aver = (double) (kor + mat + eng) / 3.0;
		// ������� : 78.5��
		System.out.println("������� : " + aver + "��");

		// ��������� �����Ͽ� 100������ 10�� ������ 1��޺��� 10��ޱ��� ������ ���� ����
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

		// �� ��� ���� ������ 1�� �ڸ��� 9, 8, 7�� ��� �ڿ� ߾ �ڰ� �ٰ�
		// 4, 5, 6�� ��� �ڿ� �� �ڰ� �ٰ�
		// 1, 2, 3�� ��� �ڿ� �� �ڰ� �ٰ� ���
		char updown = '.';
		if((aver == 100) || (aver % 10 >= 7)) {
			updown = '߾';
		}else if(aver % 10 >= 4) {
			updown = '��';
		}else {
			updown = '��';
		}		
		
		// ����� ����� : 3������Դϴ�.
//		System.out.println("����� ����� " + grade +"���" + updown + "�Դϴ�.");
		System.out.printf("����� ����� %d���%c�Դϴ�.\n", grade, updown);
		System.out.println("----------���α׷� ����----------");
		
		//

	}

}
