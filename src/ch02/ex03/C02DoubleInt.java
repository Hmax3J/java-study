package ch02.ex03;

public class C02DoubleInt {
	public static void main(String[] args) {
		double d = 1.42;
		int i = (int)d; // ū ���� ���� ���� ���θ���� ���� �ʴ´�. casting ����� �Ѵ�.
		System.out.printf("%d, %f\n", i, d); // ū ���� ���� ���� casting �� ��� �� �ս��� �߻��Ѵ�.
		
		double f = Math.floor(d); // �ٴ�(����)�� ǥ���Ѵ�. 1.92�� �ٴ��� 1.0�̴�.
		double r = Math.round(d); // õ��(�ݿø�)�� ǥ���Ѵ�. 1.92�� õ���� 2.0�̴�.
		
		System.out.printf("%f, %f\n", f, r);
	}
}
