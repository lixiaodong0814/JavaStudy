package polymophism.music;

class Instrument {
	void play(Note n) {
		System.out.println("Instrument.play(): " + n);
	}
	
	String what() {
		return "Instrument";
	}
	
	//µ÷Òô
	void adjust() {
		System.out.println("Adjusting Instrument");
	}
}

public class Wind extends Instrument {
	public void play(Note n) {
		System.out.println("Wind.play(): " + n);
	}
	
	@Override
	String what() {
		return "Wind";
	}
	
	@Override
	void adjust() {
		System.out.println("Adjusting Wind");
	}
}
