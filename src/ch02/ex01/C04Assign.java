package ch02.ex01;

public class C04Assign {  // 할당연산자
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.printf("%d %d\n", a, b);
		
		a = b; // a에 b의 값 2가 덮어 씌여진다. 논리적으로 1은 사라졌지만 물리적으로 1은 5번라인 상수에 남아 있다.
		System.out.printf("%d %d\n", a, b);
		
		a = b = 2; // 가독성이 떨어져 안쓰는게 좋다.
		System.out.printf("%d %d\n", a, b);
		
		double d = Math.random();
		System.out.printf("%.2f", d);
	}
}
