package chapter4.practice.exercise;

import java.util.Scanner;

class Day {
	private String work; // 하루의 할 일을 나타내는 문자열
	public void set(String work) {
		this.work = work;
	}
	
	public String get() {
		return work;
	}
	
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
	
}

class MonthSchedule {
	Scanner sc = new Scanner(System.in);
	private Day days[];
	
	public MonthSchedule(int day) {
		this.days = new Day[day];
		for(int i=0; i<days.length; i++) {
			days[i] = new Day();
		}
	}
	
	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램.");
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			int answer = sc.nextInt();
			
			switch(answer) {
				case 1 :  
					input();
				break;
				case 2 :
					view();
				break;
				case 3 :
					finish();
				break;
			
				default :
					System.out.println("잘못입력하셨습니다.");
					break;
			}
		}
	}

	public void finish() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
		
	}

	public void view() {
		  System.out.print("날짜(1~30)?");
	      int day = sc.nextInt();
	      day--;
	      System.out.println("입력날짜 : " + day);
	      if(day < 0 || day > 30) { // 0~29
	         System.out.println("날짜를 잘못 입력하였습니다.");
	         return;
	      }
	      System.out.print((day+1)+"일의 할 일은 ");
	      days[day].show();
	}

	public void input() {
		System.out.print("날짜(1~30)?");
	      int day = sc.nextInt();
	      System.out.print("할일(빈칸없이입력)?");
	      String work = sc.next();
	      day--;
	      if(day < 0 || day > 30) { // 0~29
	         System.out.println("날짜를 잘못 입력하였습니다.");
	         return;
	      }
	      days[day].set(work);
	}
}

public class Q6 {

	public static void main(String[] args) {
		
		MonthSchedule april = new MonthSchedule(30);
		april.run();

	}

}
