package ex1_if;

public class Ex3_else_if {
  public static void main(String[] args) {
	
	  //else-if��
	  //if(���ǽ�1) {
	  //  ���ǽ� 1�� ���� �� ����Ǵ� ����
      //}else if (���ǽ�2) {
	  //  ���ǽ� 2�� ���� �� ����Ǵ� ����
	  //}else if (���ǽ�3)....
	  
	  int num = 75;
	  String str = "";
	  if(num >= 90)  {
		  str = "A";
	  }else if (num >= 80) {
		  str = "B";
	  }else if (num >= 70) {
		  str = "C";
	  }else if (num >= 60) {
		  str = "D";
	  }else {
		  //���� ��� ������ ������ �� �ݵ�� ����Ǵ� ����
		  str = "F";
	  }

  
      System.out.println(str);
      //else if ���� ���� ������ ���� �������� �����.
  
  
  
  
  }//main
	
	
}