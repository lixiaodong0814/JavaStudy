package polymophism.music;

class StaticSuper {
	public static String staticGet() {
		return "Base staticGet()";
	}
	
	public String dynamicGet() {
		return "Base dynamicGet()";
	}
}

class StaticSub extends StaticSuper {
	public static String staticGet() {
		return "Derived staticGet()";
	}
	
	@Override
	public String dynamicGet() {
		return "Derived DynamicGet()";
	}
}

public class StaticPolymorphism {
	public static void main(String[] args) {
		StaticSuper sup = new StaticSub();
		//不与单个对象关联。。 静态方法
		System.out.println(sup.staticGet());
		System.out.println(sup.dynamicGet());
	}
}
