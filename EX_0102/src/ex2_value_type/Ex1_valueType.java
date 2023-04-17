package ex2_value_type;

public class Ex1_valueType {

 public static void main(String[] args) {
 
	 // �⺻�ڷ���(valueType)
	 /*
	   ������: boolean - 1bit 
	   ������: char - 2byte
	   ������: byte - 1byte ...... -128 ~ 127 => ������� �ƴ�.
	        short - 2byte..... -32768 ~ 32767 => ����� �ָ��ؼ� ���������� ��� ����
	        int - 4byte....... -21�� ~ 21�� => �Ϲ����� ���߿��� ���� ���� ���
	        long - 8byte...... -900�� ~ 900�� => ���� �о߿����� ���ڰ� Ŀ���� �ַ� ���
	   �Ǽ���: float - 4byte..... 4.XXX byte ����
	        double - 8byte... 8.XXX byte ����
	   */
	 //����: Ư�� ���� �����ϱ� ���� ���� (Like �̸�ǥ..)
	 //�ڷ����� �����ϴ� �ĺ���
	 
	 //���� ���� ��Ģ!!
	 // 1)�ڷ��� ������; (����)
	 // 2)������ = ��; (����)
	 // 3)�ڷ��� ������ = ��; (�ʱ�ȭ)
	 
	 // ���� ����� ���ǻ���!
	 // 1) �����̸� �ߺ� XXXX
	 // 2) _�� �����ϰ��� Ư�����ڸ� �������� ����!
	 // 3) �������� �ݵ�� �ҹ��ڷ� �����Ѵ�!!! VS Ŭ������ �빮�ڷ� ����
	 // 4) �������� ���ڷ� ������ �� ���� �������� �ۼ��� ��. (���� ������ ����)
	 
	 //1) ������
	 //���� ����. ��, true �� false ������ �����ϴ� �ڷ��� Ÿ�� (��,����)
	 boolean b;
	 b= true;
	 b= false;
	 
	 boolean b2;  // (�ߺ��Ǹ� �ȵȴ� !!!)
	 //boolean b2 = 1 (�Ұ���) => �ڷ��� Ÿ�Կ� �´� ���� �־���� �Ѵ�.
	 System.out.println(b); // => false (������ �Ʒ� ���ʿ��� ���������� ����ǹǷ�..)
	 
	 //������
	 //Ȭ����ǥ �ȿ� �� �ѱ��ڸ� ���� ������ �ڷ���
	 //���� ���� b�� �̹� �־ ��� �Ұ���
	 char c = 'A';
	 System.out.println("c : " + c);
	 
	 char c2 = 65 +1;
	 System.out.println("c2 : " + c2); // �ƽ�Ű�ڵ�ǥ���� 66�� B�̴�.
	 char c3 = 'B' +1;
	 System.out.println("c3 : " + c3);
	 
	 // ������
	 //byte by = 128; => 127���� ���� �����ϹǷ� �Ұ���
	 int n1 = 2100000000;
	 long n2 = 2200000000L; //������ �ϱ����� long�̶�� ��� ����� �Ѵ�!! (int������ ����� ��)
     System.out.println("long�� : " + n2);
     
     // �Ǽ��� 
     // �Ҽ����� ���� ������ �����ϱ� ���� �ڷ���
     float f1 = 3.14F; 
     double f2 = 3.14; //double �뷮�� Ŀ�� �뷮����
     System.out.println(f1);
     System.out.println(f2);
	 
     f1 = 100;
     f2 = 100;
     System.out.println(f1); // ������ �־ .0�� �־ ������ �Ǽ� Ÿ������ ����
     System.out.println(f2);
	 
     
     
} // main �Է��� ��Ʈ�� �����̽��� => ���� �޼��� �Է�!! (���� �޼��� �ȿ� �Է��ؾ� ����� �����ϴ�!!)
 
 
 	
	
}