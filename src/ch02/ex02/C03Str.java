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
		
	//	String s = "" + (a + b); // ���� ������ �ڵ�
		String s = a + b + ""; // ������� �˷��ֽ� �ڵ�
		System.out.println(s);
		
		s = "" + a + b; // �켱���� ������ ����+1+2 �� �Ǳ� ������ ����12�� ���´�.
		System.out.println(s);
		
		String dialog = "john said, \"hello\""; // \�� "�տ� ���� �����.
		System.out.println(dialog);
	}
}
