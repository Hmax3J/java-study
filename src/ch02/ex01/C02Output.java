package ch02.ex01;

public class C02Output {
	public static void main(String[] args) {
		int score = 100;
		System.out.println(100); // ����� �ִ� 100
		System.out.println(score); // score ������ �ִ� 100
		System.out.println(100 + 1);
		System.out.println(Math.random()); //random ���� �Ķ���ͷ� �޾� println�� ����� ���̴�.
		
		System.out.print(200); // println �� ���ο� �ٿ� ����ϰ� print�� �׳� ������ ��� ����Ѵ�.
		System.out.print(300);
		System.out.print("\n"); // \n�� enterŰ ������ �� ��Ÿ���� �����̰� print�� �ٹٲ����� ����Ѵ�.
		System.out.print(400);
		
		System.out.printf("%b %c %d %f %s\n", true, 'a', 10, 1.15, "hello"); //ù ��°�� String���� �����Ǿ� �ְ� ��¾���� ��Ÿ����.
		//����1 �� ��¹����� �����ڷ� / �� ����ϼ���.
		System.out.printf("%b/%c/%d/%f/%s\n", true, 'a', 10, 1.15, "hello");
		System.out.printf("%5b|%-5c|%5d|%5.2f|%5s\n", true, 'a', 10, 1.15, "hello"); // 5���ڷ� ���߱� ���� 5�� �پ��� �տ� -�� �پ� ������ ���� �����̴�.
		System.out.printf("%5b|%-5c|%5d|%.2f|%5s\n", true, 'a', 10, 1.15, "hello"); // .2f�� �Ǽ��� �����͸� �Ҽ��� 2 ��° �ڸ� ���� ��Ÿ����.
		
		String name = "���Ѽ�";
		int age = 22;
		System.out.printf("%s %d", name, age);
		System.out.printf("\n%s�� %d���Դϴ�.", name, age);
		System.out.println(); // �ٹٲ����� ��Ÿ����.
		System.out.println(name + "�� " + age + "���Դϴ�.");
	}
}
