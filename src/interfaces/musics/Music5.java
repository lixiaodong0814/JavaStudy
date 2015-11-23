package interfaces.musics;

import polymophism.music.Note;

class Wind implements Instrument {

	@Override
	public void play(Note n) {
		System.out.println(this + ".play()" + n);
	}

	@Override
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
	
	@Override
	public String toString() {
		return "Wind";
	}
	
}

//œ“¿÷
class Stringed implements Instrument {
	@Override
	public void play(Note n) {
		System.out.println(this + ".play()" + n);
	}

	@Override
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
	
	@Override
	public String toString() {
		return "Stringed";
	}
}

//¥Úª˜¿÷
class Percussion implements Instrument {
	@Override
	public void play(Note n) {
		System.out.println(this + ".play()" + n);
	}

	@Override
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
	
	@Override
	public String toString() {
		return "Percussion";
	}
}

//π‹¿÷
class Brass extends Wind {
	@Override
	public String toString() {
		return "Brass";
	}
}

class Woodwind extends Wind {
	@Override
	public String toString() {
		return "Woodwind";
	}
}

public class Music5 {
	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	
	static void tuneAll(Instrument[] e) {
		for (Instrument i : e) {
			tune(i);
		}
	}
	
	public static void main(String[] args) {
		Instrument[] orchestra = {
			new Wind(),
			new Percussion(),
			new Stringed(),
			new Brass(),
			new Woodwind()
		};
		tuneAll(orchestra);
	}
}
