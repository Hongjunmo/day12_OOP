package day12_OOP;

import java.util.*;
import java.text.*;
class TimerQuiz{
	private Date date;
	private SimpleDateFormat simpl;
	public void setDate(){
		date = new Date();
		simpl =	new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
	}
	public String getDate(){return simpl.format(date);}
	public void time(){
		for(int i=0;i<10;i++){
			setDate();
			String s=getDate();
			System.out.println(s);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}
		}
	}
}
public class Quiz02 {
	public static void main(String[] args){
		TimerQuiz tim = new TimerQuiz();
		tim.time();
	}
}