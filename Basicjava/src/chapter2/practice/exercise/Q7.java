package chapter2.practice.exercise;

import java.util.Scanner;

/*
 * 2���� ��鿡�� ���簢���� ���� ��� �𼭸��� ������ �ϴ� �𼭸��� �� ������ ǥ���Ѵ�.
 * (100,100) �� (200,200)�� �� ������ �̷���� �簢���� ���� ��,
 * x,y���� �Է¹ް� ��(x,y)�� �� ���簢�� �ȿ� �ִ����� �Ǻ��ϴ� ���α׷��� �ۼ��϶�.
 */
public class Q7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� (x,y)�� ��ǥ�� �Է��ϼ���>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if((x >= 100 && x <= 200) && (y >= 100 && y <= 200)) {
			System.out.println("�� ("+x+","+y+")�� �簢�� �ȿ� �ֽ��ϴ�.");
		} else {
			System.out.println("�� ("+x+","+y+")�� �簢�� �ۿ� �ֽ��ϴ�.");
		}
		sc.close();
		
	}
}