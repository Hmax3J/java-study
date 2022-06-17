package ch04.ex04;

import java.util.Scanner;

public class C04GuessNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int target = 0; // app�� ������ ����
		int guess = 0; // ���� �Է��� ����
		int tries = 0; // ������ Ƚ��
		String msg = "";
		
		target = (int)(Math.random() * 1000) + 1;
		  
		do {
			System.out.print("����.: ");
			guess = sc.nextInt();
			tries++;
			
			if(guess > target) msg = "Down.";
			else if(guess < target) msg = "Up.";
			else msg = "Great.";
			System.out.println(msg);
		} while(guess != target); // ���� ������ ���ڿ� app�� ������ ���ڰ� �ٸ� ��� ����
		
		System.out.printf("%d������ %d�� ������ϴ�.", tries, target);
	}
}
