package day05;

public class CastingTest 
{

	public static void main(String[] args) 
	{
		System.out.println((int)3.1);
		System.out.println((double)10);
		System.out.println((char)97);
		System.out.println();
		//String은 클래스이기 때문에 기본자료형끼리 변환하듯이 변환할 수 없다.
//		System.out.println((char)"a");
		
		// String --> int
		// parseInt()메소드는 Integer클래스에 만들어져 있다.
		// 괄호 안에 있는 문자열 값을 int타입으로 바꾼다.
		System.out.println(Integer.parseInt("50"));
		int a = Integer.parseInt("30");
		System.out.println(a);
		
		// int --> String
		// toString
		// 메소드 사용 결과는 괄호 안에 있는 int값을 String으로 바꾼 값이다.
		String num = Integer.toString(50);
//		System.out.println(num);
		
		// String --> double
		// parseDouble(), Double클래스에 만들어져 있다.
		double d = Double.parseDouble("3.14");
//		System.out.println(d);
		
		// double --> String
		// toString(), Double 클래스 안에 만들어져 있다.
		String s = Double.toString(3.14);
		
		// auto를 지원한다(자동)
		double test = 10;			// 10이 double타입으로 바뀐 후 변수에 저장됨 auto casting
		System.out.println(test);
		
		char c = (char)65;			// 65가 'A'로 auto casting
		System.out.println(c);
		
//		int i = 10.0;
		// 10 --> "10"
//		Integer.toString()
		String number = 10 + "";
		
		// 연산결과를 바탕으로 자동형변환을 사용할 수 있다.
		// 10 --> 10.0
//		10 + 0.0
//		10 * 1.0
//		(double)10
		
		
		
		
		
		
		
		
	}

}
