package ch02.ex04;

public class C01Overflow {
	public static void main(String[] args) {
		byte b = 10;
		int i = b; // ���θ��, casting�̶�� �Ѵ�. byte�� int���� �۾� �� ��ȯ�Ǿ� i�� ����.
		i = (int)b; // ���θ��, casting�̶�� �Ѵ�.
		System.out.println(i);
		
		int i2 = 300;
		byte b2 = (byte)i2; // i2�� b2���� ũ�� ������ casting�� �� �ؾ��Ѵ�.
		System.out.println(b2); // ���� ������ ������ �����÷ο� �ƴ� ��� �Ѵ�.
	}
}
