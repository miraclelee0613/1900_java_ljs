package day10SelfStudy;

import java.util.Scanner;

public class AdultOr {
	public static String adultOrNot(int age) {
		// ���̸� �Է��ϸ� ����/�̼����ڸ� String Ÿ������ return�ϴ� ���
		String adult = "";
		if (age >= 19) {
			adult = "����";
		} else {
			adult = "�̼�����";
		}
		return adult;
	}

	public static String arrOut(int[] arr) {
		// ������ �迭�� �迭 ����� String Ÿ������ return�ϴ� ���
		String arrange = "{";

		for (int i = 0; i < arr.length - 1; i++) {
			arrange += arr[i] + ", ";
		}
		arrange += arr[arr.length - 1] + "}";

		return arrange;
	}

	public static String arrToSqr(int[][] array) {
				// intŸ���� ���߹迭�� �Է¹޾�
				// ���������� ��ġ�� StringŸ���� ������ return�ϴ� �޼ҵ�
		String arrange = "";	// return�� String ���� ���� �� �ʱ�ȭ
		for (int i = 0; i < array.length; i++) {	// �迭�� ��
			for (int j = 0; j < array[0].length; j++) {	// �迭�� ��
				if(array[0].length > 1) {
					// ���� ���̰� 1���� ū ��� if�� ����
					if (i == array.length - 1 && j == array[0].length - 1) {
						// �������� �������� 
						arrange += ", " + array[i][j] + "}";
						// �տ� ������ �ڿ� �߰�ȣ
					} else if (j == 0) {
						// ��� ������� ��� ù ����
						arrange += "{" + array[i][j];
						// �տ� �߰�ȣ
						
					} else if (j < array[0].length - 1) {
						// ���� ������ �����ϰ� ���� �������� �ƴ϶��
						arrange += ", " + array[i][j];
						// �տ� ����
					} else {
						// �� ��� ������ �ƴ϶�� -> ���������� ������ ��� ���� ������ ��
						arrange += ", " + array[i][j] + "},\n";
						// �տ� ���� �ڿ� �߰�ȣ�� ������ ����
					}	// if~else�� ����
				}else {	// ���� ���̰� 1�� ���
					if(i != array.length - 1) {
						// ���������� �ƴ� ���
						arrange += "{" + array[i][j] + "},\n";
						// �յڷ� �߰�ȣ�� �ڿ� ����
					}else {
						// ���������� ���
						arrange += "{" + array[i][j] + "}";
						// �յڷ� �߰�ȣ
					}	// ���� ���̰� 1�̰� ���������� ��� else�� ����
				}	// ���� 1�� ��� else�� ����
			}	// �迭�� �� ����
		}	// �迭�� �� ����
		return arrange;
		// return�� String��

	}	// �޼ҵ� arrToSqr ����
	
	public static String intToArrSqr(int a, int b) {
				// returnŸ���� String, ���� �� ���� �ް�
				// ���������� ��ġ�� StringŸ���� ������ return�ϴ� �޼ҵ�
		String arrange = "";	// return�� String ���� ���� �� �ʱ�ȭ
		int array[][] = new int[a][b];	// ���� ������ �迭 ����

		for (int i = 0; i < array.length; i++) {	// �迭�� ��
			for (int j = 0; j < array[0].length; j++) {	// �迭�� ��
				if(array[0].length > 1) {
					// ���� ���̰� 1���� ū ��� if�� ����
					if (i == array.length - 1 && j == array[0].length - 1) {
						// �������� �������� 
						arrange += ", " + array[i][j] + "}";
						// �տ� ������ �ڿ� �߰�ȣ
					} else if (j == 0) {
						// ��� ������� ��� ù ����
						arrange += "{" + array[i][j];
						// �տ� �߰�ȣ
						
					} else if (j < array[0].length - 1) {
						// ���� ������ �����ϰ� ���� �������� �ƴ϶��
						arrange += ", " + array[i][j];
						// �տ� ����
					} else {
						// �� ��� ������ �ƴ϶�� -> ���������� ������ ��� ���� ������ ��
						arrange += ", " + array[i][j] + "},\n";
						// �տ� ���� �ڿ� �߰�ȣ�� ������ ����
					}	// if~else�� ����
				}else {	// ���� ���̰� 1�� ���
					if(i != array.length - 1) {
						// ���������� �ƴ� ���
						arrange += "{" + array[i][j] + "},\n";
						// �յڷ� �߰�ȣ�� �ڿ� ����
					}else {
						// ���������� ���
						arrange += "{" + array[i][j] + "}";
						// �յڷ� �߰�ȣ
					}	// ���� ���̰� 1�̰� ���������� ��� else�� ����
				}	// ���� 1�� ��� else�� ����
			}	// �迭�� �� ����
		}	// �迭�� �� ����
		return arrange;
		// return�� ���� arrange ����
	}	// �޼ҵ� intToArrSqr ����

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ����ڿ��� ���̸� �Է¹޾Ƽ� �̼��������� �ƴ��� �Ǵ��ϴ� �޼ҵ�
		System.out.println("���̸� �Է��ϼ���.");
		System.out.print("�Է� >> ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println();
		System.out.println(adultOrNot(age) + "�Դϴ�.");

		System.out.println();

		System.out.println("�迭�� ���̸� �Է��ϼ���.");
		System.out.print("�Է� >> ");
		int length = Integer.parseInt(sc.nextLine());
		int[] asdf = new int[length];
		System.out.print(arrOut(asdf));

		System.out.println();
		
		System.out.println("�����迭 ���� arrToSqr");
		int[][] asdff = new int[8][1];
		System.out.print(arrToSqr(asdff));
		System.out.println("\n");
		System.out.println("�����迭 ���� intToArrSqr");
		System.out.println(intToArrSqr(8,3));
	}
}
