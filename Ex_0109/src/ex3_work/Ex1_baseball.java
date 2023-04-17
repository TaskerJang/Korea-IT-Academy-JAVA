package ex3_work;

import java.util.Random;
import java.util.Scanner;

public class Ex1_baseball 




{public static void main(String[] args) {
	//숫자야구 게임을 배열을 활용해서 효율적으로 만들기
	
	Scanner sc = new Scanner(System.in);
	Random rnd = new Random();
	
	int[] user = new int[3];//사용자 값을 저장할 배열
	int[] com = new int[3];//컴퓨터 난수를 저장할 배열
	do {
		
		for (int i = 0; i < com.length; i++) {
			com[i] = rnd.nextInt(9)+1;
		}
			
	}while( com[0] == com[1] || com[0] == com[2] || com[1] == com[2]);
	
     //언제 끝날지 모를 게임을 위해 무한반복하는 while문 작성
	while(true) {
		System.out.print("입력(예:123) - ");
		int number = sc.nextInt();
		//사용자가 입력한 세자리의 수를 백, 십, 일의 자리로 끊어서 user 배열에 저장
		user[0] = number/100; //백의자리
		user[1] = number%100/10;//십의자리
		user[2] = number%100%10;//일의자리
		
		int strike = 0;
		int ball = 0;
		
		//경우의 수
		for (int i = 0; i < com.length; i++) {
			for (int j = 0; j < com.length; j++) {
				
			if(i==j) {
				if(com[i] == user[j]) {
					strike++;
				}
			}else {
				if(com[i] == user[j]) {
					ball++;
				}
			}
			
			
			}//inner
		}//outer
		
		if(strike ==3) {
			System.out.println("정답!!");
			break; // while종료!
		}else {//스트라이크나 볼이 한개라도 있는 경우
			if (strike > 0 || ball >0) {
				
				System.out.printf("%d Strike, %d ball\n",strike, ball);
			}else {
				System.out.println("OUT");
			}
		}
		
		System.out.println("------------------------------------------------------------------------------");
		
		
	}//while





















}//main

}
