package ch03.ex01;

public class C02MinusMinus {
	public static void main(String[] args) {
		int i = 0;
		--i;
		System.out.println(i);
		i--;
		System.out.println(i);
		
		i = 0;
		int j = --i; // i�� ���� ���� -- �Ǿ� -1�� �ǰ� �� ���� j�� �Ҵ�Ǿ� ����ȴ�.
		System.out.printf("i: %d, j: %d\n", i, j);
		
		i = 0;
		j = i--; // j�� i���� ���� �Ҵ�ǰ� --�� ����ȴ�. ���� j = 0, i = -1�� �ȴ�.
		System.out.printf("i: %d, j: %d\n", i, j);
	}
}
