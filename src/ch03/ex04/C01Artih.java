package ch03.ex04;

public class C01Artih {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		//byte c = a + b; // ��� ������ + �� ���� ���� int 5��. �׷��� a + b �� byte�� Ÿ���� ���� �ʾ� ������ ����.
		byte c = (byte)(a + b); // a+b�� ���� ���� int 5�� byte�� casting �� byte�� Ÿ���� ���߾� �ش�.
		System.out.println(c);
		
		//c = c + 1; // byte + int�� int + int �� ĳ���� �Ǿ� char Ÿ�� c�� ������ ���� ������ ������ ����. 
		c++;
		System.out.println(c);
		
		double d = a / b; // ���� ���� 1.5���� int�� �Ҽ����� ������ 1�� �ٲ�� 1�� double�� 1.0 ���� overflow�� �Ͼ��.
		System.out.println(d);
		
		d = (double)a / b; // overflow�� �Ͼ�� �ʴ´�. a�� double�� ĳ������ double a�� int b�� ���� �� double�� ĳ���õȴ�.
		System.out.println(d);
		d = 1.0 * a / b;
		System.out.println(d);
		
		d = (double)(a / b); // () ������ �켱������ �ٲ�� / �� ���� ����Ǿ� int 1.5�� ���� double�� �ٲ� �� �� �ս��� ����.
		System.out.println(d);
		d = a / b * 1.0;
		System.out.println(d);
	}
}
