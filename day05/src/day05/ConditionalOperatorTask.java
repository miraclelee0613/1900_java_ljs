package day05;

import java.util.Scanner;

public class ConditionalOperatorTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. ����ڿ��� ���� �� ���� �Է� �޾Ƽ�
		// (���� ���ٸ� ���ٰ� ����ϱ�)
		// �� �� �� ū �� ����ϱ�
		// �Է¿���
		// ����1�Է� >> 50
		// ����2�Է� >> 20
//		System.out.print("����1�Է� >> ");
//		int int1 = sc.nextInt();
//		System.out.print("����2�Է� >> ");		
//		int int2 = sc.nextInt();

		// ��¿���
		// �� �� �� ū ���� 50�Դϴ�.
//		String same = "�� ���� ���� �����ϴ�.";
//		String big = ("�� �� �� ū ���� " + (((int1 > int2) ? int1 + "" : int2 + "") + "�Դϴ�"));
//		String result = (int1 >= int2 && int1 <= int2) ? same : big ;
//		System.out.println(result);

//		int result = (int1 > int2) ? int1 : int2;
//		System.out.println("�� �� �� ū ���� " + result + "�Դϴ�.");

		/* �㰭�� �� �ڵ�
		System.out.print("���� �Է� : ");
		int a = sc.nextInt();
		System.out.print("\n���� �Է� : ");
		int b = sc.nextInt();
		boolean highlow = a < b || a > b;
		int c = a < b ? b : a;
//		int d = a < b ? a : b;
//		System.out.println(highlow ? "���ߴ�ū����" + c + "�Դϴ�" : "�� ���� ��� �����ϴ�");*/


		// 2. �Ʊ� �Է¹��� �� ���� ��(ū�� - ������)�� ����ϱ�
		// ��¿���
		// �� ���� ���� 30�Դϴ�.
		/* �㰭�� �� �ڵ�
//		System.out.println(a < b ? b - d : c - b);
		*/
//		System.out.println(a < b ? b - a : a - b); // �� �ڵ�� �ٲٴ� �� �� ���ƺ���.
		
		
//		int gap = (int1 > int2) ? int1 - int2 : int2 - int1;
//		
//		System.out.println("�� ���� ���� " + gap + "�Դϴ�.");

		// 3. ����ڿ��� ���̸� �Է� �޾Ƽ�
		// 8�� �̻� 20�� �̸��� 2500��,
		// �׿��� ��쿡�� ������ ����ϱ�
		// �Է¿���
		// ���� >> 25

		System.out.println("���� >> ");
		int age1 = sc.nextInt();

		// ��¿���
		// ����

		String price = (age1 >= 8 && age1 < 20) ? "2500��" : "����";
		 
		System.out.println("���� : " + price);

		// 4. 8�� �̻�, Ű 150 �̻� Ż �� �ִ� ���̱ⱸ�� �ִ�
		// ����ڿ��� ���̿� Ű�� �Է� �޾Ƽ� ž�°���/ �Ұ��� ����ϱ�

//		System.out.print("���� >> ");
//		int age2 = sc.nextInt();
//		System.out.print("Ű >> ");
//		double tall = sc.nextInt();
//		
//		String pass = (age2 >= 8 && tall >= 150.0) ? "ž�°���" : "ž�� �Ұ���";
//		System.out.println(pass);

		
		
		// 5. �� ���ڴ� 20���� ����� ���� ���ڰ� �ִ�.
		// ����� ������ �Է� �޾Ƽ� ��� ���忡 �ʿ��� ������ ���� ����ϱ�
		// �Է¿���
		// ��� ���� >> 25

//		System.out.print("��� ���� >> ");
//		int ram = sc.nextInt();
//		int box = (ram / 20) + ((ram % 20) > 0 ? 1 : 0);

		// ��¿���
		// �ʿ��� ������ ������ 2���Դϴ�.

		System.out.println("�빮�� Ȥ�� �ҹ��� Ȥ�� �׿��� ���� �Է� >> ");

//		char target = 'B';
		char target = sc.next().charAt(0);

		// target���� �빮�� Ȥ�� �ҹ����� ���ڸ� �� �� �ִ�.
		// ���� target�� �빮�ڰ� ����ִٸ� �ҹ��ڷ� �ٲپ� ����ϱ�
		// �ҹ��ڶ�� �빮�ڷ� �ٲپ� ����ϱ�

//		int result = ((target < 97) ? (target + 32) : (target - 32));
//		System.out.println((char)result);

		// (target�� �빮�� Ȥ�� �ҹ��� Ȥ�� �׿��� ���ڰ� �� �� �ְ�, �׿��� ���ڴ�
		// �״�� ����ϱ�)
		char t = target;
//		char result2 = 	(char)
//						(
//							(t >= 65 && t <= 90)//�빮�� ����
//						||// �빮�� Ȥ�� �ҹ��� �� �� �ϳ��� ������ ���°�?
//							(t >= 97 && t <= 122)// �ҹ��� ����
//						? // �� �� �ϳ��� ������ ���ٸ�
//									(target < 97// �ҹ��� ������ 97���� ������?
//										? 	// ���� �۴ٸ�
//											(target + 32)	// 32�� ���� �빮�ڷ� �����
//										: 				// �ƴ϶��
//											(target - 32)// 32�� �� �ҹ��ڷ� ������.
//									)
//						: target);	// �빮�ڳ� �ҹ��ڰ� �ƴ϶�� �״�� ����϶�.
//		System.out.println(result2);

		boolean Aa = t >= 65 && t <= 122;
		boolean A = t < 91;
		boolean a = t >= 97;

		char result3 = (char) (Aa ? (A ? t + 32 : (a ? t - 32 : t)) : t);

		System.out.println(result3);
		
		
		
		boolean A2 = (t >= 65 && t < 91);
		boolean a2 = (t >= 97 && t <=122);
		
		char result4 = (char) (A2 || a2 ? (A2 ? t + 32 : t - 32) : t);

	}

}
