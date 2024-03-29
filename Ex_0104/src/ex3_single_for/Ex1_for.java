package ex3_single_for;

public class Ex1_for {
public static void main(String[] args) {
	//반복문: 특정 수행문을 여러번 반복할 수 있도록 해주는 제어문
	//for(초기식;조건식;증감식){
	//  조건식이 참인경우 실행되는 영역
	//}
	for(int i = 0; i <3; i++) {
		//1.시작점       2.참거짓판별    4.증감해서 i값이 바뀜
		System.out.println(i);
	}//for         3.출력
	
	//for문에서 만들어진 지역변수 i는 for문의 소속이므로
	//for의 영역을 벗어나면 사용이 불가능
	//i = 10;
	
	int n = 0;//전역변수
	
	for (n=1; n <=3; n++) {
		System.out.println("n : " + n);
	}
	System.out.println(n); // 4가나옴 !!!
	
	System.out.println("-------------------------------------------------");
	
	//10~1까지 감소되는 값을 출력하시오.
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
