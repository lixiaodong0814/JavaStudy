package interfaces.musics;

//����ӿ�
interface Monster {
	//����
	void menace();
}

//�ӿڼ������extends  ���ö������ӿ�
interface DangerousMonster extends Monster {
	void destory();
}

//��������
interface Lethal {
	void kill();
}

class DragonZilla implements DangerousMonster {

	@Override
	public void menace() {
	}

	@Override
	public void destory() {
	}
	
}

//��Ѫ��
interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}

class VeryBadVampire implements Vampire {

	@Override
	public void destory() {
	}

	@Override
	public void menace() {
	}

	@Override
	public void kill() {
	}

	@Override
	public void drinkBlood() {
	}
	
}

public class HorroShow {
	static void u(Monster b) {
		b.menace();
	}
	
	static void v(DangerousMonster d) {
		d.menace();
		d.destory();
	}
	
	static void w(Lethal l) {
		l.kill();
	}
	
	public static void main(String[] args) {
		//�󳳴���
		DangerousMonster barney = new DragonZilla();
		u(barney);
		v(barney);
		Vampire vlad = new VeryBadVampire();
		u(vlad);
		v(vlad);
		w(vlad);
	}
}
