package ch02.home.ex03;

import java.util.Scanner;

public class Unicode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	/*	System.out.print("����: ");
		char unicode = sc.nextLine().charAt(0);
		System.out.println(unicode + "�� unicode�� " + (int)unicode + "�Դϴ�.");  */ //���� �� �˰���
		
		System.out.print("����: ");
		char ch = sc.nextLine().charAt(0); // charŸ������ �Է��� ���� �� �����Ƿ� charAt�� ����� String���� ����� ���ڿ� �߿��� �� ���ڸ� �����ؼ� charŸ������ ��ȯ�ؼ� �Է¹޴´�.
		
		int unicode = ch;
		System.out.printf("%c�� unicode�� %d�Դϴ�.", ch, unicode); // ������� �˷��ֽ� �˰���
	}
}
/*
����] �Է��� ������ unicode �� ����϶�.
--

���� : A
A�� unicode�� 65�Դϴ�.
*/