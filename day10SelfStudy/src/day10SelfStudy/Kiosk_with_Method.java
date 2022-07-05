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
		// print line like "�� number.text ��"
		// it's num(int) is limited : tens.
		// it's menu(string) is limited : 11charactors.
		if (menu.length() < 12) {
			System.out.printf("��%2d.%s\t ��\n", num, menu);
		} else {
			menu = menu.substring(0, 11);
			System.out.printf("��%2d.%s\t ��\n", num, menu);
		}
	}

	public static void printPrice(String menu, int price) {

		System.out.printf("�� 1. %-4s\t-%5d�� ��\n", menu, price);

	}

	public static void main(String[] args) {
		// 110 ����
		// main ����
		Scanner sc = new Scanner(System.in); // �Է� ���� �غ�(choice)
		Random r = new Random(); // ���� ���� �غ�(��ȣǥ)

		// ��� �ȳ�
		// 1. ������ ��й�ȣ ���� ���
		// 2. ����ȣ ���� ��� ���
		// 3. ��ٱ��� ��� �� ��ٱ��� �ʱ�ȭ ���
		// 4. Ư�� �޴� ���� ���� ���
		// (new)5. �޴��� ���� ���

		String adminCode = "0000"; // ������ �ʱ� ��й�ȣ ���� �� �ʱ�ȭ

		int[][] menusPrice = new int[8][8];
		int[][] menusCnt = new int[8][8];

		menusPrice[0][0] = 1500;
		menusPrice[1][0] = 2000;
		menusPrice[2][0] = 500;

//		int menusPrice[0][0] = 1500; // �ܹ��� �ʱⰡ��
//		int menusPrice[1][0] = 2000; // ����Ƣ�� �ʱⰡ��
//		int menusPrice[2][0] = 500; // �ݶ� �ʱⰡ��
//		int menusCnt[0][0] = 0; // �ܹ��� ������ ������ ����
//		int menusCnt[1][0] = 0; // ��Ƣ ������ ������ ����
//		int menusCnt[2][0] = 0;// �ݶ� ������ ������ ����

		String[][] menus = new String[8][8];

		String[] menusHead = { "�ܹ���", "���̵�", "�ݶ�" };
		menus[0][0] = "�ܹ���";
		menus[1][0] = "����Ƣ��";
		menus[2][0] = "�ݶ�";
		System.out.println(menus[0][1]);
//		String me nu1 = "�ܹ���"; // ù��° �޴� �̸� ���� �� �ʱ�ȭ
//		String me nu2 = "����Ƣ��";// �ι�° �޴� �̸� ���� �� �ʱ�ȭ
//		String me nu3 = "�ݶ�"; // ����° �޴� �̸� ���� �� �ʱ�ȭ

		String errMsg = "�ٽ� �Է��ϼ���.";
		// �߸� �Է����� ��� ����� ���� �޽���
		String goToMain = "���θ޴��� ���ư��ϴ�.";
		// ���θ޴��� ���ư� �� ����� �ȳ��޽���
		String profit = "���� �Ϸ�!";
		// ���� �Ϸ�� ��� �޽���
		String fail = "���� ����!";
		// ���� ���н� ��� �޽���
		// 100 �غ񿵿� ����
		while (true) { // 110 ����
			Kiosk_with_Method.arnCntBack(menusCnt, 0);
			// intŸ�� ��ø�迭 Ư�� ����ȭ �޼ҵ�
			// ��ٱ��� �ʱ�ȭ
			System.out.println("�ڡ١ڡپ������ڡ١ڡ�");
			System.out.println("������������������������������������");
			printMenu(1, "�ֹ��ϱ�");
			printMenu(2, "�����ڸ޴�");
//			System.out.println("��1.�ֹ��ϱ�\t ��");
//			System.out.println("��2.�����ڸ޴�\t ��");
			System.out.println("������������������������������������");
			arw("�Է�");
//			System.out.print("�Է� >> "); // �ֹ��ϱ� Ȥ�� �����ڸ޴� ����
			int choice = Integer.parseInt(sc.nextLine());
			// �Է��� ���� ���� choice ����

			if (choice == 1) { // 111 ���� �ֹ��ϱ� ȭ��
				while (true) { // 111.1 ���� ���ĸ޴����
								// while�� ���� �߰�ȣ
					System.out.println("�� ��������������������ǥ������������������\t��");
					printPrice(menus[0][0], menusPrice[0][0]);
					printPrice(menus[1][0], menusPrice[1][0]);
					printPrice(menus[2][0], menusPrice[2][0]);
//					System.out.printf("�� 1. %-4s\t-%5d�� ��\n", menus[0][0], menusPrice[0][0]); // menus[0][0]�ܹ���
//					System.out.printf("�� 2. %-4s\t-%5d�� ��\n", menus[1][0], menusPrice[1][0]); // menus[1][0]����Ƣ��
//					System.out.printf("�� 3. %-4s\t-%5d�� ��\n", menus[2][0], menusPrice[2][0]);// menus[2][0]�ݶ�
					System.out.println("�� ������������������������������������������\t��");
					System.out.println("4. �����ϱ�");
					// �����ϱ�� �̵�
					System.out.println("5. ��ٱ��� ����");
					// menusCnt[0][0], menusCnt[1][0], menusCnt[2][0] �ʱ�ȭ
					System.out.println("0. ���θ޴��� ���ư���\n");
					// ���θ޴��� �̵�
					arw("�Է�");
//					System.out.print("�Է� >> ");
					// �Է� �ȳ� �޽���
					choice = Integer.parseInt(sc.nextLine());
					// �ֹ� �޴� ��ȣ �Է� ����
					int tempCnt = 0; // ���� ���� tempCnt ����
					if (choice == 1 || choice == 2 || choice == 3) {// 111.1.01 ����
						// menus[0][0],2,3 �� �ϳ��� ����� ���
						do {// 111.1.01.01 ����
							// do~while�� ���� �߰�ȣ
							arw("����");
//							System.out.print("���� >> ");
							// ���� �Է� �ȳ��޽���
							tempCnt = Integer.parseInt(sc.nextLine());
							// ���� ���� tempCnt �Է�
						} while (tempCnt < 0); // 111.1.01.01 ����
						// do~while �ݴ� �߰�ȣ
						// ������ 0���� �۰� �Է��ϸ� �ٽ� �Է��ϰ� �̵�
						if (tempCnt == 0) { // 111.1.01.02 ����
											// ������ 0�� �Է��ϸ� ���ĸ޴��� �ٽ� �̵�
							continue; // ���ĸ޴��� �̵�
						} // 111.1.01.02 ����
							// if�� ���� : ���� 0�� ���θ޴��̵�
					} // 111.1.01 ����
						// if�� ���� : menus[0][0],2,3,0 �� �ϳ��� ����� ���

					if (choice == 0) { // 111.1.02 ����
						// Ż��Ű 0�� �Է��� ���
						System.out.println(goToMain);
						// �ȳ��޽��� "���θ޴��� ���ư��ϴ�." ���
						break;
						// ���θ޴��� �̵�
					} // 111.1.02 ����

					String dummyMenu = "";
					// ���̸޴� ���� ����. �ӽ÷� �޴����� ���� ����.
					int dummyCnt = 0;
					// ����ī��Ʈ ���� ����. �ӽ÷� ������ ���� ����.
					for (int i = 0; i < args.length; i++) {
						if (choice == i) { // 111.1.03 ����
							// 1. menus[0][0] �ܹ��� ����
							menusCnt[0][0] += tempCnt;
							// ��ٱ��Ͽ� ��� �� + �� ���� ��
							dummyMenu = menus[0][0];
							dummyCnt = menusCnt[0][0];
						} else
							continue;
					}
					if (choice == 1) { // 111.1.03 ����
						// 1. menus[0][0] �ܹ��� ����
						menusCnt[0][0] += tempCnt;
						// ��ٱ��Ͽ� ��� �� + �� ���� ��
						dummyMenu = menus[0][0];
						dummyCnt = menusCnt[0][0];
					} else if (choice == 2) // 111.1.03 ����
					{ // 111.1.04 ����
						// 2. ����Ƣ�� ����
						menusCnt[1][0] += tempCnt;
						// ��ٱ��Ͽ� ��� �� + �� ���� ��
						dummyMenu = menus[1][0];
						dummyCnt = menusCnt[1][0];
					} else if (choice == 3) // 111.1.04 ����
					{ // 111.1.05 ����
						// 3. �ݶ� ����
						menusCnt[2][0] += tempCnt;
						// ��ٱ��Ͽ� ��� �� + �� ���� ��
						dummyMenu = menus[2][0];
						dummyCnt = menusCnt[2][0];
					} else if (choice == 4) // 111.1.05 ����
					{ // 111.1.06 ����
						// 4. �����ϱ�
						int total = menusCnt[0][0] * menusPrice[0][0] + menusCnt[1][0] * menusPrice[1][0]
								+ menusCnt[2][0] * menusPrice[2][0];
						// ���� �ʿ� �ݾ� ���� ����
						System.out.println("�����Ͻðڽ��ϱ�?\n"
								// �������� ���� �޽���
								+ "������ ����ϰ� ���θ޴��� ���ư����� 0�� �Է��ϼ���.");
						// ���� ��� ��� �ȳ��޽���
						System.out.println("�� ���� �ݾ� : " + total);
						// �ʿ��� ���� �ݾ� �ȳ� �޽���
						System.out.print("�ݾ� �Է� >> ");
						// �ݾ� �Է� �ȳ��޽���
						int money = Integer.parseInt(sc.nextLine());
						// �ݾ� �Է� ���� money ����
						if (money >= total) { // 111.1.06.1 ����
							// �Է��� �ݾ��� ������ �ݾ׺��� ũ�ų� ���� ���(���� ������ ���)
							System.out.println("�Էµ� �ݾ� : \t" + money);
							// �Է��� �ݾ�
							System.out.println("�� ���� �ݾ� : \t" + total);
							// �ʿ��� ���� �ݾ�
							if (money > total) {// 111.1.06.1.01 ����
												// �Է� �ݾ��� ������ �ʿ��� �ݾ׺��� ���� ���
												// money == total�� ���� ������� ����
								System.out.println("��ȯ�� �ݾ� : \t" + (money - total));
								// �ܵ� �ȳ� �޽���
							} // 111.1.06.1.01 ����
							System.out.printf("����ȣ : %04d\n", r.nextInt(9999) + 1);
							// ����ȣ ��� �޽���
							System.out.println("������ �Ϸ�Ǿ����ϴ�.\n�Ļ� ���ְ� �ϼ���!\n");
							// �����Ϸ� �ȳ� �޽���
						} else // 111.1.06.1 ����
						{ // 111.1.06.2 ����
							// money < total �Է� �ݾ��� ������ �ʿ��� �ݾ׺��� ���� ���
							System.out.println("�ܾ��� �����մϴ�.");
							// �ȳ� �޽���
							System.out.println(goToMain);
							// ���θ޴� ���� �޽���
						} // 111.1.06.2 ����
						break; // ���θ޴� ����
					} else if (choice == 5) // 111.1.06 ����
					{ // 111.1.07 ����
						// 5.��ٱ��� �ʱ�ȭ
						menusCnt[0][0] = 0;
						menusCnt[1][0] = 0;
						menusCnt[2][0] = 0;
					} else // 111.1.07 ����
					{ // 111.1.08 ����
						// 0~5(��)�� �ƴ� �ٸ� ���ڸ� �Է����� ���
						System.out.println(errMsg);
						// �����޽��� "�ٽ� �Է��ϼ���." ���
					} // 111.1.08 ����
					if (choice == 1 || choice == 2 || choice == 3) { // 111.1.09 ����
						System.out.printf("��ٱ��Ͽ� %s %d�� �߰� �Ϸ�!\n", dummyMenu, dummyCnt);
					} // 111.1.09 ����
						// ���� ��ٱ��Ͽ� ����ִ� ���ĵ� ����ϱ�
					System.out.println();
					// �������� ���� �ٹٲ�
					System.out.println("�� ����ٱ��Ϧ� ��");
					if (menusCnt[0][0] >= 1) // �ܹ��Ű� 1�� �̻� ��ٱ��Ͽ� ��� ���
					{ // 111.1.10 ����
						System.out.printf("��%s\t: %d����\n", menus[0][0], menusCnt[0][0]);
						// ���� ���
					} // 111.1.10 ����
					if (menusCnt[1][0] >= 1) { // 111.1.11 ����
												// ����Ƣ���� 1�� �̻� ��ٱ��Ͽ� ��� ���
						System.out.printf("��%s\t: %d����\n", menus[1][0], menusCnt[1][0]);
						// ���� ���
					} // 111.1.11 ����
					if (menusCnt[2][0] >= 1) { // 111.1.12 ����
												// �ݶ� 1�� �̻� ��ٱ��Ͽ� ��� ���
						System.out.printf("��%s\t: %d����\n", menus[2][0], menusCnt[2][0]);
						// ���� ���
					} // 111.1.12 ����
					System.out.println();
					// �������� ���� �ٹٲ�
					System.out.println("�� ���������������� ��");
				} // 111.1 ����
					// ���ĸ޴���� while�� �ݴ� �߰�ȣ
			} else if (choice == 2) // 111 ���� �ֹ��ϱ� ȭ��
			// �ֹ��ϱ� if�� ����
			{ // 112 ����
				// �����ڸ޴� if�� ����
				String inputCode = "";
				// �Է¹��� ��й�ȣ ���� ����
				do { // 112.1 ����
						// ��й�ȣ �Է��� �޵�,
					System.out.println("(���θ޴��� �̵� -> esc �Է�)\n" + "������ �޴� ���ٿ��� ��й�ȣ�� �ʿ��մϴ�.");
					// �߸� ������ ��� escape key �ȳ��޽��� ���
					System.out.print("��й�ȣ >> ");
					// ��й�ȣ �Է� �ȳ� �޽���
					inputCode = sc.nextLine();
					// ��й�ȣ �Է� ����
					if (inputCode.equals("esc")) { // 112.1.01 ����
						// escape key �Է½�
						System.out.println(goToMain);
						// �ȳ��޽��� "���θ޴��� ���ư��ϴ�." ���
						break;
						// �����ڸ޴� Ż��
					} else if (!(inputCode.equals("esc")) && !adminCode.equals(inputCode))
					// 112.1.01 ����
					{ // 112.1.02 ����
						// �����ں�й�ȣ�� �Էµ� ���� �ٸ��� esc�� �Է����� ���� ���
						System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
						// ��й�ȣ ����ġ �ȳ� �޽��� ���
						// �Ʒ� while�� ���� ���Է����� �̵�
					} // 112.1.02 ����
				} while (!adminCode.equals(inputCode));
				// 112.1 ����
				// ������ ��й�ȣ�� ����ġ�� �ٽ� �Է�
				if (adminCode.equals(inputCode)) { // 112.2 ����
					// ��й�ȣ�� �� �ԷµǸ� ���� ����

					System.out.println("1.�����ϱ�\n" + "2.��й�ȣ�缳��\n" + "3.���� ����\n" + "4.�޴��� ����\n" + "5.���θ޴���");
//					System.out.print("�Է� >> ");
					arw("�Է�");
					choice = Integer.parseInt(sc.nextLine());
					if (choice == 1) { // 112.2.1 ����
						// 1. �����ϱ�
						System.out.println("���õ� ����߽��ϴ�.");
						// �޽��� ���
						break;
						// ���α׷� ����
					} else if (choice == 2) // 112.2.1 ����
					{ // 112.2.2 ����
						// 2. ��й�ȣ �缳��
//						System.out.print("�� ��й�ȣ �Է� >> ");
						arw("�� ��й�ȣ �Է�");
						// ����й�ȣ �Է� �ȳ��޽���
						String newPw = sc.nextLine();
						// ����й�ȣ �Է� ���� ����
//						System.out.print("��й�ȣ Ȯ�� >> ");
						arw("��й�ȣ Ȯ��");
						// ����й�ȣ Ȯ���Է� �ȳ��޽���
						String tempPw = sc.nextLine();
						// Ȯ�κ�й�ȣ �Է� ���� ����
						/*
						 * ���� ������ ��й�ȣ�� ��й�ȣ Ȯ���� ���ٸ� ���� ����! ��� �� ���θ޴��� �̵�, ���� �ʴٸ� ���� ����! ��� �� ���θ޴��� �̵�
						 */
						if (!newPw.equals(tempPw)) { // 112.2.2.01 ����
							// ����й�ȣ�� Ȯ�κ�й�ȣ�� ���� �ʴٸ�
							System.out.println(fail);
							// ���� �޽��� "���� ����!" ���
							System.out.println(goToMain);
							// �ȳ��޽��� "���θ޴��� ���ư��ϴ�" ���
							continue;
							// ���θ޴��� �̵�
						} // 112.2.2.01 ����
							// ����й�ȣ�� Ȯ�κ�й�ȣ�� ��ġ�Ѵٸ�
						System.out.println(profit);
						// �ȳ��޽��� "���� ����!" ���
						adminCode = newPw;
						// ������ ��й�ȣ�� ����й�ȣ�� ��ü
						System.out.println(goToMain);
						// �ȳ��޽��� "���θ޴��� ���ư��ϴ�" ���
						// continue; // ��� �Ǵ� �ڵ�
						// ���θ޴��� �̵�
					} else if (choice == 3) // 112.2.2 ����
					{ // 112.2.3 ����
						// 3. ���� �缳��
						System.out.println("������ ������ ī�װ��� ������");
						// ī�װ� ���� �ȳ��޽���

//						for (int a : cntUp(menusHead.length)) {
////							for (int j2 = 0; j2 < menusHead.length; j2++) {
//							System.out.printf("%d.%s", a, menusHead[a-1]);
////							}
//						}
						for (int i = 0; i < menusHead.length; i++) {
							System.out.printf("%d.%s", i + 1, menusHead[i]);
						}
						arw("\n�Է�");
						choice = Integer.parseInt(sc.nextLine());
						System.out.println();
						
						System.out.println("������ ������ �޴��� ������.");
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
						// ���ݺ��� ��� �޽���

						arw("�Է�");
						// �Է� �ȳ��޽���
						int choice2 = 0;
						choice2 = Integer.parseInt(sc.nextLine());
						// �����Է� ����
						System.out.println();
						int nowPrice = 0;
						// ���� ���� ���� ���� �� �ʱ�ȭ
						String dummyMenu = "";
						// �޴� �̸��� ���� ���̺��� ���� �� �ʱ�ȭ
//						if (choice == 1) { // 112.2.3.01 ����
//							// 1.menus[0][0] ���ý�
//							nowPrice = menusPrice[0][0];
//							// ���� ���ݿ� menus[0][0]�� ���� ���� ����
//							dummyMenu = menus[0][0];
//							// ���̸޴��� menus[0][0]�޴��� ����
//						} else if (choice == 2) // 112.2.3.01 ����
//						{ // 112.2.3.02 ����
//							// 2.menus[1][0] ���ý�
//							nowPrice = menusPrice[1][0];
//							// ���� ���ݿ� menus[1][0]�� ���� ���� ����
//							dummyMenu = menus[1][0];
//							// ���̸޴��� menus[1][0]�� �޴��� ����
//						} else if (choice == 3) // 112.2.3.02 ����
//						{ // 112.2.3.03 ����
//							// 3.menus[2][0] ���ý�
//							nowPrice = menusPrice[2][0];
//							// ���� ���ݿ� menus[2][0]�� ���� ���� ����
//							dummyMenu = menus[2][0];
//							// ���̸޴��� menus[2][0]�� �޴��� ����
//						} // 112.2.3.03 ����
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
						
						
						
						// ���� ���� ��� ���� if�� ����
						System.out.printf("%s�� ���� ���� : %d\n", dummyMenu, nowPrice);
						// ���Ե� ���̸޴��� ���簡�� �ȳ��޽���
						System.out.println("�ٲ� ������ �Է��ϼ���.");
						// ���氡�� �Է� �ȳ��޽���

						arw("�Է�");
						// �Է� �ȳ��޽���
						int dummyPrice = Integer.parseInt(sc.nextLine());
						// ����(�ӽ�)���� �Է� ���� ����
						System.out.printf("�Էµ� �ݾ� : %d\n", dummyPrice);
						// �Էµ� �ݾ� �ȳ��޽���
						System.out.println("�� �������� �����Ͻðڽ��ϱ�?");
						// ���� ���� Ȯ�� �ȳ��޽���
						System.out.println("1.��\n2.�ƴϿ�(���θ޴��� �̵�)");
						// ���� �ȳ��޽���

						arw("�Է�");
						// �Է� �ȳ��޽���
						int yOrN = Integer.parseInt(sc.nextLine());
						// ���� ���� Ȯ�� ���� �Է� ���� ����
						if (yOrN == 1) { // 112.2.3.04 ����
											// 1.�� ���ý�
							menusPrice[adrs1][adrs2] = dummyPrice;
//							if (choice == 1) { // 112.2.3.04.01 ����
								

									// ���̰����� menus[0][0] ���ݿ� ����

//								}

//												// ���� ���� ��� �޴��� menus[0][0] �޴����
//								menusPrice[0][0] = dummyPrice;
//								// ���̰����� menus[0][0] ���ݿ� ����
//							} else if (choice == 2) // 112.2.3.04.01 ����
//							{ // 112.2.3.04.02 ����
//								// ���� ���� ��� �޴��� menus[1][0] �޴����
//								menusPrice[1][0] = dummyPrice;
//								// ���̰����� menus[1][0] ���ݿ� ����
//							} else if (choice == 3) // 112.2.3.04.02 ����
//							{ // 112.2.3.04.03 ����
//								// ���� ���� ��� �޴��� menus[2][0] �޴����
//								menusPrice[2][0] = dummyPrice;
//								// ���̰����� menus[2][0] ���ݿ� ����
//							} // 112.2.3.04.03 ����
								// ���� ���� Ȯ�� 1.�� ���� if�� ����
							System.out.println(profit);
						} else if (yOrN == 2) // 112.2.3.04 ����
						{ // 112.2.3.05 ����
							// ���� ���� Ȯ�� 2.�ƴϿ� ���ý�
//							System.out.println(goToMain);
//							continue;
							// ���θ޴��� �̵�
						} else // 112.2.3.05 ����
						{ // 112.2.3.06 ����
							// 1.�� 2.�ƴϿ��� �ƴ� �ٸ� �Է��� ���� ���
							System.out.println(errMsg);
							// �����޽��� "�ٽ� �Է��ϼ���." ���
						} // 112.2.3.06 ����
								System.out.println(goToMain);
//								// �ȳ��޽��� "���θ޴��� ���ư��ϴ�." ���
								continue;
//								// ���θ޴��� �̵�
					} else if (choice == 4) // 112.2.3 ����
					{ // 112.2.4 ����
						// �޴�����
						System.out.printf("������ �޴��� �����ϼ���.\n1.%s\n2.%s\n3.%s\n", menus[0][0], menus[1][0], menus[2][0]);
						// ������ �޴� ���� �ȳ��޽���
						choice = Integer.parseInt(sc.nextLine());
						// ������ �޴� ��ȣ �Է� ������ ����
						String dummyMenu = "";
						// ���̸޴��� ���� ����
						if (choice == 1) // 1�� �޴� ������ ���
						{
							dummyMenu = menus[0][0];
							// ���̸޴��� 1�� �޴��� ����
						} else if (choice == 2) // 2�� �޴� ������ ���
						{
							dummyMenu = menus[1][0];
							// ���̸޴��� 2�� �޴��� ����
						} else if (choice == 3) // 3�� �޴� ������ ���
						{
							dummyMenu = menus[2][0];
							// ���̸޴��� 3�� �޴��� ����
						} else
						// 1,2,3�� �ƴ� �ٸ� �Է��� �� ���
						{
							System.out.println(errMsg);
							// �����޽��� "�ٽ� �Է��ϼ���." ���
							System.out.println(goToMain);
							// �ȳ��޽��� "���θ޴��� ���ư��ϴ�." ���
							continue;
							// ���θ޴��� �̵�
						}
						System.out.printf("������ �޴� : %s\n���ο� �޴����� �Է����ּ���.\n", dummyMenu);
						// ������ �޴� �ȳ��޽���
						System.out.print("�Է� >> ");
						// ���ο� �޴��� �Է� �ȳ��޽���
						String dummyNewName = sc.nextLine();
						// �Է¹��� ���ο� �޴����� ������ ���� ����
						System.out.printf("���� �޴��� : %s\n���ο� �޴��� : %s\n�����Ͻðڽ��ϱ�?\n", dummyMenu, dummyNewName);
						// ���� �޴���, ���ο� �޴��� �ȳ��޽���
						System.out.println("1.��\n2.�ƴϿ�");
						// ���� �ȳ��޽���
						System.out.print("�Է� >> ");
						// �Է� �ȳ��޽���
						int YorN = Integer.parseInt(sc.nextLine());
						// ���� �Է� ���� ����
						if (YorN == 1)
						// 1.���� �Է��� ���
						{
							if (choice == 1)
							// �޴� ���ÿ��� 1�� �޴��� ������ ���
							{
								menus[0][0] = dummyNewName;
								// ���ο� �޴����� 1�� �޴��� ����
							} else if (choice == 2)
							// �޴� ���ÿ��� 2�� �޴��� ������ ���
							{
								menus[1][0] = dummyNewName;
								// ���ο� �޴����� 2�� �޴��� ����
							} else if (choice == 3)
							// �޴� ���ÿ��� 3�� �޴��� ������ ���
							{
								menus[2][0] = dummyNewName;
								// ���ο� �޴����� 3�� �޴��� ����
							}

							System.out.println(profit);
							// "���� �Ϸ�!" �޽��� ���
						} else if (YorN == 2)
						// 2.�ƴϿ��� �Է��� ���
						{
							System.out.println(fail);
							// "���� ����!" �޽��� ���
						}
						System.out.println(goToMain);
						// "���θ޴��� ���ư��ϴ�." �ȳ��޽��� ���
						System.out.println();
						// �������� ���� �ٹٲ�
						continue;
						// ���θ޴��� �̵�
					} else// 112.2.4 ���� �޴��� ���� ��
					{ // 112.2.5 ���� 5�� �ٸ� �Է��� ���� ���
						switch (choice) // choice���� ��������
						{ // 112.2.5.1 ����
						default:
							// 5�� �ƴ� �ٸ� �Է��� ���� ���
							System.out.println(errMsg);
							// �����޽��� ���
							// switch���� �Ʒ��� �帣�� ������ ���� break���� ����.
						case 5:
							// 5�� �Է��� ���
							// �����ڸ޴� ����if�� ����
							System.out.println(goToMain);
							// �ȳ��޽��� ���θ޴��� ���ư��ϴ�." ���
							System.out.println();
							// �������� ���� �ٹٲ�
							continue;
						// ���θ޴��� �̵�
						} // 112.2.5.1 ����
					} // 112.2.5 ����
				} // 112.2 ����
					// if�� (adminCode.equals(inputCode)) ����
			} else // 112 ����
					// 2.�����ڸ޴� else~if�� ����
			{ // 113 ����
				// ���θ޴� if��else
				// 1.�ֹ��ϱ�, 2.�����ڸ޴�, Ż��Ű esc ���� �ٸ� �����Է½�
				System.out.println(errMsg);
				// �����޽��� "�ٽ� �Է��ϼ���." ���
				System.out.println();
			} // 113 ����
				// ���θ޴� if~else~if�� ����
		} // 110 ����
		// ���θ޴�while ����
}}
