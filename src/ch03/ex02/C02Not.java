package ch03.ex02;

public class C02Not {
	public static void main(String[] args) {
		boolean power = false;
		power = !power; // ���� 2���� �ִ� ��� flag variable��� �Ѵ�. true->false�� false->true�� �̷� ���̴�.
		System.out.println(power);
		
		power = !power;
		System.out.println(power);
	}
}
