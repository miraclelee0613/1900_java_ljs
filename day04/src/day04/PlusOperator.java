package day04;

public class PlusOperator 
{

	public static void main(String[] args) 
	{
		System.out.println("---int + ??---");		//
		System.out.println(10 + 10);				// int 	+ int 		--> int
		System.out.println(10 + 3.1);				// int 	+ double 	--> double
		// char 값은 이미 부여된 고유의 숫자로 판단한다.
		// char 값에 부여된 숫자를 정리한 표가 아스키 코드표이다.
		System.out.println(10 + 'a');				// int 	+ char 		--> int
		System.out.println(10 + "안녕");				// int 	+ String 	--> String
		
		System.out.println("---double + ??---");	// 
		System.out.println(3.0 + 5);				// double + int 	--> double 
		System.out.println(3.1 + 1.9);				// double + double 	--> double
		System.out.println(10.1 + 'a');				// double + char 	--> double
		System.out.println(3.1 + "안녕"); 			// double + String 	--> String
		
		System.out.println("---char + ??---");
		System.out.println('a' + 10); 				// char + int 		--> int
		System.out.println('a' + 10.1); 			// char + double 	--> double
		System.out.println('a' + 'A');  			// char + char 		--> int
		System.out.println('a' + "안녕");  			// char + String	--> String
		
		System.out.println("---String + ??---");	//
		System.out.println("안녕" + 10);				// String + int 	--> String
		System.out.println("안녕" + 10.1);			// String + double	--> String
		System.out.println("안녕" + 'a');			// String + char 	--> String
		System.out.println("안녕" + "반가워요");		// String + String 	--> String
		
		System.out.println("-----------------");
		
		System.out.println(10 + '1' + "A" + 50 + 10.1);// 10 + 49 => 59 + A + 50 + 10.1 => 59A5010.1
		System.out.println("" + 10 + 20 + 'a');  	// 1020a
		char ch = 'a';
		System.out.println(ch + 5 + "" + 20.1);  	// 97 + 5 => 102 + "" + 20.1 =>10220.1
		
		
		
		}

}
