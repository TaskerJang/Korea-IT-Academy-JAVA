package ex3_single_for;

public class Ex1_for {
public static void main(String[] args) {
	//�ݺ���: Ư�� ���๮�� ������ �ݺ��� �� �ֵ��� ���ִ� ���
	//for(�ʱ��;���ǽ�;������){
	//  ���ǽ��� ���ΰ�� ����Ǵ� ����
	//}
	for(int i = 0; i <3; i++) {
		//1.������       2.�������Ǻ�    4.�����ؼ� i���� �ٲ�
		System.out.println(i);
	}//for         3.���
	
	//for������ ������� �������� i�� for���� �Ҽ��̹Ƿ�
	//for�� ������ ����� ����� �Ұ���
	//i = 10;
	
	int n = 0;//��������
	
	for (n=1; n <=3; n++) {
		System.out.println("n : " + n);
	}
	System.out.println(n); // 4������ !!!
	
	System.out.println("-------------------------------------------------");
	
	//10~1���� ���ҵǴ� ���� ����Ͻÿ�.
	for (int i =10; i>=1; i--) {
		System.out.println(i);
		
	}
	
	System.out.println("--------------------------------");
	
	for (int i =1; i<=100; i++) {
		if (i%3==0) {
		System.out.println(i);}
	}
	
	System.out.println("--------------------------------");
	
	for (int i = 3; i <=100; i+=3 )
	{System.out.println(i);}

}//main
}