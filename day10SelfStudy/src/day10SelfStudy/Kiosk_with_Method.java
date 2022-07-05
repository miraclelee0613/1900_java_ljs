package day10SelfStudy;

import java.util.Scanner;
import java.util.Random;

public class Kiosk_with_Method {
	public static void arnCntBack(int arr[][], int a) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = a;
			}
		}
	}

	public static int[] cntUp(int length) {
		int array[] = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = i + 1;
		}
		return array;
	}

	public static void arw(String enter) {
		System.out.printf("%s >> ", enter);
	}

	public static void printMenu(int num, String menu) {
		// print line like "│ number.text │"
		// it's num(int) is limited : tens.
		// it's menu(string) is limited : 11charactors.
		if (menu.length() < 12) {
			System.out.printf("│%2d.%s\t │\n", num, menu);
		} else {
			menu = menu.substring(0, 11);
			System.out.printf("│%2d.%s\t │\n", num, menu);
		}
	}

	public static void printPrice(String menu, int price) {

		System.out.printf("│ 1. %-4s\t-%5d원 │\n", menu, price);

	}

	public static void main(String[] args) {
		// 110 시작
		// main 시작
		Scanner sc = new Scanner(System.in); // 입력 받을 준비(choice)
		Random r = new Random(); // 랜덤 받을 준비(번호표)

		// 기능 안내
		// 1. 관리자 비밀번호 변경 기능
		// 2. 대기번호 랜덤 출력 기능
		// 3. 장바구니 담기 및 장바구니 초기화 기능
		// 4. 특정 메뉴 가격 변경 기능
		// (new)5. 메뉴명 변경 기능

		String adminCode = "0000"; // 관리자 초기 비밀번호 선언 및 초기화

		int[][] menusPrice = new int[8][8];
		int[][] menusCnt = new int[8][8];

		menusPrice[0][0] = 1500;
		menusPrice[1][0] = 2000;
		menusPrice[2][0] = 500;

//		int menusPrice[0][0] = 1500; // 햄버거 초기가격
//		int menusPrice[1][0] = 2000; // 감자튀김 초기가격
//		int menusPrice[2][0] = 500; // 콜라 초기가격
//		int menusCnt[0][0] = 0; // 햄버거 갯수를 저장할 변수
//		int menusCnt[1][0] = 0; // 감튀 갯수를 저장할 변수
//		int menusCnt[2][0] = 0;// 콜라 갯수를 저장할 변수

		String[][] menus = new String[8][8];

		String[] menusHead = { "햄버거", "사이드", "콜라" };
		menus[0][0] = "햄버거";
		menus[1][0] = "감자튀김";
		menus[2][0] = "콜라";
		System.out.println(menus[0][1]);
//		String me nu1 = "햄버거"; // 첫번째 메뉴 이름 선언 및 초기화
//		String me nu2 = "감자튀김";// 두번째 메뉴 이름 선언 및 초기화
//		String me nu3 = "콜라"; // 세번째 메뉴 이름 선언 및 초기화

		String errMsg = "다시 입력하세요.";
		// 잘못 입력했을 경우 출력할 에러 메시지
		String goToMain = "메인메뉴로 돌아갑니다.";
		// 메인메뉴로 돌아갈 때 출력할 안내메시지
		String profit = "설정 완료!";
		// 설정 완료시 출력 메시지
		String fail = "설정 실패!";
		// 설정 실패시 출력 메시지
		// 100 준비영역 종료
		while (true) { // 110 시작
			Kiosk_with_Method.arnCntBack(menusCnt, 0);
			// int타입 중첩배열 특정 단일화 메소드
			// 장바구니 초기화
			System.out.println("★☆★☆어서오세요★☆★☆");
			System.out.println("┌────────────────┐");
			printMenu(1, "주문하기");
			printMenu(2, "관리자메뉴");
//			System.out.println("│1.주문하기\t │");
//			System.out.println("│2.관리자메뉴\t │");
			System.out.println("└────────────────┘");
			arw("입력");
//			System.out.print("입력 >> "); // 주문하기 혹은 관리자메뉴 선택
			int choice = Integer.parseInt(sc.nextLine());
			// 입력을 받을 변수 choice 선언

			if (choice == 1) { // 111 시작 주문하기 화면
				while (true) { // 111.1 시작 음식메뉴출력
								// while문 여는 중괄호
					System.out.println("★ ────────가격표─────────\t★");
					printPrice(menus[0][0], menusPrice[0][0]);
					printPrice(menus[1][0], menusPrice[1][0]);
					printPrice(menus[2][0], menusPrice[2][0]);
//					System.out.printf("│ 1. %-4s\t-%5d원 │\n", menus[0][0], menusPrice[0][0]); // menus[0][0]햄버거
//					System.out.printf("│ 2. %-4s\t-%5d원 │\n", menus[1][0], menusPrice[1][0]); // menus[1][0]감자튀김
//					System.out.printf("│ 3. %-4s\t-%5d원 │\n", menus[2][0], menusPrice[2][0]);// menus[2][0]콜라
					System.out.println("★ ─────────────────────\t★");
					System.out.println("4. 결제하기");
					// 결제하기로 이동
					System.out.println("5. 장바구니 비우기");
					// menusCnt[0][0], menusCnt[1][0], menusCnt[2][0] 초기화
					System.out.println("0. 메인메뉴로 돌아가기\n");
					// 메인메뉴로 이동
					arw("입력");
//					System.out.print("입력 >> ");
					// 입력 안내 메시지
					choice = Integer.parseInt(sc.nextLine());
					// 주문 메뉴 번호 입력 변수
					int tempCnt = 0; // 수량 변수 tempCnt 선언
					if (choice == 1 || choice == 2 || choice == 3) {// 111.1.01 시작
						// menus[0][0],2,3 중 하나를 골랐을 경우
						do {// 111.1.01.01 시작
							// do~while문 여는 중괄호
							arw("수량");
//							System.out.print("수량 >> ");
							// 수량 입력 안내메시지
							tempCnt = Integer.parseInt(sc.nextLine());
							// 수량 변수 tempCnt 입력
						} while (tempCnt < 0); // 111.1.01.01 종료
						// do~while 닫는 중괄호
						// 수량을 0보다 작게 입력하면 다시 입력하게 이동
						if (tempCnt == 0) { // 111.1.01.02 시작
											// 수량을 0개 입력하면 음식메뉴로 다시 이동
							continue; // 음식메뉴로 이동
						} // 111.1.01.02 종료
							// if문 종료 : 수량 0개 메인메뉴이동
					} // 111.1.01 종료
						// if문 종료 : menus[0][0],2,3,0 중 하나를 골랐을 경우

					if (choice == 0) { // 111.1.02 시작
						// 탈출키 0을 입력한 경우
						System.out.println(goToMain);
						// 안내메시지 "메인메뉴로 돌아갑니다." 출력
						break;
						// 메인메뉴로 이동
					} // 111.1.02 종료

					String dummyMenu = "";
					// 더미메뉴 변수 선언. 임시로 메뉴명을 담을 변수.
					int dummyCnt = 0;
					// 더미카운트 변수 선언. 임시로 개수를 담을 변수.
					for (int i = 0; i < args.length; i++) {
						if (choice == i) { // 111.1.03 시작
							// 1. menus[0][0] 햄버거 선택
							menusCnt[0][0] += tempCnt;
							// 장바구니에 담긴 수 + 더 담은 수
							dummyMenu = menus[0][0];
							dummyCnt = menusCnt[0][0];
						} else
							continue;
					}
					if (choice == 1) { // 111.1.03 시작
						// 1. menus[0][0] 햄버거 선택
						menusCnt[0][0] += tempCnt;
						// 장바구니에 담긴 수 + 더 담은 수
						dummyMenu = menus[0][0];
						dummyCnt = menusCnt[0][0];
					} else if (choice == 2) // 111.1.03 종료
					{ // 111.1.04 시작
						// 2. 감자튀김 선택
						menusCnt[1][0] += tempCnt;
						// 장바구니에 담긴 수 + 더 담은 수
						dummyMenu = menus[1][0];
						dummyCnt = menusCnt[1][0];
					} else if (choice == 3) // 111.1.04 종료
					{ // 111.1.05 시작
						// 3. 콜라 선택
						menusCnt[2][0] += tempCnt;
						// 장바구니에 담긴 수 + 더 담은 수
						dummyMenu = menus[2][0];
						dummyCnt = menusCnt[2][0];
					} else if (choice == 4) // 111.1.05 종료
					{ // 111.1.06 시작
						// 4. 결제하기
						int total = menusCnt[0][0] * menusPrice[0][0] + menusCnt[1][0] * menusPrice[1][0]
								+ menusCnt[2][0] * menusPrice[2][0];
						// 결제 필요 금액 변수 선언
						System.out.println("결제하시겠습니까?\n"
								// 결제할지 묻는 메시지
								+ "결제를 취소하고 메인메뉴로 돌아가려면 0을 입력하세요.");
						// 결제 취소 방법 안내메시지
						System.out.println("총 결제 금액 : " + total);
						// 필요한 결제 금액 안내 메시지
						System.out.print("금액 입력 >> ");
						// 금액 입력 안내메시지
						int money = Integer.parseInt(sc.nextLine());
						// 금액 입력 변수 money 선언
						if (money >= total) { // 111.1.06.1 시작
							// 입력한 금액이 결제할 금액보다 크거나 같은 경우(결제 가능한 경우)
							System.out.println("입력된 금액 : \t" + money);
							// 입력한 금액
							System.out.println("총 결제 금액 : \t" + total);
							// 필요한 결제 금액
							if (money > total) {// 111.1.06.1.01 시작
												// 입력 금액이 결제에 필요한 금액보다 많은 경우
												// money == total인 경우는 출력하지 않음
								System.out.println("반환될 금액 : \t" + (money - total));
								// 잔돈 안내 메시지
							} // 111.1.06.1.01 종료
							System.out.printf("대기번호 : %04d\n", r.nextInt(9999) + 1);
							// 대기번호 출력 메시지
							System.out.println("결제가 완료되었습니다.\n식사 맛있게 하세요!\n");
							// 결제완료 안내 메시지
						} else // 111.1.06.1 종료
						{ // 111.1.06.2 시작
							// money < total 입력 금액이 결제에 필요한 금액보다 적은 경우
							System.out.println("잔액이 부족합니다.");
							// 안내 메시지
							System.out.println(goToMain);
							// 메인메뉴 복귀 메시지
						} // 111.1.06.2 종료
						break; // 메인메뉴 복귀
					} else if (choice == 5) // 111.1.06 종료
					{ // 111.1.07 시작
						// 5.장바구니 초기화
						menusCnt[0][0] = 0;
						menusCnt[1][0] = 0;
						menusCnt[2][0] = 0;
					} else // 111.1.07 종료
					{ // 111.1.08 시작
						// 0~5(이)가 아닌 다른 숫자를 입력했을 경우
						System.out.println(errMsg);
						// 오류메시지 "다시 입력하세요." 출력
					} // 111.1.08 종료
					if (choice == 1 || choice == 2 || choice == 3) { // 111.1.09 시작
						System.out.printf("장바구니에 %s %d개 추가 완료!\n", dummyMenu, dummyCnt);
					} // 111.1.09 종료
						// 현재 장바구니에 담겨있는 음식들 출력하기
					System.out.println();
					// 가독성을 위한 줄바꿈
					System.out.println("★ ─장바구니─ ★");
					if (menusCnt[0][0] >= 1) // 햄버거가 1개 이상 장바구니에 담긴 경우
					{ // 111.1.10 시작
						System.out.printf("│%s\t: %d개│\n", menus[0][0], menusCnt[0][0]);
						// 개수 출력
					} // 111.1.10 종료
					if (menusCnt[1][0] >= 1) { // 111.1.11 시작
												// 감자튀김이 1개 이상 장바구니에 담긴 경우
						System.out.printf("│%s\t: %d개│\n", menus[1][0], menusCnt[1][0]);
						// 개수 출력
					} // 111.1.11 종료
					if (menusCnt[2][0] >= 1) { // 111.1.12 시작
												// 콜라가 1개 이상 장바구니에 담긴 경우
						System.out.printf("│%s\t: %d개│\n", menus[2][0], menusCnt[2][0]);
						// 개수 출력
					} // 111.1.12 종료
					System.out.println();
					// 가독성을 위한 줄바꿈
					System.out.println("★ ──────── ★");
				} // 111.1 종료
					// 음식메뉴출력 while문 닫는 중괄호
			} else if (choice == 2) // 111 종료 주문하기 화면
			// 주문하기 if문 종료
			{ // 112 시작
				// 관리자메뉴 if문 시작
				String inputCode = "";
				// 입력받을 비밀번호 변수 선언
				do { // 112.1 시작
						// 비밀번호 입력을 받되,
					System.out.println("(메인메뉴로 이동 -> esc 입력)\n" + "관리자 메뉴 접근에는 비밀번호가 필요합니다.");
					// 잘못 들어왔을 경우 escape key 안내메시지 출력
					System.out.print("비밀번호 >> ");
					// 비밀번호 입력 안내 메시지
					inputCode = sc.nextLine();
					// 비밀번호 입력 변수
					if (inputCode.equals("esc")) { // 112.1.01 시작
						// escape key 입력시
						System.out.println(goToMain);
						// 안내메시지 "메인메뉴로 돌아갑니다." 출력
						break;
						// 관리자메뉴 탈출
					} else if (!(inputCode.equals("esc")) && !adminCode.equals(inputCode))
					// 112.1.01 종료
					{ // 112.1.02 시작
						// 관리자비밀번호와 입력된 값이 다르고 esc를 입력하지 않은 경우
						System.out.println("비밀번호가 일치하지 않습니다.");
						// 비밀번호 불일치 안내 메시지 출력
						// 아래 while을 만나 재입력으로 이동
					} // 112.1.02 종료
				} while (!adminCode.equals(inputCode));
				// 112.1 종료
				// 관리자 비밀번호와 불일치시 다시 입력
				if (adminCode.equals(inputCode)) { // 112.2 시작
					// 비밀번호가 잘 입력되면 오는 영역

					System.out.println("1.마감하기\n" + "2.비밀번호재설정\n" + "3.가격 설정\n" + "4.메뉴명 설정\n" + "5.메인메뉴로");
//					System.out.print("입력 >> ");
					arw("입력");
					choice = Integer.parseInt(sc.nextLine());
					if (choice == 1) { // 112.2.1 시작
						// 1. 마감하기
						System.out.println("오늘도 고생했습니다.");
						// 메시지 출력
						break;
						// 프로그램 종료
					} else if (choice == 2) // 112.2.1 종료
					{ // 112.2.2 시작
						// 2. 비밀번호 재설정
//						System.out.print("새 비밀번호 입력 >> ");
						arw("새 비밀번호 입력");
						// 새비밀번호 입력 안내메시지
						String newPw = sc.nextLine();
						// 새비밀번호 입력 변수 선언
//						System.out.print("비밀번호 확인 >> ");
						arw("비밀번호 확인");
						// 새비밀번호 확인입력 안내메시지
						String tempPw = sc.nextLine();
						// 확인비밀번호 입력 변수 선언
						/*
						 * 새로 설정한 비밀번호와 비밀번호 확인이 같다면 설정 성공! 출력 후 메인메뉴로 이동, 같지 않다면 설정 실패! 출력 후 메인메뉴로 이동
						 */
						if (!newPw.equals(tempPw)) { // 112.2.2.01 시작
							// 새비밀번호와 확인비밀번호가 같지 않다면
							System.out.println(fail);
							// 오류 메시지 "설정 실패!" 출력
							System.out.println(goToMain);
							// 안내메시지 "메인메뉴로 돌아갑니다" 출력
							continue;
							// 메인메뉴로 이동
						} // 112.2.2.01 종료
							// 새비밀번호와 확인비밀번호가 일치한다면
						System.out.println(profit);
						// 안내메시지 "설정 성공!" 출력
						adminCode = newPw;
						// 관리자 비밀번호를 새비밀번호로 대체
						System.out.println(goToMain);
						// 안내메시지 "메인메뉴로 돌아갑니다" 출력
						// continue; // 없어도 되는 코드
						// 메인메뉴로 이동
					} else if (choice == 3) // 112.2.2 종료
					{ // 112.2.3 시작
						// 3. 가격 재설정
						System.out.println("가격을 변경한 카테고리를 고르세요");
						// 카테고리 선택 안내메시지

//						for (int a : cntUp(menusHead.length)) {
////							for (int j2 = 0; j2 < menusHead.length; j2++) {
//							System.out.printf("%d.%s", a, menusHead[a-1]);
////							}
//						}
						for (int i = 0; i < menusHead.length; i++) {
							System.out.printf("%d.%s", i + 1, menusHead[i]);
						}
						arw("\n입력");
						choice = Integer.parseInt(sc.nextLine());
						System.out.println();
						
						System.out.println("가격을 변경할 메뉴를 고르세요.");
						for (int i = 0; i < menusHead.length; i++) {
							if (choice == i+1) {
								
								for (int j = 0; j < menus[i].length; j++) {
									if(menus[i][j] != null) {
									System.out.printf("%d.%s\n", j+1, menus[i][j]);
								}
								}
							}
						}
//						System.out.printf("1.%s\n2.%s\n3.%s\n", menus[0][0], menus[1][0], menus[2][0]);
						// 가격변경 목록 메시지

						arw("입력");
						// 입력 안내메시지
						int choice2 = 0;
						choice2 = Integer.parseInt(sc.nextLine());
						// 선택입력 변수
						System.out.println();
						int nowPrice = 0;
						// 현재 가격 변수 선언 및 초기화
						String dummyMenu = "";
						// 메뉴 이름을 넣을 더미변수 선언 및 초기화
//						if (choice == 1) { // 112.2.3.01 시작
//							// 1.menus[0][0] 선택시
//							nowPrice = menusPrice[0][0];
//							// 현재 가격에 menus[0][0]의 현재 가격 대입
//							dummyMenu = menus[0][0];
//							// 더미메뉴에 menus[0][0]메뉴명 대입
//						} else if (choice == 2) // 112.2.3.01 종료
//						{ // 112.2.3.02 시작
//							// 2.menus[1][0] 선택시
//							nowPrice = menusPrice[1][0];
//							// 현재 가격에 menus[1][0]의 현재 가격 대입
//							dummyMenu = menus[1][0];
//							// 더미메뉴에 menus[1][0]의 메뉴명 대입
//						} else if (choice == 3) // 112.2.3.02 종료
//						{ // 112.2.3.03 시작
//							// 3.menus[2][0] 선택시
//							nowPrice = menusPrice[2][0];
//							// 현재 가격에 menus[2][0]의 현재 가격 대입
//							dummyMenu = menus[2][0];
//							// 더미메뉴에 menus[2][0]의 메뉴명 대입
//						} // 112.2.3.03 종료
						int adrs1 = 0, adrs2 = 0;
						for (int i = 0; i < menusHead.length; i++) {
							for (int j = 0; j < menusHead.length; j++) {
								if(choice == i+1 && choice == j+1) {
									nowPrice = menusPrice[i][j];
									dummyMenu = menus[i][j];
									adrs1 = i;
									adrs2 = j;
								}
							}
						}
						
						
						
						// 가격 변경 대상 선택 if문 종료
						System.out.printf("%s의 현재 가격 : %d\n", dummyMenu, nowPrice);
						// 대입된 더미메뉴의 현재가격 안내메시지
						System.out.println("바꿀 가격을 입력하세요.");
						// 변경가격 입력 안내메시지

						arw("입력");
						// 입력 안내메시지
						int dummyPrice = Integer.parseInt(sc.nextLine());
						// 더미(임시)가격 입력 변수 선언
						System.out.printf("입력된 금액 : %d\n", dummyPrice);
						// 입력된 금액 안내메시지
						System.out.println("이 가격으로 설정하시겠습니까?");
						// 가격 설정 확정 안내메시지
						System.out.println("1.예\n2.아니오(메인메뉴로 이동)");
						// 선택 안내메시지

						arw("입력");
						// 입력 안내메시지
						int yOrN = Integer.parseInt(sc.nextLine());
						// 가격 설정 확정 선택 입력 변수 선언
						if (yOrN == 1) { // 112.2.3.04 시작
											// 1.예 선택시
							menusPrice[adrs1][adrs2] = dummyPrice;
//							if (choice == 1) { // 112.2.3.04.01 시작
								

									// 더미가격을 menus[0][0] 가격에 대입

//								}

//												// 가격 변경 대상 메뉴가 menus[0][0] 메뉴라면
//								menusPrice[0][0] = dummyPrice;
//								// 더미가격을 menus[0][0] 가격에 대입
//							} else if (choice == 2) // 112.2.3.04.01 종료
//							{ // 112.2.3.04.02 시작
//								// 가격 변경 대상 메뉴가 menus[1][0] 메뉴라면
//								menusPrice[1][0] = dummyPrice;
//								// 더미가격을 menus[1][0] 가격에 대입
//							} else if (choice == 3) // 112.2.3.04.02 종료
//							{ // 112.2.3.04.03 시작
//								// 가격 변경 대상 메뉴가 menus[2][0] 메뉴라면
//								menusPrice[2][0] = dummyPrice;
//								// 더미가격을 menus[2][0] 가격에 대입
//							} // 112.2.3.04.03 종료
								// 설정 가격 확정 1.예 선택 if문 종료
							System.out.println(profit);
						} else if (yOrN == 2) // 112.2.3.04 종료
						{ // 112.2.3.05 시작
							// 설정 가격 확정 2.아니오 선택시
//							System.out.println(goToMain);
//							continue;
							// 메인메뉴로 이동
						} else // 112.2.3.05 종료
						{ // 112.2.3.06 시작
							// 1.예 2.아니오가 아닌 다른 입력을 받은 경우
							System.out.println(errMsg);
							// 오류메시지 "다시 입력하세요." 출력
						} // 112.2.3.06 종료
								System.out.println(goToMain);
//								// 안내메시지 "메인메뉴로 돌아갑니다." 출력
								continue;
//								// 메인메뉴로 이동
					} else if (choice == 4) // 112.2.3 종료
					{ // 112.2.4 시작
						// 메뉴명설정
						System.out.printf("변경할 메뉴를 선택하세요.\n1.%s\n2.%s\n3.%s\n", menus[0][0], menus[1][0], menus[2][0]);
						// 변경할 메뉴 선택 안내메시지
						choice = Integer.parseInt(sc.nextLine());
						// 선택한 메뉴 번호 입력 변수에 저장
						String dummyMenu = "";
						// 더미메뉴명 변수 선언
						if (choice == 1) // 1번 메뉴 선택한 경우
						{
							dummyMenu = menus[0][0];
							// 더미메뉴명에 1번 메뉴명 대입
						} else if (choice == 2) // 2번 메뉴 선택한 경우
						{
							dummyMenu = menus[1][0];
							// 더미메뉴명에 2번 메뉴명 대입
						} else if (choice == 3) // 3번 메뉴 선택한 경우
						{
							dummyMenu = menus[2][0];
							// 더미메뉴명에 3번 메뉴명 대입
						} else
						// 1,2,3이 아닌 다른 입력을 한 경우
						{
							System.out.println(errMsg);
							// 에러메시지 "다시 입력하세요." 출력
							System.out.println(goToMain);
							// 안내메시지 "메인메뉴로 돌아갑니다." 출력
							continue;
							// 메인메뉴로 이동
						}
						System.out.printf("변경할 메뉴 : %s\n새로운 메뉴명을 입력해주세요.\n", dummyMenu);
						// 변경할 메뉴 안내메시지
						System.out.print("입력 >> ");
						// 새로운 메뉴명 입력 안내메시지
						String dummyNewName = sc.nextLine();
						// 입력받은 새로운 메뉴명을 저장할 변수 선언
						System.out.printf("기존 메뉴명 : %s\n새로운 메뉴명 : %s\n적용하시겠습니까?\n", dummyMenu, dummyNewName);
						// 기존 메뉴명, 새로운 메뉴명 안내메시지
						System.out.println("1.예\n2.아니오");
						// 선택 안내메시지
						System.out.print("입력 >> ");
						// 입력 안내메시지
						int YorN = Integer.parseInt(sc.nextLine());
						// 선택 입력 변수 선언
						if (YorN == 1)
						// 1.예를 입력한 경우
						{
							if (choice == 1)
							// 메뉴 선택에서 1번 메뉴를 선택한 경우
							{
								menus[0][0] = dummyNewName;
								// 새로운 메뉴명을 1번 메뉴에 대입
							} else if (choice == 2)
							// 메뉴 선택에서 2번 메뉴를 선택한 경우
							{
								menus[1][0] = dummyNewName;
								// 새로운 메뉴명을 2번 메뉴에 대입
							} else if (choice == 3)
							// 메뉴 선택에서 3번 메뉴를 선택한 경우
							{
								menus[2][0] = dummyNewName;
								// 새로운 메뉴명을 3번 메뉴에 대입
							}

							System.out.println(profit);
							// "설정 완료!" 메시지 출력
						} else if (YorN == 2)
						// 2.아니오를 입력한 경우
						{
							System.out.println(fail);
							// "설정 실패!" 메시지 출력
						}
						System.out.println(goToMain);
						// "메인메뉴로 돌아갑니다." 안내메시지 출력
						System.out.println();
						// 가독성을 위한 줄바꿈
						continue;
						// 메인메뉴로 이동
					} else// 112.2.4 종료 메뉴명 설정 끝
					{ // 112.2.5 시작 5나 다른 입력을 했을 경우
						switch (choice) // choice값을 기준으로
						{ // 112.2.5.1 시작
						default:
							// 5가 아닌 다른 입력을 했을 경우
							System.out.println(errMsg);
							// 에러메시지 출력
							// switch문은 아래로 흐르기 때문에 굳이 break걸지 않음.
						case 5:
							// 5를 입력한 경우
							// 관리자메뉴 선택if문 종료
							System.out.println(goToMain);
							// 안내메시지 메인메뉴로 돌아갑니다." 출력
							System.out.println();
							// 가독성을 위한 줄바꿈
							continue;
						// 메인메뉴로 이동
						} // 112.2.5.1 종료
					} // 112.2.5 종료
				} // 112.2 종료
					// if문 (adminCode.equals(inputCode)) 종료
			} else // 112 종료
					// 2.관리자메뉴 else~if문 종료
			{ // 113 시작
				// 메인메뉴 if문else
				// 1.주문하기, 2.관리자메뉴, 탈출키 esc 외의 다른 숫자입력시
				System.out.println(errMsg);
				// 오류메시지 "다시 입력하세요." 출력
				System.out.println();
			} // 113 종료
				// 메인메뉴 if~else~if문 종료
		} // 110 종료
		// 메인메뉴while 닫음
}}
