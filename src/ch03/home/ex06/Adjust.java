package ch03.home.ex06;

import java.util.Scanner;

public class Adjust {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x = 0;
		double result = 0;
		
		System.out.print("x: ");
		x = sc.nextDouble();
		
		result = x - x % 1; // 3.1492 - 0.1492 �ϸ� 3.0�� ���´�.
		//result = x % 1; �Ҽ��� ���ϸ� ��Ÿ����.
		System.out.println(result);
	}
}
/*
% �����ڸ� �̿��ؼ�, �Ǽ����� �Ҽ��� ���ϸ� ����ó���϶�.
(casting), Math.api �� ��� �� �Ѵ�.
�Ǽ����� sc.nextDouble() �� �Է��Ѵ�.
--

x: 3.1492
3.0
*/