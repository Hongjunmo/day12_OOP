package day12_OOP;

import java.io.IOException;
import java.util.*;

public class Ex04 {
	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		HashMap map = new HashMap();
		map.put("메모장", "notepad");
		map.put("계산기", "calc");
		map.put("그림판", "mspaint");
		
		System.out.println(map);
		System.out.println("실행 명령어 입력");
		String key = scan.next();
		if(map.containsKey(key)) {
		ProcessBuilder pro = new ProcessBuilder((String)map.get(key));
	
		try {
			pro.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}else {
			System.out.println("해당 명령어 없음");
		}
	
	
	
	}
}
