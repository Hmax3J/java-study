package ch02.ex02;

public class C05SB {
	public static void main(String[] args) {
		StringBuffer src = new StringBuffer("우리 개는 ");
		
		int len = src.length();
		System.out.println("length: " + len);
		
		src.append("짖는다."); // string과 다르게 src값 자체를 바꿔 버린다. 메모리가 절약된다. 요즘 컴퓨터 성능이 좋아 메모리 부담이 적어 string을 쓴다.
		src.replace(3, 4, "고양이");
		
		String str = src.toString();
		
		System.out.println(src); // 스트링버퍼 타입
		System.out.println(str); // 스트링 타입
	}
}
