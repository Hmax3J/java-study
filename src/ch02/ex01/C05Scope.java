package ch02.ex01;

public class C05Scope {
	public static void main(String[] args) {
		int i = 0;
		
		//int i = 0; �ߺ��� ���� �̸��̶� ������ ������ ��Ÿ����.
		int j = 0;
		{
			int x = 0; // x������ Scope 9~12���� 
			int y = 0;
		} // Scope�� ���� �޸𸮻����� x,y�� �������.
		int x = 0; // �׷��� 13���ο��� �ߺ��� x������ ����� �� �ִ�.
	}
}
