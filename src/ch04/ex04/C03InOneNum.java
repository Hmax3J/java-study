package ch04.ex04;

import java.util.Scanner;

public class C03InOneNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		do {
			System.out.print("�Է�: ");
			input = sc.nextInt();
		} while(!(1 <= input && input <= 9)); // 1�ڸ� ���ڰ� �ƴϸ� ��� �����Ѵ�. 1�ڸ� ���ڰ� ������ ������ �����.
		
		System.out.println("��.");
	}
}
/*
����] ���ڸ� ���ڸ� �Է� �޴´�.
10�̻��� �ڿ���, �Ǵ� ���ڰ� �ԷµǸ� ����ó���Ѵ�.
*/