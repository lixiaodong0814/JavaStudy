package lxd.pattern.demo.strategy.bean;

import lxd.pattern.demo.strategy.bean.base.Duck;

/**
 * ģ��Ѽ��һ��ʼ�����
 * @author lxd
 * @date 2016��11��11��
 */
public class ModelDuck extends Duck {
	
	/**
	 * ģ��Ѽ��һ��ʼ�����
	 */
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck!");
	}

}
