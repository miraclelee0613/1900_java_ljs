package day06;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1. ����ڿ��� ���� �� ���� �Է� �޾Ƽ�
	      // (�� �� ���ٸ� ���ٰ� ����ϱ�)
	      // �� �� �� ū �� ����ϱ�
	      //�Է¿���
	      //   ����1�Է� >> 50
	      //   ����2�Է� >> 20
//		System.out.print("����1�Է� >> ");
//		int num1 = sc.nextInt();
//		System.out.print("����2�Է� >> ");
//		int num2 = sc.nextInt();
//		
//		int result = (num1 > num2 ? num1 : num2);
//		
//	      //��¿���
//	      //   �� �� �� ū ���� 50�Դϴ�
//		System.out.println("�� �� �� ū ���� " + result + "�Դϴ�.");
//		
//		
//		
//		
//	      //2. �Ʊ� �Է¹��� �� ���� ��(ū�� - ������)�� ����ϱ�
//	      //��¿���
//	      //   �� ���� ���� 30�Դϴ�
//		
//		int gap = (num1 > num2 ? num1 - num2 : num2 - num1);
//		System.out.println("�� ���� ���� " + gap + "�Դϴ�.");
		
		
		
	      //3. ����ڿ��� ���̸� �Է� �޾Ƽ�
	      // 8�� �̻� 20�� �̸��� 2500��,
	      // �׿��� ��쿡�� ������ ����ϱ�
	      //�Է¿���
	      //   ���� >> 25
//		System.out.print("���� >> ");
//		int age = sc.nextInt();
//		
//		
//	      //��¿���
//	      //   ����
//	    System.out.println(age >= 8 && age < 20 ? "2500��" : "����");
//	    System.out.println(!(age >= 8 && age < 20) ? "����" : "2500��");
//		System.out.println(age < 8 || age >= 20 ? "����" : "2500��");
		
		
	      //4. 8�� �̻�, Ű 150 �̻� Ż �� �ִ� ���̱ⱸ�� �ִ�
	      // ����ڿ��� ���̿� Ű�� �Է� �޾Ƽ� ž�°��� / ž�ºҰ��� ����ϱ�
	      
//		System.out.print("���� >> ");
//		int age = sc.nextInt();
//		System.out.print("Ű >> ");
//		int height = sc.nextInt();
//		
//		System.out.println(age >= 8 && height >= 150 ? "ž�°���" : "ž�� �Ұ���");
		
	      //5. �� ���ڴ� 20���� ����� ���� ���ڰ� �ִ�
	      // ����� ������ �Է� �޾Ƽ� ��� ���忡 �ʿ��� ������ ���� ����ϱ�
	      //�Է¿���
	      //   ��鰹�� >> 25
//	    System.out.print("��� ���� >> ");
//		int ram = sc.nextInt();
//		
//		  //��¿���
//	      //   �ʿ��� ������ ������ 2���Դϴ�.
//		int ea = (ram / 20) + ((ram % 20) > 0 ? 1 : 0);  
//		int ea = (ram / 20) + (ram % 20 == 0 ? 0 : 1);  
//		System.out.println("�ʿ��� ������ ������ " + ea + "���Դϴ�.");
//		
//		int boxCnt = (ram % 20 == 0) ? (ram / 20) : (ram / 20 + 1);
//		System.out.println("�ʿ��� ������ ������ " + boxCnt + "���Դϴ�.");
		
		
	      
	      char target = 'a';
	      //target���� �빮�� Ȥ�� �ҹ����� ���ڸ� �� �� �ִ�
	      // ���� target�� �빮�ڰ� ����ִٸ� �ҹ��ڷ� �ٲپ� ����ϱ�
	      // �ҹ��ڶ�� �빮�ڷ� �ٲپ� ����ϱ�
//	      
//	      char t = target;
//	      char big = (char)(t);
	      
//	      System.out.println((char)(target >= 65 && target <= 90 ? target + 32 : target - 32));
//	      
//	      System.out.println((char)(target >= 'A' && target <= 'Z' ? target + 32 : target - 32));
	      
	      
	      //(target�� �빮�� Ȥ�� �ҹ��� Ȥ�� �׿��� ���ڰ� �� �� �ְ�, �׿��� ���ڴ�
	      // �״�� ����ϱ�)

	      
	      
	      //1. �� ������ �Է¹ް� �� �� �� ū ��, ���� ���ٸ� ���ٰ� ���

//			System.out.print("����1�Է� >> ");
//			int num1 = sc.nextInt();
//			System.out.print("����2�Է� >> ");
//			int num2 = sc.nextInt();
//
//			String res = num1 > num2 ? num1 + "" : num2 > num1 ? num2 + "" : "����";
//			
//			
//			
//			boolean qsame = num1 < num2 || num1 > num2 ;
//			int qbig = num1 < num2 ? num2 : num1;
//			System.out.printf(qsame ? ("�� ���� �� ū ���� " + qbig + "�Դϴ�.") : "�� ������ ũ�Ⱑ �����ϴ�.");

			//2. target�� ����ִ� ���� �빮�ڶ�� �ҹ��ڷ�, �ҹ��ڶ�� �빮�ڷ�, �׿��� ���ڶ�� �״�� ����ϱ�
	      
	      	target = '��';
	      	char res = (char)	((target >= 'A' && target <= 'Z') ? (target + 32) :
	      						(target >= 'a' && target <= 'z' ? target - 32 : target));
	    	System.out.println(res);	  
	    		  
	      
	      
	      
	}

}
