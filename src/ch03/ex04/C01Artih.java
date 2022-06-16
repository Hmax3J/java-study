package ch03.ex04;

public class C01Artih {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		//byte c = a + b; // 산술 연산자 + 의 리턴 값은 int 5다. 그래서 a + b 는 byte와 타입이 맞지 않아 에러가 난다.
		byte c = (byte)(a + b); // a+b의 리턴 값이 int 5라 byte로 casting 해 byte로 타입을 맞추어 준다.
		System.out.println(c);
		
		//c = c + 1; // byte + int가 int + int 로 캐스팅 되어 char 타입 c에 저장을 못해 컴파일 에러가 난다. 
		c++;
		System.out.println(c);
		
		double d = a / b; // 실제 값은 1.5지만 int는 소수점을 버리니 1로 바뀌고 1을 double해 1.0 으로 overflow가 일어난다.
		System.out.println(d);
		
		d = (double)a / b; // overflow가 일어나지 않는다. a를 double로 캐스팅해 double a와 int b를 나눌 때 double로 캐스팅된다.
		System.out.println(d);
		d = 1.0 * a / b;
		System.out.println(d);
		
		d = (double)(a / b); // () 때문에 우선순위가 바뀌어 / 가 먼저 실행되어 int 1.5가 나와 double로 바뀔 때 값 손실이 난다.
		System.out.println(d);
		d = a / b * 1.0;
		System.out.println(d);
	}
}
