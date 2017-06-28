package lxd.annotation.demo;

/*@Description("i am a class annotation")*/
public class Child extends Person {

	/*@Description("i am a method annotation name()")*/
	@Override
	public String name() {
		return null;
	}

	/*@Description("i am a method annotation age()")*/
	@Override
	public int age() {
		return 0;
	}

	/*@Description("i am a method annotation sing()")*/
	@Override
	public void sing() {

	}

}
