package ch02.home.ex01;

public class H01Replacement {
	public static void main(String[] args) {
		/*int a = 1; // 초기값 설정
		int b = 2; // 초기값 설정
		int c = 0;
		
		System.out.printf("%d %d\n",a, b);
		
		c = a;
		a = b;
		b = c;
		
		System.out.printf("%d %d",a, b);*/ // 내가 한 알고리즘, 출력하라는 말은 없어서 출력은 굳이 쓸 필요가 없다.
		
		int a = 1;
		int b = 2;
		
		int temp = 0;
		temp = a;
		a = b;
		b = temp;    // 강사님이 알려주신 알고리즘
	}
}
//과제] a와 b의 데이터를 교체하라.
// a: 1, b: 2 -> a: 2, b: 1