package day04;

public class DivideOperator 
{

	public static void main(String[] args) 
	{
		
		System.out.println(11 / 2);		// int / int --> int(몫)
		System.out.println(11 / 2.0);	// int / double --> double
		System.out.println(100 / 'a');	// int / char --> int
		// 문자열 나눗셈 사용 불가능
		
		System.out.println(10.0 / 2.0);	// double / double --> double
		System.out.println(100.0 / 'a');// double / char --> double
		
		System.out.println('b' / 'a');	// char / char --> int
		
//		System.out.println(10 / 0); // 0으로 나눌 수 없다.		
		
		// 나머지 연산자 %
		System.out.println(10 % 3);	// 
		
		
	}

}
