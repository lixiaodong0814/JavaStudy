package interfaces.musics;

//怪物接口
interface Monster {
	//恐吓
	void menace();
}

//接口间可以用extends  引用多个基类接口
interface DangerousMonster extends Monster {
	void destory();
}

//致命因子
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

//吸血鬼
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
		//大吵大闹
		DangerousMonster barney = new DragonZilla();
		u(barney);
		v(barney);
		Vampire vlad = new VeryBadVampire();
		u(vlad);
		v(vlad);
		w(vlad);
	}
}
