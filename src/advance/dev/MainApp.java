package advance.dev;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import advance.dev.dao.Manager;
import advance.dev.models.Person;
import advance.dev.models.Student;
import advance.dev.models.Teacher;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager  Manager = new Manager();
		
		try {
			 FileInputStream fis = new FileInputStream("in.txt");
		      BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		      String line;
		     
		      while((line = br.readLine()) !=null) {
		    	  System.out.println(line);
		      }
		  
		}catch(Exception e) {
			e.printStackTrace();
		}
		


}
	static void convert(int numbers[], String line) {
		String str[] = line.split("#");
		for (int i = 0; i < str.length; i++) {
			numbers[i] = Integer.parseInt(str[i]);
		}
	}
	
	static void print(int arr[]) {
		for (int i : arr) {
			System.out.format("%d\t", i).println("");
		}
		System.out.println();
		System.out.println("------------------------------");
	}	
	
}