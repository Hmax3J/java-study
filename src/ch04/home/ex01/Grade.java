package ch04.home.ex01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		int score = 0;
		char grade = 0;
		char sign = 0;
		
		System.out.print("����: ");
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

		System.out.printf("%c%c", grade, sign); // ���� �� �˰�����
		*/
		
		int score = 0;
		int tenDigit = 0; // ���� �ڸ�
		int oneDigit = 0; // ���� �ڸ�
		String grade = "";
		
		System.out.print("����: ");
		score = sc.nextInt();
		
		tenDigit = score / 10; // ���� �ڸ�
		oneDigit = score % 10; // ���� �ڸ�
		
		if(tenDigit >= 9) grade = "A";
		else if(tenDigit >= 8) grade = "B";
		else grade = "C";
		
		if(score >= 80) {
			if(tenDigit == 10 || oneDigit >= 8) grade += "+";
			else if(0 <= oneDigit && oneDigit < 4) grade += "-"; 
		}
		
		System.out.println(grade); // ������� �˷��ֽ� �˰�����
	}
}
/*
���� �������� ������ �ο��϶�.
98 �̻� A+
94 �̻� A
90 �̻� A-
88 �̻� B+
84 �̻� B
80 �̻� B-
80 �̸� C
--

����: 100
A+
*/