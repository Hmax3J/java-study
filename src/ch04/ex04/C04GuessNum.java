package ch04.ex04;

import java.util.Scanner;

public class C04GuessNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int target = 0; // app이 선택할 숫자
		int guess = 0; // 내가 입력할 숫자
		int tries = 0; // 도전한 횟수
		String msg = "";
		
		target = (int)(Math.random() * 1000) + 1;
		  
		do {
			System.out.print("찍어봐.: ");
			guess = sc.nextInt();
			tries++;
			
			if(guess > target) msg = "Down.";
			else if(guess < target) msg = "Up.";
			else msg = "Great.";
			System.out.println(msg);
		} while(guess != target); // 내가 생각한 숫자와 app이 선택한 숫자가 다를 경우 진행
		
		System.out.printf("%d번만에 %d를 맞췄습니다.", tries, target);
	}
}
