package ch04.home.ex01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		int score = 0;
		char grade = 0;
		char sign = 0;
		
		System.out.print("점수: ");
		score = sc.nextInt();
		
		if(score >= 90) {
			grade = 'A';
			if(score >= 98) sign = '+';
			else if(score < 94) sign = '-';
		}
		else if(score >= 80) {
			grade = 'B';
			if(score >= 88) sign = '+';
			else if(score < 84) sign = '-';
		}
		else grade = 'C';

		System.out.printf("%c%c", grade, sign); // 내가 한 알고리즘
		*/
		
		int score = 0;
		int tenDigit = 0; // 십의 자리
		int oneDigit = 0; // 일의 자리
		String grade = "";
		
		System.out.print("점수: ");
		score = sc.nextInt();
		
		tenDigit = score / 10; // 십의 자리
		oneDigit = score % 10; // 일의 자리
		
		if(tenDigit >= 9) grade = "A";
		else if(tenDigit >= 8) grade = "B";
		else grade = "C";
		
		if(score >= 80) {
			if(tenDigit == 10 || oneDigit >= 8) grade += "+";
			else if(0 <= oneDigit && oneDigit < 4) grade += "-"; 
		}
		
		System.out.println(grade); // 강사님이 알려주신 알고리즘
	}
}
/*
다음 구간별로 학점을 부여하라.
98 이상 A+
94 이상 A
90 이상 A-
88 이상 B+
84 이상 B
80 이상 B-
80 미만 C
--

점수: 100
A+
*/