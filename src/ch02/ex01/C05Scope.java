package ch02.ex01;

public class C05Scope {
	public static void main(String[] args) {
		int i = 0;
		
		//int i = 0; 중복된 변수 이름이라 컴파일 에러가 나타난다.
		int j = 0;
		{
			int x = 0; // x변수의 Scope 9~12라인 
			int y = 0;
		} // Scope가 끝나 메모리상으로 x,y가 사라진다.
		int x = 0; // 그래서 13라인에서 중복된 x변수를 사용할 수 있다.
	}
}
