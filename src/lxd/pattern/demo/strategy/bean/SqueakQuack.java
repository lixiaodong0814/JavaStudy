package lxd.pattern.demo.strategy.bean;

import lxd.pattern.demo.strategy.bean.base.QuackBehavior;

/**
 * ֨֨�е�Ѽ��
 * @author lxd
 * @date 2016��11��11��
 */
public class SqueakQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak");
	}

}
