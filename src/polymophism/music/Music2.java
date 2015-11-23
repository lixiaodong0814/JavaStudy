package polymophism.music;

//弦乐
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

//管乐
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

//打击乐
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
		//风笛
		Wind flute = new Wind();
		//小提琴
		Stringed violin = new Stringed();
		//法国乐
		Brass frenchHorn = new Brass();
		
		tune(flute);
		tune(violin);
		tune(frenchHorn);
		
	}
}
