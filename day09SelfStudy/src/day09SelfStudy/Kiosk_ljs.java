package day09SelfStudy;

import java.util.Scanner;
import java.util.Random;

public class Kiosk_ljs { // class ����

	public static void main(String[] args) { // 110 ����
		// main ����
		Scanner sc = new Scanner(System.in); // �Է� ���� �غ�(choice)
		Random r = new Random(); // ���� ���� �غ�(��ȣǥ)

		// ��� �ȳ�
		// 1. ������ ��й�ȣ ���� ���
		// 2. ����ȣ ���� ��� ���
		// 3. ��ٱ��� ��� �� ��ٱ��� �ʱ�ȭ ���
		// 4. Ư�� �޴� ���� ���� ���
		// (new)5. �޴��� ���� ���

		String adminCode = "0000"; // ������ ��й�ȣ�� ������ ����

		int hamPrice = 1500; // �ܹ��� �ʱⰡ��
		int gamPrice = 2000; // ����Ƣ�� �ʱⰡ��
		int colaPrice = 500; // �ݶ� �ʱⰡ��
		int hamCnt = 0; // �ܹ��� ������ ������ ����
		int gamCnt = 0; // ��Ƣ ������ ������ ����
		int colaCnt = 0;// �ݶ� ������ ������ ����

		String menu1 = "�ܹ���"; // ù��° �޴� �̸�
		String menu2 = "����Ƣ��";// �ι�° �޴� �̸�
		String menu3 = "�ݶ�"; // ����° �޴� �̸�

		String errMsg = "�ٽ� �Է��ϼ���.";
		// �߸� �Է����� ��� ����� ���� �޽���
		String goToMain = "���θ޴��� ���ư��ϴ�.";
		// ���θ޴��� ���ư� �� ����� �ȳ��޽���
		String profit = "���� �Ϸ�!";
		// ���� �Ϸ�� ��� �޽���
		String fail = "���� ����!";
		// ���� ���н� ��� �޽���
		// m100 �غ񿵿� ����
		while (true) { // 110 ����
			hamCnt = 0;
			gamCnt = 0;
			colaCnt = 0;
			// ��ٱ��� �ʱ�ȭ
			System.out.println("�ڡ١ڡپ������ڡ١ڡ�");
			System.out.println("������������������������������������");
			System.out.println("��1.�ֹ��ϱ�\t ��");
			System.out.println("��2.�����ڸ޴�\t ��");
			System.out.println("������������������������������������");
			System.out.print("�Է� >> "); // �ֹ��ϱ� Ȥ�� �����ڸ޴� ����
			int choice = Integer.parseInt(sc.nextLine());
			// �Է��� ���� ���� choice ����

			if (choice == 1) { // 111 ���� �ֹ��ϱ� ȭ��
				while (true) { // 111.1 ���� ���ĸ޴����
								// while�� ���� �߰�ȣ
					System.out.println("�� ��������������������ǥ������������������\t��");
					System.out.printf("�� 1. %-4s\t-%5d�� ��\n", menu1, hamPrice); // menu1�ܹ���
					System.out.printf("�� 2. %-4s\t-%5d�� ��\n", menu2, gamPrice); // menu2����Ƣ��
					System.out.printf("�� 3. %-4s\t-%5d�� ��\n", menu3, colaPrice);// menu3�ݶ�
					System.out.println("�� ������������������������������������������\t��");
					System.out.println("4. �����ϱ�");
					// �����ϱ�� �̵�
					System.out.println("5. ��ٱ��� ����");
					// hamCnt, gamCnt, colaCnt �ʱ�ȭ
					System.out.println("0. ���θ޴��� ���ư���\n");
					// ���θ޴��� �̵�
					System.out.print("�Է� >> ");
					// �Է� �ȳ� �޽���
					choice = Integer.parseInt(sc.nextLine());
					// �ֹ� �޴� ��ȣ �Է� ����
					int tempCnt = 0; // ���� ���� tempCnt ����
					if (choice == 1 || choice == 2 || choice == 3) {// 111.1.01 ����
						// menu1,2,3 �� �ϳ��� ����� ���
						do {// 111.1.01.01 ����
							// do~while�� ���� �߰�ȣ
							System.out.print("���� >> ");
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
						// if�� ���� : menu1,2,3,0 �� �ϳ��� ����� ���

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
					if (choice == 1) { // 111.1.03 ����
						// 1. menu1 �ܹ��� ����
						hamCnt += tempCnt;
						// ��ٱ��Ͽ� ��� �� + �� ���� ��
						dummyMenu = menu1;
						dummyCnt = hamCnt;
					} else if (choice == 2) // 111.1.03 ����
					{ // 111.1.04 ����
						// 2. ����Ƣ�� ����
						gamCnt += tempCnt;
						// ��ٱ��Ͽ� ��� �� + �� ���� ��
						dummyMenu = menu2;
						dummyCnt = gamCnt;
					} else if (choice == 3) // 111.1.04 ����
					{ // 111.1.05 ����
						// 3. �ݶ� ����
						colaCnt += tempCnt;
						// ��ٱ��Ͽ� ��� �� + �� ���� ��
						dummyMenu = menu3;
						dummyCnt = colaCnt;
					} else if (choice == 4) // 111.1.05 ����
					{ // 111.1.06 ����
						// 4. �����ϱ�
						int total = hamCnt * hamPrice + gamCnt * gamPrice + colaCnt * colaPrice;
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
						hamCnt = 0;
						gamCnt = 0;
						colaCnt = 0;
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
					if (hamCnt >= 1) // �ܹ��Ű� 1�� �̻� ��ٱ��Ͽ� ��� ���
					{ // 111.1.10 ����
						System.out.printf("��%s\t: %d����\n", menu1, hamCnt);
						// ���� ���
					} // 111.1.10 ����
					if (gamCnt >= 1) { // 111.1.11 ����
										// ����Ƣ���� 1�� �̻� ��ٱ��Ͽ� ��� ���
						System.out.printf("��%s\t: %d����\n", menu2, gamCnt);
						// ���� ���
					} // 111.1.11 ����
					if (colaCnt >= 1) { // 111.1.12 ����
										// �ݶ� 1�� �̻� ��ٱ��Ͽ� ��� ���
						System.out.printf("��%s\t: %d����\n", menu3, colaCnt);
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
					System.out.print("�Է� >> ");
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
						System.out.print("�� ��й�ȣ �Է� >> ");
						// ����й�ȣ �Է� �ȳ��޽���
						String newPw = sc.nextLine();
						// ����й�ȣ �Է� ���� ����
						System.out.print("��й�ȣ Ȯ�� >> ");
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
						System.out.println("������ ������ �޴��� ������");
						// ���ݺ��� �ȳ��޽���
						System.out.printf("1.%s\n2.%s\n3.%s\n", menu1, menu2, menu3);
						// ���ݺ��� ��� �޽���
						System.out.print("�Է� >> ");
						// �Է� �ȳ��޽���
						choice = Integer.parseInt(sc.nextLine());
						// �����Է� ����
						int nowPrice = 0;
						// ���� ���� ���� ���� �� �ʱ�ȭ
						String dummyMenu = "";
						// �޴� �̸��� ���� ���̺��� ���� �� �ʱ�ȭ
						if (choice == 1) { // 112.2.3.01 ����
							// 1.menu1 ���ý�
							nowPrice = hamPrice;
							// ���� ���ݿ� menu1�� ���� ���� ����
							dummyMenu = menu1;
							// ���̸޴��� menu1�޴��� ����
						} else if (choice == 2) // 112.2.3.01 ����
						{ // 112.2.3.02 ����
							// 2.menu2 ���ý�
							nowPrice = gamPrice;
							// ���� ���ݿ� menu2�� ���� ���� ����
							dummyMenu = menu2;
							// ���̸޴��� menu2�� �޴��� ����
						} else if (choice == 3) // 112.2.3.02 ����
						{ // 112.2.3.03 ����
							// 3.menu3 ���ý�
							nowPrice = colaPrice;
							// ���� ���ݿ� menu3�� ���� ���� ����
							dummyMenu = menu3;
							// ���̸޴��� menu3�� �޴��� ����
						} // 112.2.3.03 ����
							// ���� ���� ��� ���� if�� ����
						System.out.printf("%s ���� ���� : %d\n", dummyMenu, nowPrice);
						// ���Ե� ���̸޴��� ���簡�� �ȳ��޽���
						System.out.println("�ٲ� ������ �Է��ϼ���.");
						// ���氡�� �Է� �ȳ��޽���
						System.out.print("�Է� >> ");
						// �Է� �ȳ��޽���
						int dummyPrice = Integer.parseInt(sc.nextLine());
						// ����(�ӽ�)���� �Է� ���� ����
						System.out.printf("�Էµ� �ݾ� : %d\n", dummyPrice);
						// �Էµ� �ݾ� �ȳ��޽���
						System.out.println("�� �������� �����Ͻðڽ��ϱ�?");
						// ���� ���� Ȯ�� �ȳ��޽���
						System.out.println("1.��\n2.�ƴϿ�(���θ޴��� �̵�)");
						// ���� �ȳ��޽���
						System.out.println("�Է� >> ");
						// �Է� �ȳ��޽���
						int yOrN = Integer.parseInt(sc.nextLine());
						// ���� ���� Ȯ�� ���� �Է� ���� ����
						if (yOrN == 1) { // 112.2.3.04 ����
											// 1.�� ���ý�
							if (choice == 1) { // 112.2.3.04.01 ����
												// ���� ���� ��� �޴��� menu1 �޴����
								hamPrice = dummyPrice;
								// ���̰����� menu1 ���ݿ� ����
							} else if (choice == 2) // 112.2.3.04.01 ����
							{ // 112.2.3.04.02 ����
								// ���� ���� ��� �޴��� menu2 �޴����
								gamPrice = dummyPrice;
								// ���̰����� menu2 ���ݿ� ����
							} else if (choice == 3) // 112.2.3.04.02 ����
							{ // 112.2.3.04.03 ����
								// ���� ���� ��� �޴��� menu3 �޴����
								colaPrice = dummyPrice;
								// ���̰����� menu3 ���ݿ� ����
							} // 112.2.3.04.03 ����
								// ���� ���� Ȯ�� 1.�� ���� if�� ����
							System.out.println(profit);
						} else if (yOrN == 2) // 112.2.3.04 ����
						{ // 112.2.3.05 ����
							// ���� ���� Ȯ�� 2.�ƴϿ� ���ý�
							System.out.println(goToMain);
							continue;
							// ���θ޴��� �̵�
						} else // 112.2.3.05 ����
						{ // 112.2.3.06 ����
							// 1.�� 2.�ƴϿ��� �ƴ� �ٸ� �Է��� ���� ���
							System.out.println(errMsg);
							// �����޽��� "�ٽ� �Է��ϼ���." ���
						} // 112.2.3.06 ����
//						System.out.println(goToMain);
//						// �ȳ��޽��� "���θ޴��� ���ư��ϴ�." ���
//						continue;
//						// ���θ޴��� �̵�
					} else if (choice == 4) // 112.2.3 ����
					{ // 112.2.4 ����
						// �޴�����
						System.out.printf("������ �޴��� �����ϼ���.\n1.%s\n2.%s\n3.%s\n", menu1, menu2, menu3);
						// ������ �޴� ���� �ȳ��޽���
						choice = Integer.parseInt(sc.nextLine());
						// ������ �޴� ��ȣ �Է� ������ ����
						String dummyMenu = "";
						// ���̸޴��� ���� ����
						if (choice == 1) // 1�� �޴� ������ ���
						{
							dummyMenu = menu1;
							// ���̸޴��� 1�� �޴��� ����
						} else if (choice == 2) // 2�� �޴� ������ ���
						{
							dummyMenu = menu2;
							// ���̸޴��� 2�� �޴��� ����
						} else if (choice == 3) // 3�� �޴� ������ ���
						{
							dummyMenu = menu3;
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
								menu1 = dummyNewName;
								// ���ο� �޴����� 1�� �޴��� ����
							} else if (choice == 2)
							// �޴� ���ÿ��� 2�� �޴��� ������ ���
							{
								menu2 = dummyNewName;
								// ���ο� �޴����� 2�� �޴��� ����
							} else if (choice == 3)
							// �޴� ���ÿ��� 3�� �޴��� ������ ���
							{
								menu3 = dummyNewName;
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
				}	// 112.2 ����
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
	} // 100 ����
		// main ����

} // class ����
