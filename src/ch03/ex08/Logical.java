package ch03.ex08;

public class Logical {
	public static void main(String[] args) {
		boolean b = false;
		
		b = true && true; // &&(and)������ �� �� true �� true
		b = (2 > 1) && (2 > 1); // �񱳿� ���� ������ ������ �񱳰� ���� ����ȴ�.
		b = 2 < 1 && 2 > 1; // false, ()�� ������ ������ ����Ѵ�.
		b = 2 < 1 || 2 > 1; // ||(or)������ �ϳ��� true ���� true
		b = 2 < 1 || 2 < 1; // false
		System.out.println(b);
		
		int x = 0;
		int y = 0;
		b = ++x < 0 && ++y < 0; // &&�� �տ� �׿� false�� ������ �ڿ� ���� ������� �ʴ´�. ������ ���ȴ�.
		
		x = 0;
		y = 0;
		b = ++x < 0 & ++y < 0; // &�� �տ� ���� false���� �ڿ� ���� ����Ѵ�.
		
		x = 0;
		y = 0;
		b = ++x < 0 || ++y < 0;
		
		x = 0;
		y = 0;
		b = ++x > 0 || ++y < 0; // ||�� �տ� �׿� true�� ������ �ڿ� ���� ������� �ʴ´�.
		
		x = 0;
		y = 0;
		b = ++x > 0 | ++y < 0; // |�� �տ� ���� true���� �ڿ� ���� ����Ѵ�.
		
		System.out.printf("x: %d, y: %d, b: %b", x, y, b);
	}
}
