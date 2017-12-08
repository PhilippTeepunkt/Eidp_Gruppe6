package aufgabe1;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;

/**
 * Plays a Wave Sound
 * 
 * @author geis
 * 
 */
public class MyAudio {

	/**
	 * Plays a wave-sound
	 * 
	 * @param file
	 *            Sound to play
	 */
	public static void play(String file) {

		File f = new File(file);
		AudioClip sound;
		try {
			sound = Applet.newAudioClip((f.toURI()).toURL());
			sound.play();
			Thread.sleep(100000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}