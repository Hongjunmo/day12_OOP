package day12_OOP;

import java.io.IOException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("������ ���� ��ɾ� �Է�");
		String s =scan.next();
		ProcessBuilder pro = new ProcessBuilder(s);
		
		
		try {
			pro.start();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
