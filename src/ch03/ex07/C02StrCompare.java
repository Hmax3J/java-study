package ch03.ex07;

public class C02StrCompare {
	public static void main(String[] args) {
		boolean b = false;
		
		String s = "a"; // 상수로 만들어졌다.
		b = s == "a"; // true
		
		s = new String("a"); // new로 만들어졌다.
		b = s == "a"; // false, 상수로 만들어진 a와 new로 만들어진 a가 다르기 때문에 false가 나온다.
		
		b = s.equals("a"); // true, equals를 이용하면 상수로 만들어졌는지 new로 만들어졌는지 상관하지 않고 논리적인 값이 같으면 true 다르면 false로 나온다.
		
		System.out.println(b);
	}
}
