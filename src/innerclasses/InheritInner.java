package innerclasses;

/*
 * ����������
 * �̳��ڲ��࣬��Ҫ����һ��������ʱ��Ĭ�ϵĹ������������
 * ���Ҳ���ֻ�Ǵ���һ��ָ����Χ���������á�
 * 1.���⣬�����ڹ�������ʹ��enclosingClassReference.super()
 * ��Ȼ���ܱ���ͨ����������������⣺
 * No enclosing instance of type WithInner
 * is available due to some intermediate constructor invocation
 * 2.�ڲ����൱���ⲿ���һ�������������д�ɾ�̬�ģ��ⲿ��InheritInner���ܵ���Inner��Ĺ��췽����
 * InheritInner����д���캯��
 *  
 */
class WithInner {
//	static class Inner {}
	class Inner {}
}

public class InheritInner extends WithInner.Inner {
//	public InheritInner() {}
	public InheritInner(WithInner wi) {
		wi.super();
	}
}
