package day07;

import java.util.Scanner;

public class SwitchTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		 ����ڿ��� ������ �Է¹ް�(�� ������ 0 ~ 100 ������ ������ �Է� �޴´�) 
//		System.out.print("���� �Է� >> ");
//		int score = sc.nextInt();
		// 90�̻� 100���̶�� A
		// 80�̻� 90�̸��̶�� B
		// 70�̻� 80�̸��̶�� C
		// 70�̸��̶�� F
//		switch(score) {
//		case 100: case 99:case 98:case 97:case 96:case 95:case 94:case 93:case 92:case 91:case 90:
//			System.out.println("A");
//			break;
//		case 89:case 88:case 87:case 86:case 85:case 84:case 83:case 82:case 81:case 80:
//			System.out.println("B");
//			break;
//		case 79:case 78:case 77:case 76:case 75:case 74:case 73:case 72:case 71:case 70:
//			System.out.println("C");
//			break;
//		default :
//			System.out.println("F");
//			}
//
//		String grade = "";
//		switch(score/10) 
//		{
//		case 10, 9:	// case 10: case 9:
////			System.out.println("A");
//			grade = "A";
//			break;
//		case 8:
////			System.out.println("B");
//			grade = "B";
//			break;
//		case 7:
////			System.out.println("C");
//			grade = "C";
//			break;
//			default:
//				grade = "F";
////		case 6: case 5: case 4: case 3: case 2: case 1: case 0:
////			System.out.println("F");
//			break;
//		}
//		System.out.println("����� ������ " + grade + "�Դϴ�.");
//		
//	}
		
		
		
//		  ����ڿ��� ���� �Է¹ް�, �ش� ���� ������ ���� ����ϱ� (2���� 28���� �������̶�� �����Ѵ�)
		System.out.println("�� �Է� >> ");
		int month = sc.nextInt();
		
		int lastday = 0;
		
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12:
			lastday = 31;
		break;
		case 2:
			lastday = 28;
			break;
		case 4,6,9,11:
			lastday = 30;
		break;
		default:
			System.err.println("�߸� �Է��߽��ϴ�.");
			break;
		}
//		if(month >= 1 && month <=12) {
		if(lastday != 0) {	// �߸� �Է����� �ʾҴٸ�
			System.out.println(month + "���� ������ ���� " + lastday + "�Դϴ�.");
		}

		
		
		
		
	}

}
