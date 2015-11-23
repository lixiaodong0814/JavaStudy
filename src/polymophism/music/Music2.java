package polymophism.music;

//����
class Stringed extends Instrument {
	@Override
	public void play(Note n) {
		System.out.println("Stringed.play(): " + n);
	}
	
	@Override
	String what() {
		return "Stringed";
	}
	
	@Override
	void adjust() {
		System.out.println("Adjusting Stringed");
	}
}

//����
class Brass extends Instrument {
	@Override
	public void play(Note n) {
		System.out.println("Brass.play(): " + n);
	}
	
	@Override
	String what() {
		return "Brass";
	}
	
	@Override
	void adjust() {
		System.out.println("Adjusting Brass");
	}
}

//�����
class Percussion extends Instrument {
	@Override
	public void play(Note n) {
		System.out.println("Percussion.play(): " + n);
	}
	
	@Override
	String what() {
		return "Percussion";
	}
	
	@Override
	void adjust() {
		System.out.println("Adjusting Percussion");
	}
}

class WoodWind extends Wind {
	@Override
	public void play(Note n) {
		System.out.println("WoodWind.play(): " + n);
	}
	
	@Override
	String what() {
		return "WoodWind";
	}
}

public class Music2 {
	public static void tune(Wind i) {
		i.play(Note.MIDDLE_C);
	}
	
	public static void tune(Stringed i) {
		i.play(Note.MIDDLE_C);
	}
	
	public static void tune(Brass i) {
		i.play(Note.MIDDLE_C);
	}
	
	public static void main(String[] args) {
		//���
		Wind flute = new Wind();
		//С����
		Stringed violin = new Stringed();
		//������
		Brass frenchHorn = new Brass();
		
		tune(flute);
		tune(violin);
		tune(frenchHorn);
		
	}
}
