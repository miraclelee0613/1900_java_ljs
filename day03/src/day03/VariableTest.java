package day03;

public class VariableTest 
{

	public static void main(String[] args) 
	{
		int number; 	// 변수의 선언, 반드시 변수의 자료형을 명시해야만 한다.
		number = 10;	// '초기화initialize' 변수에 최초 값 대입
		System.out.println(number);
		// 변수를 선언하고, 최초로 값을 넣지 않은 상태에서
		// 변수를 값처럼 사용할 수는 없다.
		number = 20;
		System.out.println(number);
		
//		double number; // 같은 영역에서 같은 이름의 변수를 선언할 수는 없다.
		
		// 변수에 "이준상"을 저장한 후, 해당 변수에 들어있는 값을
		// 콘솔창에 출력하기
		// 변수의 선언과 초기화를 동시에
		String name = "이준상";
		System.out.println(name);
		
//		String name = "김철수";
		
		
		
	}

}
