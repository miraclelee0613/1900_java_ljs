package day04;

import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. ����ڿ��� ���̸� �Է� �޾Ƽ� 10 �� ���� ���̸� ����Ͽ� ����϶�
		// �Է� ����
		// ���� >> 27
		// ��� ����
		// 10�� �� ����� ���̴� 37���Դϴ�.

//		System.out.print("���� >> ");	// �ȳ�����
//		int age = sc.nextInt();	// ���� �Է�
//
//		age = age + 10; // age�� 10�� ���� �߰�
//
//		System.out.println("10�� �� ����� ���̴� " + age + "���Դϴ�.\n");	// ���� �������� ���� ���� ���
//
//		System.out.println("10�� �� ����� ���̴� " + (age + 10) + "���Դϴ�.\n");	// ��ȣ�� Ȱ��
//		

//		System.out.print("\n���� >> ");	// �ȳ�����
//		int age = sc.nextInt();	// ���糪�� �Է�
//
//		System.out.print("���� ���� >>");	// �ȳ�����
//		int old = sc.nextInt();	// ���� ���� �Է�
//		age = age + old;	// ���糪�� + ���� ����
//		System.out.println(old + "�� �� ����� ���̴� " + age + "���Դϴ�.");	// ���� ���̵� �Է��ϴ� �ڵ�

		// 2. ����ڿ��� ���� �ϳ��� �Է� �޾Ƽ�, 5�� �������� �� ��� �������� ����϶�
		// �Է� ����
		// ���� >> 27
		// ��� ����
		// 27�� 5�� ���� ���� 5, �������� 2�Դϴ�.

//
//		System.out.print("���� >> ");
//			int num1 = sc.nextInt();
//			int quot5 = num1 / 5;		// �Է��� ���� 5�� ���� ��
//			int rem5 = num1 % 5;		// �Է��� ���� 5�� ������ �� ������
//			
//		System.out.println(num1 + "�� 5�� ���� ���� "	+ quot5 
//								+ ", �������� "		+ rem5 + "�Դϴ�.\n");

//		System.out.print("���� >> ");
//		int sc1 = sc.nextInt();
//
//		System.out.println("���� �� >> ");
//		int sc2 = sc.nextInt();
//		
//		int sc1_1 = sc1 / sc2;
//		int sc1_2 = sc1 % sc2;

//		System.out.println(sc1 + "�� " + sc2 + "�� ���� ���� " + sc1_1 + ", �������� " + sc1_2 + "�Դϴ�.");

		// 3. ����ڿ��� �� �ڸ��� ������ �Է� �޾Ƽ�, ���� �ڸ��� ���� �ڸ��� ���� ����϶�
		// �Է� ����
		// ���� >> 85
		// ��� ����
		// �����ڸ� : 8
		// �����ڸ� : 5

		System.out.print("\n���� >> ");
		int numb1 = sc.nextInt();
		int numbs10 = numb1 / 10;
		int numbs1 = numb1 % 10;

		System.out.println("���� �ڸ� : " + numbs10);
		System.out.println("���� �ڸ� : " + numbs1);

		// 4. �뷡 �� ��� 300���� ���γ뷡���� �ִ�. ����ڿ��� �ݾ��� �Է� �ް�,
		// �θ� �� �ִ� �뷡 ����� �ܵ��� ����϶�.
		// �Է� ����
		// �ݾ� �Է� >> 1600
		// ��� ����
		// �θ� �� �ִ� �뷡 : 5 ��
		// �ܵ� 100���� ��ȯ�Ǿ����ϴ�.
		int price = 300;
		System.out.print("\n�ݾ� �Է� >>");
		int won = sc.nextInt();
		int song = won / price;
//		int song = won / 300;

		System.out.println("�θ� �� �ִ� �뷡 : " + song + "��");

		int etc = won % price;
//		int etc = won % 300;
		System.out.println("�ܵ� " + etc + "���� ��ȯ�Ǿ����ϴ�.\n");

		// 5. ����ڿ��� ����, ����, ���� ������ �Է� �޾Ƽ� ����� ����϶�(��, ������ ������ �Է¹޴´�.)
		// �Է� ����
		// �������� >> 80
		// �������� >> 80
		// �������� >> 81
		// ��� ����
		// ����� ��������� 80.33���Դϴ�.

		System.out.print("�������� >> ");
		double kor = sc.nextInt();
		System.out.print("\n�������� >> ");
		double eng = sc.nextInt();
		System.out.print("\n�������� >> ");
		double mat = sc.nextInt();

		double aver = (kor + eng + mat) / 3;

		System.out.printf("����� ��������� %.2f���Դϴ�.", aver);

	}

}
