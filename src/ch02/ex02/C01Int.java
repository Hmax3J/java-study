package ch02.ex02;

public class C01Int {
	public static void main(String[] args) {
		int x = 10; // decimal(10���� ��� �浵 ���� �ִ�.)
		System.out.println(Integer.toBinaryString(x)); // 10������ 2������ �ٲٴ� ����̴�.
		
		x = 012; // octal, �� �տ� 0�� ������ ������ 8������ �νĵȴ�. 
		System.out.println(Integer.toBinaryString(x)); // 8������ 2���� ��Ʈ������ �ٲٴ� ����̴�. tobinaryString�� 2������ �ٲٴ� �뵵 2������ �ٲ� �� ��Ʈ������ ��ȯ�ȴ�.
		
		x = 0xA; // hexa, �� �տ� 0x�� ������ ������ 16������ �νĵȴ�. 
		System.out.println(Integer.toBinaryString(x)); // 16������ 2���� ��Ʈ������ �ٲٴ� ����̴�.
		
		x = 0b1010; // binary, �� �տ� 0b�� ������ ������ 2���� �����ͷ� �νĵȴ�. 
		System.out.println(Integer.toBinaryString(x)); // 2���� �����͸� 2���� ��Ʈ������ �ٲٴ� ����̴�.
		
		x = 1_234_567; // 1000���� ���б�ȣ _ ��.
		System.out.println(x + 1); // x������ �����̸� ���ϱⰡ �ǰ� �ϳ��� ��Ʈ���� ������ ���ϱⰡ �ƴϰ� ��������.
		
		double y = 1e1;
		System.out.println(y);
	}
}
