package lxd.pattern.demo.strategy.bean.base;

/**
 * Ѽ�ӳ�����
 * @author lxd
 * @date 2016��11��11��
 */
public abstract class Duck {
	
	/*
	 * ��Ѽ�ӽк�Ѽ�ӷ��������ֱ仯�Ĳ��ַ�װ����������Ϸ�ʽ�ŵ�Ѽ�ӳ������
	 * ����仯����Ϊ�����԰����ڳ����౾���ڡ������ģʽΪ����ģʽ��
	 * ����ģʽ �������㷨�壬�ֱ��װ������������֮����Ի����滻��
	 * ��ģʽ���㷨�ı仯������ʹ���㷨�Ŀͻ���
	 */

	/**
	 * Ѽ�ӷ��нӿ�
	 */
	protected FlyBehavior flyBehavior;

	/**
	 * Ѽ�ӽнӿ�
	 */
	protected QuackBehavior quackBehavior;

	public Duck() {
		
	}
	
	public abstract void display();

	/**
	 * Ѽ�ӷ���
	 * @author ������
	 */
	public void performFly() {
		//ί�и���Ϊ��
		flyBehavior.fly();
	}
	
	/**
	 * Ѽ�ӽ�
	 * @author ������
	 */
	public void performQuack() {
		//ί�и���Ϊ��
		quackBehavior.quack();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
}
