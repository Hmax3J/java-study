package ch02.home.ex01;

import java.util.Scanner;

public class H02Replacement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // ctrl + shift + O ������ import ���������.

	/*	int a = 0;
		int b = 0;
		
		int temp = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.printf("%d %d\n",a, b); */ //���� ���� �˰���
		
		// presentation logic 24~28 Line
		System.out.print("a: ");  
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		System.out.printf("=> a: %d, b: %d\n", a, b);
		
		System.out.println("=> a,b ���� ��ü�մϴ�.");
		int temp = 0;  // business logic 30~34 Line
		temp = a; // backup, a�� �����ִ� ���� temp�� backup �ߴ�.
		a = b;
		b = temp;
		System.out.printf("=> a: %d, b: %d\n", a, b); // ������� �˷��ֽ� �˰���
	}
}
/* ����] a�� b���� ���Ƿ� �Է� �޴´�.
		��ü ����� ����Ѵ�. */