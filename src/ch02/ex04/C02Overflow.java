package ch02.ex04;

public class C02Overflow {
	public static void main(String[] args) {
		//byte b = 128; Ÿ�� �̽���ġ�� �������� �ȵȴ�.
		byte b = 127;
		//b = b + 1; Ÿ�� �̽���ġ�� ������ ������ ����. byte�� 127���� �����ϴ�.
		
		b++; // �����÷ο찡 �Ͼ��. -128
		b++; // -127
		System.out.println(b);
	}
}
