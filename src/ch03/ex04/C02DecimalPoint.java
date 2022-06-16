package ch03.ex04;

public class C02DecimalPoint {
	public static void main(String[] args) {
		double pi = 3.141592;
		
		double shortPi = (int)(pi * 10) / 10.0; // 31.41592가 int 되어 31이 되고 10.0으로 나누어 3.1이 된다.
		System.out.println(shortPi);
		
		shortPi = (int)(pi * 1000) / 1000.0; 
		System.out.println(shortPi); // 3.141이 나오게 만들기
		
		shortPi = Math.round(pi * 1000) / 1000.0; 
		System.out.println(shortPi); // 3.142 나오게 만들기
	}
}
