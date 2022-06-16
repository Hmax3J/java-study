package ch02.ex04;

public class C01Overflow {
	public static void main(String[] args) {
		byte b = 10;
		int i = b; // 프로모션, casting이라고도 한다. byte가 int보다 작아 형 변환되어 i에 들어간다.
		i = (int)b; // 프로모션, casting이라고도 한다.
		System.out.println(i);
		
		int i2 = 300;
		byte b2 = (byte)i2; // i2가 b2보다 크기 때문에 casting을 꼭 해야한다.
		System.out.println(b2); // 값이 변질된 형상을 오버플로우 됐다 라고 한다.
	}
}
