package ch04.home.ex02;

import java.util.Scanner;

public class H03Kawibawibo {
	public static void main(String[] args) {
	/*	int kbb = 0;
		int appkbb = 0;
		String result = "";
		String choice = "";
		Scanner sc = new Scanner(System.in);
				
		System.out.print("1.����, 2.����, 3.��\n> ");
		kbb = sc.nextInt();
		appkbb = (int)(Math.random()*3) + 1;
		
		if(1 <= kbb && kbb <= 3) {
		if(kbb - appkbb == -2 || kbb - appkbb == 1 ) result = "You win.";
		else if(kbb - appkbb == 2 || appkbb - kbb == -1) result = "You lose.";
		else if(kbb - appkbb == 0) result = "Fair.";
		
		if(kbb == 1) choice = "����";
		else if(kbb == 2) choice = "����";
		else choice = "��";
		System.out.println("You: " + choice);
		
		if(appkbb == 1) choice = "����";
		else if(appkbb == 2) choice = "����";
		else choice = "��";
		System.out.println("Me: " + choice);
		
		} else {
			result = "ERROR] 1, 2, 3 ���� �ϳ��� �Է��ϼ���.";
		}
		
		System.out.println(result); */ // ���� �� �˰���
		
		
		Scanner sc = new Scanner(System.in);
		int playerChoice = 0; 
		int appChoice = 0;
		String result = ""; 
		String choice = "";
		
		System.out.print("1.����, 2.����, 3.��\n> ");
		playerChoice = sc.nextInt();
		appChoice = (int)(Math.random() * 3) + 1; // random�� 0.0�̻� 1.0�̸� ���� ��Ÿ���� *3 �ؼ� 0.0~2.0���� �ٲ� �� int �ϰ� ������� +1�� �� 1���� 3������ ���ڸ� ��´�.
		
		if(1 <= playerChoice && playerChoice <= 3) { // 1, 2, 3 �� �ʿ��ѵ� �ٸ� ���ڵ��� �����ϱ� ���� ���ǹ��ȿ� �˰����� �������.
			switch(playerChoice - appChoice) {
			case -2: case 1:
				result = "You win."; break;
			case -1: case 2:
				result = "You lose."; break;
			case 0:
				result = "Fair.";
			}
			
			switch(playerChoice) {
			case 1: choice = "����"; break;
			case 2: choice = "����"; break;
			case 3: choice = "��"; // decoding �̶� �Ѵ�.
			}
			System.out.println("You: " + choice);
			
			switch(appChoice) {
			case 1: choice = "����"; break;
			case 2: choice = "����"; break;
			case 3: choice = "��";
			}
			System.out.println("Me: " + choice);
		} else {
			result = "ERROR] 1, 2, 3 ���� �ϳ��� �Է��ϼ���.";
		}
		
		System.out.println(result); // ������� �˷��ֽ� �˰���
	}
}
/*
����] �۰� ������������ �϶�.
���� ����� �˷��ش�.
�����
You win.
You lose.
Fair.
���� �ϳ��̴�.
--

1.����, 2.����, 3.��
> 1
You: ����
Me: ��

You win.
*/