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
		System.out.printf("%d + %d = %d", a, b, sum); */ // ���� �� �˰���
		
		int a = 0; // ù ��° �Է°�
		int b = 0; // �� ��° �Է°�

		System.out.print("a: ");
		a = sc.nextInt();
		System.out.print("b: ");
		b = sc.nextInt();
		
		System.out.printf("%d + %d = %d", a, b, a + b); // ������� �˷��ֽ� �˰���
	}
}
/* 
�� �ڿ����� �Է� �޾�, �� �հ踦 ����϶�.
--

a: 1
b: 2
1 + 2 = 3
*/