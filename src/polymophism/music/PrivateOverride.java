package polymophism.music;

/*
 * ϣ�����Derived-->public void f()
 * ʵ�����PrivateOverride-->private void f()
 * �����е�˽��f()�Զ�����Ϊ��final�ģ����ԣ�Derived������f()��һ��ȫ�µķ���
 * ������õ�f()�����������и��ǣ����Ե��õ��Ǹ����f() 
 * main�����������������ܵ���PrivateOverride.f()
 */
class Derived extends PrivateOverride {
	//�������ͱ��,ʵ��ľ�и���
	public void f() {
		System.out.println("Derived-->public void f()");
	}
	
}

public class PrivateOverride {
	
	private void f() {
		System.out.println("PrivateOverride-->private void f()");
	}
	
	public static void main(String[] args) {
		PrivateOverride po = new Derived();
		po.f();
	}
}


