package ch02.ex01;

import java.util.Scanner;

public class C03Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		/*
		sc.nextLine(); // ���ڸ� �Է� ���� �� ���ڷ� �����ϴ°�  �ƴϰ� ���ڷ� �����Ѵ�.
		//����2 <�Էµ�����>�� �Է��߽��ϴ�. �� Ȯ�� �޼����� ����Ѵ�.
		System.out.print("���ڿ��� �Է��ϼ���.\n>");
		String inVal = sc.nextLine();
		System.out.printf("%s�� �Է��߽��ϴ�.", inVal); // ������� �˷��ֽ� �˰��� 12~13 Line
		//System.out.print(sc.nextLine() + "�� �Է��߽��ϴ�."); 		// ���� �� �˰��� 14 Line
		
		//����3 �������� ��ĳ�ʸ� ��� �� �� ���ڸ� �Է� �� ���ڿ� �Է� �ϱ� �� ����Ǵ� ���׸� �ذ��ϼ���.
		System.out.print("���ڸ� �Է��ϼ���.\n>");
		int i = sc.nextInt();
		System.out.println(i + "�� �Է��߽��ϴ�.");
		
		System.out.print("���ڸ� �Է��ϼ���.\n>");
		int i2 = sc.nextInt();	sc.nextLine(); // nextint ���� ���͸� ����� �Ѿ�µ� nextLine������ ���͸� �о� �鿩 ������ ������ �ϳ� �� ���
		System.out.println(i2 + "�� �Է��߽��ϴ�.");
		
		System.out.print("���ڿ��� �Է��ϼ���.\n>");
		String inVal = sc.nextLine();
		System.out.printf("%s�� �Է��߽��ϴ�.", inVal);
		*/
		System.out.print("���ڸ� �Է��ϼ���.");
		char c = sc.nextLine().charAt(4); // �Է¹޴� ���� �ε��� 4 ���� ��ġ�� ���� ����?�Ѵ�
		System.out.println(c);		
	}
}
