package ch04.ex02;

public class C05Random {
	public static void main(String[] args) {
		int a = (int)(Math.random() * 10) + 1; // 0.0이상 1.0미만에 *10을 하면 0.0이상 10.0미만을 int캐스팅 하면 0이상 10미만 이다.
		System.out.println(a);
	}
}
