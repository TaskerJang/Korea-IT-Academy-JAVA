package ex1_set;

import java.util.HashSet;
import java.util.Set;

public class Ex1_Set {
	public static void main(String[] args) {
		
//		�ڹ��� collection
//		�ټ��� �����͸� ���� ȿ�������� ó���� �� �ִ� ǥ��ȭ�� ����� �����ϴ� Ŭ������ ����
//
//		collection Ŭ������ ����
//		1) List<> ( ArrayList )
//		2) Set<>( HashSet, TreeSet )
//		3) Map<> ( HashMap )
		
		//Set : Ư�� �ڵ忡�� �ߺ��� ���� ����� �־�� �ȵ� �� ���
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(20);
		set1.add(30);
		set1.add(10);
		set1.add(100);
		set1.add(30);//30�� �̹� add�� ���̱� ������ ���� add���� �ʴ´�.
		
		//set�� �迭�� ���� index�� �����ϴ� ���� �Ұ�
		//��� for���� ��� set�� ������ �ִ� ��� ������ ��°�� ����ϴ°��� ����
		System.out.println( set1 );
		
		System.out.println( set1.size() );
		
		//set�� index������ ������ �Ұ��ϱ� ������
		//0, 1, 2���� index�� �����ϰ� �ʹٸ� �迭�� ������ ��
		//����� �迭�� ���ؼ� index�� ����
		
		//set -> �迭
		Integer[] arr = set1.toArray( new Integer[0] );
		System.out.println(arr.length);
		System.out.println(arr[1]);
		
		set1.clear();//set�� ���� ��� �޸𸮸� �ʱ�ȭ �Ѵ�
		System.out.println(set1.size());
	}
}































