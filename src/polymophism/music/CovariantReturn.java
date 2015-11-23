package polymophism.music;

/*
 * ConvarriantReturn Type  Э�䷵������
 * ������ı����Ƿ������Է��ػ��෽���ķ������͵�ĳ����������
 * ���������ͷ��ظ��������������
 * ������ʾ
 * 2015-11-23
 * ������
 */

//��ʳ,����
class Grain {
	@Override
	public String toString() {
		return "Grain";
	}
}

//С��
class Wheat extends Grain {
	@Override
	public String toString() {
		return "Wheat";
	}
}

//����
class Mill {
	Grain process() {
		return new Grain();
	}
}

class WheatMill extends Mill {
	Wheat process() {
		return new Wheat();
	}
}

public class CovariantReturn {
	public static void main(String[] args) {
		Mill m = new Mill();
		Grain g = m.process();
		System.out.println(g);
		m = new WheatMill();
		g = m.process();
		System.out.println(g);
	}
}
