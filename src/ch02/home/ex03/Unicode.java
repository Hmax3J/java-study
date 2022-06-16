package ch02.home.ex03;

import java.util.Scanner;

public class Unicode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	/*	System.out.print("문자: ");
		char unicode = sc.nextLine().charAt(0);
		System.out.println(unicode + "의 unicode는 " + (int)unicode + "입니다.");  */ //내가 한 알고리즘
		
		System.out.print("문자: ");
		char ch = sc.nextLine().charAt(0); // char타입으로 입력을 받을 수 없으므로 charAt을 사용해 String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해서 입력받는다.
		
		int unicode = ch;
		System.out.printf("%c의 unicode는 %d입니다.", ch, unicode); // 강사님이 알려주신 알고리즘
	}
}
/*
과제] 입력한 문자의 unicode 를 출력하라.
--

문자 : A
A의 unicode는 65입니다.
*/