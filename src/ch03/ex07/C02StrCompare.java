package ch03.ex07;

public class C02StrCompare {
	public static void main(String[] args) {
		boolean b = false;
		
		String s = "a"; // ����� ���������.
		b = s == "a"; // true
		
		s = new String("a"); // new�� ���������.
		b = s == "a"; // false, ����� ������� a�� new�� ������� a�� �ٸ��� ������ false�� ���´�.
		
		b = s.equals("a"); // true, equals�� �̿��ϸ� ����� ����������� new�� ����������� ������� �ʰ� ������ ���� ������ true �ٸ��� false�� ���´�.
		
		System.out.println(b);
	}
}
