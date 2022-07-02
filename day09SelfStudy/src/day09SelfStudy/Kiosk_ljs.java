package day09SelfStudy;
import java.util.Scanner;
import java.util.Random;
public class Kiosk_ljs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // �Է� ���� �غ�(choice)
		Random r = new Random(); // ���� ���� �غ�(��ȣǥ)

		// ��� �ȳ�
		// 1. ������ ��й�ȣ ���� ���
		// 2. ����ȣ ���� ��� ���
		// 3. ��ٱ��� ��� �� ��ٱ��� �ʱ�ȭ ���
		// 4. Ư�� �޴� ���� ���� ���
		// (�̱���)5. �޴��� ���� ���

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

		while (true) { // ���θ޴�
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

			if (choice == 1) { // �ֹ��ϱ� ȭ��
				while (true) { // ���ĸ޴���� while�� ���� �߰�ȣ
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
					if (choice == 1 || choice == 2 || choice == 3) {
						// menu1,2,3 �� �ϳ��� ����� ���
						do { // do~while�� ���� �߰�ȣ
							System.out.print("���� >> ");
							// ���� �Է� �ȳ��޽���
							tempCnt = Integer.parseInt(sc.nextLine());
							// ���� ���� tempCnt �Է�
						} while (tempCnt < 0); // do~while �ݴ� �߰�ȣ
						// ������ 0���� �۰� �Է��ϸ� �ٽ� �Է��ϰ� �̵�
						if (tempCnt == 0) {
							// ������ 0�� �Է��ϸ� ���ĸ޴��� �ٽ� �̵�
							continue; // ���ĸ޴��� �̵�
						} // if�� ���� : ���� 0�� ���θ޴��̵�

					}// if�� ���� : menu1,2,3,0 �� �ϳ��� ����� ���

					if(choice == 0) {
						// Ż��Ű 0�� �Է��� ���
						System.out.println(goToMain);
						// �ȳ��޽��� "���θ޴��� ���ư��ϴ�." ���
						break;
						// ���θ޴��� �̵�
					}

					String dummyMenu = "";
					int dummyCnt = 0;
					if (choice == 1) {
						// 1. menu1 �ܹ��� ����
						hamCnt += tempCnt;
						// ��ٱ��Ͽ� ��� �� + �� ���� ��
						dummyMenu = menu1;
						dummyCnt = hamCnt;
					} else if (choice == 2) {
						// 2. ����Ƣ�� ����
						gamCnt += tempCnt;
						// ��ٱ��Ͽ� ��� �� + �� ���� ��
						dummyMenu = menu2;
						dummyCnt = gamCnt;
					} else if (choice == 3) {
						// 3. �ݶ� ����
						colaCnt += tempCnt;
						// ��ٱ��Ͽ� ��� �� + �� ���� ��
						dummyMenu = menu3;
						dummyCnt = colaCnt;
					} else if (choice == 4) {
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
						if (money >= total) {
							// �Է��� �ݾ��� ������ �ݾ׺��� ũ�ų� ���� ���(���� ������ ���)
							System.out.println("�Էµ� �ݾ� : \t" + money);
							// �Է��� �ݾ�
							System.out.println("�� ���� �ݾ� : \t" + total);
							// �ʿ��� ���� �ݾ�
							if (money > total) {
								// �Է� �ݾ��� ������ �ʿ��� �ݾ׺��� ���� ���
								// money == total�� ���� ������� ����
								System.out.println("��ȯ�� �ݾ� : \t" + (money - total));
								// �ܵ� �ȳ� �޽���
							}
							System.out.printf("����ȣ : %04d\n", r.nextInt(9999) + 1);
							// ����ȣ ��� �޽���
							System.out.println("������ �Ϸ�Ǿ����ϴ�.\n�Ļ� ���ְ� �ϼ���!\n");
							// �����Ϸ� �ȳ� �޽���

						} else {
							// money < total �Է� �ݾ��� ������ �ʿ��� �ݾ׺��� ���� ���
							System.out.println("�ܾ��� �����մϴ�.");
							// �ȳ� �޽���
							System.out.println(goToMain);
							// ���θ޴� ���� �޽���
						}
						break; // ���θ޴� ����

					} else if (choice == 5) {
						// 5.��ٱ��� �ʱ�ȭ
						hamCnt = 0;
						gamCnt = 0;
						colaCnt = 0;
//					} else if (choice == 6) {
//						// 6. ���θ޴��� ���ư���
//						System.out.println(goToMain);
//						// �ȳ��޽��� "���θ޴��� ���ư��ϴ�" ���
//						break; // ���θ޴� ����
						// 0���� ����
					} else {
						// 0~5(��)�� �ƴ� �ٸ� ���ڸ� �Է����� ���
						System.out.println(errMsg);
						// �����޽��� "�ٽ� �Է��ϼ���." ���
					}
					if(choice == 1 || choice == 2 || choice == 3) {
						System.out.printf("��ٱ��Ͽ� %s %d�� �߰� �Ϸ�!\n", dummyMenu, dummyCnt);
					}
					// ���� ��ٱ��Ͽ� ����ִ� ���ĵ� ����ϱ�
					System.out.println();
					// �������� ���� �ٹٲ�
					System.out.println("�� ����ٱ��Ϧ� ��");
					if (hamCnt >= 1) {
						// �ܹ��Ű� 1�� �̻� ��ٱ��Ͽ� ��� ���
						System.out.printf("��%s\t: %d����\n", menu1, hamCnt);
						// ���� ���
					}
					if (gamCnt >= 1) {
						// ����Ƣ���� 1�� �̻� ��ٱ��Ͽ� ��� ���
						System.out.printf("��%s\t: %d����\n", menu2, gamCnt);
						// ���� ���
					}
					if (colaCnt >= 1) {
						// �ݶ� 1�� �̻� ��ٱ��Ͽ� ��� ���
						System.out.printf("��%s\t: %d����\n", menu3, colaCnt);
						// ���� ���
					}
					System.out.println();
					// �������� ���� �ٹٲ�
					System.out.println("�� ���������������� ��");
				} // ���ĸ޴���� while�� �ݴ� �߰�ȣ

			} else if (choice == 2) {
				// �����ڸ޴� ȭ��
				String inputCode = "";
				// �Է¹��� ��й�ȣ ���� ����
				do { // ��й�ȣ �Է��� �޵�,
					System.out.println("(���θ޴��� �̵� -> esc �Է�)\n" + "������ �޴� ���ٿ��� ��й�ȣ�� �ʿ��մϴ�.");
					// �߸� ������ ��� escape key �ȳ��޽��� ���
					System.out.print("��й�ȣ >> ");
					// ��й�ȣ �Է� �ȳ� �޽���
					inputCode = sc.nextLine();
					// ��й�ȣ �Է� ����
					if (inputCode.equals("esc")) {
						// escape key �Է½�
						System.out.println(goToMain);
						// �ȳ��޽��� "���θ޴��� ���ư��ϴ�." ���
						break;
						// �����ڸ޴� Ż��
					} else if (!(inputCode.equals("esc")) && !adminCode.equals(inputCode)) {
						// �����ں�й�ȣ�� �Էµ� ���� �ٸ��� esc�� �Է����� ���� ���
						System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
						// ��й�ȣ ����ġ �ȳ� �޽��� ���
						// �Ʒ� while�� ���� ���Է����� �̵�
					}

				} while (!adminCode.equals(inputCode));
				// ������ ��й�ȣ�� ����ġ�� �ٽ� �Է�

				if (adminCode.equals(inputCode)) {
					// ��й�ȣ�� �� �ԷµǸ� ���� ����

					System.out.println("1.�����ϱ�\n" + "2.��й�ȣ�缳��\n" + "3.���� ����\n" + "4.���θ޴���");
					System.out.print("�Է� >> ");
					choice = Integer.parseInt(sc.nextLine());
					if (choice == 1) {
						// 1. �����ϱ�
						System.out.println("���õ� ����߽��ϴ�.");
						// �޽��� ���
						break;
						// ���α׷� ����
					} else if (choice == 2) {
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
						if (!newPw.equals(tempPw)) {
							// ����й�ȣ�� Ȯ�κ�й�ȣ�� ���� �ʴٸ�
							System.out.println(fail);
							// ���� �޽��� "���� ����!" ���
							System.out.println(goToMain);
							// �ȳ��޽��� "���θ޴��� ���ư��ϴ�" ���
							continue;
							// ���θ޴��� �̵�
						} // ����й�ȣ�� Ȯ�κ�й�ȣ�� ��ġ�Ѵٸ�
						System.out.println(profit);
						// �ȳ��޽��� "���� ����!" ���
						adminCode = newPw;
						// ������ ��й�ȣ�� ����й�ȣ�� ��ü
						System.out.println(goToMain);
						// �ȳ��޽��� "���θ޴��� ���ư��ϴ�" ���
//						continue;	// ��� �Ǵ� �ڵ�
						// ���θ޴��� �̵�
					} else if (choice == 3) {
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
						if (choice == 1) {
							// 1.menu1 ���ý�
							nowPrice = hamPrice;
							// ���� ���ݿ� menu1�� ���� ���� ����
							dummyMenu = menu1;
							// ���̸޴��� menu1�޴��� ����
						} else if (choice == 2) {
							// 2.menu2 ���ý�
							nowPrice = gamPrice;
							// ���� ���ݿ� menu2�� ���� ���� ����
							dummyMenu = menu2;
							// ���̸޴��� menu2�� �޴��� ����
						} else if (choice == 3) {
							// 3.menu3 ���ý�
							nowPrice = colaPrice;
							// ���� ���ݿ� menu3�� ���� ���� ����
							dummyMenu = menu3;
							// ���̸޴��� menu3�� �޴��� ����
						}
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
						if (yOrN == 1) {
							// 1.�� ���ý�
							if (choice == 1) {
								// ���� ���� ��� �޴��� menu1 �޴����
								hamPrice = dummyPrice;
								// ���̰����� menu1 ���ݿ� ����
							} else if (choice == 2) {
								// ���� ���� ��� �޴��� menu2 �޴����
								gamPrice = dummyPrice;
								// ���̰����� menu2 ���ݿ� ����
							} else if (choice == 3) {
								// ���� ���� ��� �޴��� menu3 �޴����
								colaPrice = dummyPrice;
								// ���̰����� menu3 ���ݿ� ����
							} // ���� ���� Ȯ�� 1.�� ���� if�� ����
							System.out.println(profit);
						} else if (yOrN == 2) {
							// ���� ���� Ȯ�� 2.�ƴϿ� ���ý�
							System.out.println(goToMain);
							continue;
							// ���θ޴��� �̵�
						} else {
							// 1.�� 2.�ƴϿ��� �ƴ� �ٸ� �Է��� ���� ���
							System.out.println(errMsg);
							// �����޽��� "�ٽ� �Է��ϼ���." ���
						}
//						System.out.println(goToMain);
//						// �ȳ��޽��� "���θ޴��� ���ư��ϴ�." ���
//						continue;
//						// ���θ޴��� �̵�
					} else if (!(choice == 4)) {
						// 1,2,3,4 �Է��� �ƴ� �ٸ� ���� �Է����� ���
						System.out.println(errMsg);
						// �����޽��� "�ٽ� �Է��ϼ���." ���
					} // �����ڸ޴� ����if�� ����
					System.out.println(goToMain);
					// �ȳ��޽��� ���θ޴��� ���ư��ϴ�." ���
					System.out.println();
					// �������� ���� �ٹٲ�
					continue;
					// ���θ޴��� �̵�
				} // if�� (adminCode.equals(inputCode)) ����
			} else {// ���θ޴� if��else
				// 1.�ֹ��ϱ�, 2.�����ڸ޴�, Ż��Ű esc ���� �ٸ� �����Է½�
				System.out.println(errMsg);
				// �����޽��� "�ٽ� �Է��ϼ���." ���
				System.out.println();
			} // ���θ޴� if~else~if�� ����

		} // ���θ޴�while ����


	}

}
