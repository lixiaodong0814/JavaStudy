package lxd.demo;

public class EnumOrder {

	public static void main(String[] args) {
		//static values()��enum����������˳��
		//��������Щ����ֵ���ɵ�����
		for (Spiciness s : Spiciness.values()) {
			//ordinal ĳ���ض�enum����������˳��
			System.out.println(s + ", ordinal " + s.ordinal());
		}
	}
}
