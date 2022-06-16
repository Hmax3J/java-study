package ch03.home.ex09;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	/*	System.out.print("국어: ");
		int korean = sc.nextInt();
		System.out.print("영어: ");
		int english = sc.nextInt();
		System.out.print("수학: ");
		int math = sc.nextInt();
		
		int sum = korean + english + math;
		System.out.println("\n총점: " + sum);
		double average = sum / 3.0 ; 
		System.out.printf("평균: %.1f\n" , average); // 소수점 1자리를 나타낸다. 결과값을 바꾸는게 아니고 출력만 소수점 1자리로 나타낸다.
		char grade = average >= 90 ? 'A' : (average >= 80 ? 'B' : 'C');
		System.out.println("학점: " + grade); */ // 내가 한 알고리즘
		
		int kor = 0; // 국어 점수
		int eng = 0; // 영어 점수
		int math = 0; // 수학 점수
		int tot = 0; // 총 점수
		double avg = 0.0; // 평균 점수
		char grade = 0; // 학점
		
		System.out.print("국어: ");
		kor = sc.nextInt();
		System.out.print("영어: ");
		eng = sc.nextInt();
		System.out.print("수학: ");
		math = sc.nextInt();
		
		tot = kor + eng + math;
		avg = tot / 3.0;
		grade = (avg >= 90) ? 'A' : (avg >= 80) ? 'B' : 'C';
		
		System.out.printf("\n총점: %d\n평균: %.1f\n학점: %c", tot, avg, grade); // 강사님이 알려주신 알고리즘
	}
}
/*
국어, 영어, 수학 점수를 입력받는다.
총점, 평균, 학점을 출력한다.
평균점수는 소수점이하 1자리까지만 출력한다.

90 <= mean <= 100: A
80 <= mean <  90 : B 
	  mean <  80 : C
--

국어: 95
영어: 100
수학: 100

총점: 295
평균: 98.3
학점: A
*/