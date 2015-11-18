package lxd.demo;

public class EnumOrder {

	public static void main(String[] args) {
		//static values()按enum常量的声明顺序，
		//产生后这些常量值构成的数组
		for (Spiciness s : Spiciness.values()) {
			//ordinal 某个特定enum常量的声明顺序
			System.out.println(s + ", ordinal " + s.ordinal());
		}
	}
}
