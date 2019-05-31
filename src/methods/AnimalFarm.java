package methods;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0


import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */
		String answer = JOptionPane.showInputDialog("Which animal do you want? A duck, cow, dog, cat, llama, or if you want to want to exit, type exit");
		if (answer.equals("exit")) {
			System.exit(0);
		} else if (answer.equals("duck")) {
			playNoise(duck);
		} else if (answer.equals("cow")) {
			playNoise(cow);
		} else if (answer.equals("dog") ) {
			playNoise(dog);
		} else if (answer.equals("cat")  ) {
			playNoise(cat);
		} else if (answer.equals("llama")  ) {
			playNoise(llama);
		} 
		/* 2. Make it so that the user can keep entering new animals. */
	}

	void playMoo() {
		playNoise(cow);
	}

	void playQuack() {
		playNoise(duck);
	}

	void playWoof() {
		playNoise(dog);
	}
	
	String duck = "quack.wav";
	String cow = "moo.wav";
	String dog = "woof.wav";
	String cat = "meow.wav";
	String llama = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
