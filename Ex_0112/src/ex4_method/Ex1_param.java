package ex4_method;

public class Ex1_param {

	public void test1(String s) {
	s+="반갑습니다.";
	System.out.println("param : " + s);

	//void이므로 리턴 없음.
	}
	
	public void test2(int[] a) {
		
		a[0] = 4;
		a[1] = 5;
		a[2] = 6;
		
			for( int i = 0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("-------------------");
	}
	
}
