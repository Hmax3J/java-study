package ch02.ex04;

public class C02Overflow {
	public static void main(String[] args) {
		//byte b = 128; 타입 미스매치라 컴파일이 안된다.
		byte b = 127;
		//b = b + 1; 타입 미스매치라 컴파일 에러가 난다. byte는 127까지 가능하다.
		
		b++; // 오버플로우가 일어난다. -128
		b++; // -127
		System.out.println(b);
	}
}
