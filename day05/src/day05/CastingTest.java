package day05;

public class CastingTest 
{

	public static void main(String[] args) 
	{
		System.out.println((int)3.1);
		System.out.println((double)10);
		System.out.println((char)97);
		System.out.println();
		//String�� Ŭ�����̱� ������ �⺻�ڷ������� ��ȯ�ϵ��� ��ȯ�� �� ����.
//		System.out.println((char)"a");
		
		// String --> int
		// parseInt()�޼ҵ�� IntegerŬ������ ������� �ִ�.
		// ��ȣ �ȿ� �ִ� ���ڿ� ���� intŸ������ �ٲ۴�.
		System.out.println(Integer.parseInt("50"));
		int a = Integer.parseInt("30");
		System.out.println(a);
		
		// int --> String
		// toString
		// �޼ҵ� ��� ����� ��ȣ �ȿ� �ִ� int���� String���� �ٲ� ���̴�.
		String num = Integer.toString(50);
//		System.out.println(num);
		
		// String --> double
		// parseDouble(), DoubleŬ������ ������� �ִ�.
		double d = Double.parseDouble("3.14");
//		System.out.println(d);
		
		// double --> String
		// toString(), Double Ŭ���� �ȿ� ������� �ִ�.
		String s = Double.toString(3.14);
		
		// auto�� �����Ѵ�(�ڵ�)
		double test = 10;			// 10�� doubleŸ������ �ٲ� �� ������ ����� auto casting
		System.out.println(test);
		
		char c = (char)65;			// 65�� 'A'�� auto casting
		System.out.println(c);
		
//		int i = 10.0;
		// 10 --> "10"
//		Integer.toString()
		String number = 10 + "";
		
		// �������� �������� �ڵ�����ȯ�� ����� �� �ִ�.
		// 10 --> 10.0
//		10 + 0.0
//		10 * 1.0
//		(double)10
		
		
		
		
		
		
		
		
	}

}
