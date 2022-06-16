package ch02.ex01;

public class C01Variable {
	public static void main(String[] args) {
		boolean bl = false; // 논리형, boolean 의 초기값은 false 이다.
		bl = true;
		byte b = 0;  // 정수형
		short s = 0; // 정수형
		char c = 0;  // 문자형
		int i = 0;  // 정수형
		long l = 0L; // 정수형
		float f = 0.0f; // 실수형
		double d = 0.0; // 실수형
		
		String str = "";   // empty string
		
		int a;
		a = 0;
		// int a; 변수 명은 유일해야 한다. 같은 변수 이름이 있으면 에러가 난다.
		
		//int x;
		//int y;
		int x, y; //용량은 적지만 가독성 측면에서는 따로 선언하는게 가독성이 좋다. 코딩 스타일에 따라 다르다.
		int x2= 0, y2 = 0;
	}
}
