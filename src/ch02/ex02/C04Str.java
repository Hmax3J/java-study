package ch02.ex02;

public class C04Str {
	public static void main(String[] args) {
		String src = "�츮 ���� ";
		String s1 = "";
		String s2 = "";
		String s3 = "";
		char c = 0;
		
		int len = src.length(); // ���ڿ� ����
		System.out.println("length: " + len);
		
		s1 = src.concat("¢�´�.");
		s2 = src.replace("��", "�����"); // �б⸸ �߱� ������ src ���� �ٲٴ°� �ƴϰ� s2�� ����ȴ�.
		s3 = src.substring(0, 4); // substring�� ���̻���(0��1��2 3��4) Ŀ���� ī��Ʈ �ߴ�.
		c = src.charAt(3); // 3�ε����� �ִ� ���� �����Ѵ�.
		
		String s4 = src.substring(3, 4); // 3�ε����� 4�ε��� ������ ���� �����Ѵ�.
		
		System.out.printf("%s\n%s\n%s\n%c\n%s\n", s1, s2, s3, c, s4);
	}
}
