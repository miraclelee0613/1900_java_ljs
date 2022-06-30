package day05;

import java.util.Scanner;

public class ConditionalOperatorTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. 사용자에게 정수 두 개를 입력 받아서
		// (둘이 같다면 같다고 출력하기)
		// 둘 중 더 큰 수 출력하기
		// 입력예시
		// 정수1입력 >> 50
		// 정수2입력 >> 20
//		System.out.print("정수1입력 >> ");
//		int int1 = sc.nextInt();
//		System.out.print("정수2입력 >> ");		
//		int int2 = sc.nextInt();

		// 출력예시
		// 둘 중 더 큰 수는 50입니다.
//		String same = "두 수의 값이 같습니다.";
//		String big = ("둘 중 더 큰 수는 " + (((int1 > int2) ? int1 + "" : int2 + "") + "입니다"));
//		String result = (int1 >= int2 && int1 <= int2) ? same : big ;
//		System.out.println(result);

//		int result = (int1 > int2) ? int1 : int2;
//		System.out.println("둘 중 더 큰 수는 " + result + "입니다.");

		/* 허강산 님 코드
		System.out.print("숫자 입력 : ");
		int a = sc.nextInt();
		System.out.print("\n숫자 입력 : ");
		int b = sc.nextInt();
		boolean highlow = a < b || a > b;
		int c = a < b ? b : a;
//		int d = a < b ? a : b;
//		System.out.println(highlow ? "둘중더큰수는" + c + "입니다" : "두 숫자 모두 같습니다");*/


		// 2. 아까 입력받은 두 수의 차(큰수 - 작은수)를 출력하기
		// 출력예시
		// 두 수의 차는 30입니다.
		/* 허강산 님 코드
//		System.out.println(a < b ? b - d : c - b);
		*/
//		System.out.println(a < b ? b - a : a - b); // 이 코드로 바꾸는 게 더 나아보임.
		
		
//		int gap = (int1 > int2) ? int1 - int2 : int2 - int1;
//		
//		System.out.println("두 수의 차는 " + gap + "입니다.");

		// 3. 사용자에게 나이를 입력 받아서
		// 8살 이상 20살 미만은 2500원,
		// 그외의 경우에는 무료라고 출력하기
		// 입력예시
		// 나이 >> 25

		System.out.println("나이 >> ");
		int age1 = sc.nextInt();

		// 출력예시
		// 무료

		String price = (age1 >= 8 && age1 < 20) ? "2500원" : "무료";
		 
		System.out.println("가격 : " + price);

		// 4. 8살 이상, 키 150 이상만 탈 수 있는 놀이기구가 있다
		// 사용자에게 나이와 키를 입력 받아서 탑승가능/ 불가능 출력하기

//		System.out.print("나이 >> ");
//		int age2 = sc.nextInt();
//		System.out.print("키 >> ");
//		double tall = sc.nextInt();
//		
//		String pass = (age2 >= 8 && tall >= 150.0) ? "탑승가능" : "탑승 불가능";
//		System.out.println(pass);

		
		
		// 5. 한 상자당 20개의 라면이 들어가는 상자가 있다.
		// 라면의 갯수를 입력 받아서 라면 포장에 필요한 상자의 갯수 출력하기
		// 입력예시
		// 라면 갯수 >> 25

//		System.out.print("라면 개수 >> ");
//		int ram = sc.nextInt();
//		int box = (ram / 20) + ((ram % 20) > 0 ? 1 : 0);

		// 출력예시
		// 필요한 상자의 갯수는 2개입니다.

		System.out.println("대문자 혹은 소문자 혹은 그외의 문자 입력 >> ");

//		char target = 'B';
		char target = sc.next().charAt(0);

		// target에는 대문자 혹은 소문자의 문자만 들어갈 수 있다.
		// 만약 target에 대문자가 들어있다면 소문자로 바꾸어 출력하기
		// 소문자라면 대문자로 바꾸어 출력하기

//		int result = ((target < 97) ? (target + 32) : (target - 32));
//		System.out.println((char)result);

		// (target에 대문자 혹은 소문자 혹은 그외의 문자가 들어갈 수 있고, 그외의 문자는
		// 그대로 출력하기)
		char t = target;
//		char result2 = 	(char)
//						(
//							(t >= 65 && t <= 90)//대문자 범위
//						||// 대문자 혹은 소문자 둘 중 하나의 범위에 들어가는가?
//							(t >= 97 && t <= 122)// 소문자 범위
//						? // 둘 중 하나라도 범위에 들어간다면
//									(target < 97// 소문자 시작점 97보다 작은가?
//										? 	// 만약 작다면
//											(target + 32)	// 32를 더해 대문자로 만들고
//										: 				// 아니라면
//											(target - 32)// 32를 빼 소문자로 만들어라.
//									)
//						: target);	// 대문자나 소문자가 아니라면 그대로 출력하라.
//		System.out.println(result2);

		boolean Aa = t >= 65 && t <= 122;
		boolean A = t < 91;
		boolean a = t >= 97;

		char result3 = (char) (Aa ? (A ? t + 32 : (a ? t - 32 : t)) : t);

		System.out.println(result3);
		
		
		
		boolean A2 = (t >= 65 && t < 91);
		boolean a2 = (t >= 97 && t <=122);
		
		char result4 = (char) (A2 || a2 ? (A2 ? t + 32 : t - 32) : t);

	}

}
