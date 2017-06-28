package lxd.pattern.demo.strategy.bean;

import lxd.pattern.demo.strategy.bean.base.Duck;

/**
 * ҰѼ����С����
 * @author lxd
 * @date 2016��11��11��
 */
public class MallardDuck extends Duck {
	
	/**
	 * ҰѼ����С����
	 */
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck!");
	}

}
