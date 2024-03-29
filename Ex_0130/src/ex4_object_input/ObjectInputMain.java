package ex4_object_input;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import ex5_object_output.Person;

public class ObjectInputMain {
	public static void main(String[] args) {
		
		Person p = null;
		String path = "C:/embedded_jyh/person.sav";
		
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream(path);
			ois = new ObjectInputStream(fis);
			
			p = (Person)ois.readObject();
			
			System.out.println( p.getName() );
			System.out.println( p.getAge() );
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				
				ois.close();
				fis.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
	}//main
}











