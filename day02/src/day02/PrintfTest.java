package day02;

public class PrintfTest
{

	public static void main(String[] args)
	{
		// ctrl + m : ��üȭ�� ����Ű
		System.out.printf("������ \t%04d���Դϴ�.\n", 14);
		System.out.printf("�������� \t%04.2f�Դϴ�.\n", 3.14);
		System.out.printf("���� ������ %c�Դϴ�\n", 'A');
		System.out.printf("���� �̸��� %s�Դϴ�\n", "���ػ�");
		
		// �������� ���������ڰ� ���ȴٸ� ������� �����Ѵ�.
		System.out.printf("%s %d %c %.2f\n", "�ȳ�", 10, 'A', 3.14);
		
	}

}
