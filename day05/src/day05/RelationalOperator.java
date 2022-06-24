package day05;

public class RelationalOperator {

	public static void main(String[] args) {
		
		System.out.println(10 > 15);
		System.out.println(10 < 13.1);
		System.out.println(97 == 'a');
		System.out.println('a' > 'b');
		
		// 문자열은 관계연산자 사용 불가능
//		System.out.println("안녕" >= "반가워");
		
		// 문자열은 클래스이기 때문에 서로 같은지 비교할 때
		// 메소드를 써야 한다★★★★★.
		// 문자열1.equals(문자열2)	:	문자열1과 문자열2가 같다면 true, 아니라면 false
		System.out.println("---------------------");
		System.out.println("안녕".equals("반가워"));
		System.out.println("안녕".equals("안녕"));		
//		
//		System.out.println("안녕" == "안녕");
		System.out.println("---------------------");
		System.out.println(false == false);
		
	}

}
