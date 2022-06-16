package ch02.ex03;

public class C02DoubleInt {
	public static void main(String[] args) {
		double d = 1.42;
		int i = (int)d; // 큰 수가 작은 수로 프로모션이 되지 않는다. casting 해줘야 한다.
		System.out.printf("%d, %f\n", i, d); // 큰 수를 작은 수로 casting 할 경우 값 손실이 발생한다.
		
		double f = Math.floor(d); // 바닥(내림)을 표시한다. 1.92의 바닥은 1.0이다.
		double r = Math.round(d); // 천장(반올림)을 표시한다. 1.92의 천장은 2.0이다.
		
		System.out.printf("%f, %f\n", f, r);
	}
}
