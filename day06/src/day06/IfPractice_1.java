package day06;

import java.util.Scanner;
import java.util.random.*;

public class IfPractice_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("if�� �����������α׷��Դϴ�.");
		System.out.println("������ ���α׷��� ��ȣ�� �Է��ϼ���");
		System.out.println("1.Ȧ/¦/0/���� �Ǻ����α׷�\n2.���ǽǾȳ�\n3.���������� ����");
		System.out.print("�Է� >> ");
		int select = sc.nextInt();
		if (select == 1) {

			// if �� [���� 1]
			// ������ �Է� �޾� �Ʒ��� ���� ��� �Ǵ� ���α׷��� ����� ����
			System.out.println("¦/Ȧ �Ǻ� ���α׷��Դϴ�.\n���ڸ� �Է����ּ���.");
			System.out.print("���� >> ");
			int num = sc.nextInt();
//				�Է¹��� ���� ��� �� �� ¦�� �̸� "¦��" ���
//				Ȧ���̸� "Ȧ��" ��� �����̸� "����" ��� 0�̸� "0" ���� ��� �غ���  

			if (num >= 0) {
				if (num == 0) {
					System.out.println("0");
				} else if (num % 2 == 0) {
					System.out.println("¦��");
				} else {
					System.out.println("Ȧ��");
				}
			} else {
				System.out.println("����");
			}
			System.out.println("----���α׷� ����----");
		}

		if (select == 2) {
//			if ~ else if ~ else  [ ���� 2]
//					���� ��ȣ�� �Է� �޾� ���ǽ� ��ȣ�� ����ϴ� ���α׷��� ������
//					������ 1.���� 2.���� 3.���� 4.����
			System.out.println("�����ȣ�� �Է��ϸ� ���ǽ��� �˷��ݴϴ�.");
			System.out.println("1.���� 2.���� 3.���� 4.����");
			System.out.print("�ش��ϴ� ������ ��ȣ�� �Է� >> ");
			int num = sc.nextInt();
//			String room = ""
//			���� code ���� 
//			1�̸� "101ȣ �Դϴ�"
//			2�̸� "102ȣ �Դϴ�"
//			3�̸� "203ȣ �Դϴ�"
//			4�̸� " 202ȣ �Դϴ�"
//			�������� "�������� ���� ���ּ���" �� ����غ��� 
			if (num == 1) {
				System.out.println("101ȣ�Դϴ�.");
			} else if (num == 2) {
				System.out.println("102ȣ�Դϴ�.");
			} else if (num == 3) {
				System.out.println("201ȣ�Դϴ�.");
			} else if (num == 4) {
				System.out.println("202ȣ�Դϴ�.");
			} else {
				System.out.println("�������� ������ �ּ���.");
			}
			System.out.println("----���ǽ� �ȳ� ���α׷� ����----");
		}

		if (select == 3) {

//			if ~ else if ~ else [���� 3]
//					���� ���� �� ���� ����� 
			System.out.println("## ���������� ����##");
			System.out.println("1.���� 2.���� 3.��");
			int com = (int) (Math.random() * 3) + 1; // ��ǻ�� ���������� ����
			int player = sc.nextInt(); // �÷��̾� �Է�. ���� �ڵ�� �ڸ� �ٲٸ� �� ��.

			String player_ = ""; // �÷��̾� ���
			String com_ = ""; // ��ǻ�� ���

//			System.out.println(com); // ���������� �� �޾Ҵ��� Ȯ���ϴ� �ڵ�
						
			if (player == 1) {
				player_ = "����"; // 1 �Է� = ���� ���
			} else if (player == 2) {
				player_ = "����"; // 2 �Է� = ���� ���
			} else if (player == 3) {
				player_ = "��"; // 3 �Է� = �� ���
			}
			System.out.println("�÷��̾� :" + player_);

			if (com == 1) {
				com_ = "����";
			} else if (com == 2) {
				com_ = "����";
			} else if (com == 3) {
				com_ = "��";
			}
			System.out.println("��ǻ�� : " + com_);

			if (player == com) {
				System.out.println("���º�");
			} else if (player == com + 1 || (player == 1/* ���� */ && com == 3/* �� */)) {
				System.out.println("�÷��̾� ��");
			} else if (player + 1 == com || (player == 3 && com == 1)) {
				System.out.println("��ǻ�� ��");
			}
			System.out.println("----���� ����----");
		}

		if (select == 4) {
//			switch ~ case  [���� 4]

//					[����] ���� �Է¹޾� �ش� ���� �ϼ��� ����ϴ� ���α׷� �ۼ�
//
//					1�� �� 31��
//					2�� �� 29��
//					3�� �� 31��
//					4�� �� 30��
//					5�� �� 31��
//					6�� �� 30��
//					7�� �� 31��
//					8�� �� 31��
//					9�� �� 30��
//					10�� �� 31��
//					11�� �� 30��
//					12�� �� 31��

			
			
		}

	}

}
