package ch02.ex02;

public class C03Str {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		System.out.printf("sum: %d\n", sum);
		
		String sumStr = "" + sum; 
		System.out.println(sumStr);
		
	//	String s = "" + (a + b); // 내가 생각한 코드
		String s = a + b + ""; // 강사님이 알려주신 코드
		System.out.println(s);
		
		s = "" + a + b; // 우선순위 때문에 문자+1+2 가 되기 때문에 문자12로 나온다.
		System.out.println(s);
		
		String dialog = "john said, \"hello\""; // \를 "앞에 붙혀 만든다.
		System.out.println(dialog);
	}
}
