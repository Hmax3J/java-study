package ch02.home.ex02;

import java.time.LocalDate;
import java.util.Scanner;

public class Reservation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	/*	System.out.println("���� ��¥�� �Է��ϼ���.");
		
		System.out.print("��: ");
		int year = sc.nextInt();
		System.out.print("��: ");
		int month = sc.nextInt();
		System.out.print("��: ");
		int day = sc.nextInt();
		
		LocalDate date = LocalDate.of(year, month, day);
		
		System.out.printf("%d-%d-%d ������ �����߽��ϴ�.", year, month, day);
		System.out.print("\n" + date.minusDays(3) + "���� ȯ���� �����մϴ�."); */ //���� �� �˰���
		
		int year = 0;
		int month = 0;
		int day = 0;
		
		System.out.println("���� ��¥�� �Է��ϼ���.");
		System.out.print("��: "); year = sc.nextInt();
		System.out.print("��: "); month = sc.nextInt();
		System.out.print("��: "); day = sc.nextInt();
		
		LocalDate showDate = LocalDate.of(year, month, day);
		
		System.out.println(showDate + " ������ �����߽��ϴ�.");
		System.out.println(showDate.minusDays(3) + " ���� ȯ���� �����մϴ�."); // ������� �˷��ֽ� �˰���
	}
}
/*
�����϶�. ȯ���� �����Ϸκ��� 3�� ������ �����ϴ�.
-- 
���� ��¥�� �Է��ϼ���.
��: 2025
��: 7
��: 17

2025-7-17 ������ �����߽��ϴ�.
2025-7-14 ���� ȯ���� �����մϴ�.
*/
