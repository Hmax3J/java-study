package ch04.home.ex02;

import java.util.Scanner;

public class H03Kawibawibo {
	public static void main(String[] args) {
	/*	int kbb = 0;
		int appkbb = 0;
		String result = "";
		String choice = "";
		Scanner sc = new Scanner(System.in);
				
		System.out.print("1.가위, 2.바위, 3.보\n> ");
		kbb = sc.nextInt();
		appkbb = (int)(Math.random()*3) + 1;
		
		if(1 <= kbb && kbb <= 3) {
		if(kbb - appkbb == -2 || kbb - appkbb == 1 ) result = "You win.";
		else if(kbb - appkbb == 2 || appkbb - kbb == -1) result = "You lose.";
		else if(kbb - appkbb == 0) result = "Fair.";
		
		if(kbb == 1) choice = "가위";
		else if(kbb == 2) choice = "바위";
		else choice = "보";
		System.out.println("You: " + choice);
		
		if(appkbb == 1) choice = "가위";
		else if(appkbb == 2) choice = "바위";
		else choice = "보";
		System.out.println("Me: " + choice);
		
		} else {
			result = "ERROR] 1, 2, 3 중의 하나를 입력하세요.";
		}
		
		System.out.println(result); */ // 내가 한 알고리즘
		
		
		Scanner sc = new Scanner(System.in);
		int playerChoice = 0; 
		int appChoice = 0;
		String result = ""; 
		String choice = "";
		
		System.out.print("1.가위, 2.바위, 3.보\n> ");
		playerChoice = sc.nextInt();
		appChoice = (int)(Math.random() * 3) + 1; // random은 0.0이상 1.0미만 값을 나타내고 *3 해서 0.0~2.0으로 바꾼 후 int 하고 결과값에 +1을 해 1부터 3까지의 숫자를 얻는다.
		
		if(1 <= playerChoice && playerChoice <= 3) { // 1, 2, 3 만 필요한데 다른 숫자들을 제외하기 위해 조건문안에 알고리즘을 만들었다.
			switch(playerChoice - appChoice) {
			case -2: case 1:
				result = "You win."; break;
			case -1: case 2:
				result = "You lose."; break;
			case 0:
				result = "Fair.";
			}
			
			switch(playerChoice) {
			case 1: choice = "가위"; break;
			case 2: choice = "바위"; break;
			case 3: choice = "보"; // decoding 이라 한다.
			}
			System.out.println("You: " + choice);
			
			switch(appChoice) {
			case 1: choice = "가위"; break;
			case 2: choice = "바위"; break;
			case 3: choice = "보";
			}
			System.out.println("Me: " + choice);
		} else {
			result = "ERROR] 1, 2, 3 중의 하나를 입력하세요.";
		}
		
		System.out.println(result); // 강사님이 알려주신 알고리즘
	}
}
/*
과제] 앱과 가위바위보를 하라.
게임 결과를 알려준다.
결과는
You win.
You lose.
Fair.
중의 하나이다.
--

1.가위, 2.바위, 3.보
> 1
You: 가위
Me: 보

You win.
*/