package day10SelfStudy;
import java.util.Scanner;
public class AdultOr {
	public static String adultOrNot(int age) {

		String adult = "";
		if(age >= 19) {
			adult = "성인";
		}else {
			adult = "미성년자";
		}
		return adult;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 사용자에게 나이를 입력받아서 미성년자인지 아닌지 판단하는 메소드
		System.out.println("나이를 입력하세요.");
		System.out.print("입력 >> ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println();
		System.out.println(adultOrNot(age) + "입니다.");
		
		
		
		
		
		
		
		
	}
}
