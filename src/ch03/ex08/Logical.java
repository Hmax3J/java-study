package ch03.ex08;

public class Logical {
	public static void main(String[] args) {
		boolean b = false;
		
		b = true && true; // &&(and)연산은 둘 다 true 때 true
		b = (2 > 1) && (2 > 1); // 비교와 논리가 나란히 있으면 비교가 먼저 실행된다.
		b = 2 < 1 && 2 > 1; // false, ()는 가독성 때문에 사용한다.
		b = 2 < 1 || 2 > 1; // ||(or)연산은 하나만 true 여도 true
		b = 2 < 1 || 2 < 1; // false
		System.out.println(b);
		
		int x = 0;
		int y = 0;
		b = ++x < 0 && ++y < 0; // &&는 앞에 항에 false가 나오면 뒤에 항은 계산하지 않는다. 빠르게 계산된다.
		
		x = 0;
		y = 0;
		b = ++x < 0 & ++y < 0; // &는 앞에 항이 false여도 뒤에 항을 계산한다.
		
		x = 0;
		y = 0;
		b = ++x < 0 || ++y < 0;
		
		x = 0;
		y = 0;
		b = ++x > 0 || ++y < 0; // ||는 앞에 항에 true가 나오면 뒤에 항은 계산하지 않는다.
		
		x = 0;
		y = 0;
		b = ++x > 0 | ++y < 0; // |는 앞에 항이 true여도 뒤에 항을 계산한다.
		
		System.out.printf("x: %d, y: %d, b: %b", x, y, b);
	}
}
