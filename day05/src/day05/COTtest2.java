package day05;

import java.util.Scanner;

public class COTtest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�빮�� Ȥ�� �ҹ��� Ȥ�� �׿��� ���� �Է� >> ");
		char target = sc.next().charAt(0);	// �Է¹��� ���� �� ���� ��(0)���ڸ� char�� �޾ƿ���

		// target���� �빮�� Ȥ�� �ҹ����� ���ڸ� �� �� �ִ�.
		// ���� target�� �빮�ڰ� ����ִٸ� �ҹ��ڷ� �ٲپ� ����ϱ�
		// �ҹ��ڶ�� �빮�ڷ� �ٲپ� ����ϱ�
		// target�� �빮�� Ȥ�� �ҹ��� Ȥ�� �׿��� ���ڰ� �� �� �ְ�, �׿��� ���ڴ�
		// �״�� ����ϱ�

		char t = target;	// ������ ���̱�
		boolean Aa = t >= 65 && t <= 122;	// A���� z���� ��ȣ�� ������ ����
		boolean A = t < 91;					// Aa �� �빮��
		boolean a = t >= 97;				// Aa �� �ҹ���
		
		char result3 = 	(char)(Aa ?	(A ? t + 32 : (a ? t - 32 : t)) : t);

		System.out.println(result3);
		
		
	}

}
