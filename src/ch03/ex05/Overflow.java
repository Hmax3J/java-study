package ch03.ex05;

public class Overflow {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 1_000_000;
		
		long c = a + b;
		System.out.println(c);
		
		c = a * b; // 100�� * 100���� 1��
		System.out.println(c); // 1���� int ����� �ε� int�� 1���� ������. overflow
		
		c = (long)a * b;
		System.out.println(c);
		
		int x = a * b / a; // overflow �̹� a*b���� int���� �ʰ��߱� ������ �ڿ� ����� �״�� overflow
		x = a * (b / a); // ()��ȣ�� ����� �켱������ ������ ���� ������ overflow�� ���ش�.
		x = a / b * a; // �̷��� ������ ������ �ٲپ �ȴ�.
		System.out.println(x);
	}
}
