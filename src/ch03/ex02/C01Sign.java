package ch03.ex02;

public class C01Sign {
	public static void main(String[] args) {
		int i = -10;
		i = +i; // 부호 연산자, +는 피연산자에 1을 곱한다. 
		System.out.println(i);
		
		i = -10;
		i = -i; // 부호 연산자, -는 피연산자에 -1을 곱한다.
		System.out.println(i);
	}
}
