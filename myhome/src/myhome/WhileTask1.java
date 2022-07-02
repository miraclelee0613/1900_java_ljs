package myhome;

import java.util.Scanner;

public class WhileTask1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		1. 코인노래방프로그램
		
		
		
		
		
		
//		2. 키오스크프로그램
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		3. ATM프로그램
		int choice = 0;
		int money = 0;
		do {
			System.out.println("어서오십시오\n원하는 업무를 선택해주세요\n1.입금\n2.출금\n3.잔액조회");
			System.err.println("0.비상종료");
			System.out.print(" >> ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("입금 페이지입니다.\n입금 희망 금액을 입력하세요\n >> ");
				int within = sc.nextInt();
				money += within;
				System.out.println("출금액 : " + within + "\n잔액 : " + money);
				break;
			case 2:
				System.out.print("출금 페이지입니다.\n출금 희망 금액을 입력하세요\n >> ");
				int withdraw = sc.nextInt();
				if (money >= withdraw) {
					money += -withdraw;
					System.out.println("출금 금액 :" + withdraw + "\n잔액 : " + money);
				} else {
					System.out.println("잔액이 부족합니다. 금액을 확인하시고 다시 시도해주시기 바랍니다.");
				}
				break;

			case 3:
				System.out.println("잔액 확인 페이지입니다.\n잔액 : " + money);
				break;

			case 0:
				System.err.println("시스템을 종료합니다.");
				System.out.println();
				break;
			}
			System.out.println("시스템 종료");

		} while (choice != 0);

	}

}
