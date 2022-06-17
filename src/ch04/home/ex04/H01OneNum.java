package ch04.home.ex04;

import java.util.Scanner;

public class H01OneNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
	/*	String input = "";
		int len = 0;
		
		do {
			System.out.print("입력: ");
			input = sc.nextLine();
			len = input.length();
			if(len >= 2) System.out.println("한자리 자연수를 입력하세요.");
		} while(len != 1);
		
		System.out.println("끝."); */ // 내가 한 알고리즘
		
		String input = "";
		boolean isGood = false;
		String errMsg = "ERROR] 한자리 자연수를 입력하세요.";
		
		do {
			System.out.print("입력: ");
			input = sc.nextLine();
			if(input.length() == 1 && '0' < input.charAt(0) && input.charAt(0) <= '9')
				isGood = true;
			else System.out.println(errMsg);
		} while(!isGood);
		
		System.out.println("끝."); // 강사님이 알려주신 알고리즘
	}
}
/*
과제] 한자리 자연수를 입력 받는다.
10이상의 자연수, 또는 문자가 입력되면 예외처리한다.
*/