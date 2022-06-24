package day05;

import java.util.Scanner;

public class COTtest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("대문자 혹은 소문자 혹은 그외의 문자 입력 >> ");
		char target = sc.next().charAt(0);	// 입력받은 내용 중 가장 앞(0)글자만 char로 받아오기

		// target에는 대문자 혹은 소문자의 문자만 들어갈 수 있다.
		// 만약 target에 대문자가 들어있다면 소문자로 바꾸어 출력하기
		// 소문자라면 대문자로 바꾸어 출력하기
		// target에 대문자 혹은 소문자 혹은 그외의 문자가 들어갈 수 있고, 그외의 문자는
		// 그대로 출력하기
		
		char t = target;	// 변수명 줄이기

		boolean Aa = t >= 65 && t <= 122;	// A부터 z까지 기호를 포함한 범위
		boolean A = t < 91;					// Aa 중 대문자
		boolean a = t >= 97;				// Aa 중 소문자
		
		char result3 = 	(char)(Aa ?			// A~z 범위인가?
						(A ?				// 맞다면 대문자인가?
							t + 32			// 맞다면 32를 더한 후 출력. 
							: (a ?			// 아니라면 소문자인가?
									t - 32	// 맞다면 32를 뺀 후 출력. 
									: t		// 아니라면 그대로 출력
									)) : t);// A~z 범위 밖이라면 그대로 출력

		System.out.println(result3);
		
		
	}

}
