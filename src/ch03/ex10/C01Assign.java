package ch03.ex10;

public class C01Assign {
	public static void main(String[] args) {
		int i = 3; // 상수에 있는 3을 i에 복사한다.
		
		i = i + 2; // +변수에 있는 5를 return 하는 것이다.
		i += 2; // i = i + 2 와 같은 뜻이다. 줄여서 사용했다.
		i -= 2;
		i *= 2;
		i /= 2;
		i %= 2;
		
		System.out.println(i);
	}
}
