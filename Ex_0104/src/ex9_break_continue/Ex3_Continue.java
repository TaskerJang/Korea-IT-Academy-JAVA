package ex9_break_continue;

public class Ex3_Continue {
public static void main(String[] args) {

	
	
	//continue�� : �ݺ��� ������ Ư�� ������ �����ϰ� �ǳʶٰ��� �� �� ���Ǵ� Ű����
	
	for (int i = 1; i <=2; i++) {
		for (int j = 1; j <=5; j++) {
			
			//j++ => �ǵ������� �������� ���⿡ ���� ���ǽ����� �ǳ� �ڴ�.
			if (j % 2 == 0) {
				continue;//���� ����� for�� ������ �ö󰣴� (�ǳʶٰ�)
				//continue ���� �� ��� �ڵ嵵 �߰��� �� ����.
			}
			
		
			System.out.printf("%d " , j);
		}
		
		
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}//main
}