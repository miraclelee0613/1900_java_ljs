package day05;

public class RelationalOperator {

	public static void main(String[] args) {
		
		System.out.println(10 > 15);
		System.out.println(10 < 13.1);
		System.out.println(97 == 'a');
		System.out.println('a' > 'b');
		
		// ���ڿ��� ���迬���� ��� �Ұ���
//		System.out.println("�ȳ�" >= "�ݰ���");
		
		// ���ڿ��� Ŭ�����̱� ������ ���� ������ ���� ��
		// �޼ҵ带 ��� �Ѵ١ڡڡڡڡ�.
		// ���ڿ�1.equals(���ڿ�2)	:	���ڿ�1�� ���ڿ�2�� ���ٸ� true, �ƴ϶�� false
		System.out.println("---------------------");
		System.out.println("�ȳ�".equals("�ݰ���"));
		System.out.println("�ȳ�".equals("�ȳ�"));		
//		
//		System.out.println("�ȳ�" == "�ȳ�");
		System.out.println("---------------------");
		System.out.println(false == false);
		
	}

}
