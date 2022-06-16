package ch02.ex02;

public class C01Int {
	public static void main(String[] args) {
		int x = 10; // decimal(10진수 라는 뜻도 갖고 있다.)
		System.out.println(Integer.toBinaryString(x)); // 10진수를 2진수로 바꾸는 방법이다.
		
		x = 012; // octal, 맨 앞에 0을 붙혔기 때문에 8진수로 인식된다. 
		System.out.println(Integer.toBinaryString(x)); // 8진수를 2진수 스트링으로 바꾸는 방법이다. tobinaryString이 2진수로 바꾸는 용도 2진수로 바꾼 후 스트링으로 반환된다.
		
		x = 0xA; // hexa, 맨 앞에 0x을 붙혔기 때문에 16진수로 인식된다. 
		System.out.println(Integer.toBinaryString(x)); // 16진수를 2진수 스트링으로 바꾸는 방법이다.
		
		x = 0b1010; // binary, 맨 앞에 0b를 붙혔기 때문에 2진수 데이터로 인식된다. 
		System.out.println(Integer.toBinaryString(x)); // 2진수 데이터를 2진수 스트링으로 바꾸는 방법이다.
		
		x = 1_234_567; // 1000단위 구분기호 _ 다.
		System.out.println(x + 1); // x변수가 숫자이면 더하기가 되고 하나라도 스트링이 있으면 더하기가 아니고 붙혀진다.
		
		double y = 1e1;
		System.out.println(y);
	}
}
