package ch03.ex01;

public class C01PlusPlus {
	public static void main(String[] args) {
		int i = 0;
		++i; // 단항연산자
		System.out.println(i);
		i++;
		System.out.println(i);
		
		i = 0;
		int j = ++i;
		System.out.printf("i: %d, j: %d\n", i, j);
		
		i = 0;
		j = i++; // ++이 변수 뒤에 들어가면 할당연산자가 먼저 실행된다. j = 0 다음 ++되어 i는 1이 된다.
		System.out.printf("i: %d, j: %d\n", i, j);
	}
}
