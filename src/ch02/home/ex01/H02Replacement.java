package ch02.home.ex01;

import java.util.Scanner;

public class H02Replacement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // ctrl + shift + O 누르면 import 만들어진다.

	/*	int a = 0;
		int b = 0;
		
		int temp = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.printf("%d %d\n",a, b); */ //내가 만든 알고리즘
		
		// presentation logic 24~28 Line
		System.out.print("a: ");  
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		System.out.printf("=> a: %d, b: %d\n", a, b);
		
		System.out.println("=> a,b 값을 교체합니다.");
		int temp = 0;  // business logic 30~34 Line
		temp = a; // backup, a가 갖고있던 값을 temp에 backup 했다.
		a = b;
		b = temp;
		System.out.printf("=> a: %d, b: %d\n", a, b); // 강사님이 알려주신 알고리즘
	}
}
/* 과제] a와 b값을 임의로 입력 받는다.
		교체 결과를 출력한다. */