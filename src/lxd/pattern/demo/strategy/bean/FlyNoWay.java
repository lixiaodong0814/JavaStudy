package lxd.pattern.demo.strategy.bean;

import lxd.pattern.demo.strategy.bean.base.FlyBehavior;

/**
 * ����ɵ�Ѽ�ӣ�������ƤѼ���ն�Ѽ
 * @author lxd
 * @date 2016��11��11��
 */
public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}

}
