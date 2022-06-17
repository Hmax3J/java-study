package ch04.home.ex04;

import java.util.Scanner;

public class H02Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	/*	int a = 0;
		int b = 0;
		int result = 0;
		String op = "";
		char gogo = 0;
		boolean isGood = false;
				
		do {
			System.out.print("a: ");
			a = sc.nextInt(); sc.nextLine();
			System.out.print("op: ");
			op = sc.nextLine();
			System.out.print("b: ");
			b = sc.nextInt(); sc.nextLine();
			
			switch(op) {
			case "+": result = a + b; break;
			case "-": result = a - b; break;
			case "*": result = a * b; break;
			case "/": result = a / b;
			}
			
			System.out.printf("%d %s %d = %d\n", a, op, b, result);
			System.out.print("계속하시겠습니까(y/n)? ");
			gogo = sc.nextLine().charAt(0);			
		} while(gogo == 'y');
		
		System.out.println("끝."); */ // 내가 한 알고리즘
		
		int a = 0;
		int b = 0;
		char op = 0;
		int result = 0;
		char isRepeat = 0; // 토글 변수로 사용 할 경우 is로 시작하는게 좋다. 토글 변수는 대부분 boolean타입이다.
		
		do {
			System.out.print("a: ");
			a = sc.nextInt(); sc.nextLine();
			System.out.print("op: ");
			op = sc.nextLine().charAt(0);
			System.out.print("b: ");
			b = sc.nextInt(); sc.nextLine();
			
			switch(op) {
			case '+': result = a + b; break;
			case '-': result = a - b; break;
			case '*': result = a * b; break;
			case '/': result = a / b;
			}
			
			System.out.printf("%d %c %d = %d\n", a, op, b, result);
			System.out.print("계속할까요(y/n)? ");
			isRepeat = sc.nextLine().charAt(0);
		} while(isRepeat == 'y');
		
		System.out.println("끝."); // 강사님이 알려주신 알고리즘
	}
}
/*
과제] 계산기를 만들어라.
연산자는 +, -, *, / 이다.
/ 는 몫만을 얻는다.
--

a: 1
op: +
b: 2
1 + 2 = 3
계속하시겠습니까(y/n)? y
a: 2
op: /
b: 2
2 / 2 = 1
계속하시겠습니까?(y/n)? y
a: 2
op: *
b: 3
2 * 3 = 6
계속하시겠습니까(y/n)? n
끝.
*/