package ch04.ex01;

public class C04Condition {
	public static void main(String[] args) {
		int a = 3;
		if(0 < a && a < 4) System.out.println("good");
		
		// 과제] b값이, 'a'초과 'c'미만 범위에 속하면, good 를 말하라.
		char b = 'b';
		if('a' < b && b < 'c') 
			System.out.println("good");
		
		int x = 0;
		int y = 0;
		if((x = 1 + 2) > 0 || (y = 1 - 2) > 0) // 빠른or 라 앞 항이 true라 뒤에 항은 계산하지 않는다.
			System.out.printf("x: %d, y: %d\n", x, y);
		
		// 과제] s값이 he, HE, He, hE 중의 하나면, he를 말하라.
		String s = "he";
		if( s.equals("he") || s.equals("HE") || s.equals("He")  || s.equals("hE") )
			System.out.println("he");
		
		s = ""; // 초기값
		if(s.equals("")) System.out.println("값이 없다."); // s.equals("")는 값이 없다라는 것을 나타낸다.
		
		// 과제] 값이 있으면, 값이 있다. 를 말하라.
		s = "hello";
		if(!s.equals("")) System.out.println("값이 있다.");
		
		boolean power = false;
		if(!power) System.out.println("전원을 켜다.");
	}
}
