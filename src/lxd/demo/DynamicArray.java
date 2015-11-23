package lxd.demo;

class Other {
	public static void main(String[] args) {
		for (String s: args) {
			System.out.print(s + " ¡¢");
		}
	}
}

public class DynamicArray {
	public static void main(String[] args) {
	//	Other.main(new String[]{"fiddle", "de", "dum"});
		f(1, "one");
		f(2, "one", "two");
		f(0);
	}
	
	static void f(int r, String...strings) {
		System.out.println("r: " + r + " ");
		for (String s: strings) {
			System.out.println(s + " ");
		}
		System.out.println();
	}
}
