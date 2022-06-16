package ch03.ex02;

public class C02Not {
	public static void main(String[] args) {
		boolean power = false;
		power = !power; // 값이 2개만 있는 경우 flag variable라고 한다. true->false로 false->true로 이런 식이다.
		System.out.println(power);
		
		power = !power;
		System.out.println(power);
	}
}
