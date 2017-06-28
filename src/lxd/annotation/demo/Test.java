package lxd.annotation.demo;

public class Test {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Person p = new Child();
		p.sing();
	}
	
	public String eyeColor() {
		
		return "red";
	}
	
}
