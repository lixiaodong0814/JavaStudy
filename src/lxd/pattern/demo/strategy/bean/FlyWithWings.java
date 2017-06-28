package lxd.pattern.demo.strategy.bean;

import lxd.pattern.demo.strategy.bean.base.FlyBehavior;

/**
 * ��ʵ��ɵ�Ѽ��
 * @author lxd
 * @date 2016��11��11��
 */
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying");
	}

}
