package ch02.home.ex01;

public class H01Replacement {
	public static void main(String[] args) {
		/*int a = 1; // �ʱⰪ ����
		int b = 2; // �ʱⰪ ����
		int c = 0;
		
		System.out.printf("%d %d\n",a, b);
		
		c = a;
		a = b;
		b = c;
		
		System.out.printf("%d %d",a, b);*/ // ���� �� �˰���, ����϶�� ���� ��� ����� ���� �� �ʿ䰡 ����.
		
		int a = 1;
		int b = 2;
		
		int temp = 0;
		temp = a;
		a = b;
		b = temp;    // ������� �˷��ֽ� �˰���
	}
}
//����] a�� b�� �����͸� ��ü�϶�.
// a: 1, b: 2 -> a: 2, b: 1