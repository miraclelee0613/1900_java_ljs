package day05;

public class LogicalOperator 
{

	public static void main(String[] args) 
	{
		System.out.println("---&&---");
		System.out.println(true && true);	// true
		System.out.println(true && false);	// false
		System.out.println(false && true); 	// false
		System.out.println(false && false);	// false

		System.out.println("---||---");
		System.out.println(true	 || true);	// true
		System.out.println(true	 || false);	// true
		System.out.println(false || true); 	// true
		System.out.println(false || false);	// false
		
		System.out.println("---!---");
		System.out.println(!true);			// false
		System.out.println(!false);			// true
		System.out.println(!(10 % 2 == 0) && ((8 + 10) > 5));
//		System.out.println(!(true || true));
		
		
	}

}
