package day03;
import java.util.Scanner;

public class InputTask 
{

	public static void main(String[] args) 
	{
		// ����ڿ��� �̸��� �Է� �޾Ƽ�
		// ---�� ȯ���մϴ�
		// ---���� ����� VIP�Դϴ�
		// ����ϱ�
		// �Է¿���:
		//  �̸� : ��ö��
		// ��¿���:
		//	��󿱴� ȯ���մϴ�
		//	��󿱴��� ����� VIP�Դϴ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		// next() : ����� �����Ͽ� String Ÿ������ �޾ƿ�.
		// nextLine() : ���ͷ� �����Ͽ� String Ÿ������ �޾ƿ�.
		String name = sc.nextLine();		// ���� �������� �Է¹��� ���� ����
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		
//		System.out.println(name + "�� ȯ���մϴ�.");		// �ջ���� �� �ڵ�
//		System.out.println(name + "���� ����� VIP�Դϴ�.");//    "		"
		System.out.printf("%s �� ȯ���մϴ�.\n"
						+ "%s ���� ����� VIP�Դϴ�.\n", name, name);
		System.out.printf("%s ���� ���̴� %d���Դϴ�.\n", name, age);
//		System.out.printf("%s �� ȯ���մϴ�\n", name);			// ���簡 �� �ڵ�
//		System.out.printf("%s ���� ����� VIP�Դϴ�.", name);	// 	"	"	"
		
		
	}

}
