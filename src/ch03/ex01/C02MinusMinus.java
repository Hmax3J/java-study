package ch03.ex01;

public class C02MinusMinus {
	public static void main(String[] args) {
		int i = 0;
		--i;
		System.out.println(i);
		i--;
		System.out.println(i);
		
		i = 0;
		int j = --i; // i의 값이 먼저 -- 되어 -1이 되고 그 값이 j에 할당되어 실행된다.
		System.out.printf("i: %d, j: %d\n", i, j);
		
		i = 0;
		j = i--; // j에 i값이 먼저 할당되고 --가 실행된다. 따라서 j = 0, i = -1이 된다.
		System.out.printf("i: %d, j: %d\n", i, j);
	}
}
