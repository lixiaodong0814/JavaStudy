package interfaces.musics;

import polymophism.music.Note;

public interface Instrument {
	int VALUE = 5;
	void play(Note n);
	void adjust();
}
