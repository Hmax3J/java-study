package ch04.ex01;

import java.util.Scanner;

public class C06Present {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String prize = "";
		
		System.out.print("1.�����, 2.��Ź��\n> ");
		choice = sc.nextInt();
		
		if(choice == 1) prize = "�����"; // decoding
		else if(choice == 2) prize = "��Ź��";
		else prize = "ȭ����"; 
		// ���� ó��, ���� �޼����� ����. �ݺ��۾��� �Ѵ�. ������ �ٲ۴�. ���� ��� ������ ����ó���� �� �� ���̴�. 
		// 16���� ����ó���� ������ �ٲ� ���̴�.
		System.out.println(prize);
	}
}
