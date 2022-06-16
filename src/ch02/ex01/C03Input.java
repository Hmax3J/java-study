package ch02.ex01;

import java.util.Scanner;

public class C03Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		/*
		sc.nextLine(); // 숫자를 입력 했을 때 숫자로 인지하는게  아니고 문자로 인지한다.
		//과제2 <입력데이터>를 입력했습니다. 는 확인 메세지를 출력한다.
		System.out.print("문자열을 입력하세요.\n>");
		String inVal = sc.nextLine();
		System.out.printf("%s를 입력했습니다.", inVal); // 강사님이 알려주신 알고리즘 12~13 Line
		//System.out.print(sc.nextLine() + "를 입력했습니다."); 		// 내가 한 알고리즘 14 Line
		
		//과제3 여러개의 스캐너를 사용 할 때 숫자를 입력 후 문자열 입력 하기 전 종료되는 버그를 해결하세요.
		System.out.print("숫자를 입력하세요.\n>");
		int i = sc.nextInt();
		System.out.println(i + "를 입력했습니다.");
		
		System.out.print("숫자를 입력하세요.\n>");
		int i2 = sc.nextInt();	sc.nextLine(); // nextint 에서 엔터를 사용해 넘어가는데 nextLine에서는 엔터를 읽어 들여 끝나기 때문에 하나 더 사용
		System.out.println(i2 + "를 입력했습니다.");
		
		System.out.print("문자열을 입력하세요.\n>");
		String inVal = sc.nextLine();
		System.out.printf("%s를 입력했습니다.", inVal);
		*/
		System.out.print("문자를 입력하세요.");
		char c = sc.nextLine().charAt(4); // 입력받는 값의 인덱스 4 값에 위치한 값을 지정?한다
		System.out.println(c);		
	}
}
