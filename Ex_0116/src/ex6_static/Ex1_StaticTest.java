package ex6_static;

public class Ex1_StaticTest {

	String str1 = "�Ϲ� �������";
	static String str2 = "����ƽ ����";
	
	public void test1() {
		//�Ϲ� �޼��忡���� static������ �Ϲݺ����� ��� ����� �� �ִ�.
		str1 = "hi";
		str2 = "hello";
		
		//�Ϲ� �޼��忡���� staticŰ���带 ���� ������ ���� �� ����.
		//static String str3 = "�ݰ�";
	}
	
	public static void test2() {
		//static�޼��忡���� �Ϲ� ��������� ����� �Ұ�
		//str1 = "hi";
		str2 = "hello";
		
		int num = 100;//���������� �Ϲ� ������ ����ϴ� ���� ����
		
		//static�޼��忡���� static������ ���������� �����ϴ� ���� �Ұ�
		//static int num6 = 300;
	}
	
}











