package polymophism.music;

/*
 * ConvarriantReturn Type  协变返回类型
 * 在子类的被覆盖方法可以返回基类方法的返回类型的某种子类类型
 * 允许返回类型返回更具体的子类类型
 * 如下所示
 * 2015-11-23
 * 李晓东
 */

//粮食,谷物
class Grain {
	@Override
	public String toString() {
		return "Grain";
	}
}

//小麦
class Wheat extends Grain {
	@Override
	public String toString() {
		return "Wheat";
	}
}

//工厂
class Mill {
	Grain process() {
		return new Grain();
	}
}

class WheatMill extends Mill {
	Wheat process() {
		return new Wheat();
	}
}

public class CovariantReturn {
	public static void main(String[] args) {
		Mill m = new Mill();
		Grain g = m.process();
		System.out.println(g);
		m = new WheatMill();
		g = m.process();
		System.out.println(g);
	}
}
