package ch04.home.ex02;

import java.util.Scanner;

public class H02Season {
	public static void main(String[] args) {
		int month = 0;
		String season = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월: ");
		month = sc.nextInt();
		
	/*	if(month == 12 || 0 < month && month < 3) season = "겨울";
		else if(2 < month && month < 6) season = "봄";
		else if(5 < month && month < 9) season = "여름";
		else if(8 < month && month < 12) season = "가을";
		else season = "잘못된 월을 입력했습니다."; */ // 내가 한 알고리즘
		
		if(3 <= month && month <= 5) season = "봄";
		else if(6 <= month && month <= 8) season = "여름";
		else if(9 <= month && month <= 11) season = "가을";
		else if(month == 12 || month == 1 || month == 2) season = "겨울";
		else season = "존재하지 않는 월"; // 강사님이 알려주신 알고리즘
		
		System.out.printf("%d월은 %s입니다.", month, season);
	}
}
/*
ch04.ex02.C04Season을 refactoring 한다.
switch를 if 로 바꾼다.
존재하지 않는 월을 입력 경우를, 예외 처리한다.
*/