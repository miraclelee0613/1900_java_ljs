package day05;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 4. �뷡 �� ��� 300���� ���γ뷡���� �ִ�. ����ڿ��� �ݾ��� �Է� �ް�,
		// �θ� �� �ִ� �뷡 ����� �ܵ��� ����϶�
		// �Է¿���
		// �ݾ��Է� >> 1600

//		int price = 300;

//		System.out.print("�ݾ��Է� >> ");
//		int money = sc.nextInt();

		// ��¿���
		// �θ� �� �ִ� �뷡 : 5��
		// �ܵ� 100���� ��ȯ�Ǿ����ϴ�
//		  System.out.println("�θ� �� �ִ� �뷡 : " + money / price + "��");
//		  System.out.println("�ܵ� " + money % price + "���� ��ȯ�Ǿ����ϴ�.");

		// 5. ����ڿ��� ����, ����, ���� ������ �Է� �޾Ƽ� ����� ����϶�(��, ������ ������ �Է¹޴´�)
		// �Է¿���
		// �������� >> 80
		// �������� >> 80
		// �������� >> 81
		System.out.print("�������� >> ");
		double kor = sc.nextInt();
		System.out.print("�������� >> ");
		double eng = sc.nextInt();
		System.out.print("�������� >> ");
		double math = sc.nextInt();

		// ��¿���
		// ����� ��������� 80.33�� �Դϴ�
//		 System.out.println("����� ��������� " + (kor + eng + math) / 3.0 + "���Դϴ�.");
		System.out.printf("����� ��������� %.2f���Դϴ�\n", (kor + eng + math) / 3.0);
//		 System.out.printf("����� ��������� %.2f���Դϴ�\n", (double)(kor + eng + math) / 3.0);

	}

}
