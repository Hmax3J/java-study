package ch03.home.ex04;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	/*	System.out.print("a: ");
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		
		int sum = a + b;
		System.out.printf("%d + %d = %d", a, b, sum); */ // 내가 한 알고리즘
		
		int a = 0; // 첫 번째 입력값
		int b = 0; // 두 번째 입력값

		System.out.print("a: ");
		a = sc.nextInt();
		System.out.print("b: ");
		b = sc.nextInt();
		
		System.out.printf("%d + %d = %d", a, b, a + b); // 강사님이 알려주신 알고리즘
	}
}
/* 
두 자연수를 입력 받아, 그 합계를 출력하라.
--

a: 1
b: 2
1 + 2 = 3
*/