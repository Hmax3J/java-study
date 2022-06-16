package ch02.ex02;

public class C04Str {
	public static void main(String[] args) {
		String src = "우리 개는 ";
		String s1 = "";
		String s2 = "";
		String s3 = "";
		char c = 0;
		
		int len = src.length(); // 문자열 길이
		System.out.println("length: " + len);
		
		s1 = src.concat("짖는다.");
		s2 = src.replace("개", "고양이"); // 읽기만 했기 때문에 src 값을 바꾸는게 아니고 s2에 저장된다.
		s3 = src.substring(0, 4); // substring은 사이사이(0우1리2 3개4) 커서로 카운트 했다.
		c = src.charAt(3); // 3인덱스에 있는 값을 저장한다.
		
		String s4 = src.substring(3, 4); // 3인덱스와 4인덱스 사이의 값을 저장한다.
		
		System.out.printf("%s\n%s\n%s\n%c\n%s\n", s1, s2, s3, c, s4);
	}
}
