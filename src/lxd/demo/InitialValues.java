package lxd.demo;

public class InitialValues {
	private boolean t;
	private char c;
	private byte b;
	private short s;
	private int i;
	private long l;
	private float f;
	private double d;
	private InitialValues reference;
	
	void printInitialValues() {
		System.out.println("Data type initial value");
		System.out.println("boolean\t" + t);
		System.out.println("char\t[" + c + "]");
		System.out.println("byte\t" + b);
		System.out.println("short\t" + s);
		System.out.println("int\t" + i);
		System.out.println("long\t" + l);
		System.out.println("float\t" + f);
		System.out.println("double\t" + d);
		System.out.println("reference\t" + reference);
	}
	
	public static void main(String[] args) {
		InitialValues iv = new InitialValues();
		iv.printInitialValues();
	}
}
