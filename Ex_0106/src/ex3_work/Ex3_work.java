package ex3_work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {

		// Ű���忡�� �������� �Է¹ް�, �Է¹��� ���ڰ� �Ҽ�(����� �ڽŰ� 1�� ��)���� �Ǵ��Ͻÿ�.
		// �� Ű���忡�� 1�� �޾Ҵٸ� '�Ҽ��� �ƴ�'�� ����ؾ� �Ѵ�.

		// �� : 5
		// 5��(��) �Ҽ��Դϴ�
		// �� : 6
		// 6��(��) �Ҽ��� �ƴմϴ�

		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		int num = sc.nextInt();

		int i = 0;
		for (i = 2; i <= num; i++) {

			if (num % i == 0) {
				break;
			}
		}

		if (i == num) {
			System.out.println(num + " ��(��) �Ҽ��Դϴ�.");

		} else {
			System.out.println(num + " ��(��) �Ҽ��� �ƴմϴ�.");

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}// main

}