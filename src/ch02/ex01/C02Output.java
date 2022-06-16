package ch02.ex01;

public class C02Output {
	public static void main(String[] args) {
		int score = 100;
		System.out.println(100); // 상수에 있는 100
		System.out.println(score); // score 변수에 있는 100
		System.out.println(100 + 1);
		System.out.println(Math.random()); //random 값을 파라미터로 받아 println이 출력한 것이다.
		
		System.out.print(200); // println 은 새로운 줄에 출력하고 print는 그냥 옆으로 계속 출력한다.
		System.out.print(300);
		System.out.print("\n"); // \n은 enter키 눌렀을 때 나타나는 현상이고 print가 줄바꿈으로 출력한다.
		System.out.print(400);
		
		System.out.printf("%b %c %d %f %s\n", true, 'a', 10, 1.15, "hello"); //첫 번째는 String으로 고정되어 있고 출력양식을 나타낸다.
		//과제1 위 출력문에서 구분자로 / 를 사용하세요.
		System.out.printf("%b/%c/%d/%f/%s\n", true, 'a', 10, 1.15, "hello");
		System.out.printf("%5b|%-5c|%5d|%5.2f|%5s\n", true, 'a', 10, 1.15, "hello"); // 5글자로 맞추기 위해 5가 붙었고 앞에 -가 붙어 있으면 왼쪽 정렬이다.
		System.out.printf("%5b|%-5c|%5d|%.2f|%5s\n", true, 'a', 10, 1.15, "hello"); // .2f는 실수형 데이터를 소수점 2 번째 자리 까지 나타낸다.
		
		String name = "최한석";
		int age = 22;
		System.out.printf("%s %d", name, age);
		System.out.printf("\n%s은 %d살입니다.", name, age);
		System.out.println(); // 줄바꿈으로 나타난다.
		System.out.println(name + "은 " + age + "살입니다.");
	}
}
