package day10SelfStudy;

import java.util.Scanner;

public class AdultOr {
	public static String adultOrNot(int age) {
		// 나이를 입력하면 성인/미성년자를 String 타입으로 return하는 기능
		String adult = "";
		if (age >= 19) {
			adult = "성인";
		} else {
			adult = "미성년자";
		}
		return adult;
	}

	public static String arrOut(int[] arr) {
		// 일차원 배열을 배열 모양의 String 타입으로 return하는 기능
		String arrange = "{";

		for (int i = 0; i < arr.length - 1; i++) {
			arrange += arr[i] + ", ";
		}
		arrange += arr[arr.length - 1] + "}";

		return arrange;
	}

	public static String arrToSqr(int[][] array) {
				// int타입의 이중배열을 입력받아
				// 정방형으로 배치한 String타입의 변수를 return하는 메소드
		String arrange = "";	// return할 String 변수 선언 및 초기화
		for (int i = 0; i < array.length; i++) {	// 배열의 행
			for (int j = 0; j < array[0].length; j++) {	// 배열의 열
				if(array[0].length > 1) {
					// 열의 길이가 1보다 큰 경우 if문 시작
					if (i == array.length - 1 && j == array[0].length - 1) {
						// 마지막행 마지막열 
						arrange += ", " + array[i][j] + "}";
						// 앞에 반점과 뒤에 중괄호
					} else if (j == 0) {
						// 행과 상관없이 모든 첫 열은
						arrange += "{" + array[i][j];
						// 앞에 중괄호
						
					} else if (j < array[0].length - 1) {
						// 위의 조건을 제외하고 열이 마지막이 아니라면
						arrange += ", " + array[i][j];
						// 앞에 반점
					} else {
						// 위 모든 조건이 아니라면 -> 마지막행을 제외한 모든 행의 마지막 열
						arrange += ", " + array[i][j] + "},\n";
						// 앞에 반점 뒤에 중괄호와 반점과 개행
					}	// if~else문 종료
				}else {	// 열의 길이가 1인 경우
					if(i != array.length - 1) {
						// 마지막행이 아닌 경우
						arrange += "{" + array[i][j] + "},\n";
						// 앞뒤로 중괄호와 뒤에 반점
					}else {
						// 마지막행인 경우
						arrange += "{" + array[i][j] + "}";
						// 앞뒤로 중괄호
					}	// 열의 길이가 1이고 마지막행인 경우 else문 종료
				}	// 열이 1인 경우 else문 종료
			}	// 배열의 열 종료
		}	// 배열의 행 종료
		return arrange;
		// return할 String값

	}	// 메소드 arrToSqr 종료
	
	public static String intToArrSqr(int a, int b) {
				// return타입은 String, 정수 두 개를 받고
				// 정방형으로 배치한 String타입의 변수를 return하는 메소드
		String arrange = "";	// return할 String 변수 선언 및 초기화
		int array[][] = new int[a][b];	// 받은 정수로 배열 선언

		for (int i = 0; i < array.length; i++) {	// 배열의 행
			for (int j = 0; j < array[0].length; j++) {	// 배열의 열
				if(array[0].length > 1) {
					// 열의 길이가 1보다 큰 경우 if문 시작
					if (i == array.length - 1 && j == array[0].length - 1) {
						// 마지막행 마지막열 
						arrange += ", " + array[i][j] + "}";
						// 앞에 반점과 뒤에 중괄호
					} else if (j == 0) {
						// 행과 상관없이 모든 첫 열은
						arrange += "{" + array[i][j];
						// 앞에 중괄호
						
					} else if (j < array[0].length - 1) {
						// 위의 조건을 제외하고 열이 마지막이 아니라면
						arrange += ", " + array[i][j];
						// 앞에 반점
					} else {
						// 위 모든 조건이 아니라면 -> 마지막행을 제외한 모든 행의 마지막 열
						arrange += ", " + array[i][j] + "},\n";
						// 앞에 반점 뒤에 중괄호와 반점과 개행
					}	// if~else문 종료
				}else {	// 열의 길이가 1인 경우
					if(i != array.length - 1) {
						// 마지막행이 아닌 경우
						arrange += "{" + array[i][j] + "},\n";
						// 앞뒤로 중괄호와 뒤에 반점
					}else {
						// 마지막행인 경우
						arrange += "{" + array[i][j] + "}";
						// 앞뒤로 중괄호
					}	// 열의 길이가 1이고 마지막행인 경우 else문 종료
				}	// 열이 1인 경우 else문 종료
			}	// 배열의 열 종료
		}	// 배열의 행 종료
		return arrange;
		// return할 변수 arrange 지정
	}	// 메소드 intToArrSqr 종료

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 사용자에게 나이를 입력받아서 미성년자인지 아닌지 판단하는 메소드
		System.out.println("나이를 입력하세요.");
		System.out.print("입력 >> ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println();
		System.out.println(adultOrNot(age) + "입니다.");

		System.out.println();

		System.out.println("배열의 길이를 입력하세요.");
		System.out.print("입력 >> ");
		int length = Integer.parseInt(sc.nextLine());
		int[] asdf = new int[length];
		System.out.print(arrOut(asdf));

		System.out.println();
		
		System.out.println("이차배열 정렬 arrToSqr");
		int[][] asdff = new int[8][1];
		System.out.print(arrToSqr(asdff));
		System.out.println("\n");
		System.out.println("이차배열 정렬 intToArrSqr");
		System.out.println(intToArrSqr(8,3));
	}
}
