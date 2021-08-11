package day12_OOP;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

class Win7 {
	public void g(String str) {
		
		ProcessBuilder pro = new ProcessBuilder(str);
		try {
			pro.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
}

public class Quiz01 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("메모장", "notepad");
		map.put("계산기", "calc");
		String str;
		Win7 wn = new Win7();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("==== windows ====");
		System.out.println("1. 기능");
		System.out.println("2.off");
		int choice= scan.nextInt();
		if(choice==1) {
			System.out.println("1: 메모장");
			System.out.println("2: 계산기");
			System.out.print("사용할 기능 입력: ");
			 str = scan.next();
			 if(map.containsKey(str)) {
				wn.g((String) map.get(str));
				}else {
					System.out.println("없는기능");
				}
			
			
		}else {
			System.out.println("시스템 종료");
			System.exit(0);
		}
		
		
			
		
		
		
	}
}
