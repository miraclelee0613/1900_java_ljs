package day09SelfStudy;
import java.util.Scanner;
import java.util.Random;
public class Kiosk_ljs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 입력 받을 준비(choice)
		Random r = new Random(); // 랜덤 받을 준비(번호표)

		// 기능 안내
		// 1. 관리자 비밀번호 변경 기능
		// 2. 대기번호 랜덤 출력 기능
		// 3. 장바구니 담기 및 장바구니 초기화 기능
		// 4. 특정 메뉴 가격 변경 기능
		// (미구현)5. 메뉴명 변경 기능

		String adminCode = "0000"; // 관리자 비밀번호를 저장할 변수

		int hamPrice = 1500; // 햄버거 초기가격
		int gamPrice = 2000; // 감자튀김 초기가격
		int colaPrice = 500; // 콜라 초기가격
		int hamCnt = 0; // 햄버거 갯수를 저장할 변수
		int gamCnt = 0; // 감튀 갯수를 저장할 변수
		int colaCnt = 0;// 콜라 갯수를 저장할 변수

		String menu1 = "햄버거"; // 첫번째 메뉴 이름
		String menu2 = "감자튀김";// 두번째 메뉴 이름
		String menu3 = "콜라"; // 세번째 메뉴 이름

		String errMsg = "다시 입력하세요.";
		// 잘못 입력했을 경우 출력할 에러 메시지
		String goToMain = "메인메뉴로 돌아갑니다.";
		// 메인메뉴로 돌아갈 때 출력할 안내메시지
		String profit = "설정 완료!";
		// 설정 완료시 출력 메시지
		String fail = "설정 실패!";
		// 설정 실패시 출력 메시지

		while (true) { // 메인메뉴
			hamCnt = 0;
			gamCnt = 0;
			colaCnt = 0;
			// 장바구니 초기화
			System.out.println("★☆★☆어서오세요★☆★☆");
			System.out.println("┌────────────────┐");
			System.out.println("│1.주문하기\t │");
			System.out.println("│2.관리자메뉴\t │");
			System.out.println("└────────────────┘");
			System.out.print("입력 >> "); // 주문하기 혹은 관리자메뉴 선택
			int choice = Integer.parseInt(sc.nextLine());
			// 입력을 받을 변수 choice 선언

			if (choice == 1) { // 주문하기 화면
				while (true) { // 음식메뉴출력 while문 여는 중괄호
					System.out.println("★ ────────가격표─────────\t★");
					System.out.printf("│ 1. %-4s\t-%5d원 │\n", menu1, hamPrice); // menu1햄버거
					System.out.printf("│ 2. %-4s\t-%5d원 │\n", menu2, gamPrice); // menu2감자튀김
					System.out.printf("│ 3. %-4s\t-%5d원 │\n", menu3, colaPrice);// menu3콜라
					System.out.println("★ ─────────────────────\t★");
					System.out.println("4. 결제하기");
					// 결제하기로 이동
					System.out.println("5. 장바구니 비우기");
					// hamCnt, gamCnt, colaCnt 초기화
					System.out.println("0. 메인메뉴로 돌아가기\n");
					// 메인메뉴로 이동
					System.out.print("입력 >> ");
					// 입력 안내 메시지
					choice = Integer.parseInt(sc.nextLine());
					// 주문 메뉴 번호 입력 변수
					int tempCnt = 0; // 수량 변수 tempCnt 선언
					if (choice == 1 || choice == 2 || choice == 3) {
						// menu1,2,3 중 하나를 골랐을 경우
						do { // do~while문 여는 중괄호
							System.out.print("수량 >> ");
							// 수량 입력 안내메시지
							tempCnt = Integer.parseInt(sc.nextLine());
							// 수량 변수 tempCnt 입력
						} while (tempCnt < 0); // do~while 닫는 중괄호
						// 수량을 0보다 작게 입력하면 다시 입력하게 이동
						if (tempCnt == 0) {
							// 수량을 0개 입력하면 음식메뉴로 다시 이동
							continue; // 음식메뉴로 이동
						} // if문 종료 : 수량 0개 메인메뉴이동

					}// if문 종료 : menu1,2,3,0 중 하나를 골랐을 경우

					if(choice == 0) {
						// 탈출키 0을 입력한 경우
						System.out.println(goToMain);
						// 안내메시지 "메인메뉴로 돌아갑니다." 출력
						break;
						// 메인메뉴로 이동
					}

					String dummyMenu = "";
					int dummyCnt = 0;
					if (choice == 1) {
						// 1. menu1 햄버거 선택
						hamCnt += tempCnt;
						// 장바구니에 담긴 수 + 더 담은 수
						dummyMenu = menu1;
						dummyCnt = hamCnt;
					} else if (choice == 2) {
						// 2. 감자튀김 선택
						gamCnt += tempCnt;
						// 장바구니에 담긴 수 + 더 담은 수
						dummyMenu = menu2;
						dummyCnt = gamCnt;
					} else if (choice == 3) {
						// 3. 콜라 선택
						colaCnt += tempCnt;
						// 장바구니에 담긴 수 + 더 담은 수
						dummyMenu = menu3;
						dummyCnt = colaCnt;
					} else if (choice == 4) {
						// 4. 결제하기
						int total = hamCnt * hamPrice + gamCnt * gamPrice + colaCnt * colaPrice;
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
						if (money >= total) {
							// 입력한 금액이 결제할 금액보다 크거나 같은 경우(결제 가능한 경우)
							System.out.println("입력된 금액 : \t" + money);
							// 입력한 금액
							System.out.println("총 결제 금액 : \t" + total);
							// 필요한 결제 금액
							if (money > total) {
								// 입력 금액이 결제에 필요한 금액보다 많은 경우
								// money == total인 경우는 출력하지 않음
								System.out.println("반환될 금액 : \t" + (money - total));
								// 잔돈 안내 메시지
							}
							System.out.printf("대기번호 : %04d\n", r.nextInt(9999) + 1);
							// 대기번호 출력 메시지
							System.out.println("결제가 완료되었습니다.\n식사 맛있게 하세요!\n");
							// 결제완료 안내 메시지

						} else {
							// money < total 입력 금액이 결제에 필요한 금액보다 적은 경우
							System.out.println("잔액이 부족합니다.");
							// 안내 메시지
							System.out.println(goToMain);
							// 메인메뉴 복귀 메시지
						}
						break; // 메인메뉴 복귀

					} else if (choice == 5) {
						// 5.장바구니 초기화
						hamCnt = 0;
						gamCnt = 0;
						colaCnt = 0;
//					} else if (choice == 6) {
//						// 6. 메인메뉴로 돌아가기
//						System.out.println(goToMain);
//						// 안내메시지 "메인메뉴로 돌아갑니다" 출력
//						break; // 메인메뉴 복귀
						// 0으로 변경
					} else {
						// 0~5(이)가 아닌 다른 숫자를 입력했을 경우
						System.out.println(errMsg);
						// 오류메시지 "다시 입력하세요." 출력
					}
					if(choice == 1 || choice == 2 || choice == 3) {
						System.out.printf("장바구니에 %s %d개 추가 완료!\n", dummyMenu, dummyCnt);
					}
					// 현재 장바구니에 담겨있는 음식들 출력하기
					System.out.println();
					// 가독성을 위한 줄바꿈
					System.out.println("★ ─장바구니─ ★");
					if (hamCnt >= 1) {
						// 햄버거가 1개 이상 장바구니에 담긴 경우
						System.out.printf("│%s\t: %d개│\n", menu1, hamCnt);
						// 개수 출력
					}
					if (gamCnt >= 1) {
						// 감자튀김이 1개 이상 장바구니에 담긴 경우
						System.out.printf("│%s\t: %d개│\n", menu2, gamCnt);
						// 개수 출력
					}
					if (colaCnt >= 1) {
						// 콜라가 1개 이상 장바구니에 담긴 경우
						System.out.printf("│%s\t: %d개│\n", menu3, colaCnt);
						// 개수 출력
					}
					System.out.println();
					// 가독성을 위한 줄바꿈
					System.out.println("★ ──────── ★");
				} // 음식메뉴출력 while문 닫는 중괄호

			} else if (choice == 2) {
				// 관리자메뉴 화면
				String inputCode = "";
				// 입력받을 비밀번호 변수 선언
				do { // 비밀번호 입력을 받되,
					System.out.println("(메인메뉴로 이동 -> esc 입력)\n" + "관리자 메뉴 접근에는 비밀번호가 필요합니다.");
					// 잘못 들어왔을 경우 escape key 안내메시지 출력
					System.out.print("비밀번호 >> ");
					// 비밀번호 입력 안내 메시지
					inputCode = sc.nextLine();
					// 비밀번호 입력 변수
					if (inputCode.equals("esc")) {
						// escape key 입력시
						System.out.println(goToMain);
						// 안내메시지 "메인메뉴로 돌아갑니다." 출력
						break;
						// 관리자메뉴 탈출
					} else if (!(inputCode.equals("esc")) && !adminCode.equals(inputCode)) {
						// 관리자비밀번호와 입력된 값이 다르고 esc를 입력하지 않은 경우
						System.out.println("비밀번호가 일치하지 않습니다.");
						// 비밀번호 불일치 안내 메시지 출력
						// 아래 while을 만나 재입력으로 이동
					}

				} while (!adminCode.equals(inputCode));
				// 관리자 비밀번호와 불일치시 다시 입력

				if (adminCode.equals(inputCode)) {
					// 비밀번호가 잘 입력되면 오는 영역

					System.out.println("1.마감하기\n" + "2.비밀번호재설정\n" + "3.가격 설정\n" + "4.메인메뉴로");
					System.out.print("입력 >> ");
					choice = Integer.parseInt(sc.nextLine());
					if (choice == 1) {
						// 1. 마감하기
						System.out.println("오늘도 고생했습니다.");
						// 메시지 출력
						break;
						// 프로그램 종료
					} else if (choice == 2) {
						// 2. 비밀번호 재설정
						System.out.print("새 비밀번호 입력 >> ");
						// 새비밀번호 입력 안내메시지
						String newPw = sc.nextLine();
						// 새비밀번호 입력 변수 선언
						System.out.print("비밀번호 확인 >> ");
						// 새비밀번호 확인입력 안내메시지
						String tempPw = sc.nextLine();
						// 확인비밀번호 입력 변수 선언
						/*
						 * 새로 설정한 비밀번호와 비밀번호 확인이 같다면 설정 성공! 출력 후 메인메뉴로 이동, 같지 않다면 설정 실패! 출력 후 메인메뉴로 이동
						 */
						if (!newPw.equals(tempPw)) {
							// 새비밀번호와 확인비밀번호가 같지 않다면
							System.out.println(fail);
							// 오류 메시지 "설정 실패!" 출력
							System.out.println(goToMain);
							// 안내메시지 "메인메뉴로 돌아갑니다" 출력
							continue;
							// 메인메뉴로 이동
						} // 새비밀번호와 확인비밀번호가 일치한다면
						System.out.println(profit);
						// 안내메시지 "설정 성공!" 출력
						adminCode = newPw;
						// 관리자 비밀번호를 새비밀번호로 대체
						System.out.println(goToMain);
						// 안내메시지 "메인메뉴로 돌아갑니다" 출력
//						continue;	// 없어도 되는 코드
						// 메인메뉴로 이동
					} else if (choice == 3) {
						// 3. 가격 재설정
						System.out.println("가격을 변경한 메뉴를 고르세요");
						// 가격변경 안내메시지
						System.out.printf("1.%s\n2.%s\n3.%s\n", menu1, menu2, menu3);
						// 가격변경 목록 메시지
						System.out.print("입력 >> ");
						// 입력 안내메시지
						choice = Integer.parseInt(sc.nextLine());
						// 선택입력 변수
						int nowPrice = 0;
						// 현재 가격 변수 선언 및 초기화
						String dummyMenu = "";
						// 메뉴 이름을 넣을 더미변수 선언 및 초기화
						if (choice == 1) {
							// 1.menu1 선택시
							nowPrice = hamPrice;
							// 현재 가격에 menu1의 현재 가격 대입
							dummyMenu = menu1;
							// 더미메뉴에 menu1메뉴명 대입
						} else if (choice == 2) {
							// 2.menu2 선택시
							nowPrice = gamPrice;
							// 현재 가격에 menu2의 현재 가격 대입
							dummyMenu = menu2;
							// 더미메뉴에 menu2의 메뉴명 대입
						} else if (choice == 3) {
							// 3.menu3 선택시
							nowPrice = colaPrice;
							// 현재 가격에 menu3의 현재 가격 대입
							dummyMenu = menu3;
							// 더미메뉴에 menu3의 메뉴명 대입
						}
						// 가격 변경 대상 선택 if문 종료
						System.out.printf("%s 현재 가격 : %d\n", dummyMenu, nowPrice);
						// 대입된 더미메뉴의 현재가격 안내메시지
						System.out.println("바꿀 가격을 입력하세요.");
						// 변경가격 입력 안내메시지
						System.out.print("입력 >> ");
						// 입력 안내메시지
						int dummyPrice = Integer.parseInt(sc.nextLine());
						// 더미(임시)가격 입력 변수 선언
						System.out.printf("입력된 금액 : %d\n", dummyPrice);
						// 입력된 금액 안내메시지
						System.out.println("이 가격으로 설정하시겠습니까?");
						// 가격 설정 확정 안내메시지
						System.out.println("1.예\n2.아니오(메인메뉴로 이동)");
						// 선택 안내메시지
						System.out.println("입력 >> ");
						// 입력 안내메시지
						int yOrN = Integer.parseInt(sc.nextLine());
						// 가격 설정 확정 선택 입력 변수 선언
						if (yOrN == 1) {
							// 1.예 선택시
							if (choice == 1) {
								// 가격 변경 대상 메뉴가 menu1 메뉴라면
								hamPrice = dummyPrice;
								// 더미가격을 menu1 가격에 대입
							} else if (choice == 2) {
								// 가격 변경 대상 메뉴가 menu2 메뉴라면
								gamPrice = dummyPrice;
								// 더미가격을 menu2 가격에 대입
							} else if (choice == 3) {
								// 가격 변경 대상 메뉴가 menu3 메뉴라면
								colaPrice = dummyPrice;
								// 더미가격을 menu3 가격에 대입
							} // 설정 가격 확정 1.예 선택 if문 종료
							System.out.println(profit);
						} else if (yOrN == 2) {
							// 설정 가격 확정 2.아니오 선택시
							System.out.println(goToMain);
							continue;
							// 메인메뉴로 이동
						} else {
							// 1.예 2.아니오가 아닌 다른 입력을 받은 경우
							System.out.println(errMsg);
							// 오류메시지 "다시 입력하세요." 출력
						}
//						System.out.println(goToMain);
//						// 안내메시지 "메인메뉴로 돌아갑니다." 출력
//						continue;
//						// 메인메뉴로 이동
					} else if (!(choice == 4)) {
						// 1,2,3,4 입력이 아닌 다른 것을 입력했을 경우
						System.out.println(errMsg);
						// 오류메시지 "다시 입력하세요." 출력
					} // 관리자메뉴 선택if문 종료
					System.out.println(goToMain);
					// 안내메시지 메인메뉴로 돌아갑니다." 출력
					System.out.println();
					// 가독성을 위한 줄바꿈
					continue;
					// 메인메뉴로 이동
				} // if문 (adminCode.equals(inputCode)) 종료
			} else {// 메인메뉴 if문else
				// 1.주문하기, 2.관리자메뉴, 탈출키 esc 외의 다른 숫자입력시
				System.out.println(errMsg);
				// 오류메시지 "다시 입력하세요." 출력
				System.out.println();
			} // 메인메뉴 if~else~if문 종료

		} // 메인메뉴while 닫음


	}

}
