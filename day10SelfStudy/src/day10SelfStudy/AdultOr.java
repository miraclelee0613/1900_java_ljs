package day10SelfStudy;
import java.util.Scanner;
public class AdultOr {
	public static String adultOrNot(int age) {

		String adult = "";
		if(age >= 19) {
			adult = "����";
		}else {
			adult = "�̼�����";
		}
		return adult;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ����ڿ��� ���̸� �Է¹޾Ƽ� �̼��������� �ƴ��� �Ǵ��ϴ� �޼ҵ�
		System.out.println("���̸� �Է��ϼ���.");
		System.out.print("�Է� >> ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println();
		System.out.println(adultOrNot(age) + "�Դϴ�.");
		
		
		
		
		
		
		
		
	}
}
