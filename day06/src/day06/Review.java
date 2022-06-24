package day06;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1. 사용자에게 정수 두 개를 입력 받아서
	      // (둘 이 같다면 같다고 출력하기)
	      // 둘 중 더 큰 수 출력하기
	      //입력예시
	      //   정수1입력 >> 50
	      //   정수2입력 >> 20
//		System.out.print("정수1입력 >> ");
//		int num1 = sc.nextInt();
//		System.out.print("정수2입력 >> ");
//		int num2 = sc.nextInt();
//		
//		int result = (num1 > num2 ? num1 : num2);
//		
//	      //출력예시
//	      //   둘 중 더 큰 수는 50입니다
//		System.out.println("둘 중 더 큰 수는 " + result + "입니다.");
//		
//		
//		
//		
//	      //2. 아까 입력받은 두 수의 차(큰수 - 작은수)를 출력하기
//	      //출력예시
//	      //   두 수의 차는 30입니다
//		
//		int gap = (num1 > num2 ? num1 - num2 : num2 - num1);
//		System.out.println("두 수의 차는 " + gap + "입니다.");
		
		
		
	      //3. 사용자에게 나이를 입력 받아서
	      // 8살 이상 20살 미만은 2500원,
	      // 그외의 경우에는 무료라고 출력하기
	      //입력예시
	      //   나이 >> 25
//		System.out.print("나이 >> ");
//		int age = sc.nextInt();
//		
//		
//	      //출력예시
//	      //   무료
//	    System.out.println(age >= 8 && age < 20 ? "2500원" : "무료");
//	    System.out.println(!(age >= 8 && age < 20) ? "무료" : "2500원");
//		System.out.println(age < 8 || age >= 20 ? "무료" : "2500원");
		
		
	      //4. 8살 이상, 키 150 이상만 탈 수 있는 놀이기구가 있다
	      // 사용자에게 나이와 키를 입력 받아서 탑승가능 / 탑승불가능 출력하기
	      
//		System.out.print("나이 >> ");
//		int age = sc.nextInt();
//		System.out.print("키 >> ");
//		int height = sc.nextInt();
//		
//		System.out.println(age >= 8 && height >= 150 ? "탑승가능" : "탑승 불가능");
		
	      //5. 한 상자당 20개의 라면이 들어가는 상자가 있다
	      // 라면의 갯수를 입력 받아서 라면 포장에 필요한 상자의 갯수 출력하기
	      //입력예시
	      //   라면갯수 >> 25
//	    System.out.print("라면 개수 >> ");
//		int ram = sc.nextInt();
//		
//		  //출력예시
//	      //   필요한 상자의 갯수는 2개입니다.
//		int ea = (ram / 20) + ((ram % 20) > 0 ? 1 : 0);  
//		int ea = (ram / 20) + (ram % 20 == 0 ? 0 : 1);  
//		System.out.println("필요한 상자의 개수는 " + ea + "개입니다.");
//		
//		int boxCnt = (ram % 20 == 0) ? (ram / 20) : (ram / 20 + 1);
//		System.out.println("필요한 상자의 개수는 " + boxCnt + "개입니다.");
		
		
	      
	      char target = 'a';
	      //target에는 대문자 혹은 소문자의 문자만 들어갈 수 있다
	      // 만약 target에 대문자가 들어있다면 소문자로 바꾸어 출력하기
	      // 소문자라면 대문자로 바꾸어 출력하기
//	      
//	      char t = target;
//	      char big = (char)(t);
	      
//	      System.out.println((char)(target >= 65 && target <= 90 ? target + 32 : target - 32));
//	      
//	      System.out.println((char)(target >= 'A' && target <= 'Z' ? target + 32 : target - 32));
	      
	      
	      //(target에 대문자 혹은 소문자 혹은 그외의 문자가 들어갈 수 있고, 그외의 문자는
	      // 그대로 출력하기)

	      
	      
	      //1. 두 정수를 입력받고 둘 중 더 큰 수, 만일 같다면 같다고 출력

//			System.out.print("정수1입력 >> ");
//			int num1 = sc.nextInt();
//			System.out.print("정수2입력 >> ");
//			int num2 = sc.nextInt();
//
//			String res = num1 > num2 ? num1 + "" : num2 > num1 ? num2 + "" : "같다";
//			
//			
//			
//			boolean qsame = num1 < num2 || num1 > num2 ;
//			int qbig = num1 < num2 ? num2 : num1;
//			System.out.printf(qsame ? ("두 정수 중 큰 수는 " + qbig + "입니다.") : "두 정수의 크기가 같습니다.");

			//2. target에 들어있는 값이 대문자라면 소문자로, 소문자라면 대문자로, 그외의 문자라면 그대로 출력하기
	      
	      	target = '안';
	      	char res = (char)	((target >= 'A' && target <= 'Z') ? (target + 32) :
	      						(target >= 'a' && target <= 'z' ? target - 32 : target));
	    	System.out.println(res);	  
	    		  
	      
	      
	      
	}

}
