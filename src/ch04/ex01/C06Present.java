package ch04.ex01;

import java.util.Scanner;

public class C06Present {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String prize = "";
		
		System.out.print("1.냉장고, 2.세탁기\n> ");
		choice = sc.nextInt();
		
		if(choice == 1) prize = "냉장고"; // decoding
		else if(choice == 2) prize = "세탁기";
		else prize = "화장지"; 
		// 예외 처리, 에러 메세지를 띄운다. 반복작업을 한다. 업무를 바꾼다. 앱이 살아 있으면 예외처리가 잘 된 것이다. 
		// 16라인 예외처리는 업무를 바꾼 것이다.
		System.out.println(prize);
	}
}
