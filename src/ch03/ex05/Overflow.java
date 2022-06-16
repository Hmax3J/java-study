package ch03.ex05;

public class Overflow {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 1_000_000;
		
		long c = a + b;
		System.out.println(c);
		
		c = a * b; // 100만 * 100만은 1조
		System.out.println(c); // 1조는 int 결과값 인데 int에 1조가 못들어간다. overflow
		
		c = (long)a * b;
		System.out.println(c);
		
		int x = a * b / a; // overflow 이미 a*b에서 int값을 초과했기 때문에 뒤에 나누어도 그대로 overflow
		x = a * (b / a); // ()괄호를 사용해 우선순위를 나누기 부터 시작해 overflow를 없앤다.
		x = a / b * a; // 이렇게 연산자 순서만 바꾸어도 된다.
		System.out.println(x);
	}
}
