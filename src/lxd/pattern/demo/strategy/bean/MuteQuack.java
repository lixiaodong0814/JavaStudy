package lxd.pattern.demo.strategy.bean;

import lxd.pattern.demo.strategy.bean.base.QuackBehavior;

/**
 * ����е�Ѽ��
 * @author lxd
 * @date 2016��11��11��
 */
public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("<<Slience>>");
	}

}
