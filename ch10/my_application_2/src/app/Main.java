package app;

import pack1.A;
import pack2.B;
import pack3.C;

public class Main {
	public static void main(String[] args) {
		// my_module_a ��Ű���� ���Ե� A Ŭ���� �̿�
		A a = new A();
		a.method();
		
		// my_module_a ��Ű���� ���Ե� B Ŭ���� �̿�
		B b = new B();
		b.method();
				
		// my_module_b ��Ű���� ���Ե� C Ŭ���� �̿�
		C c = new C();
		c.method();
	}
}