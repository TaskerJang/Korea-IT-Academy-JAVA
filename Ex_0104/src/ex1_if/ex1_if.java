package ex1_if;

public class ex1_if {
public static void main(String[] args) {
	
	//제어문 : 프로그램의 흐름을 제어하는 문장
	// - 분기문: if, switch
	// - 반복문: for, while
	
	
	//if( 조건식 ) { 조건식이 참일때 실행되는 영역
	

    //
    // }
	
	int n = 51;
	
	//String은 쌍따옴표 안에 여러글자(문자열)를 저장 가능한 자료형
	String str = ""; // 초기화 시키는 작업
	
	if(n == 50) {
		//조건식이 참일때 실행되는 영역
		str= "n은 50입니다";
	}
	
	if( n != 50) {
		str = "n은 50이 아닙니다";
	}
	System.out.println(str);
	
	
	
	
	
}//main
}
