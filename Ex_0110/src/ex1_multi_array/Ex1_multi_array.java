package ex1_multi_array;

public class Ex1_multi_array {
	public static void main(String[] args) {
		
	//������ �迭 =>���ȣ�� ������ ������ �����Ѵ�. => ū��(��) 2���� ���� ������(��) 3���� =>ū��, ��������  ��� �����ؼ� ���� �־�� �ȴ�. => �� ���� �Ұ���
    //1���� �迭�� 2�� ���̸� 2���� �迭   =>2�� for������ ����ؾ��Ѵ�.(��� ���� �����ʹٸ�)
    //1���� �迭�� 3�� ���̸� 3���� �迭   => ū�� �ӿ� �߰��� �ӿ� �������� �ִ�. => ���� ���� �濡�� ���� �� �ִ�. (ū��, �߰��� �Ұ���)[][][]
		
	int[][] test = new int[2][3];
	
	test[0][0] = 10;
	test[0][1] = 20;
	test[0][2] = 30;
	
	test[1][0]= 40;
	test[1][1]= 50;
	test[1][2]= 60;
	
	System.out.println(test[1][1]);
	
	System.out.println("--------------------------------------------------------------------");
	
	//2���� �迭 test�� ��� ���� ����غ���!!!!!
	//test.length => ū ���� ����
	//test[i].length => ���� ���� ����  => ���� ���� ������ ��� �ٸ� �� �����Ƿ� ���ڸ� ���� �ʴ´�!!!!
	
	for (int i = 0; i < test.length; i++) {
		for (int j = 0; j < test[i].length; j++) {	
		
			System.out.printf("%d ", test[i][j]);
		}//inner
		
		System.out.println();
	}//outer
	
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}//main

}